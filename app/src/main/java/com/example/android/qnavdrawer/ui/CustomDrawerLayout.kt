package com.example.android.qnavdrawer.ui

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import android.util.Log
import androidx.drawerlayout.widget.DrawerLayout

class CustomDrawerLayout : DrawerLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)

        Log.i("AndroidQ", "onLayout: $l, $t, $r, $b")

        @SuppressLint("DrawAllocation")
        val rectangle = Rect(0, 0, 100, b)
        val rectangles = listOf(rectangle)
        systemGestureExclusionRects = rectangles

    }

}