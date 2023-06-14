package com.example.basiclayoutscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.basiclayoutscodelab.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    SearchBar()
                }
            }
        }
    }
}

@Composable
fun SearchBar(
    modifier: Modifier = Modifier
) {
    TextField(
        value = "",
        onValueChange = {},
        leadingIcon = {
            Icon(
                imageVector = Icons.Default.Search,
                contentDescription = null
            )
        },
        modifier = modifier
            .fillMaxWidth()
            .heightIn(min = 56.dp),
        placeholder = {
            Text(text = stringResource(id = R.string.placeholder_search))
        }
    )
}

@Composable
fun AlignYourBodyElement(
    modifier: Modifier,
    @DrawableRes painterRes: Int,
    @StringRes text: Int
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = painterRes),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(88.dp)
                .clip(CircleShape),
        )
        Text(
            text = stringResource(id = text),
            style = MaterialTheme.typography.labelLarge,
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun AlignBodyElementPreview() {
    ComposeTutorialTheme {
        AlignYourBodyElement(
            modifier = Modifier.padding(all = 8.dp),
            painterRes = R.drawable.ab1_inversions,
            text = R.string.ab1_inversions
        )
    }
}


@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    ComposeTutorialTheme {
        SearchBar()
    }
}