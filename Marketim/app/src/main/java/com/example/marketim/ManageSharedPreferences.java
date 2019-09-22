package com.example.marketim;

import android.content.Context;
import android.content.SharedPreferences;

public class ManageSharedPreferences {
    public  static String LOGIN_REMEMBER = "LOGIN_REMEMBER";
    private static Context context;
    private static ManageSharedPreferences manageSharedPreferences;

    private ManageSharedPreferences()
    {}


    //Daha önce oluşturduğumuz bir nesnemizin olup olmadığını kontrol ediyoruz.
    //Varsa olanı geri döndürür
    //yoksa yeni bir nesne olşturup. onu döndürür.
    public static ManageSharedPreferences getInstance( Context context)
    {
        if (manageSharedPreferences ==null)
        {
            manageSharedPreferences = new ManageSharedPreferences();
        }

        ManageSharedPreferences.context=context;

        return manageSharedPreferences;
    }



    //Sharedpreferce gönderdiğimiz anahtarı gönderiyoruz
    public void write(boolean key)
    {
        SharedPreferences sharedPref = context.getSharedPreferences(
                LOGIN_REMEMBER , Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPref.edit();
        editor.putBoolean(LOGIN_REMEMBER,key);
        editor.apply();
    }


    //Sharedpreferce gönderdiğimiz anahtarı değerini okuyoruz.
    public boolean read( String Key)
    {
        SharedPreferences sharedPref = context.getSharedPreferences(
                LOGIN_REMEMBER , Context.MODE_PRIVATE);
       return sharedPref.getBoolean(Key,false);

    }

}
