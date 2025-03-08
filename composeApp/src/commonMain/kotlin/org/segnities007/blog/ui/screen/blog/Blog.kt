package org.segnities007.blog.ui.screen.blog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import org.segnities007.blog.data.model.FakePage
import org.segnities007.blog.data.model.Page
import org.segnities007.blog.data.presentation.Values
import org.segnities007.blog.ui.component.bar.bottom.BottomBar

@Composable
fun Blog() {
    val page = FakePage.fakePage
    val verticalScroll = rememberScrollState()
    Column(
        modifier = Modifier.verticalScroll(verticalScroll)
    ){
        BlogUi(page = page) {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Spacer(Modifier.padding(Values.Dimensions.paddingLarge))
                Title()
                Spacer(Modifier.padding(Values.Dimensions.paddingSmall))
                Dates()
                Spacer(Modifier.padding(Values.Dimensions.paddingSmall))
                Statement()
                Spacer(Modifier.padding(Values.Dimensions.paddingSmall))
            }
        }
        BottomBar()
    }
}

@Composable
fun BlogUi(
    page: Page,
    content: @Composable BlogScope.() -> Unit,
) {
    val scope = DefaultBlogPage(page)
    Row(
        modifier = Modifier.padding(Values.Dimensions.paddingLargest),
    ) {
        Spacer(Modifier.weight(1f))
        Box(
            modifier =
                Modifier
                    .fillMaxSize()
                    .weight(10f)
                    .clip(RoundedCornerShape(Values.Dimensions.paddingLarge))
                    .background(MaterialTheme.colors.onPrimary.copy(alpha = 0.2f)),
            contentAlignment = Alignment.TopCenter,
        ) {
            scope.content()
        }
        Spacer(Modifier.weight(1f))
    }
}

@Composable
private fun BlogScope.Title() {
    val fontSize = 64.sp
    Text(
        text = page.title,
        color = Color.White,
        fontSize = fontSize,
    )
}

@Composable
private fun BlogScope.Dates() {
    val createAt = page.createAt.toString()
    val updateAt = page.updateAt.toString()
    val fontSize = 16.sp

    Column(
//        modifier = Modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ) {
        Text(
            text = "Create Date: $createAt",
            color = Color.White,
            fontSize = fontSize,
        )
        Text(
            text = "Update Date: $updateAt",
            color = Color.White,
            fontSize = fontSize,
        )
    }
}

@Composable
private fun BlogScope.Statement() {
    val fontSize = 32.sp
    Row {
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier.weight(10f),
        ) {
            Text(
                text = page.description,
                color = Color.White,
                fontSize = fontSize,
            )
        }
        Spacer(Modifier.weight(1f))
    }
}
