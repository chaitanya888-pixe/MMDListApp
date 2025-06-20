package com.sample.presentation.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.sample.core.utils.NavRoute
import com.sample.domain.model.NewsInfo
import com.sample.presentation.R
import com.sample.presentation.ui.components.NetworkImage
import com.sample.presentation.viewmodel.NewsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ListScreen(viewModel: NewsViewModel, navController: NavController) {
    LaunchedEffect(Unit) {
        viewModel.fetchData()
    }
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = stringResource(R.string.list_screen), color = Color.White) },
            colors = TopAppBarDefaults.topAppBarColors(Color.Blue),
            navigationIcon = {
                Icon(
                    imageVector = Icons.Default.Home,
                    contentDescription = stringResource(R.string.home), tint = Color.White
                )
            }
        )
    }) { paddingValues ->
        val items by viewModel.newsList.collectAsState()

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxWidth(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            if (viewModel.isLoading) {
                Box(modifier = Modifier.fillMaxSize()) {
                    CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                }
            } else {
                LazyColumn(modifier = Modifier.background(Color.LightGray)) {
                    items(items) { newsModel ->
                        ListItem(newsModel, onClick = {
                            viewModel.setSelectedUser(newsModel)
                            navController.navigate(NavRoute.Details.route)
                        })
                    }
                }
            }
        }

    }

}

/** Prepare the compose list item screen */
@Composable
fun ListItem(article: NewsInfo, onClick: () -> Unit) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_5dp))
    ) {

        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(4.dp),
            shape = RoundedCornerShape(4.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
        ) {
            Row(
                modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_10dp))
                    .background(Color.White)
                    .clickable { onClick() }
                , horizontalArrangement = Arrangement.Center
            ) {
                SetImage(article)
                Column(modifier = Modifier
                    .padding(dimensionResource(R.dimen.padding_5dp))
                    .weight(1f)) {
                    Text(
                        text = article.title ?:  stringResource(R.string.no_title),
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_5dp)),
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = article.sourceName ?: stringResource(R.string.na),
                        modifier = Modifier.padding(dimensionResource(R.dimen.padding_5dp)),
                        color = Color.Gray
                    )
                }

                Image(
                    painter = painterResource(id = R.drawable.forward_arrow),
                    contentDescription = stringResource(R.string.forward),
                    modifier = Modifier
                        .align(Alignment.CenterVertically)
                                    )


            }
        }
    }
}
/** Set the image data to list item */
@Composable
private fun SetImage(article: NewsInfo) {
    NetworkImage(
        imageUrl = article.imageUrl,
        contentDescription = stringResource(R.string.article_image),
        modifier = Modifier
            .size(dimensionResource(R.dimen.height_100dp))
            .padding(dimensionResource(R.dimen.padding_5dp)),
        cornerRadius = dimensionResource(R.dimen.corner_radius_5dp)
    )
}
