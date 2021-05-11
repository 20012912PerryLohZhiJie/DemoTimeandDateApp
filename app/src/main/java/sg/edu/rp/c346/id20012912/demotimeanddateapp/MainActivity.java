package sg.edu.rp.c346.id20012912.demotimeanddateapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;


public class MainActivity extends AppCompatActivity
{
    DatePicker dp;
    TimePicker tp;
    Button btnDisplayDate, btnDisplayTime, buttonreset;
    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        btnDisplayDate = findViewById(R.id.buttondisplaydate);
        btnDisplayTime = findViewById(R.id.buttondisplaytime);
        tvDisplay = findViewById(R.id.textViewDisplay);
        buttonreset = findViewById(R.id.buttonreset);

        btnDisplayTime.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                String timeis = "Time is " + tp.getCurrentHour() + ":" +
                                String.format("%02d", tp.getCurrentMinute());

                tvDisplay.setText(timeis);
            }


        });

        btnDisplayDate.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String dateis ="Date is "+ dp.getDayOfMonth() +"/" +
                    (dp.getMonth() + 1) +"/" + dp.getYear();
                tvDisplay.setText(dateis);
            }
        });

        buttonreset.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                tp.setCurrentHour(0);
                tp.setCurrentMinute(0);
                dp.updateDate(2021,0,1);

            }
        });


    }


}