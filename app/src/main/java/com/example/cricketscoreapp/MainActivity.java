package com.example.cricketscoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void UpdateScore01(View view)
    {
        TextView T1 = findViewById(R.id.Runs01);
        String Score = T1.getText().toString();

        String [] parts = Score.split("/");
        String Score01 = parts[0];
        String Wicket01 = parts[1];

        int UpdateScore = Integer.parseInt(Score01);
        UpdateScore++;

        Score01 = UpdateScore+"";
        T1.setText(Score01+"/"+Wicket01);
    }

    public void UpdateWicket01(View view)
    {

        TextView T1 = findViewById(R.id.Runs01);
        String Score = T1.getText().toString();

        String [] parts = Score.split("/");
        String Score01 = parts[0];
        String Wicket01 = parts[1];

        int UpdateWickets = Integer.parseInt(Wicket01);
        if(UpdateWickets >= 10)
        {
            Toast.makeText(getApplicationContext(),"no more wickets",Toast.LENGTH_SHORT).show();
        }
        else
        {
            UpdateWickets++;
        }


        Wicket01 = UpdateWickets+"";
        T1.setText(Score01+"/"+Wicket01);
    }

    public void ResetSW(View view)
    {
        TextView T1 = findViewById(R.id.Runs01);
        T1.setText("0/0");
    }
    //Second Team
    public void UpdateScore02(View view)
    {
        TextView T1 = findViewById(R.id.runs02);
        String Score = T1.getText().toString();

        String [] parts = Score.split("/");
        String Score01 = parts[0];
        String Wicket01 = parts[1];

        int UpdateScore = Integer.parseInt(Score01);
        UpdateScore++;

        Score01 = UpdateScore+"";
        T1.setText(Score01+"/"+Wicket01);
    }


    public void UpdateWicket02(View view)
    {


        TextView T1 = findViewById(R.id.runs02);
        String Score = T1.getText().toString();

        String [] parts = Score.split("/");
        String Score01 = parts[0];
        String Wicket01 = parts[1];

        int UpdateWickets = Integer.parseInt(Wicket01);
        if(UpdateWickets >= 10)
        {
            Toast.makeText(getApplicationContext(),"no more wickets",Toast.LENGTH_SHORT).show();
        }
        else
        {
            UpdateWickets++;
        }


        Wicket01 = UpdateWickets+"";
        T1.setText(Score01+"/"+Wicket01);
    }

    public void ResetSW2(View view)
    {
        TextView T1 = findViewById(R.id.runs02);
        T1.setText("0/0");
    }
}