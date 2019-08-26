package com.rez.datetimepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;

import java.sql.Time;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    //TimePicker timePicker;
    TextView textView;
    DatePicker datePicker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*timePicker = findViewById(R.id.timepicker);*/
        textView = findViewById(R.id.textview);
        datePicker = findViewById(R.id.datepicker);

        Calendar calendar = Calendar.getInstance();
        datePicker.init(calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH), new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String date = "";
                if(dayOfMonth == 1 || dayOfMonth == 21 || dayOfMonth == 31)
                {
                    date = "st";
                } else if (dayOfMonth == 2 || dayOfMonth == 22)
                {
                    date = "nd";
                }
                else if (dayOfMonth == 3 || dayOfMonth == 23)
                {
                    date = "rd";
                }
                else
                {
                    date = "th";
                }
                String month = "";
                switch (monthOfYear) {
                    case 0:
                        month = "January";
                        break;
                    case 1:
                        month = "February";
                        break;
                    case 2:
                        month = "March";
                        break;
                    case 3:
                        month = "April";
                        break;
                    case 4:
                        month = "May";
                        break;
                    case 5:
                        month = "June";
                        break;
                    case 6:
                        month = "July";
                        break;
                    case 7:
                        month = "August";
                        break;
                    case 8:
                        month = "September";
                        break;
                    case 9:
                        month = "October";
                        break;
                    case 10:
                        month = "November";
                        break;
                    case 11:
                        month = "December";
                        break;

                }
                textView.setText(dayOfMonth + date + " " + month + ", " + year);
            }
        });

        /*timePicker.setOnTimeChangedListener(new TimePicker.OnTimeChangedListener() {
            @Override
            public void onTimeChanged(TimePicker timePicker, int hour, int minute) {
                String amOrPm = "";
                if(hour >= 12)
                {
                    amOrPm = "PM";
                }
                else
                {
                    amOrPm = "AM";
                }

                textView.setText(hour + ":" + minute + " " + amOrPm);

            }
        });*/
    }
}
