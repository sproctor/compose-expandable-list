package com.skyyo.expandablelist

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.platform.setContent
import com.skyyo.expandablelist.cards.CardsScreen
import com.skyyo.expandablelist.cards.CardsViewModel
import com.skyyo.expandablelist.theme.AppTheme


class MainActivity : AppCompatActivity() {
    private val cardsViewModel by viewModels<CardsViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(color = MaterialTheme.colors.background) { CardsScreen(cardsViewModel) }
            }
        }
    }
}
