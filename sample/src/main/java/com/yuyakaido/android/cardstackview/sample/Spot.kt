package com.yuyakaido.android.cardstackview.sample

data class Spot(
        val id: Long = counter++,
        val name: String,
        val city: String,
        val url: String,
        val kanan:String ="kanan",
        val kiri:String ="kiri"
) {
    companion object {
        private var counter = 0L
    }
}
