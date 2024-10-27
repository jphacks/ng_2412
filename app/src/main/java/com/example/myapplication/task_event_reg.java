package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class task_event_reg extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_task_event_reg);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //タスクボタンを押した時
        findViewById(R.id.task_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントの追加（これが遷移用ロジックです）
                Intent intent = new Intent(task_event_reg.this, task0.class);
                startActivity(intent);
            }
        });

        //イベントボタンを押したとき
        findViewById(R.id.event_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントの追加（これが遷移用ロジックです）
                Intent intent = new Intent(task_event_reg.this, event_0.class);
                startActivity(intent);
            }
        });



        //もどるボタンを押した時
        findViewById(R.id.back_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //インテントの追加（これが遷移用ロジックです）
                Intent intent = new Intent(task_event_reg.this, TemplateActivity.class);
                startActivity(intent);
            }
        });

    }
}