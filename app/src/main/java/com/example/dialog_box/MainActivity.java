package com.example.dialog_box;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) this.findViewById(R.id.loginbtn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                final View viewDialog = LayoutInflater.from(MainActivity.this).inflate(R.layout.custom,null,false);
                builder.setTitle("登录入口")
                        .setView(viewDialog)
                        .setPositiveButton("确定", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                EditText editTextuserId = viewDialog.findViewById(R.id.userid);
                                EditText editTextpwd = viewDialog.findViewById(R.id.pwd);

                                if(editTextuserId.getText().toString().equals("abc")&& editTextpwd.getText().toString().equals("123")){
                                    Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                                }
                                else{
                                    Toast.makeText(MainActivity.this,"登录失败",Toast.LENGTH_LONG).show();
                                }
                            }
                        });
                builder.show();
            }
        });

    }
}