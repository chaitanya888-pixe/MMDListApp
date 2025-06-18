package com.sample.presentation.ui.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.sample.presentation.R
import com.sample.presentation.ui.components.NetworkImage
import com.sample.presentation.viewmodel.NewsViewModel

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailScreen(viewModel: NewsViewModel, onBackClick: () -> Unit) {
    val selectedModel by viewModel.selectedNews.collectAsState()
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = stringResource(R.string.details_screen), color = Color.White) },
            colors = TopAppBarDefaults.topAppBarColors(Color.Blue),
            navigationIcon = {
                IconButton(onClick = onBackClick) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "Back", tint = Color.White
                    )
                }
            }
        )
    }) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(dimensionResource(R.dimen.padding_5dp)),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NetworkImage(
                imageUrl = selectedModel?.imageUrl,
                contentDescription = null,
                modifier = Modifier
                    .wrapContentSize()
                    .clip(RoundedCornerShape(dimensionResource(R.dimen.corner_radius_5dp)))
                    .border(
                        1.dp,
                        Color.Gray,
                        RoundedCornerShape(dimensionResource(R.dimen.corner_radius_5dp))

                    )
            )

            Spacer(modifier = Modifier.height(dimensionResource(R.dimen.height_16dp)))
            Text(
                text = selectedModel?.title ?: "No title", fontWeight = FontWeight.Bold,
                modifier = Modifier.align(Alignment.Start)
            )
            Text(
                text = selectedModel?.description ?: "No description",
                modifier = Modifier.align(Alignment.Start)
            )
        }
    }

}