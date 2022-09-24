package com.example.exemplomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.exemplomvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding // configuração do binding
    private lateinit var viewModel: MainViewModel     // configuração do ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)  // instancia do binding inflando layout
        setContentView(binding.root) // configuração do binding


        binding.buttonLogin.setOnClickListener(this) // setando o botão para ser clicado


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java) // instanciando viewModel

        setObserver()  // chamada da função para observar as mudanças no viewModel

    }

    override fun onClick(view: View) { // função para o click
        if (view.id == R.id.button_Login) { // identifica qual botão esta sendo clicado
            val email = binding.editEmail.text.toString()  // captura com o binding o email
            val password = binding.editPsw.text.toString() // captura com o binding a senha

            // envia por paramento o email e senha para a função [doLigin] tratar/verificar os dados na view model
            viewModel.doLogin(email, password)
        }
    }

    private fun setObserver() {
                                                           // atribuição do uma variavel ao binding
        viewModel.welcome().observe(this, Observer {
            binding.textWelcome.text = it
        })
        // chama o viewModel -> chama o método -> usa o observe para verificar mudançãs no liveData
        // atribui isso a variavel do binding


        viewModel.login().observe(this, Observer {
            if(it == true) {
                Toast.makeText(this, "SUCESSO", Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "FALHA!", Toast.LENGTH_LONG).show()
            }
        })
    }
}