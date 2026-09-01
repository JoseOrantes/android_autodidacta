package com.example.auto_didacta.ui.profile

import android.os.Bundle
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.auto_didacta.R
import com.example.auto_didacta.data.profileRepository
import com.example.auto_didacta.ui.navigation.appNavigation

class profile : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContentView(R.layout.activity_profile)

		ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
			val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
			v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
			insets
		}

		// populate sample data from profileRepository
		val tvImage = findViewById<TextView>(R.id.tvImagePlaceholderProfile)
		val vNombre = findViewById<TextView>(R.id.valueNombreP)
		val vApellido = findViewById<TextView>(R.id.valueApellidoP)
		val vUsuario = findViewById<TextView>(R.id.valueUsuarioP)
		val vTelefono = findViewById<TextView>(R.id.valueTelefonoP)
		val vCorreo = findViewById<TextView>(R.id.valueCorreoP)
		val vFecha = findViewById<TextView>(R.id.valueFechaP)
		val vGenero = findViewById<TextView>(R.id.valueGeneroP)

		val repo = profileRepository()
		val sample = repo.getSampleUserProfile()

		vNombre.text = sample.nombre
		vApellido.text = sample.apellido
		vUsuario.text = sample.usuario
		vTelefono.text = sample.telefono
		vCorreo.text = sample.correo
		vFecha.text = sample.fechaNac
		vGenero.text = sample.genero
		tvImage.text = "Aca va la imagen"

		val btnLogout = findViewById<Button>(R.id.btnLogoutProfile)
		btnLogout.setOnClickListener {
			appNavigation.goToMain(this)
			finish()
		}
	}
}