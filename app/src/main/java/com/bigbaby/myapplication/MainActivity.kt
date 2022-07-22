package com.bigbaby.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import com.bigbaby.myapplication.base.BaseActivity
import com.bigbaby.myapplication.proxymode.ProxyModeActivity

class MainActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tv_proxy_mode).setOnClickListener {
            val intent = Intent()
            intent.setClass(this, ProxyModeActivity :: class.java)
            startActivity(intent)
        }

    }
}