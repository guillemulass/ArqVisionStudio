package com.gmulbat1301.arqvisionstudio.cajaproyecto

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

// Design to select for CajaProyecto
enum class Design {
    CajaProy3,
    CajaProy2,
    CajaProy1
}

/**
 * This composable was generated from the UI Package 'caja_proyecto'.
 * Generated code; do not edit directly
 */
@Composable
fun CajaProyecto(
    modifier: Modifier = Modifier,
    design: Design = Design.CajaProy3,
    cajaProy3Btn: () -> Unit = {},
    cajaProy2Btn: () -> Unit = {},
    cajaProy1Btn: () -> Unit = {}
) {
    when (design) {
        Design.CajaProy3 -> TopLevelCajaProy3(modifier = modifier) {
            CajaProy3FondoCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy3BtnCajaProy3(
                cajaProy3Btn = cajaProy3Btn,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                CajaProy3BtnFondoCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CajaProy3BtnTextCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    VerMSCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Arrow2RightLongCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        IcoBgCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        IcoShapeCajaProy3(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 3.0.dp,
                                    y = 7.5.dp
                                )
                            )
                        ) {
                            VectorStrokeCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector2StrokeCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            CajaProy3TextCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Proyecto3CajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy3ImgCajaProy3(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Design.CajaProy2 -> TopLevelCajaProy2(modifier = modifier) {
            CajaProy2FondoCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy2BtnCajaProy2(
                cajaProy2Btn = cajaProy2Btn,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                CajaProy2BtnFondoCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CajaProy2BtnTextCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    VerMSCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Arrow2RightLongCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        IcoBgCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        IcoShapeCajaProy2(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 3.0.dp,
                                    y = 7.5.dp
                                )
                            )
                        ) {
                            VectorStrokeCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector2StrokeCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            CajaProy2TextCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Proyecto2CajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy2ImgCajaProy2(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
        }
        Design.CajaProy1 -> TopLevelCajaProy1(modifier = modifier) {
            CajaProy1FondoCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy1BtnCajaProy1(
                cajaProy1Btn = cajaProy1Btn,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            ) {
                Rectangle1CajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                CajaProy1Text1CajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                    VerMSCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    Arrow2RightLongCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                        IcoBgCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                        IcoShapeCajaProy1(
                            modifier = Modifier.boxAlign(
                                alignment = Alignment.TopStart,
                                offset = DpOffset(
                                    x = 3.0.dp,
                                    y = 7.5.dp
                                )
                            )
                        ) {
                            VectorStrokeCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                            Vector2StrokeCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        }
                    }
                }
            }
            CajaProy1TextCajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            Proyecto1CajaProy1(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
            CajaProy1ImgCajaProy1(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 187.0.dp,
                        y = 17.0.dp
                    )
                )
            )
        }
    }
}

@Preview(widthDp = 328, heightDp = 224)
@Composable
private fun CajaProyectoCajaProy3Preview() {
    MaterialTheme {
        RelayContainer {
            CajaProyecto(
                cajaProy3Btn = {},
                cajaProy2Btn = {},
                cajaProy1Btn = {},
                design = Design.CajaProy3,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 328, heightDp = 224)
@Composable
private fun CajaProyectoCajaProy2Preview() {
    MaterialTheme {
        RelayContainer {
            CajaProyecto(
                cajaProy3Btn = {},
                cajaProy2Btn = {},
                cajaProy1Btn = {},
                design = Design.CajaProy2,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Preview(widthDp = 328, heightDp = 224)
@Composable
private fun CajaProyectoCajaProy1Preview() {
    MaterialTheme {
        RelayContainer {
            CajaProyecto(
                cajaProy3Btn = {},
                cajaProy2Btn = {},
                cajaProy1Btn = {},
                design = Design.CajaProy1,
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun CajaProy3FondoCajaProy3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_caja_proy3fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy3BtnFondoCajaProy3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_caja_proy3btn_fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VerMSCajaProy3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver Más",
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
                start = 0.0.dp,
                top = 6.0.dp,
                end = 24.0.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcoBgCajaProy3(
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
fun VectorStrokeCajaProy3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_stroke_),
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
fun Vector2StrokeCajaProy3(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_2_stroke_),
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
fun IcoShapeCajaProy3(
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
fun Arrow2RightLongCajaProy3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 104.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy3BtnTextCajaProy3(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.0.dp,
                top = 12.0.dp,
                end = 19.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy3BtnCajaProy3(
    cajaProy3Btn: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 163.0.dp,
                end = 155.0.dp,
                bottom = 13.0.dp
            )
        ).tappable(onTap = cajaProy3Btn).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy3TextCajaProy3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto Realizado en 2015 en Berlin, un centro comercial queria un aparcamiento nuevo, seguro y muy grande, las obras terminaron en tiempo record.\n\n",
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
                start = 7.0.dp,
                top = 34.0.dp,
                end = 142.0.dp,
                bottom = 68.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto3CajaProy3(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 3\n",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 5.0.dp,
                end = 224.0.dp,
                bottom = 173.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy3ImgCajaProy3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.caja_proyecto_caja_proy3img),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 190.0.dp,
                top = 10.0.dp,
                end = 5.0.dp,
                bottom = 5.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevelCajaProy3(
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

@Composable
fun CajaProy2FondoCajaProy2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_caja_proy2fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy2BtnFondoCajaProy2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_caja_proy2btn_fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VerMSCajaProy2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver Más",
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
                start = 0.0.dp,
                top = 6.0.dp,
                end = 24.0.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcoBgCajaProy2(
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
fun VectorStrokeCajaProy2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_stroke_1),
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
fun Vector2StrokeCajaProy2(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_2_stroke_1),
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
fun IcoShapeCajaProy2(
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
fun Arrow2RightLongCajaProy2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 104.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy2BtnTextCajaProy2(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.0.dp,
                top = 12.0.dp,
                end = 19.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy2BtnCajaProy2(
    cajaProy2Btn: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 163.0.dp,
                end = 155.0.dp,
                bottom = 13.0.dp
            )
        ).tappable(onTap = cajaProy2Btn).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy2TextCajaProy2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto realizado en 2021 en Barcelona, tuvimos que diseñar unos apartamentos de unos edificios nuevos, los cuales se vendieron en una semana.\n",
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
                start = 7.0.dp,
                top = 31.0.dp,
                end = 142.0.dp,
                bottom = 68.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto2CajaProy2(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 2",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 5.0.dp,
                end = 224.0.dp,
                bottom = 196.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy2ImgCajaProy2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.caja_proyecto_caja_proy2img),
        contentScale = ContentScale.Crop,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 190.0.dp,
                top = 11.0.dp,
                end = 6.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun TopLevelCajaProy2(
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

@Composable
fun CajaProy1FondoCajaProy1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_caja_proy1fondo),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Rectangle1CajaProy1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_rectangle_1),
        modifier = modifier.fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VerMSCajaProy1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver Más",
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
                start = 0.0.dp,
                top = 6.0.dp,
                end = 24.0.dp,
                bottom = 6.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun IcoBgCajaProy1(
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
fun VectorStrokeCajaProy1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_stroke_2),
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
fun Vector2StrokeCajaProy1(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.caja_proyecto_vector_2_stroke_2),
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
fun IcoShapeCajaProy1(
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
fun Arrow2RightLongCajaProy1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 104.0.dp,
                top = 0.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy1Text1CajaProy1(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 19.0.dp,
                top = 12.0.dp,
                end = 19.0.dp,
                bottom = 12.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy1BtnCajaProy1(
    cajaProy1Btn: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 163.0.dp,
                end = 155.0.dp,
                bottom = 13.0.dp
            )
        ).tappable(onTap = cajaProy1Btn).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy1TextCajaProy1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto realizado en 2017 en Madrid, un instituto necesitavas nuevas instalaciones y fuimos contratados, actualmente las obras estan terminadas.\n",
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
                start = 7.0.dp,
                top = 31.0.dp,
                end = 142.0.dp,
                bottom = 68.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Proyecto1CajaProy1(modifier: Modifier = Modifier) {
    RelayText(
        content = "Proyecto 1",
        fontSize = 20.0.sp,
        color = Color(
            alpha = 255,
            red = 189,
            green = 189,
            blue = 189
        ),
        height = 1.171875.em,
        textAlign = TextAlign.Left,
        fontWeight = FontWeight(300.0.toInt()),
        maxLines = -1,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 7.0.dp,
                top = 5.0.dp,
                end = 224.0.dp,
                bottom = 196.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun CajaProy1ImgCajaProy1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.caja_proyecto_caja_proy1img),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(137.0.dp).requiredHeight(183.51234436035156.dp)
    )
}

@Composable
fun TopLevelCajaProy1(
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
