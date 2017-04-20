package sg.edu.rp.c346.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DemoActivities2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_activities2);

        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] info = i.getStringArrayExtra("info");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textview1);
        // Display the name and age on the TextView
        tv1.setText("You are " + info[0] + ", age " + info[1]);


    }
}
