package com.example.sujankrishna.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    EditText etID;
    TextView tv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etID = (EditText) findViewById(R.id.etID);
        tv = (TextView) findViewById(R.id.tv);
    }

    public void btnSubmit_OnClick(View v){
        String data = etID.getText().toString();
        String dob = data.substring(0,8);

        int gender = Integer.parseInt(data.charAt(8) + "");
        String sGender;

        if(gender >= 0){
            sGender = "Male";
        }
        else{
            sGender = "Female";
        }

        int nationality = Integer.parseInt(data.charAt(9) + "");
        String sNationality;

        if(nationality == 0){
            sNationality = "Foreigner";
        }
        else{
            sNationality = "Nepali";
        }


        tv.setText("Your information from your id number: \n"
                    + "Date of Birth: \t" + dob + "\n"
                    + "Gender: \t" + sGender + "\n"
                    + "Nationality: \t" + sNationality);

        etID.onEditorAction(EditorInfo.IME_ACTION_DONE);
    }
}