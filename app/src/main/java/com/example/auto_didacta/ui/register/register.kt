package com.example.auto_didacta.ui.register

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.auto_didacta.R
import com.example.auto_didacta.ui.navigation.appNavigation

class register : AppCompatActivity() {

	private lateinit var btnBackMain: Button
	private lateinit var btnRegisterSubmit: Button
	private lateinit var etNombre: EditText
	private lateinit var etApellido: EditText
	private lateinit var etUsuario: EditText
	private lateinit var etPasswordRegister: EditText
	private lateinit var etCorreo: EditText
	private lateinit var etTelefono: EditText
	private lateinit var etFechaNac: EditText
	private lateinit var etGenero: EditText
	private lateinit var etFotoBase64: EditText

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_register)

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}

		// find new inputs
		etNombre = findViewById(R.id.etNombre)
		etApellido = findViewById(R.id.etApellido)
		etUsuario = findViewById(R.id.etUsuario)
		etPasswordRegister = findViewById(R.id.etPasswordRegister)
		etCorreo = findViewById(R.id.etCorreo)
		etTelefono = findViewById(R.id.etTelefono)
		etFechaNac = findViewById(R.id.etFechaNac)
		etGenero = findViewById(R.id.etGenero)
		etFotoBase64 = findViewById(R.id.etFotoBase64)
		btnRegisterSubmit = findViewById(R.id.btnRegisterSubmit)
		btnBackMain = findViewById(R.id.btnBackMain)

		btnRegisterSubmit.setOnClickListener {
			Toast.makeText(this, "Register not implemented", Toast.LENGTH_SHORT).show()
		}

		btnBackMain.setOnClickListener {
			appNavigation.goToMain(this)
			finish()
		}
	}
}