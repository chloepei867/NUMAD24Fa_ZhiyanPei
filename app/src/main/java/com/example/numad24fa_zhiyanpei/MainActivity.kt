package com.example.numad24fa_zhiyanpei

import android.content.Context
import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.numad24fa_zhiyanpei.ui.theme.NUMAD24Fa_ZhiyanPeiTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NUMAD24Fa_ZhiyanPeiTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    AboutMeLayout()
                }
            }
        }
    }
}



@Composable
fun AboutMeLayout() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Row() {
            Text(
                text= stringResource(R.string.hello_word_text),
                fontSize = 60.sp,
                lineHeight = 116.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(16.dp)

            )
        }
        Row() {
            AboutMeButton()
        }
    }
}

@Composable
fun AboutMeButton() {
    val text = stringResource(R.string.my_info);
    val duration = Toast.LENGTH_SHORT;
    val context: Context = LocalContext.current;

    Button(
        onClick={
        Toast.makeText(context, text, duration)
            .show()
        }
    ) {
        Text(
            stringResource(R.string.about_me_text),
            fontSize = 20.sp,
            )

    }
}

@Preview(showBackground = true)
@Composable
fun AboutMeLayoutPreview() {
    NUMAD24Fa_ZhiyanPeiTheme {
        AboutMeLayout()
    }
}