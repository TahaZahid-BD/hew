package com.tahazahid.android.hew.utils

import android.view.View

fun View.setSafeOnClickListener(onSafeClick: (View) -> Unit) {
    val safeClickListener = SafeOnClickListener {
        onSafeClick(it)
    }
    setOnClickListener(safeClickListener)
}