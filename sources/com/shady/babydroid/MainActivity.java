package com.shady.babydroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText passwordEditText;
    EditText usernameEditText;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) C0103R.layout.activity_main);
        setTitle("h3nth1gh");
        this.usernameEditText = (EditText) findViewById(C0103R.C0106id.usernameEdt);
        this.passwordEditText = (EditText) findViewById(C0103R.C0106id.password);
        Button button = (Button) findViewById(C0103R.C0106id.submit);
    }

    public void Submit(View view) {
        String username = this.usernameEditText.getText().toString();
        String password = this.passwordEditText.getText().toString();
        int cont = 1;
        if (username.isEmpty()) {
            this.usernameEditText.setError("Username cannot be empty");
            cont = 0;
        }
        if (password.isEmpty()) {
            this.passwordEditText.setError("Password cannot be empty");
            cont = 0;
        }
        if (cont != 0) {
            fcns fn = new fcns();
            if (fn.heisen(fn.chanbong(password)).equals(getResources().getString(C0103R.string.secret))) {
                startActivity(new Intent(getApplicationContext(), WinActivity.class));
                finish();
            }
        }
    }
}
