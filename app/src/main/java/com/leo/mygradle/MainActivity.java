package com.leo.mygradle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.just.agentweb.AgentWeb;

public class MainActivity extends AppCompatActivity {

    private AgentWeb mAgentWeb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAgentWeb = AgentWeb.with(this)
                .setAgentWebParent((LinearLayout) findViewById(R.id.ll), new LinearLayout.LayoutParams(-1, -1))
                .useDefaultIndicator()
                .createAgentWeb()
                .ready()
                .go("http://www.citizenmall.com.cn/wap/Index/index");
//                .go("https://www.baidu.com");

    }
}