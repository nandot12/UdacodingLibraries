package com.udacoding.udacodinglibraries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.udacoding.nandostoaster.ToasterNandos

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        ToasterNandos.s(this,"")
    }
}