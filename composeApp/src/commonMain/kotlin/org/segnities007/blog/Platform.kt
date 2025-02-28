package org.segnities007.blog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform