package com.sample.assesmentapp

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.sample.core.utils.NavRoute
import com.sample.presentation.ui.screens.DetailScreen
import com.sample.presentation.ui.screens.ListScreen
import com.sample.presentation.viewmodel.NewsViewModel

@Composable
fun AppNavGraph( viewModel: NewsViewModel = hiltViewModel()) {
    val navController = rememberNavController()
    NavHost(navController, startDestination = NavRoute.List.route) {
        composable(NavRoute.List.route) { ListScreen(viewModel, navController) }
        composable(
            route = NavRoute.Details.route) { backStackEntry ->
            DetailScreen(viewModel) {
                navController.popBackStack()
            }
        }
    }
}