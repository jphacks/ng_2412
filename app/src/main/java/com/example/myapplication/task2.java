package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_task2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //登録ボタンを押した時
        findViewById(R.id.reg_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントの追加（これが遷移用ロジックです）
                Intent intent = new Intent(task2.this, task3.class);
                startActivity(intent);
            }
        });

        //もどるボタンを押した時
        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントの追加（これが遷移用ロジックです）
                Intent intent = new Intent(task2.this, task1.class);
                startActivity(intent);
            }
        });

    }
}