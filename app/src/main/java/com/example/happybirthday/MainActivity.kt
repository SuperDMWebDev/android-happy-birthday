package com.example.happybirthday


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    ComposeArticleApp()
                }
            }
        }
    }
}
@Composable
fun ComposeArticleApp()
{
    ArticleApp(
        title= stringResource(id = R.string.title),
        shortDescription= stringResource(id = R.string.short_description),
        longDescription= stringResource(id= R.string.long_description),
        imagePainter = painterResource(id = R.drawable.background)
    )
}
@Composable
fun ArticleApp(  title: String,
                 shortDescription: String,
                 longDescription: String,
                 imagePainter: Painter
)
{
    Column()
    {
        Image(painter=imagePainter, contentDescription = null,
        modifier = Modifier.fillMaxWidth())
        Text(
            text=title,
            fontSize = 24.sp,
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text=shortDescription,
            modifier = Modifier.padding(
                start=16.dp,
                end=16.dp
            ),
            textAlign = TextAlign.Justify
        )
        Text(
            text=longDescription,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    HappyBirthdayTheme {
        ComposeArticleApp()
    }
}