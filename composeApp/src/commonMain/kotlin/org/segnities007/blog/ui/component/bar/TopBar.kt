package org.segnities007.blog.ui.component.bar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.segnities007.blog.data.presentation.Values

@Composable
fun TopBar(
    symbolButtonClick: () -> Unit, // navigate to Home Screen
) {
    val height: Dp = 64.dp
    Row(
        modifier =
            Modifier
                .fillMaxWidth()
                .height(height)
                .background(color = MaterialTheme.colors.primary),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
    ) {
        SymbolButton(symbolButtonClick = symbolButtonClick)
    }
}

@Composable
private fun SymbolButton(symbolButtonClick: () -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,
    ) {
        Spacer(Modifier.padding(Values.Dimensions.paddingLarge))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(Values.Dimensions.paddingNormal))
                .clickable { symbolButtonClick() }
                .padding(Values.Dimensions.paddingSmall),
            contentAlignment = Alignment.Center,
        ){
            Text(
                text = Values.Strings.SEG,
                color = MaterialTheme.colors.onPrimary,
                fontSize = Values.Dimensions.textLarge.sp,
            )
        }
    }
}
