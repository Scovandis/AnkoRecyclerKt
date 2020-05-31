package com.example.ankorecyclerkt

import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import org.jetbrains.anko.*

class  MoviewUi : AnkoComponent<ViewGroup>{
    companion object{
        val tvTitleId = 1
        val tvYearId = 2
    }

    override fun createView(ui: AnkoContext<ViewGroup>): View = with(ui){
        verticalLayout {
            lparams(matchParent, wrapContent)
            padding = dip(16)

            textView{
                id = tvTitleId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "Sharelock"
                textSize = 16f
                textColor = Color.BLACK
            }
            textView{
                id = tvYearId
                layoutParams = LinearLayout.LayoutParams(matchParent, wrapContent)
                text = "2009"
                textSize = 16f
            }

        }
    }






}