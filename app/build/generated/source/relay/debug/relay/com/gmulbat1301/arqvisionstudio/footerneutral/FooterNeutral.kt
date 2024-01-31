package com.gmulbat1301.arqvisionstudio.footerneutral

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
 * This composable was generated from the UI Package 'footer_neutral'.
 * Generated code; do not edit directly
 */
@Composable
fun FooterNeutral(
    modifier: Modifier = Modifier,
    footerNeutralProyectosButton: () -> Unit = {},
    footerNeutralInicioButton: () -> Unit = {},
    footerNeutralMasInfoButton: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        Rectangle23(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        Proyectos(
            footerNeutralProyectosButton = footerNeutralProyectosButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        Inicio(
            footerNeutralInicioButton = footerNeutralInicioButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
        FooterSeparador(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        MSInfo(
            footerNeutralMasInfoButton = footerNeutralMasInfoButton,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        )
    }
}

@Preview(widthDp = 360, heightDp = 56)
@Composable
private fun FooterNeutralPreview() {
    MaterialTheme {
        RelayContainer {
            FooterNeutral(
                footerNeutralProyectosButton = {},
                footerNeutralInicioButton = {},
                footerNeutralMasInfoButton = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun Rectangle23(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_neutral_rectangle_23),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyectos(
    footerNeutralProyectosButton: () -> Unit,
    modifier: Modifier = Modifier
) {
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
        ).tappable(onTap = footerNeutralProyectosButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Inicio(
    footerNeutralInicioButton: () -> Unit,
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
        ).tappable(onTap = footerNeutralInicioButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun FooterSeparador(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.footer_neutral_footer_separador),
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
    footerNeutralMasInfoButton: () -> Unit,
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
        ).tappable(onTap = footerNeutralMasInfoButton).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
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
