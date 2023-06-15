package com.example.basiclayoutscodelab.data

import com.example.basiclayoutscodelab.R

data class FavouriteCollectionData(
    var imageRes: Int,
    var stringRes: Int
)

val favouriteCollectionDataList = listOf(
    FavouriteCollectionData(
        imageRes = R.drawable.fc1_short_mantras,
        stringRes = R.string.fc1_short_mantras
    ),
    FavouriteCollectionData(
        imageRes = R.drawable.fc2_nature_meditations,
        stringRes = R.string.fc2_nature_meditations
    ),
    FavouriteCollectionData(
        imageRes = R.drawable.fc3_stress_and_anxiety,
        stringRes = R.string.fc3_stress_and_anxiety
    ),
    FavouriteCollectionData(
        imageRes = R.drawable.fc4_self_massage,
        stringRes = R.string.fc4_self_massage
    ),
    FavouriteCollectionData(
        imageRes = R.drawable.fc5_overwhelmed,
        stringRes = R.string.fc5_overwhelmed
    )
)
