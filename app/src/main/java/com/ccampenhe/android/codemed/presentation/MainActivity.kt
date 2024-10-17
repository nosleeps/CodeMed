package com.ccampenhe.android.codemed.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.ccampenhe.android.codemed.presentation.qrCodeScreen.QrCodeScreen
import com.ccampenhe.android.codemed.presentation.theme.CodeMedTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CodeMedTheme {
                Scaffold(modifier = Modifier.fillMaxSize()){ innerPadding ->
                    QrCodeScreen(Modifier.padding(innerPadding))
                }
            }
        }
    }
}
