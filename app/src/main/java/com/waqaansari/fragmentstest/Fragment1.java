package com.waqaansari.fragmentstest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {


    public Fragment1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);

        Bundle bundle = getArguments();
        String message = bundle.getString("message");
        Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
        TextView textView = (TextView) view.findViewById(R.id.textView);
        textView.setText(message);

        return view;
    }

}
