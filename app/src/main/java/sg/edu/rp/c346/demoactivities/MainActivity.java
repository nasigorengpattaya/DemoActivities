package sg.edu.rp.c346.demoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDone = (Button) findViewById(R.id.buttonDone);

        final EditText etName = (EditText) findViewById(R.id.editTextName);
        // Get the EditText that user keys in age
        final EditText etAge = (EditText) findViewById(R.id.editTextAge);

        btnDone.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View arg0) {

                if (TextUtils.isEmpty(etName.getText().toString())) {
                    etName.setError("Please input a valid amount.");
                } else if (TextUtils.isEmpty(etAge.getText().toString())){
                    etAge.setError("Please input a valid number.");
                } else {
                    // Get the EditText that user keys in name
                    // Put the name and age into an array
                    String[] info = {etName.getText().toString(),
                            etAge.getText().toString()};
                    // Create an intent to start another activity called
                    //  DemoActivities (which we would create later)
                    Intent i = new Intent(MainActivity.this,
                            DemoActivities2.class);
                    // Pass the String array holding the name & age to new activity
                    i.putExtra("info", info);
                    // Start the new activity
                    startActivity(i);
                }
            }});

    }
}
