package com.example.auto_didacta
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.EditText
import android.widget.TextView
import android.view.View

class MainActivity : AppCompatActivity() {

    private lateinit var editText1: EditText
    private lateinit var editText2: EditText
    private lateinit var textView1: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Muestra mensaje pop up en pantalla
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val matematica: Int = 5
        val quimica: Int = 7
        val fisica: Int = 7
        val promedio = (matematica + quimica + fisica)/3

        if(promedio >= 6){
            Toast.makeText(this, "Arriba de estandard: $promedio", Toast.LENGTH_LONG).show()
        }
        else if (promedio <= 5){
            Toast.makeText(this, "Debajo de estandard: $promedio", Toast.LENGTH_LONG).show()
        }

        //Ya va lo grafico
        //Se llaman las ids de las cajitas de texto
        editText1 = findViewById(R.id.editTextNumber)
        editText2 = findViewById(R.id.editTextNumber2)
        textView1 = findViewById(R.id.txtresultado)
    }

    // Haciendo la suma
    fun sumar(view: View) {
        val valor1 = editText1.text.toString()
        val valor2 = editText2.text.toString()

        val num1 = valor1.toInt()
        val num2 = valor2.toInt()
        val suma = num1 + num2

        val resul = suma.toString()
        textView1.text = resul
    }
    /*
    //Ciclo de vida de la aplicacion
    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }
    */
}