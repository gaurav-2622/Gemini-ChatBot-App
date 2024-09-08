package com.example.takon.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ChatHeader(){
        Text(text = "Gemini ChatBot",
            color= Color.Black,
            fontSize = 18.sp,
            textAlign = TextAlign.Center,

            fontWeight = FontWeight.Bold,
            modifier =Modifier.fillMaxWidth().padding(10.dp).background(Color.LightGray),


        )
}