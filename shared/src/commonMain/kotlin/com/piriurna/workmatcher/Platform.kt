package com.piriurna.workmatcher

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform