package org.segnities007.blog.data.presentation

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import org.segnities007.blog.domain.presentation.Dimension

object Values {
    object Dimensions : Dimension {
        override val paddingSmallest: Dp = 1.dp
        override val paddingSmaller: Dp = 2.dp
        override val paddingSmall: Dp = 4.dp
        override val paddingNormal: Dp = 8.dp
        override val paddingLarge: Dp = 16.dp
        override val paddingLarger: Dp = 32.dp
        override val paddingLargest: Dp = 64.dp

        override val iconSmall: Dp = 32.dp
        override val iconNormal: Dp = 64.dp
        override val iconLarge: Dp = 128.dp
        override val iconLarger: Dp = 256.dp
        override val iconLargest: Dp = 512.dp

        override val textSmall: Int = 12
        override val textNormal: Int = 24
        override val textLarge: Int = 36
        override val textLarger: Int = 64
        override val textLargest: Int = 128
    }

    object Strings {
        const val SEG: String = "SEG"
    }
}
