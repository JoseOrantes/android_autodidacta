package com.example.auto_didacta.data

import com.example.auto_didacta.data.apis.Profile

//Quemado pero aca ira api para aws
class profileRepository {

	data class SampleUserProfile(
		val nombre: String,
		val apellido: String,
		val usuario: String,
		val password: String,
		val fotoBase64: String?,
		val telefono: String?,
		val correo: String?,
		val fechaNac: String?,
		val genero: String?
	)

	// Return the hardcoded sample user+profile
	fun getSampleUserProfile(): SampleUserProfile {
		return SampleUserProfile(
			nombre = "Jose",
			apellido = "Orantes",
			usuario = "jose123",
			password = "1234",
			fotoBase64 = null,
			telefono = "5551234567",
			correo = "admin@email.com",
			fechaNac = "1998-04-12",
			genero = "M"
		)
	}

	// Optional: produce a Profile object for endpoints using api model
	fun getSampleProfile(): Profile {
		return Profile(
			id = 1,
			userId = 1,
			fotoBase64 = null,
			telefono = "5551234567",
			fechaNac = "1998-04-12",
			genero = "M",
			createdAt = null,
			updatedAt = null
		)
	}
}