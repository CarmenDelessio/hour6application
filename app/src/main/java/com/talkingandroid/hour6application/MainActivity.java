package com.talkingandroid.hour6application;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void changeImage(View v){
        Button button = (Button) v;
        ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton);
        if (button.getText().toString().equals(getResources().getString(R.string.button_show_skateboarder))){
            imageButton.setImageDrawable(getResources().getDrawable(R.drawable.robot_skateboarding));
            button.setText(getResources().getString(R.string.button_show_icon));
        } else {
            imageButton.setImageDrawable(getResources().getDrawable(R.drawable.ic_launcher));
            button.setText(getResources().getString(R.string.button_show_skateboarder));
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
