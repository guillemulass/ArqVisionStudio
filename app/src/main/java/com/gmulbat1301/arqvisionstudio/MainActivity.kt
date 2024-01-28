package com.gmulbat1301.arqvisionstudio

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gmulbat1301.arqvisionstudio.Routes.Routes
import com.gmulbat1301.arqvisionstudio.ui.theme.ArqVisionStudioTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ArqVisionStudioTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.MainScreen.route
                    ) {

                        composable(Routes.MainScreen.route) {
                            MainScreen(
                                navController
                            )
                        }

                        composable(Routes.ScreenNuestrosProyectos.route) {
                            NuestrosProyectosScreen(
                                navController
                            )
                        }

                        composable(Routes.ScreenProyecto1.route) {
                            ScreenProyecto1(
                                navController
                            )
                        }

                        composable(Routes.ScreenProyecto2.route) {
                            ScreenProyecto2(
                                navController
                            )
                        }

                        composable(Routes.ScreenProyecto3.route) {
                            ScreenProyecto3(
                                navController
                            )
                        }

                        composable(Routes.ScreenMasInfo.route) {
                            ScreenMasInfo(
                                navController
                            )
                        }

                        composable(Routes.ScreenGaleria.route) {
                            ScreenGaleria(
                                navController
                            )
                        }

                    }
                }
            }
        }
    }
}
