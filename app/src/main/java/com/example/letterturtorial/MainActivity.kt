package com.example.letterturtorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.letterturtorial.ui.theme.LetterTurtorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LetterTurtorialTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    LetterScreen()
                }
            }
        }
    }
}

@Composable
fun LetterScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment =Alignment.CenterHorizontally
    ) {
        Column(
            modifier = Modifier
                .weight(1.5f)
                .fillMaxWidth()
                .fillMaxHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(
                Icons.Rounded.Email,
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .width(150.dp),
                tint = Color(0xFF3ddc84)
            )
            Text(
                text = "Full Name",
                fontSize = 50.sp,
                modifier = Modifier.padding(top = 5.dp, bottom = 1.dp)
            )
            Text(
                text = "Title",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        }
        Column(
            modifier = Modifier.weight(1f)
        ) {
            BoxBottom(title = "+00 (00) 000 000")
            BoxBottom(title = "@socialmediahandle")
            BoxBottom(title = "email@domain.com")
        }
    }
}

@Composable
private fun BoxBottom(
    title: String
){
    Row{
        Spacer(modifier = Modifier.width(20.dp))
        Icon(
            Icons.Rounded.Email,
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(60.dp))
        Text(
            text = title
        )
        Spacer(modifier = Modifier.width(20.dp))
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LetterTurtorialTheme {
        LetterScreen()
    }
}