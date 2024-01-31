package com.gmulbat1301.arqvisionstudio.galeria

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
 * This composable was generated from the UI Package 'galeria'.
 * Generated code; do not edit directly
 */
@Composable
fun Galeria(
    modifier: Modifier = Modifier,
    onBtnGaleria: () -> Unit = {}
) {
    TopLevel(modifier = modifier) {
        BtnGaleria(
            onBtnGaleria = onBtnGaleria,
            modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
        ) {
            BtnGaleriaFondo(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.Center,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            BtnGaleriaText(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
                VerMS(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = -17.797298431396484.dp,
                            y = 0.563446044921875.dp
                        )
                    )
                )
                Arrow2RightLong(
                    modifier = Modifier.boxAlign(
                        alignment = Alignment.Center,
                        offset = DpOffset(
                            x = 36.499999046325684.dp,
                            y = -0.12682628631591797.dp
                        )
                    )
                ) {
                    IcoBg(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {}
                    IcoShape(
                        modifier = Modifier.boxAlign(
                            alignment = Alignment.TopStart,
                            offset = DpOffset(
                                x = 3.8243408203125.dp,
                                y = 4.64788818359375.dp
                            )
                        )
                    ) {
                        VectorStroke(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                        Vector2Stroke(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f))
                    }
                }
            }
        }
        ImgGaleria(modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)) {
            ImgGaleria5(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 243.0.dp,
                        y = 100.0.dp
                    )
                )
            )
            ImgGaleria4(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 62.0.dp,
                        y = 100.0.dp
                    )
                )
            )
            ImgGaleria3(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 0.0.dp,
                        y = 100.0.dp
                    )
                )
            )
            ImgGaleria2(
                modifier = Modifier.boxAlign(
                    alignment = Alignment.TopStart,
                    offset = DpOffset(
                        x = 171.0.dp,
                        y = 0.0.dp
                    )
                )
            )
            ImgGaleria1()
        }
        GaleriaTxt(
            modifier = Modifier.boxAlign(
                alignment = Alignment.Center,
                offset = DpOffset(
                    x = -116.0.dp,
                    y = -127.5.dp
                )
            )
        )
    }
}

@Preview(widthDp = 329, heightDp = 273)
@Composable
private fun GaleriaPreview() {
    MaterialTheme {
        RelayContainer {
            Galeria(
                onBtnGaleria = {},
                modifier = Modifier.rowWeight(1.0f).columnWeight(1.0f)
            )
        }
    }
}

@Composable
fun BtnGaleriaFondo(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.galeria_btn_galeria_fondo),
        modifier = modifier.requiredWidth(117.0.dp).requiredHeight(44.0.dp)
    )
}

@Composable
fun VerMS(modifier: Modifier = Modifier) {
    RelayText(
        content = "Ver más",
        fontSize = 12.0.sp,
        color = Color(
            alpha = 255,
            red = 255,
            green = 255,
            blue = 255
        ),
        letterSpacing = 2.4000000000000004.sp,
        textAlign = TextAlign.Left,
        case = Case.Upper,
        maxLines = -1,
        modifier = modifier.requiredWidth(68.0.dp).requiredHeight(14.0.dp)
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
                bottom = 0.0000020027478093709306.dp
            )
        ).graphicsLayer(rotationZ = -0.0f).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun VectorStroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.galeria_vector_stroke_),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 0.0.dp,
                top = 2.16901397705078.dp,
                end = 0.26401519775390625.dp,
                bottom = 2.169014453887941.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun Vector2Stroke(modifier: Modifier = Modifier) {
    RelayVector(
        vector = painterResource(R.drawable.galeria_vector_2_stroke_),
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 15.9346923828125.dp,
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
        modifier = modifier.requiredWidth(21.935184478759766.dp).requiredHeight(4.957746982574463.dp)
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
        modifier = modifier.requiredWidth(30.594594955444336.dp).requiredHeight(14.873239517211914.dp)
    )
}

@Composable
fun BtnGaleriaText(
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 13.0.dp,
                top = 14.87310791015625.dp,
                end = 0.40540313720703125.dp,
                bottom = 14.0.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun BtnGaleria(
    onBtnGaleria: () -> Unit,
    modifier: Modifier = Modifier,
    content: @Composable RelayContainerScope.() -> Unit
) {
    RelayContainer(
        isStructured = false,
        clipToParent = false,
        content = content,
        modifier = modifier.padding(
            paddingValues = PaddingValues(
                start = 212.0.dp,
                top = 229.0.dp,
                end = 0.0.dp,
                bottom = 0.0.dp
            )
        ).tappable(onTap = onBtnGaleria).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun ImgGaleria5(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.galeria_img_galeria5),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(85.7699966430664.dp).requiredHeight(91.31069946289062.dp)
    )
}

@Composable
fun ImgGaleria4(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.galeria_img_galeria4),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(169.9199981689453.dp).requiredHeight(92.73473358154297.dp)
    )
}

@Composable
fun ImgGaleria3(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.galeria_img_galeria3),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(51.619998931884766.dp).requiredHeight(90.90055847167969.dp)
    )
}

@Composable
fun ImgGaleria2(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.galeria_img_galeria2),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(158.0800018310547.dp).requiredHeight(91.49150848388672.dp)
    )
}

@Composable
fun ImgGaleria1(modifier: Modifier = Modifier) {
    RelayImage(
        image = painterResource(R.drawable.galeria_img_galeria1),
        contentScale = ContentScale.Crop,
        modifier = modifier.requiredWidth(160.0800018310547.dp).requiredHeight(91.6963119506836.dp)
    )
}

@Composable
fun ImgGaleria(
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
                top = 28.0.dp,
                end = 0.0.dp,
                bottom = 52.2652587890625.dp
            )
        ).fillMaxWidth(1.0f).fillMaxHeight(1.0f)
    )
}

@Composable
fun GaleriaTxt(modifier: Modifier = Modifier) {
    RelayText(
        content = "Galeria",
        fontSize = 25.0.sp,
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
        modifier = modifier.requiredWidth(97.0.dp).requiredHeight(22.0.dp)
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
