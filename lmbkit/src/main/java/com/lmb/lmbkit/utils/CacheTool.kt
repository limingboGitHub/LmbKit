package com.lmb.lmbkit.utils

import android.content.Context
import com.lmb.lmbkit.MyContext

fun saveCache(spName:String,key:String,value:String?){
    val sp = MyContext.context.getSharedPreferences(spName, Context.MODE_PRIVATE)
    val edit = sp.edit()
    edit.putString(key,value)
    edit.apply()
}

fun getCache(spName:String,key:String):String{
    val sp = MyContext.context.getSharedPreferences(spName, Context.MODE_PRIVATE)
    return sp.getString(key,"")?:""
}
