package br.com.guilhermetantulli.appactionbutton

// Importa as classes necessárias para o código
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

// Declara a classe MainActivity que herda da classe AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da tela usando o arquivo de layout activity_main.xml
        setContentView(R.layout.activity_main)

        // Encontra o botão na interface do usuário usando o ID 'button'
        val button = findViewById<Button>(R.id.button)
        val textView = findViewById<TextView>(R.id.textView) // Encontra a TextView

        // Define um ouvinte de clique para o botão
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                val message = "Você pressionou o botão!"
                // Ação a ser executada quando o botão for clicado
                // Chama a função showToast para exibir uma mensagem de tostagem

                // Decomentar este bloqco para mostrar o toast
                //  showToast(message) // descomentar isso

                // Define o texto da TextView com a mensagem
                textView.text = message
            }
        })
    }

    //#Decomentar este  bloco de código para o toast
    // Função que exibe uma mensagem em um toast
    private fun showToast(message: String) {
        // Cria um objeto Toast para exibir a mensagem
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        Log.i("Button","O botão foi acionado")
    }


}

