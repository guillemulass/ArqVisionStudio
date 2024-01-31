package com.gmulbat1301.arqvisionstudio.proyecto1body

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
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayImage
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'proyecto1body'.
 * Generated code; do not edit directly
 */
@Composable
fun Proyecto1body(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Proyecto1Text(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        ImgProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Proyecto1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 328, heightDp = 588)
@Composable
private fun Proyecto1bodyPreview() {
    MaterialTheme {
        RelayContainer {
            Proyecto1body(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Proyecto1Text(modifier: Modifier = Modifier) {
    RelayText(
        content = "El proyecto arquitectónico propuesto es una fusión innovadora de diseño contemporáneo y sostenibilidad. Inspirado en líneas limpias y formas orgánicas, busca integrarse armoniosamente con el entorno natural. La estructura modular permite una flexibilidad funcional, adaptándose a las necesidades cambiantes del usuario. La utilización de materiales ecoamigables y tecnologías energéticamente eficientes refleja nuestro compromiso con la preservación del medio ambiente. Este proyecto aspira a crear un espacio estético, funcional y respetuoso con el entorno, proporcionando una experiencia arquitectónica única y consciente. El juego de luces y sombras, cuidadosamente calculado, resalta la elegancia de cada detalle arquitectónico durante diferentes momentos del día.",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 2.083333282470703.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 245.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImgProy1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proyecto1body_img_proy1),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 40.0.dp,
                end = 0.0.dp,
                bottom = 359.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 1",
        fontSize = 30.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 183.0.dp,
                bottom = 558.0.dp
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
