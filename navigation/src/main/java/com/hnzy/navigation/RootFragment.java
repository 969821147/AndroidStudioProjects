package com.hnzy.navigation;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class RootFragment extends Fragment {
    private Button btnToSettings;

    public RootFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_root, container, false);
        btnToSettings = view.findViewById(R.id.btnToSettings);
        toSettings();
        return view;
    }

    private void toSettings() {
        btnToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String nickName = "master";
                RootFragmentDirections.ActionRootFragmentToSettingsFragment action =
                        RootFragmentDirections.actionRootFragmentToSettingsFragment().setNick(nickName);

                Navigation.findNavController(btnToSettings)
                        .navigate(action);

            }
        });
    }

}
