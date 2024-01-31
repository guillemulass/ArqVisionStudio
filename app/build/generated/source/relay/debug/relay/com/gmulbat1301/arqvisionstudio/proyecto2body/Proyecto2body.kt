package com.gmulbat1301.arqvisionstudio.proyecto2body

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
 * This composable was generated from the UI Package 'proyecto2body'.
 * Generated code; do not edit directly
 */
@Composable
fun Proyecto2body(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Proyecto1Text(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        ImgProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Proyecto2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 332, heightDp = 588)
@Composable
private fun Proyecto2bodyPreview() {
    MaterialTheme {
        RelayContainer {
            Proyecto2body(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Proyecto1Text(modifier: Modifier = Modifier) {
    RelayText(
        content = "La propuesta arquitectónica planteada fusiona de manera innovadora el diseño contemporáneo y la sostenibilidad. Inspirados en líneas limpias y formas orgánicas, buscamos una armoniosa integración con el entorno natural circundante. La flexibilidad funcional, permitida por la estructura modular, se adapta de forma eficiente a las cambiantes necesidades de los usuarios. La elección de materiales respetuosos con el medio ambiente y tecnologías energéticamente eficientes subraya nuestro firme compromiso con la preservación del entorno. Este proyecto persigue la creación de un espacio estético, funcional y consciente del entorno, brindando así una experiencia arquitectónica única. La cuidadosa manipulación de luces y sombras destaca la elegancia de cada detalle arquitectónico en diferentes momentos del día.",
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
                end = 4.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImgProy2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.proyecto2body_img_proy2),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 39.0.dp,
                end = 0.0.dp,
                bottom = 360.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 2",
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
                start = 1.0.dp,
                top = 0.0.dp,
                end = 186.0.dp,
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
