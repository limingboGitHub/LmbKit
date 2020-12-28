package com.lmb.lmbkit.extend

import java.io.File
import java.io.FileInputStream

fun File.size():Long{
    var size = 0L
    if (exists()) {
        val fis = FileInputStream(this)
        size =  fis.available().toLong()
        fis.close()
    }
    return size
}