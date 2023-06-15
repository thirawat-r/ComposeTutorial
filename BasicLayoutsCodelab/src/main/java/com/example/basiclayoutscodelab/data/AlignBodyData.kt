package com.example.basiclayoutscodelab.data

import com.example.basiclayoutscodelab.R

data class AlignBodyData(
    var imageRes: Int,
    var stringRes: Int
)

val alignBodyDataList = listOf(
    AlignBodyData(
        imageRes = R.drawable.ab1_inversions,
        stringRes = R.string.ab1_inversions
    ),
    AlignBodyData(
        imageRes = R.drawable.ab2_quick_yoga,
        stringRes = R.string.ab2_quick_yoga
    ),
    AlignBodyData(
        imageRes = R.drawable.ab3_stretching,
        stringRes = R.string.ab3_stretching
    ),
    AlignBodyData(
        imageRes = R.drawable.ab4_tabata,
        stringRes = R.string.ab4_tabata
    ),
    AlignBodyData(
        imageRes = R.drawable.ab5_hiit,
        stringRes = R.string.ab5_hiit
    )
)
