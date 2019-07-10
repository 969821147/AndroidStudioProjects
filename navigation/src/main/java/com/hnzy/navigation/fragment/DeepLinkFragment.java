package com.hnzy.navigation.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.hnzy.navigation.R;

public class DeepLinkFragment extends Fragment {

    public DeepLinkFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_deep_link, container, false);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String myarg = arguments.getString("myarg");
            Toast.makeText(getContext(), myarg, Toast.LENGTH_LONG)
                    .show();
        }
        return rootView;
    }

}
