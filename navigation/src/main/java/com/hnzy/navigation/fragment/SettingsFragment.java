package com.hnzy.navigation.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.hnzy.navigation.R;

public class SettingsFragment extends Fragment {
    private Button btnToRoot;

    public SettingsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        btnToRoot = view.findViewById(R.id.btnToRoot);
        TextView tvNickName = view.findViewById(R.id.tv_nick_name);
        if (getArguments() != null) {
            String nickName = SettingsFragmentArgs.fromBundle(getArguments()).getNick();
            tvNickName.setText(nickName);
        }
        goBack();
        return view;
    }

    private void goBack() {
        btnToRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Navigation.findNavController(btnToRoot)
                        .popBackStack();
            }
        });
    }

}
