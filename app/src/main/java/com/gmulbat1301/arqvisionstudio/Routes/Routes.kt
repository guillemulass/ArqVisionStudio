package com.gmulbat1301.arqvisionstudio.Routes

sealed class Routes(val route : String) {

    object MainScreen: Routes("mainScreen")
    object ScreenNuestrosProyectos: Routes("screenNuestrosProyectos")
    object ScreenProyecto1: Routes("screenProyecto1")
    object ScreenProyecto2: Routes("screenProyecto2")
    object ScreenProyecto3: Routes("screenProyecto3")
    object ScreenMasInfo: Routes("screenMasInfo")
    object ScreenGaleria: Routes("ScreenGaleria")



}