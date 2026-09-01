package com.example.auto_didacta.data.apis

// Request for POST /api/register
data class RegisterRequest(
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

// Created user info returned by register
data class RegisterUser(
	val id: Int,
	val nombre: String,
	val apellido: String,
	val usuario: String
)

// Profile data included in register response
data class ProfileShort(
	val id: Int,
	val userId: Int,
	val fotoBase64: String?,
	val telefono: String?,
	val fechaNac: String?,
	val genero: String?
)

// Body of register response
data class RegisterBody(
	val user: RegisterUser,
	val profile: ProfileShort
)

// Full register response (envelope + body)
data class RegisterResponse(
	val standardResponse: StandardResponse,
	val body: RegisterBody
)

