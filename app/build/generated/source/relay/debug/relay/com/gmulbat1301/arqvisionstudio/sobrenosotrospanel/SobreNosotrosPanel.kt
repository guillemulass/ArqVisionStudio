package com.gmulbat1301.arqvisionstudio.sobrenosotrospanel

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
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
import com.google.relay.compose.tappable

/**
 * This composable was generated from the UI Package 'sobre_nosotros_panel'.
 * Generated code; do not edit directly
 */
@Composable
fun SobreNosotrosPanel(
    modifier: Modifier = Modifier,
    onSobreNosotrosPanel: () -> Unit = {},
    sobreNosotrosPanelText: String
) {
    TopLevel(modifier = modifier) {
        SobreNosotrosPanelFondo(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 0.0.dp,
                    y = 0.0.dp
                )
            )
        )
        SobreNosotrosPanelBtn(
            onSobreNosotrosPanel = onSobreNosotrosPanel,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            SobreNosotrosPanelBtnFondo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            SobreNosotrosPanelBtnText(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                LeerMS(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 0.0.dp,
                            y = 0.0.dp
                        )
                    )
                )
            }
        }
        SobreNosotrosPanelText(
            sobreNosotrosPanelText = sobreNosotrosPanelText,
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 64.0.dp,
                    y = -16.0.dp
                )
            )
        )
        SobreNosotros(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = 36.0.dp,
                    y = -129.0.dp
                )
            )
        )
        SobreNosotrosPanelImg(
            modifier = Modifier.boxAlign(
                alignment = Alignment.TopStart,
                offset = DpOffset(
                    x = 5.0.dp,
                    y = 4.0.dp
                )
            )
        )
        Arrow2RightLong(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            IcoBg(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
            IcoShape(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 3.0.dp,
                        y = 7.5.dp
                    )
                )
            ) {
                VectorStroke(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                Vector2Stroke(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            }
        }
    }
}

@Preview(widthDp = 328, heightDp = 307)
@Composable
private fun SobreNosotrosPanelPreview() {
    MaterialTheme {
        RelayContainer {
            SobreNosotrosPanel(
                onSobreNosotrosPanel = {},
                sobreNosotrosPanelText = "En ArqVision Studio, llevamos la visión arquitectónica a nuevas alturas. Somos un equipo apasionado de diseñadores, arquitectos y creadores que buscan transformar sueños en espacios tangibles y funcionales.\n",
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun SobreNosotrosPanelFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sobre_nosotros_panel_sobre_nosotros_panel_fondo),
        modifier = modifier.requiredWidth(328.0.dp).requiredHeight(307.0.dp)
    )
}

@Composable
fun SobreNosotrosPanelBtnFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sobre_nosotros_panel_sobre_nosotros_panel_btn_fondo),
        modifier = modifier.requiredWidth(178.0.dp).requiredHeight(48.0.dp)
    )
}

@Composable
fun LeerMS(modifier: Modifier = Modifier) {
    RelayText(
        content = "Leer más",
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
        modifier = modifier.requiredWidth(123.0.dp)
    )
}

@Composable
fun SobreNosotrosPanelBtnText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 16.0.dp,
                top = 18.0.dp,
                end = 39.0.dp,
                bottom = 18.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SobreNosotrosPanelBtn(
    onSobreNosotrosPanel: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 134.0.dp,
                top = 239.0.dp,
                end = 16.0.dp,
                bottom = 20.0.dp
            )
        ).tappable(onTap = onSobreNosotrosPanel).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun SobreNosotrosPanelText(
    sobreNosotrosPanelText: String,
    modifier: Modifier = Modifier
) {
    RelayText(
        content = sobreNosotrosPanelText,
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
        modifier = modifier.requiredWidth(192.0.dp).requiredHeight(195.0.dp)
    )
}

@Composable
fun SobreNosotros(modifier: Modifier = Modifier) {
    RelayText(
        content = "Sobre nosotros",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.requiredWidth(136.0.dp).requiredHeight(23.0.dp)
    )
}

@Composable
fun SobreNosotrosPanelImg(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.sobre_nosotros_panel_sobre_nosotros_panel_img),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(111.0.dp).requiredHeight(298.6428527832031.dp)
    )
}

@Composable
fun IcoBg(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 0.0.dp,
                end = 0.000002956421667477116.dp,
                bottom = 0.000002956422122224467.dp
            )
        ).graphicsLayer(rotationZ = -0.0f).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sobre_nosotros_panel_vector_stroke_),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 3.499999999999998.dp,
                end = 0.2071075439453125.dp,
                bottom = 3.500000953674318.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.sobre_nosotros_panel_vector_2_stroke_),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 12.5.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcoShape(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.requiredWidth(17.20710563659668.dp).requiredHeight(8.000000953674316.dp)
    )
}

@Composable
fun Arrow2RightLong(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 273.0.dp,
                top = 251.0.dp,
                end = 31.0.dp,
                bottom = 32.0.dp
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
