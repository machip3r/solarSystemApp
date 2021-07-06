package com.compubac.spacelearning

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
    }

    private fun initViews() {
        val cvSun = findViewById<CardView>(R.id.cv_sun)
        val cvMercury = findViewById<CardView>(R.id.cv_mercury)
        val cvVenus = findViewById<CardView>(R.id.cv_venus)
        val cvTerra = findViewById<CardView>(R.id.cv_terra)
        val cvMars = findViewById<CardView>(R.id.cv_mars)
        val cvJupiter = findViewById<CardView>(R.id.cv_jupiter)
        val cvSaturn = findViewById<CardView>(R.id.cv_saturn)
        val cvUranus = findViewById<CardView>(R.id.cv_uranus)
        val cvNeptune = findViewById<CardView>(R.id.cv_neptune)
        val cvMoon = findViewById<CardView>(R.id.cv_moon)
        val cvCP = findViewById<CardView>(R.id.cv_cp)
        val cvPE = findViewById<CardView>(R.id.cv_pe)
        val cvInfo = findViewById<CardView>(R.id.cv_info)

        val mediaPlayer = MediaPlayer.create(this, R.raw.clic)

        cvSun?.setOnClickListener {
            val intent = Intent(this, SunActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvMercury?.setOnClickListener {
            val intent = Intent(this, MercuryActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvVenus?.setOnClickListener {
            val intent = Intent(this, VenusActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvTerra?.setOnClickListener {
            val intent = Intent(this, TerraActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvMars?.setOnClickListener {
            val intent = Intent(this, MarsActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvJupiter?.setOnClickListener {
            val intent = Intent(this, JupiterActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvSaturn?.setOnClickListener {
            val intent = Intent(this, SaturnActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvUranus?.setOnClickListener {
            val intent = Intent(this, UranusActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvNeptune?.setOnClickListener {
            val intent = Intent(this, NeptuneActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvMoon?.setOnClickListener {
            val intent = Intent(this, MoonActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvCP?.setOnClickListener {
            val intent = Intent(this, CPActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvPE?.setOnClickListener {
            val intent = Intent(this, PEActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }

        cvInfo?.setOnClickListener {
            val intent = Intent(this, InfoActivity::class.java)

            mediaPlayer.stop()
            mediaPlayer.prepare()
            mediaPlayer.seekTo(0)
            mediaPlayer.start()

            startActivity(intent)
        }
    }
}