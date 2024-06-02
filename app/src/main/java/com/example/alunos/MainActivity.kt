package com.example.alunos


import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.alunos.ui.theme.AlunosTheme
import androidx.compose.ui.Modifier as Modifier1

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlunosTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier1.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Registro()
                }
            }
        }
    }
}


fun Divider(modifier: Modifier1, thickness: Arrangement.HorizontalOrVertical, color: @Composable () -> Unit) {
    TODO("Not yet implemented")
}



fun NotaMBButtonColors(): Any {

    return TODO("Provide the return value")
}

@Composable
fun Aluno(nome: String) {

    Surface(modifier = Modifier1.fillMaxWidth(), color = MaterialTheme.colorScheme.background)
    {
        Column(verticalArrangement = Arrangement.SpaceEvenly, horizontalAlignment = Alignment.CenterHorizontally) {

            Spacer(modifier = Modifier1.height(80.dp))

            ActionButton(
                text = "Nota I",
                buttonColors = NotaIButtonColors(),
                modifier = Modifier1.fillMaxWidth(0.5f)
            ){
                Log.e(TAG,"App: $nome Nota I")
            }

            ActionButton(
                text = "Nota R",
                modifier = NotaRButtonColors(),
                buttonColors = Modifier1.fillMaxWidth(0.5f))
            {
                Log.w(TAG, "App: $nome Clicou na nota R")
            }

            ActionButton(
                text = "Nota B",
                modifier = NotaRButtonColors(),
                buttonColors = Modifier1.fillMaxWidth(0.5f))
            {
                Log.i(TAG, "App: $nome Clicou na nota B")
            }

            ActionButton(
                text = "Nota MB",
                modifier = NotaMBButtonColors(),
                buttonColors =  Modifier1.fillMaxWidth(0.5f))
            {
                Log.i(TAG, "App: $nome Clicou na nota MB")

            }
        }


    }
}

fun NotaRButtonColors(): Any {

    return TODO("Provide the return value")
}

fun NotaIButtonColors(): Any {

    return TODO("Provide the return value")
}

@Composable
fun ActionButton(text: String, modifier: Any, buttonColors: Any, function: () -> Int) {
    TODO("Not yet implemented")
}

@Composable
@Preview(showBackground = true)
fun Registro()
{
    var nome by remember { mutableStateOf("") }

    Column(Modifier1.fillMaxWidth(),) {
        Row(Modifier1.fillMaxWidth(), Arrangement.Center) {
            Image(painter = painterResource(id = com.example.alunos.R.drawable.logo), contentDescription = "Logo")

            Spacer(modifier = Modifier1.width(60.dp))

            Text(text = "Exercício de Fixação", fontSize = 20.sp)
        }

        Divider(modifier = Modifier1
            .fillMaxWidth()
            .padding(vertical = 20.dp)

            Row(Modifier1.fillMaxWidth()),Arrangement.Center){
                TextField(value = nome, onValueChange = {novoValor -> nome = novoValor},
                label = {Text("Nome: ")}
            )

        }

        Spacer(modifier = Modifier1.height(16.dp))

        Aluno(nome)

    }
}

private infix fun Any.Row(NOME: Modifier1): Modifier1 {

    return TODO("Provide the return value")
}


@Composable
fun ActionButton(text: String,
                 buttonColors: ButtonColors = ButtonDefaults.buttonColors(),
                 modifier: Modifier1 = Modifier1,
                 block: () -> Unit
) {
    ElevatedButton(
        onClick = block,
        shape = RoundedCornerShape(5.dp),
        colors = buttonColors,
        modifier = Modifier1
    )
    {
        Text(text = text)
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AlunosTheme {
        Greeting("Android")
    }
}

@Composable
fun Greeting(s: String) {

}
