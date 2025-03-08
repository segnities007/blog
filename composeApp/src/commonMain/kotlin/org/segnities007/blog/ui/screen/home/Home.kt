package org.segnities007.blog.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import blog.composeapp.generated.resources.Res
import blog.composeapp.generated.resources.segnities007
import org.jetbrains.compose.resources.painterResource
import org.segnities007.blog.data.model.FakePage
import org.segnities007.blog.data.model.Page
import org.segnities007.blog.data.model.Segnities
import org.segnities007.blog.data.presentation.Values
import org.segnities007.blog.ui.component.bar.bottom.BottomBar

@Composable
fun Home() {
    val scrollState = rememberScrollState()
    Column(
        modifier =
            Modifier
                .fillMaxSize()
                .verticalScroll(scrollState),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.padding(Values.Dimensions.paddingLarger))
        Status()
        PostBoard()
        BottomBar()
    }
}

@Composable
private fun Status() {
    Row(
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(horizontal = Values.Dimensions.paddingNormal),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.Center,
    ) {
        StatusIcon()
        Spacer(Modifier.padding(Values.Dimensions.paddingLarge))
        StatusDetails()
    }
}

@Composable
private fun StatusIcon() {
    Image(
        modifier =
            Modifier
                .size(Values.Dimensions.iconLarger)
                .clip(CircleShape),
        painter = painterResource(Res.drawable.segnities007),
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
    )
}

@Composable
private fun StatusDetails() {
    val segList =
        listOf(
            "Favorite food:  ${Segnities.favoriteFood}",
            "Hobby:  ${Segnities.hobby}",
        )

    Column {
        Text(
            text = "Name: ${Segnities.name}",
            fontSize = Values.Dimensions.textLarge.sp,
            color = Color.White,
        )
        for (value in segList) {
            Spacer(Modifier.padding(Values.Dimensions.paddingNormal))
            Text(
                text = value,
                fontSize = Values.Dimensions.textLarge.sp,
                color = Color.White,
            )
        }
    }
}

@Composable
private fun PostBoard() {
    val postList =
        listOf(
            listOf(
                FakePage.fakePage,
                FakePage.fakePage,
                FakePage.fakePage,
            ),
            listOf(
                FakePage.fakePage,
                FakePage.fakePage,
                FakePage.fakePage,
            ),
            listOf(
                FakePage.fakePage,
                FakePage.fakePage,
                FakePage.fakePage,
            ),
            listOf(
                FakePage.fakePage,
                FakePage.fakePage,
                FakePage.fakePage,
            ),
        )

    Column(
        modifier =
            Modifier
                .padding(Values.Dimensions.paddingLargest)
                .clip(RoundedCornerShape(Values.Dimensions.paddingLarge))
                .background(MaterialTheme.colors.onPrimary.copy(alpha = 0.2f)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.padding(Values.Dimensions.paddingLarge))
        for (posts in postList) {
            Row {
                Spacer(modifier = Modifier.weight(1f))
                for (post in posts) {
                    Post(page = post, modifier = Modifier.weight(7f))
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
            Spacer(modifier = Modifier.padding(Values.Dimensions.paddingLarge))
        }
    }
}

@Composable
private fun Post(
    modifier: Modifier,
    page: Page,
) {
    Card(
        modifier =
            modifier
                .padding(Values.Dimensions.paddingNormal)
                .height(Values.Dimensions.paddingLargest * 3),
    ) {
        Box(
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = page.title,
                fontSize = Values.Dimensions.textNormal.sp,
            )
        }
    }
}
