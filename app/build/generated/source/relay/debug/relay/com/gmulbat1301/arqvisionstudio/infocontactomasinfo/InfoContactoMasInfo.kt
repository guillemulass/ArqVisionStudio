package com.gmulbat1301.arqvisionstudio.infocontactomasinfo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText

/**
 * This composable was generated from the UI Package 'info_contacto_mas_info'.
 * Generated code; do not edit directly
 */
@Composable
fun InfoContactoMasInfo(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Email(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        NumTlf(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Direccion(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Contacto(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        InformaciN(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 176, heightDp = 176)
@Composable
private fun InfoContactoMasInfoPreview() {
    MaterialTheme {
        RelayContainer {
            InfoContactoMasInfo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Email(modifier: Modifier = Modifier) {
    RelayText(
        content = "contacto@arqvision.com",
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 160.0.dp,
                end = 22.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun NumTlf(modifier: Modifier = Modifier) {
    RelayText(
        content = "652 397 250",
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 131.0.dp,
                end = 95.0.dp,
                bottom = 29.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Direccion(modifier: Modifier = Modifier) {
    RelayText(
        content = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    color = Color(
                        alpha = 255,
                        red = 51,
                        green = 51,
                        blue = 51
                    ),
                    fontFamily = roboto,
                    fontSize = 14.0.sp,
                    fontWeight = FontWeight(700.0.toInt())
                )
            ) {
                append("ArqVision Studio\n")
            }
            withStyle(
                style = SpanStyle(
                    fontFamily = roboto,
                    fontSize = 14.0.sp,
                    fontWeight = FontWeight(400.0.toInt())
                )
            ) {
                append("San Fernando - Cádiz 11100")
            }
        },
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 90.0.dp,
                end = 0.0.dp,
                bottom = 54.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Contacto(modifier: Modifier = Modifier) {
    RelayText(
        content = "Contacto",
        fontSize = 25.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 2.56.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 26.0.dp,
                end = 74.0.dp,
                bottom = 86.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun InformaciN(modifier: Modifier = Modifier) {
    RelayText(
        content = "Información",
        fontSize = 25.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 2.56.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 39.0.dp,
                bottom = 112.0.dp
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
