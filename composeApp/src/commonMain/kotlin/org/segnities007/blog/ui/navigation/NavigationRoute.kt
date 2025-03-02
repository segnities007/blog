package org.segnities007.blog.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavigationRoute(
    val name: String,
) {
    @Serializable
    data object Home : NavigationRoute(name = "Home")

    @Serializable
    data class Blog(
        val pageID: Int,
    ) : NavigationRoute(name = "Blog")

    @Serializable
    data object CreateBlog : NavigationRoute(name = "CreateBlog")
}
