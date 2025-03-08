package org.segnities007.blog.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import org.segnities007.blog.ui.component.bar.TopBar

@Composable
fun Hub(
    navigateToHome: () -> Unit,
    content: @Composable () -> Unit,
) {
    // TODO Create Drawer if necessary.
    HubUi(navigateToHome = navigateToHome) {
        content()
    }
}

@Composable
private fun HubUi(
    navigateToHome: () -> Unit,
    content: @Composable () -> Unit,
) {
    Scaffold(
        topBar = {
            TopBar(
                symbolButtonClick = {
                    navigateToHome()
                },
            )
        },
    ) {
        Column(
            modifier =
                Modifier
                    .fillMaxSize()
                    .padding(it)
                    .background(MaterialTheme.colors.onSurface.copy(alpha = 0.8f)),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            content()
        }
    }
}
