package br.com.alura.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.datasource.LoremIpsum
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.com.alura.aluvery.ui.theme.AluveryTheme
import br.com.alura.aluvery.ui.theme.Purple500
import br.com.alura.aluvery.ui.theme.Teal200
import kotlin.math.round

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ProductItem() {
    Surface(
        Modifier.padding(8.dp),
        shape = RoundedCornerShape(15.dp),
        shadowElevation = 4.dp
    ) {
        Column (
            Modifier
                .heightIn(250.dp, 300.dp)
                .width(200.dp)
        ){
            val imageSize = 100.dp
            Box(
                Modifier
                    .height(imageSize)
                    .background(
                        Brush.horizontalGradient(
                            colors = listOf(
                                Purple500, Teal200
                            )
                        )
                    )
                    .fillMaxWidth()
            ){
                Image(
                    painter = painterResource(
                        id = R.drawable.ic_launcher_background
                    ),
                    contentDescription = "imagem do produto",
                    Modifier
                        .size(imageSize)
                        .offset(y = imageSize / 2)
                        .clip(CircleShape)
                        .align(BottomCenter)
                )
            }
            Spacer(Modifier.height(imageSize / 2))
            Column (Modifier.padding(16.dp)){
                Text(
                    text = LoremIpsum(50).values.first(),
                    fontSize = 18.sp,
                    fontWeight = FontWeight(700),
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
                Text(
                    text = "R$: 14,99",
                    Modifier.padding(top = 8.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight(400),
                )
            }
        }

    }
}

@Composable
fun MyFirstComposable() {
    Text(text = "Meu primeiro texto")
    //Text(text = "Meu segundo texto maior")
}

@Preview
@Composable
fun MyfirstComposablePreview() {
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}