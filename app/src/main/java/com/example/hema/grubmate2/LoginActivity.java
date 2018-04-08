package com.example.hema.grubmate2;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginManager;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class LoginActivity extends AppCompatActivity {
    Button btnSignUp  , btnSignIn ;
    TextView  text$logan;
    LoginButton login_button;
    CallbackManager callbackManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
          FacebookSdk.sdkInitialize(getApplicationContext());
       setContentView(R.layout.activity_login);
         initializeControls();
      LoginWithFB();
        /*try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.example.hema.grubmate2",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.e("KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));

                Toast.makeText(this, "KeyHash"+Base64.encodeToString(md.digest(), Base64.DEFAULT), Toast.LENGTH_SHORT).show();

            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }*/
        
         btnSignUp  =  findViewById(R.id.btnSignUp);
        btnSignIn  = findViewById(R.id.btnSignIn);

        callbackManager = CallbackManager.Factory.create();



        /*text$logan = (TextView)findViewById(R.id.text$logan);
        Typeface typeface = Typeface.createFromAsset(getAssets(),  "fonts/LATINWD.TTF");
        text$logan.setTypeface(typeface);*/
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignUp =new Intent(LoginActivity.this,  SignUp.class);
                startActivity(SignUp);

            }
        });
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignIn =new Intent(LoginActivity.this,  SignIn.class);

                startActivity(SignIn);

            }
        });




    }
    private void initializeControls(){
        callbackManager = CallbackManager.Factory.create();
        login_button = findViewById(R.id.login_button);


    }
    private  void LoginWithFB(){

        LoginManager.getInstance().registerCallback(callbackManager,
                new FacebookCallback<LoginResult>() {
                    @Override
                    public void onSuccess(LoginResult loginResult) {
                        // App code
                        loginResult.getAccessToken();
                    }

                    @Override
                    public void onCancel() {
                        // App code
                    }

                    @Override
                    public void onError(FacebookException exception) {
                        // App code
                    }
                });


    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        callbackManager.onActivityResult(requestCode, resultCode, data);
        super.onActivityResult(requestCode, resultCode, data);
    }

}
