package com.example.cf_btvn_recycleview_b3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Add extends AppCompatActivity {
    EditText edt ;
    Button btn;
//    public static int TRAVE_FOLDERNAME = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        edt = (EditText)findViewById(R.id.edt_foldername);
        btn= (Button)findViewById(R.id.bt_add);
        //Intent intent = new Intent(this, MainActivity.class);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Add.this, MainActivity.class);
                String fn = edt.getText().toString();
                intent.putExtra("FolderName",fn);
                startActivity(intent);
            }
        });
    }
}