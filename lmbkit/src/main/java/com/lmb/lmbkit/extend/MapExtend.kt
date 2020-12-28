package com.lmb.lmbkit.extend

import java.lang.Exception

fun <K,V>Map<K,V>.getString(key:K,default:String):String{
    return try {
        get(key).toString()
    }catch (e:Exception){
        default
    }
}

fun <K,V>Map<K,V>.getInt(key:K,default:Int):Int{
    return try {
        val value = get(key)
        if (value is Double)
            return value.toInt()
        else
            value as Int
    }catch (e:Exception){
        default
    }
}