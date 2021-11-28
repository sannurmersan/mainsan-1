package com.mintcho.wwmarket2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub2_negofinal.*

class Sub2NegofinalaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub2_negofinala)

        button_gotomainsub.setOnClickListener {
            val intent = Intent(this, SubActivity::class.java)  //네고하기
            startActivity(intent)
        }
    }
}