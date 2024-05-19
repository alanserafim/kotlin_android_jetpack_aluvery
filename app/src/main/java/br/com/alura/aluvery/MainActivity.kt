package br.com.alura.aluvery

import android.content.res.Configuration
import android.content.res.Configuration.UI_MODE_NIGHT_YES
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.com.alura.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AluveryTheme {
                Surface {
                    MyFirstComposable()
                }
            }
        }
    }
}


@Composable
fun MyFirstComposable(){
    Text(text = "Meu primeiro texto")
    //Text(text = "Meu segundo texto maior")
}

@Preview(
    name = "NewTextPreview",
    uiMode = UI_MODE_NIGHT_YES
)
@Preview(
    name = "NewTextPreviewLight",
)
@Preview(
    name = "TextPreview",
    heightDp = 200,
    widthDp = 300,
    showBackground = true,
    backgroundColor = 0xFFFF1144
    //showSystemUi = true,
    //uiMode = Configuration.UI_MODE_NIGHT_YES
    )
@Composable
fun MyfirstComposablePreview(){
    AluveryTheme {
        Surface {
            MyFirstComposable()
        }
    }
}