package com.qa.Common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;
import org.json.JSONException;
import org.json.JSONObject;

public class DbConnectivity extends Activity {

    public void signUp() {
        if (isConnectingToInternet(getApplicationContext())) {

            try {

                JSONObject jsonResponse = new JSONObject(response);
                int success = jsonResponse.getInt("success");
                if (success == 0) {
                    Toast.makeText(RegisterActivity.this, "Registration failed. Please try again.", Toast.LENGTH_LONG).show();
                } else if (success == 1) {
                    Toast.makeText(RegisterActivity.this, "You have successfully registered with SmartCarRent", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                    startActivity(intent);
                    //   pref.setFirstTimeLoggedIn("true");

                } else if (success == 2) {
                    Toast.makeText(RegisterActivity.this, "This user is already registered with SmartCarRent", Toast.LENGTH_LONG).show();
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isConnectingToInternet(Context context) {

        ConnectivityManager connectivity = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivity != null) {
            NetworkInfo info[] = connectivity.getAllNetworkInfo();
            if (info != null) {
                for (int i = 0; i < info.length; i++)

                    if (info[i].getState() == NetworkInfo.State.CONNECTED) {
                        return true;
                    }

            }
        }
        return false;
    }

}