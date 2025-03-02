package org.segnities007.blog.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import org.segnities007.blog.data.model.DefaultBlogPage
import org.segnities007.blog.data.model.FakePage
import org.segnities007.blog.data.model.Page
import org.segnities007.blog.data.presentation.Values
import org.segnities007.blog.domain.presentation.BlogScope

@Composable
fun Blog() {
    val page = FakePage.fakePage
    BlogUi(page = page){
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
        ){
            Title()
            Dates()
            Statement()
        }
    }
}

@Composable
fun BlogUi(
    page: Page,
    content: @Composable BlogScope.() -> Unit,
){
    val scope = DefaultBlogPage(page)
    Row(
        modifier = Modifier.padding(Values.Dimensions.paddingLargest)
    ){
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier
                .fillMaxSize()
                .weight(10f)
                .clip(RoundedCornerShape(Values.Dimensions.paddingLarge))
                .background(MaterialTheme.colors.onPrimary.copy(alpha = 0.2f)),
            contentAlignment = Alignment.Center,
        ){
            scope.content()
        }
        Spacer(Modifier.weight(1f))
    }
}

@Composable
private fun BlogScope.Title(){
    Text(page.title)
}

@Composable
private fun BlogScope.Dates(){

    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
    ){
        Text(page.createAt.toString())
        Text(page.createAt.toString())
    }
}

@Composable
private fun BlogScope.Statement(){
    Row(){
        Spacer(Modifier.weight(1f))
        Box(
            modifier = Modifier.weight(10f),
        ){
            Text(page.description)
        }
        Spacer(Modifier.weight(1f))
    }
}
