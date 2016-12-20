package com.dismas.imaya.touradvisor;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by imaya on 12/2/16.
 */
public class AccountFragment extends Fragment implements View.OnClickListener {

    ///////////////////////////

    String str_getName, str_getPassword, str_getEmail, str_getCity, str_getCountry;

    TextView profile;

    Button logout;

    ///////////////////////////

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View x =  inflater.inflate(R.layout.fragment_account,container, false);
        ((MainActivityDrawer) getActivity()).topToolBar.setTitle("Account");

        ///////////////////////////////////////////////////

        /*
         * fetching the all data corresponding to each key from shared
         * preference in order to show the user profile
         */

        str_getName = SplashActivity.sh.getString("name", null);
        str_getPassword = SplashActivity.sh.getString("password", null);
        str_getEmail = SplashActivity.sh.getString("email", null);
        str_getCity = SplashActivity.sh.getString("city", null);
        str_getCountry = SplashActivity.sh.getString("country", null);

        profile = (TextView) x.findViewById(R.id.txt_profile);
        logout = (Button) x.findViewById(R.id.logout);
        logout.setOnClickListener(this);

        /* set fetch data to textview, textview show the user complete profile */

        profile.setText("Name : " + str_getName + "\n" + "\n" + "Password : "
                + str_getPassword + "\n" + "\n" + "Email : " + str_getEmail
                + "\n" + "\n" + "City : " + str_getCity + "\n" + "\n" + "Country : " + str_getCountry);

        ///////////////////////////////////////////////////

        // Inflate the layout for this fragment
        return x;
    }
    @Override
    public void onClick(View v) {
        /*
         * logout button click does not delete the shared preference all data
         * but it only delete the user login test key, you can do the login
         * again with same credentials. In order to delete the complete data
         * call editor.clear(); followed by editor.commit(); you can edit your
         * complete profile by doing registration once again, it will overwrite
         * your previous data.
         */
        Toast.makeText(getActivity(), "You have successfully logout",
                Toast.LENGTH_LONG).show();
        SplashActivity.editor.remove("loginTest");

        SplashActivity.editor.commit();

        Intent sendToLoginandRegistration = new Intent(getActivity(),
                LoginActivity.class);

        startActivity(sendToLoginandRegistration);
    }
}
