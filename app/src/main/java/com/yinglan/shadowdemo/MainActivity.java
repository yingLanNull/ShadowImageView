package com.yinglan.shadowdemo;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.yinglan.shadowimageview.ShadowImageView;

public class MainActivity extends AppCompatActivity {

    private com.yinglan.shadowimageview.ShadowImageView shadow;
    private int resId = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.shadow = (ShadowImageView) findViewById(R.id.shadow);

        shadow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int res = R.mipmap.lotus;
                switch (resId) {
                    case 1:
                        res = R.mipmap.mountain;
                        resId = 2;
                        break;
                    case 2:
                        res = R.mipmap.sunset;
                        resId = 3;
                        break;
                    case 3:
                        res = R.mipmap.red;
                        resId = 4;
                        break;
                    case 4:
                        res = R.mipmap.lotus;
                        resId = 1;
                        break;
                }
                if (resId == 1 || resId == 3)
                    shadow.setImageResource(res);
                else
                    shadow.setImageDrawable(getResources().getDrawable(res));
            }
        });
    }
}
