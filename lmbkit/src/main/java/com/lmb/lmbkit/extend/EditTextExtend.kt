package com.lmb.lmbkit.extend

import android.content.Context
import android.view.inputmethod.InputMethodManager
import android.widget.EditText

fun EditText.showSoftInput(context: Context){
    isFocusableInTouchMode =true
    isFocusable = true
    requestFocus()
    setSelection(text.toString().length)

    val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(this,0)
}