package com.geektech.hm6

import java.io.Serializable

data class Song(
    val name: String, val artist: String,
    val duration: String,
    val image: String
): Serializable
