package com.demo.tabassumkhanam_movies.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.demo.tabassumkhanam_movies.R
import com.demo.tabassumkhanam_movies.utils.ConstantsUtils

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            callMainActivity()
        }, ConstantsUtils.SPLASH_DURATION)
    }

    /**
     * Call Main activity and finish Splash activity
     */
    private fun callMainActivity() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}
