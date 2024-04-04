package br.com.guilhermetantulli.AppCadastro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val editTextNome = findViewById<EditText>(R.id.textNome)
    val editTextTelefone = findViewById<EditText>(R.id.textPhone)
    val editTextEmail = findViewById<EditText>(R.id.textEmail)
    val spinnerTipoTelefone = findViewById<Spinner>(R.id.spinnerTipoTelefone)
    val checkBoxTelefone = findViewById<CheckBox>(R.id.checkBoxTelefone)
    val checkBoxEmail = findViewById<CheckBox>(R.id.checkBoxEmail)
    val buttonMostrarMensagem = findViewById<Button>(R.id.button)

    val tiposTelefone = arrayOf("Residencial","Comercial")
    val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, tiposTelefone)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerTipoTelefone.adapter = adapter

    buttonMostrarMensagem.setOnClickListener(View.OnClickListener {
        val nome = editTextNome.text.toString()
        val telefone = editTextTelefone.text.toString()
        val email = editTextEmail.text.toString()
        val tipoTelefone = spinnerTipoTelefone.selectedItem.toString()
        val contatoTelefone = checkBoxTelefone.isChecked
        val contatoEmail = checkBoxEmail.isChecked


        if (nome.isEmpty()) {
            showAlert("Preencha o campo Nome.")
            return@OnClickListener
        }

        if (!contatoTelefone && !contatoEmail) {
            showAlert("Selecione pelo menos uma preferência de contato (Telefone ou Email).")
            return@OnClickListener
        }

        if (contatoTelefone && telefone.isEmpty()) {
            showAlert("Preencha o campo Telefone ou desmarque essa preferência.")
            return@OnClickListener
        }

        if (contatoEmail && email.isEmpty()) {
            showAlert("Preencha o campo Email ou desmarque essa preferência.")
            return@OnClickListener
        }

        val mensagem = StringBuilder("Nome: $nome\n")

        if (contatoTelefone && !telefone.isEmpty()) {
            mensagem.append("Tipo: $tipoTelefone\n")
            mensagem.append("Telefone: $telefone\n")
        }

        if (contatoEmail && !email.isEmpty()) {
            mensagem.append("Email: $email\n")
        }

        if (checkBoxTelefone.isChecked) {
            mensagem.append("Contato Telefone")
        }

        if (checkBoxEmail.isChecked) {
            mensagem.append("Contato Email")
        }

        showInfoDialog("Informações digitadas: ", mensagem)
        })
    }
    private fun showAlert(message: String) {
        val builder = androidx.appcompat.app.AlertDialog.Builder(this)
        builder.setTitle("Desculpe! Atenção")
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
        val dialog = builder.create()
        dialog.show()
    }

    private fun showInfoDialog(title: String, message: StringBuilder) {
        val builder = AlertDialog.Builder(this)
        builder.setTitle(title)
        builder.setMessage(message)
        builder.setPositiveButton("OK") { dialog, _ -> dialog.dismiss() }
        val dialog = builder.create()
        dialog.show()
    }



}