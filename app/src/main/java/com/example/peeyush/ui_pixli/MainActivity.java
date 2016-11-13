package com.example.peeyush.ui_pixli;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    AlertDialog.Builder alertDialogBuilder1;
    AlertDialog alertDialog1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openLogin(View view) {
//        Intent intent = new Intent(this, Login.class);
//        startActivity(intent);

        alertDialogBuilder1 = new AlertDialog.Builder(MainActivity.this);

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        LayoutInflater inflater = MainActivity.this.getLayoutInflater();
        final View v_iew=inflater.inflate(R.layout.dialog_guest, null);       // Pass null as the parent view because its
        // going in the dialog layout
        alertDialogBuilder1.setView(v_iew);
    }

    public void openCreateEvent(View view) {
        Intent intent = new Intent(this, CreateEvent.class);
        startActivity(intent);
    }


}
