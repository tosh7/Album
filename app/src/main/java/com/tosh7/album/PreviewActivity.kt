package com.tosh7.album

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_preview.*

class PreviewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        val imageId = intent.getIntExtra("image", 0)
        preview_image.setImageResource(imageId)

        back_button.setOnClickListener {
            finish()
        }
    }
}
