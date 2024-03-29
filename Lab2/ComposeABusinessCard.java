/*
 * Author: Adib Shauqi (S62588)
 */

package com.example.composebasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material.icons.outlined.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
//import com.example.businesscard.ui.theme.BusinessCardTheme
import com.example.composebasics.ui.theme.ComposeBasicsTheme

class MainActivity : ComponentActivity() {
        override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        ComposeBasicsTheme {
        // A surface container using the 'background' color from the theme
        Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFD2E8D4)
        ) {
        BusinessCard()
        }
        }
        }
        }
        }

@Composable
fun BusinessCard() {
        Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround
        ) {
        CardInfo(
        name = "Adib Shauqi",
        title = "Junior Android Developer"
        )
        ContactInfo(
        phone = "+60 (11) 3746 2183",
        social = "@didib",
        email = "adibshauqi@gmail.com"
        )
        }
        }

@Composable
fun CardInfo(name: String, title: String) {
        Column(
        modifier = Modifier
        .fillMaxWidth()
        .padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center // Center the content vertically
        ) {
        Image(
        painter = painterResource(id = R.drawable.android_logo),
        contentDescription = null,
        modifier = Modifier
        .size(160.dp)
        .background(Color(0xFF073042))
        )
        Text(
        text = name,
        fontSize = 40.sp,
        modifier = Modifier.padding(16.dp)
        )
        Text(
        text = title,
        color = Color(0xFF1F7E4F)
        )
        }
        }


@Composable
fun ContactInfo(phone: String, social: String, email: String) {
        Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
        ) {
        ContactLine(
        icon = Icons.Outlined.Phone,
        message = phone
        )
        ContactLine(
        icon = Icons.Outlined.Share,
        message = social
        )
        ContactLine(
        icon = Icons.Outlined.Email,
        message = email
        )
        }
        }

@Composable
fun ContactLine(icon: ImageVector, message: String) {
        Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(start = 16.dp)
        ) {
        Icon(
        imageVector = icon,
        contentDescription = null,
        tint = Color(0xFF1F7E4F),
        modifier = Modifier.padding(end = 8.dp)
        )
        Text(
        text = message,
        modifier = Modifier.padding(8.dp)
        )
        }
        }

@Preview(showBackground = true, backgroundColor = 0xD2E8D4)
@Composable
fun DefaultPreview() {
        ComposeBasicsTheme {
        BusinessCard()
        }
        }