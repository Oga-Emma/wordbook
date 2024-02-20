package app.seven.wordbook

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform