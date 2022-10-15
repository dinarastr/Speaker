package ru.dinarastepina.speaker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashActivity : AppCompatActivity() {

    lateinit var handler:Handler


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        handler = Handler(Looper.getMainLooper())
        supportActionBar?.hide()

        handler.postDelayed(
            {
                startActivity(Intent(this, MainActivity::class.java))
                finish()
        },
            2000)
    }
}