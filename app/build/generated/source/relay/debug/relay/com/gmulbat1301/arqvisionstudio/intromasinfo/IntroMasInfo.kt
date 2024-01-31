package com.gmulbat1301.arqvisionstudio.intromasinfo

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector

/**
 * This composable was generated from the UI Package 'intro_mas_info'.
 * Generated code; do not edit directly
 */
@Composable
fun IntroMasInfo(modifier: Modifier = Modifier) {
    TopLevel(modifier = modifier) {
        Separador2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        IntroText(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Separador1(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 1.0.dp,
                    y = -128.0.dp
                )
            )
        )
        Nosotros(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Sobre(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
    }
}

@Preview(widthDp = 330, heightDp = 413)
@Composable
private fun IntroMasInfoPreview() {
    MaterialTheme {
        RelayContainer {
            IntroMasInfo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
    }
}

@Composable
fun Separador2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.intro_mas_info_separador2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 412.0.dp,
                end = 2.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IntroText(modifier: Modifier = Modifier) {
    RelayText(
        content = "En ArqVision Studio, creemos que cada proyecto es una oportunidad única para contar una historia arquitectónica cautivadora. Nos esforzamos por fusionar la estética excepcional con la funcionalidad pragmática en cada uno de nuestros diseños. Nuestra filosofía se centra en la colaboración estrecha con nuestros clientes para entender sus aspiraciones y traducirlas en espacios que superen sus \nCon más de 100 proyectos exitosos en nuestro portafolio, hemos demostrado nuestra capacidad para enfrentar desafíos arquitectónicos diversos. Desde residencias lujosas hasta espacios comerciales vanguardistas, nuestro equipo multidisciplinario combina creatividad y conocimiento técnico para ofrecer soluciones excepcionales.\n",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 0,
            green = 0,
            blue = 0
        ),
        height = 2.083333282470703.em,
        textAlign = TextAlign.Left,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 2.0.dp,
                top = 86.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Separador1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.intro_mas_info_separador1),
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(1.0.dp)
    )
}

@Composable
fun Nosotros(modifier: Modifier = Modifier) {
    RelayText(
        content = "Nosotros",
        fontSize = 30.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        height = 2.133333282470703.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(700.0.toInt()),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 26.0.dp,
                end = 205.0.dp,
                bottom = 323.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Sobre(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sobre",
        fontSize = 30.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 2.133333282470703.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 1.0.dp,
                top = 0.0.dp,
                end = 51.23699951171875.dp,
                bottom = 349.0.dp
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
