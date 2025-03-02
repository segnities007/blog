package org.segnities007.blog

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import kotlinx.datetime.Clock
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.segnities007.blog.ui.navigation.Navigation

@Composable
@Preview
fun App() {
    MaterialTheme {
        Navigation()
    }
}
