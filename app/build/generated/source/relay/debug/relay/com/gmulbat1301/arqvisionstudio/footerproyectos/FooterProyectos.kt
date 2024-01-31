package com.gmulbat1301.arqvisionstudio.footerproyectos

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gmulbat1301.arqvisionstudio.R
import com.google.relay.compose.Case
import com.google.relay.compose.RelayContainer
import com.google.relay.compose.RelayContainerScope
import com.google.relay.compose.RelayText
import com.google.relay.compose.RelayVector
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'footer_proyectos'.
 * Generated code; do not edit directly
 */
@Composable
fun FooterProyectos(
    modifier: Modifier = Modifier,
    footerProyectosInicioButton: () -> Unit = {},
    footerProyectosMasInfoButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        FooterFondo(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Proyectos(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Inicio(
            footerProyectosInicioButton = footerProyectosInicioButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        Indicador2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Indicador1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        FooterSeparador(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        MSInfo(
            footerProyectosMasInfoButton = footerProyectosMasInfoButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 360, heightDp = 56)
@Composable
private fun FooterProyectosPreview() {
    MaterialTheme {
        RelayContainer {
            FooterProyectos(
                footerProyectosInicioButton = {},
                footerProyectosMasInfoButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun FooterFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_proyectos_footer_fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyectos(modifier: Modifier = Modifier) {
    RelayText(
        content = "proyectos",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        letterSpacing = 2.4000000000000004.sp,
        textAlign = TextAlign.Left,
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 135.0.dp,
                top = 22.0.dp,
                end = 136.0.dp,
                bottom = 21.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Inicio(
    footerProyectosInicioButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "Inicio",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        letterSpacing = 2.4000000000000004.sp,
        textAlign = TextAlign.Left,
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 31.0.dp,
                top = 22.0.dp,
                end = 279.0.dp,
                bottom = 21.0.dp
            )
        ).tappable(onTap = footerProyectosInicioButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Indicador2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_proyectos_indicador2),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 135.0.dp,
                top = 16.0.dp,
                end = 136.0.dp,
                bottom = 39.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Indicador1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_proyectos_indicador1),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 135.0.dp,
                top = 39.0.dp,
                end = 136.0.dp,
                bottom = 16.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FooterSeparador(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_proyectos_footer_separador),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 55.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun MSInfo(
    footerProyectosMasInfoButton: () -> Unit,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = "más info",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 51,
            green = 51,
            blue = 51
        ),
        letterSpacing = 2.4000000000000004.sp,
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 266.0.dp,
                top = 22.0.dp,
                end = 13.0.dp,
                bottom = 21.0.dp
            )
        ).tappable(onTap = footerProyectosMasInfoButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
