package org.danylnatife.habit_tracker_kmp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform