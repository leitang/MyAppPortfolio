package org.leitang.myappportfolio;

import android.os.Bundle;
import android.support.annotation.StringRes;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.app_button_1:
                toast(R.string.app_1);
                break;
            case R.id.app_button_2:
                toast(R.string.app_2);
                break;
            case R.id.app_button_3:
                toast(R.string.app_3);
                break;
            case R.id.app_button_4:
                toast(R.string.app_4);
                break;
            case R.id.app_button_5:
                toast(R.string.app_5);
                break;
            case R.id.app_button_6:
                toast(R.string.app_6);
                break;

        }
    }

    private void toast(@StringRes int id) {
        String stringToToast = "This button will launch " + getString(id) + "!";
        Toast.makeText(this, stringToToast, Toast.LENGTH_SHORT).show();
    }
}
