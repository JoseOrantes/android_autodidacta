package com.example.auto_didacta.data.apis

// Profile record returned by GET profile
data class Profile(
	val id: Int,
	val userId: Int,
	val fotoBase64: String?,
	val telefono: String?,
	val fechaNac: String?,
	val genero: String?,
	val createdAt: String?,
	val updatedAt: String?
)

// Wrapper for profile responses
data class ProfileBody(
	val profile: Profile
)

// Full profile response (envelope + body)
data class ProfileResponse(
	val standardResponse: StandardResponse,
	val body: Profile
)

// Request to update profile (PUT /api/users/:id/profile)
data class UpdateProfileRequest(
	val fotoBase64: String?,
	val telefono: String?,
	val fechaNac: String?,
	val genero: String?
)

// Hardcoded sample user + profile for UI preview
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

val SAMPLE_USER = SampleUserProfile(
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

