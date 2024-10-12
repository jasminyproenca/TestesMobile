package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
//                    bottomBar = { BottomNavigationBar() }
                ) { paddingValues ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(Color(0xFF1E1EFF))
                            .padding(paddingValues)
                            .padding(horizontal = 16.dp)
                    ) {
                        Text(
                            text = "R$ 43,62",
                            fontSize = 32.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White,
                            modifier = Modifier
                                .padding(vertical = 16.dp)
                                .align(Alignment.CenterHorizontally)
                        )
                        Spacer(modifier = Modifier.height(16.dp))
                        InvestmentCard(
                            "MXRF11",
                            "Rendimento: R$ 0,09",
                            "R$ 11,52",
                            "DAQUI A 2 DIAS"
                        )
                        InvestmentCard(
                            "VISC11",
                            "Rendimento: R$ 0,80",
                            "R$ 10,40",
                            "DAQUI A 2 DIAS"
                        )
                        InvestmentCard(
                            "RVBI11",
                            "Rendimento: R$ 0,75",
                            "R$ 18,75",
                            "DAQUI A 3 DIAS"
                        )
                        InvestmentCard("CPTS11", "Rendimento: R$ 0,07", "R$ 2,95", "DAQUI A 5 DIAS")
                        InvestmentCard("MCHY11", "Rendimento: NÃO INFORMADO", "--", "NÃO INFORMADO")
                    }
                }
            }
        }
    }

    @Composable
    fun Greeting(name: String, modifier: Modifier = Modifier) {
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        MyApplicationTheme {
            Greeting("Android")
        }
    }

    @Composable
    fun InvestmentCard(code: String, earnings: String, amount: String, date: String) {
        Card(
            shape = RoundedCornerShape(8.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            ),
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Column(modifier = Modifier.padding(16.dp)) {
                Text(text = code, fontWeight = FontWeight.Bold, fontSize = 16.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = earnings, color = Color.Gray, fontSize = 14.sp)
                Spacer(modifier = Modifier.height(8.dp))
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Text(
                        text = amount,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFFF9A825),
                        fontSize = 18.sp
                    )
                    Button(
                        onClick = { /* ação do botão */ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        contentPadding = PaddingValues(horizontal = 8.dp, vertical = 4.dp)
                    ) {
                        Text(text = date, color = Color(0xFFF9A825), fontSize = 12.sp)
                    }
                }
                Spacer(modifier = Modifier.height(8.dp))
                TextButton(onClick = { /* ação do botão Mais detalhes */ }) {
                    Text(text = "Mais detalhes", color = Color.Gray)
                }
            }
        }
    }
}