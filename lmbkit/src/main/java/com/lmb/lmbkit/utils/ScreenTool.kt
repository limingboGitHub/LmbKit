package com.lmb.lmbkit.utils

import com.lmb.lmbkit.MyContext

fun getScreenWidth():Int{
    return MyContext.context.resources.displayMetrics.widthPixels
}

fun getScreenHeight():Int{
    return MyContext.context.resources.displayMetrics.heightPixels
}

fun getScreenRatio():Float{
    return getScreenHeight() / getScreenWidth().toFloat()
}

fun getDensity():Float{
    val dm = MyContext.context.resources.displayMetrics
    return dm.density
}
