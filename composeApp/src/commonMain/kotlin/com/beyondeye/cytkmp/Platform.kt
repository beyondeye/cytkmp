package com.beyondeye.cytkmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform