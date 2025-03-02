package org.segnities007.blog.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.segnities007.blog.ui.screen.Blog
import org.segnities007.blog.ui.screen.CreateBlog
import org.segnities007.blog.ui.screen.Home
import org.segnities007.blog.ui.screen.Hub

@Composable
fun Navigation() {
    val navController = rememberNavController()
    val navigateToHome: () -> Unit = {
        navController.navigate(NavigationRoute.Home.name)
    }

    Hub(navigateToHome = navigateToHome) {
        NavHost(
            navController = navController,
            startDestination = NavigationRoute::Blog.name,
        ) {
            composable(NavigationRoute.Home.name) {
                Home()
            }
            composable(NavigationRoute::Blog.name) {
                Blog()
            }
            composable(NavigationRoute.CreateBlog.name) {
                CreateBlog()
            }
        }
    }
}
