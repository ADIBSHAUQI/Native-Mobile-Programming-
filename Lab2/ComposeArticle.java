/*
 * Author: Adib Shauqi (S62588)
 */

package com.example.composearticle;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.activity.compose.setContent;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Box;
import androidx.compose.foundation.layout.Column;
import androidx.compose.foundation.layout.fillMaxSize;
import androidx.compose.foundation.layout.fillMaxWidth;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.Surface;
import androidx.compose.material3.Text;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.tooling.preview.Preview;
import androidx.compose.foundation.Image;
import androidx.compose.ui.res.painterResource;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.buildAnnotatedString;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.withStyle;
import com.example.composebasics.ui.theme.ComposeBasicsTheme;

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        ComposeBasicsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
        modifier = Modifier.fillMaxSize(),
        color = MaterialTheme.colorScheme.background
        ) {
        // Use a Column with a Box to place the Image at the top
        Column(
        verticalArrangement = Arrangement.Top,
        modifier = Modifier.fillMaxSize()
        ) {
        Box(
        modifier = Modifier.fillMaxWidth(),
        contentAlignment = Alignment.TopStart
        ) {
        // Load your image resource using painterResource
        Image(
        painter = painterResource(id = R.drawable.bg_compose_background),
        contentDescription = null,
        modifier = Modifier.fillMaxWidth()
        )
        }
        // Insert your Jetpack Compose tutorial text here
        TutorialText()
        }
        }
        }
        }
        }
        }

@Composable
fun TutorialText() {
        Text(
        text = buildAnnotatedString {
        withStyle(style = SpanStyle(fontWeight = FontWeight.Bold)) {
        append("Jetpack Compose tutorial")
        }
        append(
        "\n\nJetpack Compose is a modern toolkit for building native Android UI. Compose simplifies and accelerates UI development on Android with less code, powerful tools, and intuitive Kotlin APIs." +
        "\n\nIn this tutorial, you build a simple UI component with declarative functions. You call Compose functions to say what elements you want, and the Compose compiler does the rest. Compose is built around Composable functions. These functions let you define your app's UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI's construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name."
        )
        }
        )
        }


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
        ComposeBasicsTheme {
        TutorialText()
        }
        }