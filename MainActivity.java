package com.example.tamirgahbeheshtipour;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.graphics.Color;
import android.view.Gravity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        layout.setBackgroundColor(Color.parseColor("#E3F2FD"));
        layout.setPadding(50, 50, 50, 50);

        String[] messages = {
            "سلام دستگاه شما آماده است تعمیرگاه بهشتی پور",
            "سلام دستگاه شما قابل تعمیر نیست تعمیرگاه بهشتی پور",
            "سلام دستگاه شما به مدت (یک ماه) در تعمیرگاه نگه داشته می‌شود تعمیرگاه بهشتی پور"
        };

        for (String msg : messages) {
            TextView tv = new TextView(this);
            tv.setText(msg);
            tv.setTextSize(20);
            tv.setTextColor(Color.parseColor("#0D47A1"));
            tv.setPadding(0, 30, 0, 30);
            tv.setGravity(Gravity.RIGHT);
            layout.addView(tv);
        }

        setContentView(layout);
    }
}