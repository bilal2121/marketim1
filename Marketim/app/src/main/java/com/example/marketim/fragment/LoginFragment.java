package com.example.marketim.fragment;


import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import com.example.marketim.ChangeFragment;
import com.example.marketim.ManageSharedPreferences;
import com.example.marketim.R;
import com.google.android.material.snackbar.Snackbar;

/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {

    private View mainView;
    private Button girisBTN;
    private EditText kullaniciAdiET,sifreET;
    private Switch hatirlaSWC;




    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        mainView = inflater.inflate(R.layout.fragment_login, container, false);

        init();
        handleButtonEvent();
        return  mainView;

    }



    private void init() {

         girisBTN = mainView.findViewById(R.id.girisBTN);
         kullaniciAdiET = mainView.findViewById(R.id.kullaniciAdiET);
         sifreET = mainView.findViewById(R.id.sifreET);
         hatirlaSWC  = mainView.findViewById(R.id.hatirlaSWC);
    }

    private void handleButtonEvent() {
        girisBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(kullaniciAdiET.getText().toString().trim().isEmpty())
                    kullaniciAdiET.setError("Kulanıcı adı alanı boş bırakamazsınız!");
                else  if(sifreET.getText().toString().trim().isEmpty())
                    sifreET.setError("şifre alanı boş bırakamazsınız!");
                else if(kullaniciAdiET.getText().toString().equals("kariyer") && sifreET.getText().toString().equals("2019ADev") )
                {
                    if(hatirlaSWC.isChecked())
                    {
                        ManageSharedPreferences.getInstance(getContext()).write(true);
                    }
                    ChangeFragment.getInstance(getContext()).change(new OrderFragment(),false);

                    }
                else
                {
                    Snackbar snackbar = Snackbar
                            .make(mainView, "şifre veya adınızı kontrol ediniz", Snackbar.LENGTH_LONG);
                    View snackBarView = snackbar.getView();
                    snackBarView.setBackgroundColor(Color.RED);

                    snackbar.show();


                }

            }
        });
    }



}
