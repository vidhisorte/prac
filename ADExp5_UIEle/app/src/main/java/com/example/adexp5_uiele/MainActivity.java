package com.example.adexp5_uiele;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        registerForContextMenu(textView);
        Button diag = findViewById(R.id.dialog);
        builder = new AlertDialog.Builder(this);
        diag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("This is an Alert dialog box");
                AlertDialog alert = builder.create();
                alert.setTitle("Alert Dialog Example");
                alert.show();
            }
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.context1) {
            Toast.makeText(this, "Context Item 1 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.context2) {
            Toast.makeText(this, "Context Item 2 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.context3) {
            Toast.makeText(this, "Context Item 3 selected", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onContextItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.option_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.option1) {
            Toast.makeText(this, "Option Item 1 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.option2) {
            Toast.makeText(this, "Option Item 2 selected", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.option3) {
            Toast.makeText(this, "Option Item 3 selected", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void popUp(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
    }
}