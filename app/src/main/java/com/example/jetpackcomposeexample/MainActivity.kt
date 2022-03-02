package com.example.jetpackcomposeexample

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeexample.ui.theme.JetpackComposeExampleTheme
import com.example.jetpackcomposeexample.util.PhrasesConstants

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center, Alignment.CenterHorizontally
            )
            {
                Row(
                    modifier = Modifier
                        .fillMaxHeight(0.15f)
                        .fillMaxWidth()
                        .background(Color(0xFF9CCC65)),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.Center
                ) {
                    Header("Cappuccino")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp)
                    ,
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    btnTime("15 minutos")
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    LineSeparator()
                }
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    horizontalArrangement = Arrangement.SpaceAround
                ) {
                    TextNormal(PhrasesConstants.PHRASES.NORMAL)
                }
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                ) {
                    Header("Ingredientes")
                    Row(modifier = Modifier.padding(12.dp)) {
                        IngredientsText("1 dose espresso")
                    }
                    Row(modifier = Modifier.padding(12.dp)) {
                        IngredientsText("100 ml de leite")
                    }
                    Row(modifier = Modifier.padding(12.dp)) {
                        IngredientsText("1 colher de chocolate")
                    }


                }
            }
        }
    }
}

@Composable
fun Header(name: String) {
    Text(
        text = name,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center
    )
}
@Composable
fun IngredientsText(name: String) {
    Icon(
        painter = painterResource(id = R.drawable.ic_arrow), contentDescription = null,
        modifier = Modifier

    )
    Text(
        text = name,
        fontSize = 18.sp,
        textAlign = TextAlign.Center

    )
}

@Composable
fun TextNormal(name: String) {
    Text(
        text = name,
        fontSize = 18.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun btnTime(name: String) {
    Icon(
        painter = painterResource(id = R.drawable.ic_time), contentDescription = "vascoo",
        modifier = Modifier
            .size(68.dp)
            .padding(12.dp)
    )
    Icon(
        painter = painterResource(id = R.drawable.ic_4k), contentDescription = null,
        modifier = Modifier
            .size(68.dp)
            .padding(12.dp)
    )
}

@Composable
fun LineSeparator(){
    Divider(color = Color(0xFF9CCC65), thickness = 1.dp)
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeExampleTheme {
        btnTime("Android")
    }
}