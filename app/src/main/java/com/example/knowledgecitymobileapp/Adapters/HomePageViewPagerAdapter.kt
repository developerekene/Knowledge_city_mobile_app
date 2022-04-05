package com.example.knowledgecitymobileapp.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import com.example.knowledgecitymobileapp.Model.MyModel
import com.example.knowledgecitymobileapp.R

class HomePageViewPagerAdapter(private val context: Context, private val myModelArrayList: ArrayList<MyModel>): PagerAdapter() {
    override fun getCount(): Int {
        return myModelArrayList.size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        //inflate home_view_pager_item
        var myView = LayoutInflater.from(context).inflate(R.layout.home_view_pager_item, container, false)

        //get data
        val model = myModelArrayList[position]
        val title = model.title
        val description = model.desc
        val image = model.image

        myView.findViewById<ImageView>(R.id.my_card_view_image).setImageResource(image)
        myView.findViewById<TextView>(R.id.card_title_text).text = title
        myView.findViewById<TextView>(R.id.card_desc_text).text = description

        myView.setOnClickListener { Toast.makeText(context, "$title \n $description", Toast.LENGTH_SHORT).show() }

        container.addView(myView, position)
        return myView
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }
}