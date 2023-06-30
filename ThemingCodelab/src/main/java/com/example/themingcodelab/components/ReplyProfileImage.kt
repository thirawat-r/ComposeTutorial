package com.example.themingcodelab.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themingcodelab.R
import com.example.themingcodelab.ui.theme.ThemingCodelab

@Composable
fun ReplyProfileImage(
    @DrawableRes painterRes: Int,
    contentDescription: String,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id = painterRes),
        modifier = modifier
            .size(40.dp)
            .clip(CircleShape),
        contentDescription = contentDescription
    )
}

@Preview(showBackground = true)
@Composable
fun ReplyProfileImagePreview() {
    ThemingCodelab {
        ReplyProfileImage(
            painterRes = R.drawable.avatar_6,
            contentDescription = stringResource(id = R.string.profile)
        )
    }
}