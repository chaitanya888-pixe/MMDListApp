package com.sample.presentation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.sample.presentation.R

@Composable
fun NetworkImage(
    imageUrl: String?,
    contentDescription: String? = null,
    modifier: Modifier = Modifier,
    cornerRadius: Dp = 8.dp,
    placeholder: Painter = painterResource(R.drawable.image_error),
    error: Painter = painterResource(R.drawable.image_error),
    contentScale: ContentScale = ContentScale.Crop
) {
    val imageModifier = modifier
        .clip(RoundedCornerShape(cornerRadius))
        .border(1.dp, Color.Gray, RoundedCornerShape(cornerRadius))

    if (imageUrl.isNullOrEmpty()) {
        Image(
            painter = placeholder,
            contentDescription = contentDescription,
            modifier = imageModifier,
            contentScale = contentScale
        )
    } else {
        AsyncImage(
            model = imageUrl,
            contentDescription = contentDescription,
            placeholder = placeholder,
            error = error,
            modifier = imageModifier,
            contentScale = contentScale
        )
    }
}
