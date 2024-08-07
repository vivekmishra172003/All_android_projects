package com.example.codelab_1

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(heightDp = 200)
@Composable
fun BlogCategoryItem(){
    LazyColumn(content = {
        items(getCategoryList()){
            item ->
            BlogCategory(img = item.img, title = item.title, subtitle =item.subtitle )
        }
    })
}




@Composable
fun BlogCategory(img:Int,title:String,subtitle:String){
    Card(elevation = CardDefaults.cardElevation(8.dp),
        modifier = Modifier.padding(8.dp)) {
        Row( verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(4.dp)
            ) {
            Image(
                painter = painterResource(id = img),
                contentDescription = null,
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            itemDescriptionn (title, subtitle, Modifier.weight(.7f))
        }


    }
}

@Composable
 fun itemDescriptionn(title: String, subtitle: String,modifier: Modifier) {
    Column(modifier = modifier) {
        Text(
            text = title,

            style = MaterialTheme.typography.titleLarge

        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.bodyLarge,
            fontWeight = FontWeight.Thin
        )
    }
}

data class Catagory(val img:Int,val title: String,val subtitle: String)

fun getCategoryList():MutableList<Catagory>{
    val list = mutableListOf<Catagory>()
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    list.add(Catagory(R.drawable.contact,"Programming","Learn different Programming"))
    return list
}