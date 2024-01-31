package com.gmulbat1301.arqvisionstudio.proyecto3body

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
 * This composable was generated from the UI Package 'proyecto3body'.
 * Generated code; do not edit directly
 */
@Composable
fun Proyecto3body(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Proyecto3Text(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        ImgProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Proyecto3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 329, heightDp = 620)
@Composable
private fun Proyecto3bodyPreview() {
    MaterialTheme {
        RelayContainer {
            Proyecto3body(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Proyecto3Text(modifier: Modifier = Modifier) {
    RelayText(
        content = "El proyecto arquitectónico que proponemos representa una fusión visionaria entre el diseño contemporáneo y la sostenibilidad. Inspirados en líneas limpias y formas orgánicas, buscamos una integración armoniosa con el entorno natural circundante. La estructura modular, diseñada para proporcionar flexibilidad funcional, se adapta de manera eficiente a las cambiantes necesidades de los usuarios. La elección de materiales respetuosos con el medio ambiente y tecnologías energéticamente eficientes refleja nuestro compromiso inquebrantable con la preservación del entorno. Nuestro proyecto aspira a crear un espacio estético, funcional y respetuoso con el entorno, ofreciendo una experiencia arquitectónica única y consciente. El juego meticuloso de luces y sombras realza la elegancia de cada detalle arquitectónico en distintos momentos del día.\n",
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
                end = 1.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImgProy3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proyecto3body_img_proy3),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 29.0.dp,
                end = 0.0.dp,
                bottom = 393.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 3",
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
                end = 184.0.dp,
                bottom = 590.0.dp
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
