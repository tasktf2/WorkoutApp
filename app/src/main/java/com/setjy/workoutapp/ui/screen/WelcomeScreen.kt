package com.setjy.workoutapp.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.setjy.workoutapp.ui.theme.DavyGray
import com.setjy.workoutapp.ui.theme.WorkoutAppTheme

@Preview(showBackground = true)
@Composable
fun WelcomePreview() {
    WorkoutAppTheme {
        WelcomeScreen()
    }
}

@Composable
fun WelcomeScreen() {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colors.background)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(0.dp))
        StartButton(modifier = Modifier.weight(1.6f))
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.weight(1f)
        ) {
            CustomButton(
                text = "Training History",
                icon = Icons.Rounded.History,
                modifier = Modifier.weight(1f)
            )
            CustomButton(
                text = "Graphs",
                icon = Icons.Rounded.Timeline,
                modifier = Modifier.weight(1f)
            )
        }
        Row(
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            modifier = Modifier.weight(1f)
        ) {
            CustomButton(
                text = "Training Settings",
                icon = Icons.Rounded.SettingsAccessibility,
                modifier = Modifier.weight(1f)
            )
            CustomButton(
                text = "Settings",
                icon = Icons.Rounded.Settings,
                modifier = Modifier.weight(1f)
            )
        }
        Spacer(modifier = Modifier.height(0.dp))
    }
}

@Composable
private fun CustomButton(text: String, icon: ImageVector, modifier: Modifier) {
    Card(
        elevation = 10.dp,
        modifier = modifier.height(160.dp),
        border = BorderStroke(width = 1.dp, color = DavyGray)
    ) {
        Box {
            Icon(
                imageVector = icon,
                contentDescription = "later",
                modifier = Modifier
                    .align(Alignment.Center)
                    .size(100.dp)
            )
            Box(
                modifier = Modifier
                    .align(Alignment.BottomCenter)
                    .height(46.dp),
            ) {
                Text(
                    text = text,
                    style = MaterialTheme.typography.h4,
                    color = Color.Black,
                    modifier = Modifier
                        .align(Alignment.Center)
                        .widthIn(max = 115.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Composable
private fun StartButton(modifier: Modifier) {
    Card(
        elevation = 10.dp,
        modifier = modifier
            .fillMaxWidth(),
        border = BorderStroke(width = 1.dp, color = DavyGray)
    ) {
        Box(contentAlignment = Alignment.Center) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Rounded.PlayArrow,
                    contentDescription = "Start",
                    modifier = Modifier.size(140.dp)
                )
            }
        }
    }
}