package com.example.themingcodelab.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.themingcodelab.R
import com.example.themingcodelab.ui.theme.ThemingCodelab

@Composable
fun ReplySearchBar(
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            imageVector = Icons.Default.Search,
            contentDescription = null,
            modifier = Modifier
                .padding(start = 16.dp)
        )
        Text(
            text = stringResource(id = R.string.search_replies),
            modifier = Modifier
                .padding(all = 16.dp)
                .weight(1f)
        )
        ReplyProfileImage(
            painterRes = R.drawable.avatar_6,
            contentDescription = stringResource(id = R.string.profile),
            modifier = Modifier
                .padding(all = 12.dp)
                .size(32.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ReplySearchBarPreview() {
    ThemingCodelab {
        ReplySearchBar()
    }
}