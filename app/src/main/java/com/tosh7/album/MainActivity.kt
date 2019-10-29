package com.tosh7.album

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent(this, PreviewActivity::class.java)

        imageView.setOnClickListener {
            intent.putExtra("image", R.drawable.ocean)
            startActivity(intent)
        }

        imageView2.setOnClickListener {
            intent.putExtra("image", R.drawable.portugal)
            startActivity(intent)
        }

        imageView3.setOnClickListener {
            intent.putExtra("image", R.drawable.sakura)
            startActivity(intent)
        }

        imageView4.setOnClickListener {
            intent.putExtra("image", R.drawable.ship)
            startActivity(intent)
        }

        imageView5.setOnClickListener {
            intent.putExtra("image", R.drawable.waterfall)
            startActivity(intent)
        }

        imageView6.setOnClickListener {
            intent.putExtra("image", R.drawable.yukata)
            startActivity(intent)
        }
    }
}
