package com.example.adexp5_uielements;

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

public class MainActivity extends AppCompatActivity implements
        Exampledialog.Exampledialoglistner {
    TextView username1, password1;

    @Override
    public void applyTexts(String username, String password) {
        username1.setText(username);
        password1.setText(password);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.textView);
        username1 = findViewById(R.id.textView2);
        password1 = findViewById(R.id.textView3);
        Button open = findViewById(R.id.button2);
        open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opendialog();
            }
        });
        registerForContextMenu(textView1);
    }

    public void opendialog() {
        Exampledialog exampledialog = new Exampledialog();

        exampledialog.show(getSupportFragmentManager(), "example_dialog");
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) { //context menu
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Choose your option");
        //menu.add(0,v.getId(),0,"Item1");
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.context1_menu, menu);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.Ite1:
//                Toast.makeText(this, "First item Selcted", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.Ite2:
//                Toast.makeText(this, "Second item Selcted", Toast.LENGTH_LONG).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }

        if (item.getItemId() == R.id.Ite1) {
            Toast.makeText(this, "First item Selcted", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.Ite2) {
            Toast.makeText(this, "Second item Selcted", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) { //Options Menu
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.first:
//                Toast.makeText(this, "First item Selcted", Toast.LENGTH_LONG).show();
//                return true;
//            case R.id.second:
//                Toast.makeText(this, "Second item Selcted", Toast.LENGTH_LONG).show();
//                return true;
//            default:
//                return super.onOptionsItemSelected(item);
//        }

        if (item.getItemId() == R.id.first) {
            Toast.makeText(this, "First item Selcted", Toast.LENGTH_LONG).show();
            return true;
        } else if (item.getItemId() == R.id.second) {
            Toast.makeText(this, "Second item Selcted", Toast.LENGTH_LONG).show();
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }

    public void Showpopup(View view) { ///Popup Menu
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, view);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
//                switch (menuItem.getItemId()) {
//                    case R.id.Item1:
//                        Toast.makeText(MainActivity.this, "Item1 selected", Toast.LENGTH_LONG).show();
//                        return true;
//                    default:
//                        return false;
//                }

                if (menuItem.getItemId() == R.id.Item1) {
                    Toast.makeText(MainActivity.this, "Item1 selected", Toast.LENGTH_LONG).show();
                    return true;
                } else {
                    return false;
                }
            }
        });
    }
}
