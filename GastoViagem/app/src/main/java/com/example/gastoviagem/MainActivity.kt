package com.example.gastoviagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.gastoviagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
//    private lateinit var textKotlin: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCalculate.setOnClickListener(this)

//        textKotlin = findViewById<TextView>(R.id.button_calculate)

    }

    override fun onClick(view: View) {
        if( view.id == R.id.button_calculate ) {
            calculate()
        }
    }

    private fun isValid():Boolean {
        return (binding.editDistance.text.toString() != "" &&
                binding.editPrice.text.toString() != "" &&
                binding.editAutonomy.text.toString() != "" &&
                binding.editAutonomy.text.toString().toFloat() != 0f)
    }

//    private fun isValid(): Boolean {
//            if(binding.editDistance.text.toString() != "" &&
//                binding.editPrice.text.toString() != "" &&
//                binding.editAutonomy.text.toString() != "" &&
//                binding.editAutonomy.text.toString().toFloat() != 0f){
//                return true
//            }else {
//                return false
//            }
//    }

    private fun calculate() {
        if(isValid()) {
            val distance  = binding.editDistance.text.toString().toFloat()
            val price = binding.editPrice.text.toString().toFloat()
            val autonomy = binding.editAutonomy.text.toString().toFloat()

            val totalValue = (distance * price) / autonomy
            val totalValueStr = "R$ ${"%.2f".format(totalValue)}"

            binding.textTotalValue.text = totalValueStr
        }
        else {
            Toast.makeText(this, R.string.validation_fill_all_fields, Toast.LENGTH_LONG).show()
        }



    }

}


