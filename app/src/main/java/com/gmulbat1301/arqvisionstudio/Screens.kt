package com.gmulbat1301.arqvisionstudio

import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.gmulbat1301.arqvisionstudio.Routes.Routes
import com.gmulbat1301.arqvisionstudio.cajaproyecto.CajaProyecto
import com.gmulbat1301.arqvisionstudio.cajaproyecto.Design
import com.gmulbat1301.arqvisionstudio.certificacionesmasinfo.CertificacionesMasInfo
import com.gmulbat1301.arqvisionstudio.footermain.FooterMain
import com.gmulbat1301.arqvisionstudio.footermasinfo.FooterMasInfo
import com.gmulbat1301.arqvisionstudio.footerneutral.FooterNeutral
import com.gmulbat1301.arqvisionstudio.footerproyectos.FooterProyectos
import com.gmulbat1301.arqvisionstudio.galeria.Galeria
import com.gmulbat1301.arqvisionstudio.header.Header
import com.gmulbat1301.arqvisionstudio.imgsgaleria.ImgsGaleria
import com.gmulbat1301.arqvisionstudio.infocontactomasinfo.InfoContactoMasInfo
import com.gmulbat1301.arqvisionstudio.intro.Intro
import com.gmulbat1301.arqvisionstudio.intromasinfo.IntroMasInfo
import com.gmulbat1301.arqvisionstudio.nuestroproyectostitle.NuestroProyectosTitle
import com.gmulbat1301.arqvisionstudio.proyecto1body.Proyecto1body
import com.gmulbat1301.arqvisionstudio.proyecto2body.Proyecto2body
import com.gmulbat1301.arqvisionstudio.proyecto3body.Proyecto3body
import com.gmulbat1301.arqvisionstudio.sobrenosotrospanel.SobreNosotrosPanel

@Composable
fun MainScreen(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
    Column (
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
        .padding(28.dp)
    ){

        Header(modifier = Modifier
            .width(329.dp)
            .height(75.dp),
            "ArqVision Studio")

        Spacer(modifier = Modifier.height(20.dp))

        SobreNosotrosPanel(modifier = Modifier
            .width(328.dp)
            .height(307.dp),
            onSobreNosotrosPanel = {
                navController.navigate(Routes.ScreenMasInfo.route)
            },
            "En ArqVision Studio, llevamos la visión arquitectónica a nuevas alturas. Somos un equipo apasionado de diseñadores, arquitectos y creadores que buscan transformar sueños en espacios tangibles y funcionales.\n")

        Spacer(modifier = Modifier.height(25.dp))

        Galeria(
            modifier = Modifier
                .width(329.dp)
                .height(273.dp),
            onBtnGaleria = {
                navController.navigate(Routes.ScreenGaleria.route)
            }
        )

        Spacer(modifier = Modifier.height(35.dp))

    }

        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterMain(
                modifier = Modifier
                    .width(360.dp)
                    .height(56.dp),
                footerMainProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                },
                footerMainMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }

}

@Composable
fun NuestrosProyectosScreen(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ){

            Header(modifier = Modifier
                .width(329.dp)
                .height(75.dp),
                "ArqVision Studio")

            NuestroProyectosTitle(modifier = Modifier
                .width(329.dp)
                .height(90.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            CajaProyecto(
                modifier = Modifier
                    .width(328.dp)
                    .height(224.dp),
                design = Design.CajaProy1,
                cajaProy1Btn = {
                    navController.navigate(Routes.ScreenProyecto1.route)
                }

            )

            Spacer(modifier = Modifier.height(20.dp))

            CajaProyecto(
                modifier = Modifier
                    .width(328.dp)
                    .height(224.dp),
                design = Design.CajaProy2,
                cajaProy2Btn = {
                    navController.navigate(Routes.ScreenProyecto2.route)
                }
            )

            Spacer(modifier = Modifier.height(20.dp))

            CajaProyecto(
                modifier = Modifier
                    .width(328.dp)
                    .height(224.dp),
                design = Design.CajaProy3,
                cajaProy3Btn = {
                    navController.navigate(Routes.ScreenProyecto3.route)
                }
            )

            Spacer(modifier = Modifier.height(40.dp))

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterProyectos(
                footerProyectosInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerProyectosMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }
}

@Composable
fun ScreenProyecto1(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ){
            Header(modifier = Modifier
                .width(329.dp)
                .height(75.dp),
                "ArqVision Studio")

            Proyecto1body(
                modifier = Modifier
                    .width(328.dp)
                    .height(588.dp)
            )

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterNeutral(
                footerNeutralInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerNeutralProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                },
                footerNeutralMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }
}

@Composable
fun ScreenProyecto2(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ){
            Header(modifier = Modifier
                .width(329.dp)
                .height(75.dp),
                "ArqVision Studio")

            Proyecto2body(
                modifier = Modifier
                    .width(332.dp)
                    .height(588.dp)
            )

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterNeutral(
                footerNeutralInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerNeutralProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                },
                footerNeutralMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }
}

@Composable
fun ScreenProyecto3(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ){

            Header(modifier = Modifier
                .width(329.dp)
                .height(75.dp),
                "ArqVision Studio")

            Proyecto3body(
                modifier = Modifier
                    .width(329.dp)
                    .height(620.dp)
            )

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterNeutral(
                footerNeutralInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerNeutralProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                },
                footerNeutralMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }
}

@Composable
fun ScreenMasInfo(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ) {
            Header(
                modifier = Modifier
                    .width(329.dp)
                    .height(75.dp),
                "ArqVision Studio"
            )

            IntroMasInfo(
                modifier = Modifier
                    .width(330.dp)
                    .height(413.dp)
            )

            CertificacionesMasInfo(
                modifier = Modifier
                    .width(329.dp)
                    .height(241.dp)
            )

            InfoContactoMasInfo(
                modifier = Modifier
                    .width(176.dp)
                    .height(176.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterMasInfo(
                footerMasInfoInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerMasInfoProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                }
            )
        }
    }
}

@Composable
fun ScreenGaleria(
    navController: NavHostController
){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Top,
            modifier = Modifier
                .verticalScroll(
                    ScrollState(10000),
                    enabled = true,
                    reverseScrolling = true
                )
                .padding(28.dp)
        ) {
            Spacer(modifier = Modifier.height(20.dp))

            Header(
                modifier = Modifier
                    .width(329.dp)
                    .height(75.dp),
                "ArqVision Studio"
            )

            Intro(
                modifier = Modifier
                    .width(329.dp)
                    .height(64.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            ImgsGaleria(
                modifier = Modifier
                    .width(314.dp)
                    .height(696.dp)
            )

            Spacer(modifier = Modifier.height(40.dp))

        }
        Box(modifier = Modifier
            .size(width = 360.dp, height = 56.dp)
            .align(Alignment.BottomCenter)
        ) {
            FooterNeutral(
                footerNeutralInicioButton = {
                    navController.navigate(Routes.MainScreen.route)
                },
                footerNeutralProyectosButton = {
                    navController.navigate(Routes.ScreenNuestrosProyectos.route)
                },
                footerNeutralMasInfoButton = {
                    navController.navigate(Routes.ScreenMasInfo.route)
                }
            )
        }
    }
}