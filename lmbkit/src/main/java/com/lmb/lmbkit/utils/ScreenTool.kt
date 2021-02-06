package com.lmb.lmbkit.utils

import android.content.Context
import android.os.Build
import android.util.DisplayMetrics
import android.view.WindowManager
import com.lmb.lmbkit.MyContext

fun getScreenWidth():Int{
    return MyContext.context.resources.displayMetrics.widthPixels
}

fun getScreenHeight():Int{
    return MyContext.context.resources.displayMetrics.heightPixels
}

fun getScreenRealHeight():Int{
    val metrics = DisplayMetrics()
    if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.R){
        MyContext.context.display?.getRealMetrics(metrics)
    }else{
        val manager = MyContext.context.getSystemService(Context.WINDOW_SERVICE) as WindowManager
        manager.defaultDisplay.getRealMetrics(metrics)
    }
    return metrics.heightPixels
}

fun getScreenRatio():Float{
    return getScreenHeight() / getScreenWidth().toFloat()
}

fun getDensity():Float{
    val dm = MyContext.context.resources.displayMetrics
    return dm.density
}
