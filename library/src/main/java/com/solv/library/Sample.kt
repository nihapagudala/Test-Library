package com.solv.library

import android.content.Context
import android.widget.Toast

class Sample {
    companion object {
        fun showSampleText(c: Context?, message: String?) {
            Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
        }
    }
}