package com.qa.Common;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

import android.widget.*;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import java.util.prefs.Preferences;

public class DbConnectivity extends Activity {
    private static final String TAG = "RegistrationPage";

    String name, email, mobile, password, city, pincode, licenceno, conformpassword, walletAmt;
    String sex, usertype;

    private ProgressDialog progressDialog;
    private Preferences preferences;

    private static final String REGISTER_URL = "http://127.0.0.1"+"/SmartCarRentWeb/registration.php";

    UserData userData;
    public void signUp() {
        name = userData.getName();
        email = userData.getEmailId();
        mobile = userData.getPhone_No();
        password = userData.getPassword();
        conformpassword = userData.getConfirmPassword();
        city = userData.getCity();
        pincode = userData.getPinCode();
        licenceno = userData.getLicenceNo();
        walletAmt = userData.getWallet();

        if (isConnectingToInternet(getApplicationContext())) {
            if (password.equals(conformpassword)) {
                StringRequest stringRequest = new StringRequest(Request.Method.POST, REGISTER_URL,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                progressDialog.dismiss();

                                try {

                                    JSONObject jsonResponse = new JSONObject(response);
                                    int success = jsonResponse.getInt("success");
                                    progressDialog.dismiss();
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
                                }catch (JSONException e) {
                                    progressDialog.dismiss();
                                    e.printStackTrace();
                                }
                            }
                        },
                        new Response.ErrorListener() {
                            @Override
                            public void onErrorResponse(VolleyError error) {
                                progressDialog.dismiss();
                                Toast.makeText(RegisterActivity.this, error.toString(), Toast.LENGTH_LONG).show();
                            }
                        }) {

                    @Override
                    protected Map<String, String> getParams() {
                        Map<String, String> params = new HashMap<String, String>();

                        params.put("name", name);
                        params.put("email",email);
                        params.put("mobile", mobile);
                        params.put("password",password);
                        params.put("city", city);
                        params.put("pincode", pincode);
                        params.put("walletamt",walletAmt);
                        params.put("licenseno", licenceno);
                        params.put("usertype", usertype);
                        params.put("sex", sex);


                        return params;
                    }

                };

                RequestQueue requestQueue = Volley.newRequestQueue(RegisterActivity.this);
                stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                        10000,
                        DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
                requestQueue.add(stringRequest);
            }else {
                progressDialog.dismiss();
                Toast.makeText(RegisterActivity.this, "Passwords are not matching", Toast.LENGTH_LONG).show();
            }
        }else {
            progressDialog.dismiss();
            Toast.makeText(RegisterActivity.this, "Internet Connection is not available ", Toast.LENGTH_LONG).show();
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