package com.example.marketim;

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class ChangeFragment {


    private static Context context;
    private static  ChangeFragment changeFragment;



    private ChangeFragment() {
    }

    public static ChangeFragment getInstance(Context context )
    {
        //Daha önce oluşturduğumuz bir nesnemizin olup olmadığını kontrol ediyoruz.
        //Varsa olanı geri döndürür
        //yoksa yeni bir nesne olşturup. onu döndürür.
        if( changeFragment == null)
        {

            changeFragment = new ChangeFragment();

        }
        ChangeFragment.context=context;
        return changeFragment;
    }



    public void  change(Fragment fragment, Boolean addbackstack)
    {
        FragmentManager fragmentManager = ((AppCompatActivity) context).getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);

        fragmentTransaction.setCustomAnimations(android.R.anim.slide_in_left,android.R.anim.slide_out_right);

        if(addbackstack)
            fragmentTransaction.addToBackStack(null);
        else
            fragmentTransaction.disallowAddToBackStack();



        fragmentTransaction.replace(R.id.framelayout,fragment);
        fragmentTransaction.commit();


    }



}
