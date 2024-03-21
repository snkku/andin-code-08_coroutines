package ru.netology.coroutines.dto

data class Comment(
    val id: Long,
    val postId: Long,
    val userId: Long,
    val content: String,
    val published: String,
    val likedByMe: Boolean,
    val likes: Int = 0,
)