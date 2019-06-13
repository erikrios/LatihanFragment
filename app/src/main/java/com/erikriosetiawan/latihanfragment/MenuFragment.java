package com.erikriosetiawan.latihanfragment;


import android.graphics.Point;
import android.os.Build;
import android.os.Bundle;
import android.app.Fragment;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class MenuFragment extends Fragment {

    Button buttonConvert, buttonAbout, buttonLogOut;

    public MenuFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        buttonConvert = getActivity().findViewById(R.id.button_convert);
        buttonAbout = getActivity().findViewById(R.id.button_about);
        buttonLogOut = getActivity().findViewById(R.id.button_log_out);

        WindowManager windowManager = getActivity().getWindowManager();
        Point size = new Point();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {

            if (size.x > size.y) {
                buttonConvert.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
                buttonAbout.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
                buttonLogOut.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
            }

        } else {
            Display display = windowManager.getDefaultDisplay();
            if (display.getRotation() == Surface.ROTATION_90 || display.getRotation() == Surface.ROTATION_270) {
                buttonConvert.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
                buttonAbout.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
                buttonLogOut.getLayoutParams().width = (int) getResources().getDimension(R.dimen.button_width);
            }
        }
    }
}
