package br.com.alura.aluvery.ui.components

import android.graphics.Color
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ChallengeComponent {
    @Preview(showBackground = true)
    @Composable
    private fun DesafioPreview() {
        Row (
            Modifier
                .height(100.dp)
                .fillMaxWidth()
        ){
            Column(
                Modifier
                    .background(color = androidx.compose.ui.graphics.Color.Blue)
                    .fillMaxWidth(0.2f)
                    .fillMaxHeight()
            ) {
            }
            Column () {
                Row (Modifier
                    .padding(12.dp)
                ) {
                    Text(text = "Teste 1")
                }
                Row (Modifier
                    .padding(12.dp)
                ) {
                    Text(text = "Teste 2")
                }
            }
        }
    }
}