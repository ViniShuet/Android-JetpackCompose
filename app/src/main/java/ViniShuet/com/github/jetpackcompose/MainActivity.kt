package ViniShuet.com.github.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import ViniShuet.com.github.jetpackcompose.ui.theme.JetpackComposeTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Inicial(Modifier.padding(innerPadding))
                }
            }
        }
    }

    @Composable
    fun Inicial(modifier: Modifier = Modifier) {
        Column {
            TextoCustomizado("Primeira função composable.", modifier)
            Row {
                TextoCustomizado("Seja bem vindo!", modifier)
                TextoCustomizado("Olá usuário.", modifier)
            }

        }
    }

    @Composable
    fun TextoCustomizado(texto: String, modifier: Modifier = Modifier) {
        Text(
            text = texto,
            color = Color.Red,
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun PreviewFuncaoInicial() {
        JetpackComposeTheme {
            Inicial()
        }
    }
}