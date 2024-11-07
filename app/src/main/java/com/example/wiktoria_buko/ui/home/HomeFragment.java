package com.example.wiktoria_buko.ui.home;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.wiktoria_buko.R;
import com.example.wiktoria_buko.databinding.FragmentHomeBinding;
import com.google.android.material.snackbar.Snackbar;

public class HomeFragment extends Fragment {
    public static void hideKeyboard(Activity activity) {
        View view = activity.findViewById(android.R.id.content);
        if (view != null) {
            InputMethodManager imm = (InputMethodManager) activity.getSystemService(Context.INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }
    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        
        Button button = root.findViewById(R.id.button2);
        EditText edit = root.findViewById(R.id.editTextText);
        CheckBox check = root.findViewById(R.id.checkBox);
        button.setOnClickListener(v -> {
            hideKeyboard(requireActivity());
            String input = edit.getText().toString();
            if(check.isChecked()){
                if (input.isEmpty()) {
                    Toast.makeText(v.getContext(), "Nie wpisano tekstu!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(v.getContext(), input, Toast.LENGTH_LONG).show();
                }
            }else{
                if(input.isEmpty()){
                    Snackbar.make(v,"nie wspiano tekstu!", Snackbar.LENGTH_LONG).show();
                }else{
                    Snackbar.make(v, input, Snackbar.LENGTH_LONG).show();
                }
            }

        });



        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}