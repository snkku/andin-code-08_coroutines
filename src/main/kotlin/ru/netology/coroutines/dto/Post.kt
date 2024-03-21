package ru.netology.coroutines.dto

data class Post(
    val id: Long,
    val userId: Long,
    var author: Author,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
    val likes: Int = 0,
    var attachment: Attachment? = null,
)