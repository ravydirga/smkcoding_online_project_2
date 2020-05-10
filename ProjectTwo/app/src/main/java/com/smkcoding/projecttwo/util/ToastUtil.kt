package com.smkcoding.projecttwo.util

import android.widget.Toast
import android.content.Context


fun tampilToast(context: Context, message:String) {
    Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
}