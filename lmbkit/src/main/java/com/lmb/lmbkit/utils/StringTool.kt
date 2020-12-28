package com.lmb.lmbkit.utils

import com.lmb.lmbkit.MyContext

fun getString(resId:Int):String{
    return MyContext.context.getString(resId)
}