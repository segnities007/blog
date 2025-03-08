package org.segnities007.blog.domain.presentation

import androidx.compose.ui.unit.Dp

interface Dimension {
    val paddingSmallest: Dp
    val paddingSmaller: Dp
    val paddingSmall: Dp
    val paddingNormal: Dp
    val paddingLarge: Dp
    val paddingLarger: Dp
    val paddingLargest: Dp

    val iconSmallest: Dp
    val iconSmaller: Dp
    val iconSmall: Dp
    val iconNormal: Dp
    val iconLarge: Dp
    val iconLarger: Dp
    val iconLargest: Dp

    val textSmall: Int
    val textNormal: Int
    val textLarge: Int
    val textLarger: Int
    val textLargest: Int
}
