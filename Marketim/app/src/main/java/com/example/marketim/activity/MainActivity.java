package com.example.marketim.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.marketim.ChangeFragment;
import com.example.marketim.ManageSharedPreferences;
import com.example.marketim.R;
import com.example.marketim.fragment.LoginFragment;
import com.example.marketim.fragment.OrderFragment;

public class MainActivity extends AppCompatActivity {

    private ManageSharedPreferences manageSharedPreferencesInstance;
    private ChangeFragment changeFragmentInstance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        //Aktivititin ilk kez oluşup oluşmadoğını kontrol eder
        if(savedInstanceState == null)
        {

            if(manageSharedPreferencesInstance.read(ManageSharedPreferences.LOGIN_REMEMBER))
            {
                changeFragmentInstance.change(new OrderFragment(),false);

            }
            else
            {
                changeFragmentInstance.change(new LoginFragment(),false);
            }
        }



    }

    //nesnelerimizi kulanmak için atamalarını yaptık
    private void init() {
        manageSharedPreferencesInstance = ManageSharedPreferences.getInstance(this);
        changeFragmentInstance = ChangeFragment.getInstance(this);

    }


}
