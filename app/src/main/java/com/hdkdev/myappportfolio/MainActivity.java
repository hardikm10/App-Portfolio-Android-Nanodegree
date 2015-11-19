package com.hdkdev.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// declaring the click event handler programmatically rather than in an XML layout
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button3 = (Button)findViewById(R.id.button3);
        Button button4 = (Button)findViewById(R.id.button4);
        Button button5 = (Button)findViewById(R.id.button5);
        Button button6 = (Button)findViewById(R.id.button6);

        button.setOnClickListener(onClickListener);
        button2.setOnClickListener(onClickListener);
        button3.setOnClickListener(onClickListener);
        button4.setOnClickListener(onClickListener);
        button5.setOnClickListener(onClickListener);
        button6.setOnClickListener(onClickListener);

    }
//creating an View.OnClickListener object and assign it to the button by calling setOnClickListener(View.OnClickListener)
    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch(v.getId()){

                case R.id.button:

                    Toast.makeText(getApplicationContext(),"This button will launch my Spotify Streamer app!", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button2:

                    Toast.makeText(getApplicationContext(),"This button will launch my Scores app!", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button3:

                    Toast.makeText(getApplicationContext(),"This button will launch my Library app!", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button4:

                    Toast.makeText(getApplicationContext(),"This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button5:

                    Toast.makeText(getApplicationContext(),"This button will launch my XYZ Reader app!", Toast.LENGTH_SHORT).show();

                    break;
                case R.id.button6:
                   //Custome Toast Message
                    LayoutInflater inflater = getLayoutInflater();

                    View layout = inflater.inflate(R.layout.toast,(ViewGroup) findViewById(R.id.toast_layout_id));

                    // set a message
                    TextView text = (TextView) layout.findViewById(R.id.text);
                    text.setText("This button will launch my Capstone app!");

                    // Toast configuration
                    Toast toast = new Toast(getApplicationContext());
                    toast.setGravity(Gravity.BOTTOM, 0, 0);
                    toast.setDuration(Toast.LENGTH_LONG);
                    toast.setView(layout);
                    toast.show();

                    break;
            }

        }
    };
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

}
