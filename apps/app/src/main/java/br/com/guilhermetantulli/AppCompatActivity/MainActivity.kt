// Pacote onde a classe está localizada:
package br.com.guilhermetantulli.AppCompatActivity

// Importações de bibliotecas necessarias:
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

// Definição da Classe MainActivity que herda da classe AppCompatActivity:
class MainActivity : AppCompatActivity() {

    // Declaração de propriedades para as views que serão usadas na atividade
    private lateinit var nomeEmpresa: TextView
    private lateinit var atuacaoEmpresa: TextView
    private lateinit var resultado: TextView


    // Método chamado quando a atividade é criada
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Define o layout da atividade a partir do arquivo XML (activity.main.xml)
        setContentView(R.layout.activity_main)

        // Inicializa as propriedades com as views correspondetes
        nomeEmpresa = findViewById(R.id.nomeEmpresa)
        atuacaoEmpresa = findViewById(R.id.atuacaoEmpresa)
        resultado = findViewById(R.id.resultado)

        nomeEmpresa.text = "Mirae Asset"
        atuacaoEmpresa.text = "Product Owner"
        resultado.text = ""
    }

    // Função chamada quando o botão é tapado
    fun combinarTextos(view: View) {
        // criar uma string combinando o texto das view nomeEmpresa e atuacaoEmpresa
        val textoFinal = "${nomeEmpresa.text} - ${atuacaoEmpresa.text}"

        // Define o texto da view resultado com o texto combinado
        resultado.text = textoFinal
    }
}