package br.com.alura.aluvery.ui.components

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
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ChallengeComponent {
    @Preview(showBackground = true)
    @Composable
    private fun DesafioPreview() {
        Row (
            Modifier
                .fillMaxWidth()
                .height(150.dp)
        ){
            Column(
                Modifier
                    .background(color = Color.Blue)
                    .width(100.dp)
                    .fillMaxHeight()
            ) {
            }
            Column () {
                    Text("Teste 1",
                        Modifier
                            .fillMaxWidth()
                            .background(Color(0xFFededed))
                            .padding(16.dp)

                    )
                    Text("Teste 2", Modifier.padding(16.dp))

            }
        }
    }
}