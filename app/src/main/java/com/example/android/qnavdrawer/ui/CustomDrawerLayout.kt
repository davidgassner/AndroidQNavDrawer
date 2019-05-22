package com.example.android.qnavdrawer.ui

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Rect
import android.util.AttributeSet
import androidx.core.os.BuildCompat
import androidx.drawerlayout.widget.DrawerLayout

class CustomDrawerLayout : DrawerLayout {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle)

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
        super.onLayout(changed, l, t, r, b)

        // TODO: replace condition with version check after API has been finalized
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
        if (BuildCompat.isAtLeastQ()) {
            @SuppressLint("DrawAllocation")
            val rectangle = Rect(0, 0, 100, b)
            systemGestureExclusionRects = listOf(rectangle)
        }

    }

}