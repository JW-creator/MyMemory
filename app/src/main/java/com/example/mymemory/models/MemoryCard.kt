package com.example.mymemory.models

data class MemoryCard(
    val identifier: Int,
    val imageUrl: String? = null,
    var isFaceUp: Boolean = false,
    var isMatch: Boolean = false
)
