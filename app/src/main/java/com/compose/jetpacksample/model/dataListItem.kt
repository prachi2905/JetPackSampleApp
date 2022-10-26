package com.compose.jetpacksample.model

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme.typography
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun DataListItem(dataList: DataList) {
    Row {
        DataImage(dataList)
        Column(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxWidth()
                .align(CenterVertically)
        )
        {
            Text(text = dataList.title, style = typography.bodySmall)
            Text(text = "VIEW DETAIL", style = typography.bodySmall)
        }
    }
}

@Composable
private fun DataImage(dataList: DataList) {
    Image(
        painter = painterResource(id = dataList.puppyImageId),
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .padding(8.dp)
            .size(84.dp)
            .clip(RoundedCornerShape(corner = CornerSize(16.dp)))
    )
}
