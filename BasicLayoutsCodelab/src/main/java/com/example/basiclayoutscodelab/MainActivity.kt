package com.example.basiclayoutscodelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
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
import com.example.basiclayoutscodelab.data.AlignBodyData
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
fun AlignYourBodyRow(
    modifier: Modifier,
    alignBodyDataList: List<AlignBodyData>
) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
        modifier = modifier
    ) {
        items(alignBodyDataList) { item ->
            AlignYourBodyElement(
                modifier = Modifier,
                painterRes = item.imageRes,
                text = item.stringRes
            )
        }
    }
}

@Composable
fun AlignYourBodyElement(
    modifier: Modifier,
    @DrawableRes painterRes: Int,
    @StringRes text: Int
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
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
            style = MaterialTheme.typography.titleSmall,
            modifier = Modifier.paddingFromBaseline(
                top = 24.dp, bottom = 8.dp
            )
        )
    }
}

@Composable
fun FavouriteCollectionCard(
    modifier: Modifier,
    @DrawableRes painterRes: Int,
    @StringRes text: Int
) {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = modifier
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.width(192.dp)
        ) {
            Image(
                painter = painterResource(id = painterRes),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(56.dp)
            )
            Text(
                text = stringResource(id = text),
                style = MaterialTheme.typography.titleSmall,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun FavouriteCollectionCardPreview() {
    ComposeTutorialTheme {
        FavouriteCollectionCard(
            painterRes = R.drawable.fc2_nature_meditations,
            text = R.string.fc2_nature_meditations,
            modifier = Modifier.padding(all = 8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignBodyElementPreview() {
    ComposeTutorialTheme {
        AlignYourBodyElement(
            painterRes = R.drawable.ab1_inversions,
            text = R.string.ab1_inversions,
            modifier = Modifier.padding(all = 8.dp)
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFFF0EAE2)
@Composable
fun AlignBodyRowPreview() {
    ComposeTutorialTheme {
        AlignYourBodyRow(
            modifier = Modifier,
            alignBodyDataList = listOf(
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