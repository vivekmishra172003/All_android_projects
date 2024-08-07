package com.example.state_concept

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Favorite
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.state_concept.ui.theme.State_conceptTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            State_conceptTheme {
                NotificationScree()

            }
        }
    }
}

@Composable
fun NotificationScree(){
    var count  = rememberSaveable{ mutableStateOf(0) }
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(1f)
    ) {
        NotificationCounter(count.value,{count.value++})
        MessageBar(count.value)
    }
}



@Composable
fun NotificationCounter(count:Int,updateCount:()->Unit){

    Column(verticalArrangement = Arrangement.Center,) {
        Text(text = "You  have sent ${count} notifications")
        Button(onClick = { updateCount()}) {
            Text(text = "Send Notification")
        }
    }
}

@Composable
fun MessageBar(count: Int){
    Card(
        elevation = CardDefaults.cardElevation(
            defaultElevation = 6.dp
        )
    ) {
        Row(Modifier.padding(8.dp),
            verticalAlignment = Alignment.CenterVertically) {
            Image(imageVector = Icons.Outlined.Favorite ,
                contentDescription = null,
                Modifier.padding(4.dp))
            Text(text = "Messgae sent so far - $count")
        }
    }
}