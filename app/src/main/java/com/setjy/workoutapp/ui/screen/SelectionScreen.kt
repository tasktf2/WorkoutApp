package com.setjy.workoutapp.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.ArrowBack
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.setjy.workoutapp.ui.theme.DavyGray
import com.setjy.workoutapp.ui.theme.WorkoutAppTheme

@Preview(showBackground = true)
@Composable
fun SelectionPreview() {
    WorkoutAppTheme {
        SelectionScreen()
    }
}

@Composable
fun SelectionTopAppBar(onBackClicked: () -> Unit) {
    TopAppBar(
        title = { Text(text = "Select workout") },
        navigationIcon = {
            IconButton(onClick = onBackClicked) {
                Icon(imageVector = Icons.Rounded.ArrowBack, contentDescription = "Back")
            }
        },
        backgroundColor = MaterialTheme.colors.background,
        elevation = 0.dp
    )
}

@Composable
fun SelectionScreen() {
    Scaffold(topBar = {
        SelectionTopAppBar {}
    }, modifier = Modifier.background(MaterialTheme.colors.background)) { innerPaddings ->
        innerPaddings
        LazyColumn(
            modifier = Modifier.padding(top = 20.dp),
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            items(items = listOf("Chest", "Chest", "Chest", "Chest", "Chest")) {
                SelectionItem(text = it)
            }
        }
    }
}

@Composable
fun SelectionItem(text: String) {
    Card(
        elevation = 4.dp,
        modifier = Modifier
            .fillMaxWidth()
            .heightIn(min = 110.dp),
        border = BorderStroke(width = 1.dp, color = DavyGray)
    ) {
        Box {
            Text(
                text = text,
                style = MaterialTheme.typography.h1,
                color = Color.Black,
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 36.dp)
            )
            Icon(
                imageVector = Icons.Rounded.Menu,
                contentDescription = "Drag",
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(end = 36.dp)
                    .size(40.dp)
            )
        }
    }
}