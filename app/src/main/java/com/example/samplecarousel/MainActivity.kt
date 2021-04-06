package com.example.samplecarousel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.synnapps.carouselview.CarouselView
import com.synnapps.carouselview.ImageListener

class MainActivity : AppCompatActivity()
{
    private var imageArray: ArrayList<Int> = ArrayList()
    private var carouselView: CarouselView? = null

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageArray.add(R.drawable.first)
        imageArray.add(R.drawable.second)
        imageArray.add(R.drawable.third)
        imageArray.add(R.drawable.fourth)

        carouselView = findViewById(R.id.carouselView)

        carouselView?.pageCount = imageArray.size

        carouselView?.setImageListener(imageListener)
    }

    private var imageListener = ImageListener { position, imageView -> imageView.setImageResource(imageArray[position]) }
}