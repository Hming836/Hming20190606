package com.bwei.hming20190606;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.uuzuche.lib_zxing.activity.CodeUtils;

public class CodeActivity extends AppCompatActivity {

    private EditText et;
    private ImageView iv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_code);
        et = findViewById(R.id.et_code);
        iv = findViewById(R.id.iv);
        findViewById(R.id.bt1_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trim = et.getText().toString().trim();
                if (trim.isEmpty()) {
                    Toast.makeText(CodeActivity.this, "输入内容为空!!", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    et.setText("");
                    //BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                    //                imageView.setImageBitmap(mBitmap);
                    Bitmap image = CodeUtils.createImage(trim, 400, 400, BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                    iv.setImageBitmap(image);
                }

            }
        });
        findViewById(R.id.bt2_code).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String trim = et.getText().toString().trim();
                if (trim.isEmpty()) {
                    Toast.makeText(CodeActivity.this, "输入内容为空!!", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    et.setText("");
                    //BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher));
                    //                imageView.setImageBitmap(mBitmap);
                    Bitmap image = CodeUtils.createImage(trim, 400, 400, null);
                    iv.setImageBitmap(image);
                }
            }
        });
    }
}
