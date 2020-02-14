package com.example.app_2020_0212

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.core.os.postDelayed
import kotlinx.android.synthetic.main.activity_fullscreen.*
import kotlinx.android.synthetic.main.activity_spalsh.*
import kotlinx.android.synthetic.main.activity_spalsh.fullscreen_content

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class SpalshActivity : AppCompatActivity() {
    private val mHideHandler = Handler()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_spalsh)

        fullscreen_content.systemUiVisibility =
            View.SYSTEM_UI_FLAG_LOW_PROFILE or
                    View.SYSTEM_UI_FLAG_FULLSCREEN or
                    View.SYSTEM_UI_FLAG_LAYOUT_STABLE or
                    View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY or
                    View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION or
                    View.SYSTEM_UI_FLAG_HIDE_NAVIGATION

        Handler().postDelayed({
            val nextIntent = Intent(this, MainActivity::class.java)
            startActivity(nextIntent)
            finish()
        }, AUTO_HIDE_DELAY_MILLIS.toLong())

    }

    companion object {
        private val AUTO_HIDE_DELAY_MILLIS = 3000
    }
}
