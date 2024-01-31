package com.gmulbat1301.arqvisionstudio.imgsgaleria

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage

/**
 * This composable was generated from the UI Package 'imgs_galeria'.
 * Generated code; do not edit directly
 */
@Composable
fun ImgsGaleria(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        ImgsGaleria8(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 183.0.dp,
                    y = 534.0.dp
                )
            )
        )
        ImgsGaleria7(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 534.0.dp
                )
            )
        )
        ImgsGaleria6(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 183.0.dp,
                    y = 354.0.dp
                )
            )
        )
        ImgsGaleria5(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 354.0.dp
                )
            )
        )
        ImgsGaleria4(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 183.0.dp,
                    y = 177.0.dp
                )
            )
        )
        ImgsGaleria3(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 177.0.dp
                )
            )
        )
        ImgsGaleria2(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 183.0.dp,
                    y = 0.0.dp
                )
            )
        )
        ImgsGaleria1()
    }
}

@Preview(widthDp = 314, heightDp = 696)
@Composable
private fun ImgsGaleriaPreview() {
    MaterialTheme {
        RelayContainer {
            ImgsGaleria(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun ImgsGaleria8(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria8),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria7(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria7),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria6(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria6),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria5),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria4),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun ImgsGaleria1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.imgs_galeria_imgs_galeria1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(131.0.dp).requiredHeight(162.0.dp)
    )
}

@Composable
fun TopLevel(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}
