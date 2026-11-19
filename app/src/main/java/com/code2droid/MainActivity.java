
package com.code2droid;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setPadding(25, 35, 25, 25);
        layout.setBackgroundColor(Color.rgb(9, 13, 24));

        TextView title = new TextView(this);
        title.setText("Code2Droid");
        title.setTextSize(30);
        title.setTextColor(Color.rgb(66, 165, 255));
        title.setGravity(Gravity.CENTER);

        TextView subtitle = new TextView(this);
        subtitle.setText("Turn your C++ code into Android apps");
        subtitle.setTextColor(Color.LTGRAY);
        subtitle.setGravity(Gravity.CENTER);
        subtitle.setPadding(0, 10, 0, 25);

        EditText appName = new EditText(this);
        appName.setHint("Application name");
        appName.setTextColor(Color.WHITE);
        appName.setHintTextColor(Color.GRAY);

        EditText code = new EditText(this);
        code.setHint("Paste your C++ code here...");
        code.setTextColor(Color.GREEN);
        code.setHintTextColor(Color.GRAY);
        code.setGravity(Gravity.TOP);
        code.setMinLines(10);
        code.setBackgroundColor(Color.rgb(21, 30, 48));

        Button generate = new Button(this);
        generate.setText("GENERATE APK");

        TextView status = new TextView(this);
        status.setText("Ready to build your application.");
        status.setTextColor(Color.LTGRAY);
        status.setPadding(0, 25, 0, 0);
        status.setGravity(Gravity.CENTER);

        generate.setOnClickListener(v -> {
            if (appName.getText().toString().trim().isEmpty()
                    || code.getText().toString().trim().isEmpty()) {
                status.setText("Please enter name and C++ code!");
            } else {
                status.setText(
                    "Code received! Compiler connection is next."
                );
            }
        });

        layout.addView(title);
        layout.addView(subtitle);
        layout.addView(appName);
        layout.addView(code);
        layout.addView(generate);
        layout.addView(status);

        ScrollView scroll = new ScrollView(this);
        scroll.addView(layout);

        setContentView(scroll);
    }
}
