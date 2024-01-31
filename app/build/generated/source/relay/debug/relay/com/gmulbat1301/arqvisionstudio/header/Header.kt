package com.gmulbat1301.arqvisionstudio.header

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.Case
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'header'.
 * Generated code; do not edit directly
 */
@Composable
fun Header(
    modifier: Modifier = Modifier,
    headerText: String
) {
    TopLevel(modifier = modifier) {
        ArqVisionStudio(
            headerText = headerText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 37.5.dp,
                    y = -11.5.dp
                )
            )
        )
        Logo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -132.40243911743164.dp,
                    y = -5.5.dp
                )
            )
        )
        Rectangle22(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 37.0.dp
                )
            )
        )
    }
}

@Preview(widthDp = 329, heightDp = 75)
@Composable
private fun HeaderPreview() {
    MaterialTheme {
        RelayContainer {
            Header(
                headerText = "ArqVision Studio",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun ArqVisionStudio(
    headerText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = headerText,
        fontSize = 19.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 0.6315789413452149.em,
        letterSpacing = 3.8000000000000003.sp,
        textAlign = TextAlign.Left,
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.requiredWidth(254.0.dp).requiredHeight(12.0.dp)
    )
}

@Composable
fun Logo(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.header_logo),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(64.19512176513672.dp).requiredHeight(64.0.dp)
    )
}

@Composable
fun Rectangle22(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.header_rectangle_22),
        modifier = modifier.requiredWidth(329.0.dp).requiredHeight(1.0.dp)
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
