package com.helios.githubuserbrowser.core.network.dto

import com.helios.githubuserbrowser.core.data.model.UserModel
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class UserDto(
    @SerialName("login")
    val userName: String,
    @SerialName("avatar_url")
    val avatarUrl: String,
    @SerialName("html_url")
    val landingPageUrl: String
)

fun UserDto.asExternalModel() = UserModel(
    userName = userName,
    avatarUrl = avatarUrl,
    landingPageUrl = landingPageUrl
)