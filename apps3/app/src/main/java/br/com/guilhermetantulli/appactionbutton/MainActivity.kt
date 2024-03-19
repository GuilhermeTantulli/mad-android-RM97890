package br.com.guilhermetantulli.appactionbutton

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


//Declarando a classe MainActivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button = findViewById<Button>(R.id.button) // encontra o button
        val textView = findViewById<TextView>(R.id.textView) // encontra a textview

        // Define um ouvinte de clique para o botão
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val message = "Você pressionou o botão!"

                // Atribuir ao botão
                // chamada da função 'showToast' para exibir uma mensagem de 'toastagem'

                textView.text = message
                showToast(message)

            }

        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        Log.i("Button", "O botão foi acionado")
    }
}