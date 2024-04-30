package com.example.hesapmakinesi_odev5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hesapmakinesi_odev5.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.button0.setOnClickListener { appendNumber("0") }
        binding.button1.setOnClickListener { appendNumber("1") }
        binding.button2.setOnClickListener { appendNumber("2") }
        binding.button3.setOnClickListener { appendNumber("3") }
        binding.button4.setOnClickListener { appendNumber("4") }
        binding.button5.setOnClickListener { appendNumber("5") }
        binding.button6.setOnClickListener { appendNumber("6") }
        binding.button7.setOnClickListener { appendNumber("7") }
        binding.button8.setOnClickListener { appendNumber("8") }
        binding.button9.setOnClickListener { appendNumber("9") }
        binding.buttonTopla.setOnClickListener { appendNumber("+") }
        binding.buttonCikart.setOnClickListener { appendNumber("-") }
        binding.buttonBol.setOnClickListener { appendNumber("/") }
        binding.buttonCarp.setOnClickListener { appendNumber("*") }


        binding.buttonSonuc.setOnClickListener { calculateResult() }

        binding.buttonAC.setOnClickListener { tamaminiSil() }

        binding.buttonDEL.setOnClickListener { sil() }

            setContentView(binding.root)
    }

    private fun sil() {
        var silinecekIfade = binding.textView.text.toString()
        silinecekIfade = silinecekIfade.dropLast(1)
        binding.textView.text = "$silinecekIfade"
    }

    private fun tamaminiSil() {
        binding.textView.text = ""

    }



    private fun calculateResult() {
        val alinanDeger=binding.textView.text.toString()
        val topla = alinanDeger.split("+")
        val sayi1 = topla[0].toInt()
        val sayi2 = topla[1].toInt()
        val sonuc = sayi1 + sayi2
        binding.textView.text = "$sonuc"
    }





    private fun appendNumber(number: String) {
        // Başlangıçta "0" yazısını sil
        if (binding.textView.text == "0") {
            binding.textView.text = ""
        }
        binding.textView.append(number)
    }





}

