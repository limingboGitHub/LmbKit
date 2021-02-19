package com.lmb.lmbkit.utils

import android.util.Log
import com.lmb.lmbkit.BuildConfig

fun logD(tag:String,msg:String){
    if (BuildConfig.DEBUG)
        Log.d(tag,msg)
}

fun logE(tag:String,msg:String){
    if (BuildConfig.DEBUG)
        Log.e(tag,msg)
}