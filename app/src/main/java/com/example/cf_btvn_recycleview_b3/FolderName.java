package com.example.cf_btvn_recycleview_b3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class FolderName{
    public FolderName() {
    }

    public FolderName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}