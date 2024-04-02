package br.com.guilhermetantulli.appdino

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    private lateinit var imagem : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imagem = findViewById(R.id.imageView)
    }

    fun cliqueBotao(view: View) {
        when (view.id) {

            R.id.btn1 -> imagem.setImageResource(R.drawable.dino1)
            R.id.btn2 -> imagem.setImageResource(R.drawable.dino2)
            R.id.btn3 -> imagem.setImageResource(R.drawable.dino3)

        }
    }

}