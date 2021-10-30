package com.udacoding.nandostoaster

import android.content.Context
import android.widget.Toast

class ToasterNandos {

    companion object {
        fun s(c: Context, msg: String) {
            Toast.makeText(c, msg, Toast.LENGTH_SHORT).show()
        }

    }
}