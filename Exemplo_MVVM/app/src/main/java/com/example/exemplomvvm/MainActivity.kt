package com.example.exemplomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.exemplomvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding // configuração do binding
    private lateinit var viewModel: MainViewModel     // configuração do ViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)  // instancia do binding inflando layout
        setContentView(binding.root) // configuração do binding


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java) // instanciando viewModel

        setObserver()  // chamada da função para observar as mudanças no viewModel

    }

    private fun setObserver() {
                                                           // atribuição do uma variavel ao binding
        viewModel.welcome().observe(this, Observer { binding.textWelcome.text = it })
        // chama o viewModel -> chama o método -> usa o observe para verificar mudançãs no liveData
        // atribui isso a variavel do binding
    }
}