package com.lmb.lmbkit

import android.content.Context
import androidx.startup.Initializer

/**
 * startup利用ContentProvider初始化全局Context
 */
class ContextInitializer : Initializer<Context>{

    override fun create(context: Context): Context {
        MyContext.init(context)
        return context
    }

    override fun dependencies(): List<Class<out Initializer<*>>> {
        return emptyList()
    }
}