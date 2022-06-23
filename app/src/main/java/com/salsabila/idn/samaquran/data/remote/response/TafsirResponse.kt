package com.salsabila.idn.samaquran.data.remote.response

import com.google.gson.annotations.SerializedName

data class TafsirResponse(

	@field:SerializedName("nama")
	val nama: String,

	@field:SerializedName("nama_latin")
	val namaLatin: String,

	@field:SerializedName("tafsir")
	val tafsir: List<TafsirItem>,

	@field:SerializedName("jumlah_ayat")
	val jumlahAyat: String,

	@field:SerializedName("tempat_turun")
	val tempatTurun: String,

	@field:SerializedName("arti")
	val arti: String,

	@field:SerializedName("nomor")
	val nomor: String,

	@field:SerializedName("status")
	val status: Boolean
)

data class TafsirItem(

	@field:SerializedName("ayat")
	val ayat: String,

	@field:SerializedName("tafsir")
	val tafsir: String
)
