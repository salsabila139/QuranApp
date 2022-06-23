package com.salsabila.idn.samaquran.data.remote.retrofit

import com.salsabila.idn.samaquran.data.remote.response.DetailResponse
import com.salsabila.idn.samaquran.data.remote.response.SuratResponse
import com.salsabila.idn.samaquran.data.remote.response.TafsirResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("surat")
    fun getListSurat(): Call<SuratResponse>

    @GET("surat/{nomor}")
    fun getDetailSurat(
        @Path("nomor") nomor: String
    ): Call<DetailResponse>

    @GET("tafsir/{nomor}")
    fun getTafsirSurat(
        @Path("nomor") nomor: String
    ): Call<TafsirResponse>

}