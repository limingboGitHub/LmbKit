package com.lmb.lmbkit

import android.content.Context

object MyContext{

    lateinit var context: Context

    fun init(context: Context) {
        MyContext.context = context
    }

}