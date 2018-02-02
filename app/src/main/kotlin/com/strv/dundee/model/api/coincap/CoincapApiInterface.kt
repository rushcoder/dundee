package com.strv.dundee.model.api.coincap

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface CoincapApiInterface {

	@GET("page/{coin}")
	fun getTicker(@Path("coin") coin: String): Call<CoincapTickerResponse>
}
