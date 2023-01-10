package com.jd.thegamegym;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class Menu_Options extends AppCompatActivity {


    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal,menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem menuItem){
        switch (menuItem.getItemId()){
            case R.id.menu_principal:
                volverMenuPrincipal();
                return true;
            case R.id.menu_salir:
                salirApp();
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    private void salirApp() {
        finish();
        System.exit(1);
    }

    private void volverMenuPrincipal() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
    }
}
