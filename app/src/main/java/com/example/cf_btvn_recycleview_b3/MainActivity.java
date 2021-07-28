package com.example.cf_btvn_recycleview_b3;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuAdapter;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
        Toolbar mytoolbar;
        RecyclerView rvfoldername;
        List<FolderName> folderNames = new ArrayList<>();
        MyAdapter adapter;
        ImageView im1, im2, im3;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mytoolbar = findViewById(R.id.toolbaar);
        setSupportActionBar(mytoolbar);// ho tro toolbar
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        rvfoldername = (RecyclerView) findViewById(R.id.rvfoldername);
        folderNames = new ArrayList<>();

        Intent intent = getIntent();
        String s = intent.getStringExtra("FolderName");
        FolderName fn = new FolderName(s);
        folderNames.add(fn);



        adapter = new MyAdapter(folderNames, getApplicationContext());
        LinearLayoutManager manager = new LinearLayoutManager(getApplicationContext());
        rvfoldername.setAdapter(adapter);
        rvfoldername.setLayoutManager(manager);
        im3 =(ImageView)findViewById(R.id.imadd);
        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent((MainActivity.this), Add.class);
                startActivity(i);
            }
        });



       /* im1 = (ImageView)findViewById(R.id.imvupdate);
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edit();
            }
        });
        im2 = (ImageView) findViewById(R.id.imvdel);
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                del();

            }
        });

    }

    private void del() {
    }

    private void edit() {

    }*/
    }
//    private void setFolderNameData() {
//        Intent intent = getIntent();
//        String mfoldername = intent.getExtras().getString("FolderName");
////        FolderName fn = new FolderName("foldername");
////        folderNames.add(fn);
////        fn = new FolderName("Video");
////        folderNames.add(fn);
////        fn = new FolderName("Android");
////        folderNames.add(fn);
////        fn = new FolderName("App");
////        folderNames.add(fn);
////        fn = new FolderName("foldername");
////        folderNames.add(fn);
////        fn = new FolderName("foldername");
////        folderNames.add(fn);
//
//        FolderName fn = new FolderName(mfoldername);
//        folderNames.add(fn);
//        adapter.notifyDataSetChanged();
//
//
//     //   Intent intent = getIntent();
////        String foldername = intent.getExtras().getString("FolderName");;
////        FolderName fn = new FolderName(foldername);
////        folderNames.add(fn);
//
//    }
}