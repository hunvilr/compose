package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.myapplication.books.BookShelfListItems
import com.example.myapplication.books.PieChart
import com.example.myapplication.books.getBooks
import com.example.myapplication.ui.theme.MyApplicationTheme

/**
 * https://dribbble.com/shots/18526342-Mobile-App-iOS-Android-UI
 */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BookShelfListItems(bookList = getBooks())
                }
            }
        }
    }
}