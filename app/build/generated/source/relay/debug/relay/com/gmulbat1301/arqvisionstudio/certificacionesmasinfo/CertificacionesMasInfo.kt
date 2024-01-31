package com.gmulbat1301.arqvisionstudio.certificacionesmasinfo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'certificaciones_mas_info'.
 * Generated code; do not edit directly
 */
@Composable
fun CertificacionesMasInfo(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Separador(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        CertificacionesImg(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Certificaciones(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 329, heightDp = 241)
@Composable
private fun CertificacionesMasInfoPreview() {
    MaterialTheme {
        RelayContainer {
            CertificacionesMasInfo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Separador(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.certificaciones_mas_info_separador),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 240.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CertificacionesImg(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.certificaciones_mas_info_certificaciones_img),
        contentScale = ContentScale.FillBounds,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 48.0.dp,
                top = 25.0.dp,
                end = 16.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Certificaciones(modifier: Modifier = Modifier) {
    RelayText(
        content = "Certificaciones",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 192.0.dp,
                bottom = 223.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
