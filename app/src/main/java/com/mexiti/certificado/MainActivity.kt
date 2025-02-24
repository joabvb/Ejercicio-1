package com.mexiti.certificado

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CertificateScreen()
        }
    }
}

@Composable
fun CertificateScreen() {
    val name = "Vega Barenas Joab"
    val numberOfHours = 40
    val course = "Advanced Android Development"

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.android_certificate),
            contentDescription = "Background Image",
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(alpha = 0.3f) // Reduce opacidad
        )
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.unam_negro),
                    contentDescription = "Left Logo",
                    modifier = Modifier.size(125.dp,125.dp)
                )
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "UNAM",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Spacer(modifier = Modifier.width(16.dp))
                Image(
                    painter = painterResource(id = R.drawable.fi_negro),
                    contentDescription = "Right Logo",
                    modifier = Modifier.size(125.dp,125.dp)
                )
            }
            Text(
                text = "Facultad de Ingenieria",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(150.dp))
            Text(
                text = "This certificate is presented to:",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(25.dp))
            Text(
                text = "has completed a $numberOfHours hours course on",
                fontSize = 16.sp,
                textAlign = TextAlign.Center
            )
            Text(
                text = course,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            )
            Spacer(modifier = Modifier.height(250.dp))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.firma1),
                        contentDescription = "Signature Image 1",
                        modifier = Modifier.size(100.dp, 50.dp)
                    )
                    Text(text = "Eric Schmidt", fontWeight = FontWeight.Bold)
                    Text(text = "Google CEO")
                }
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Image(
                        painter = painterResource(id = R.drawable.firma2),
                        contentDescription = "Signature Image 2",
                        modifier = Modifier.size(100.dp, 50.dp)
                    )
                    Text(text = "Andy Rubin", fontWeight = FontWeight.Bold)
                    Text(text = "Android CEO")
                }
            }
        }
    }
}

