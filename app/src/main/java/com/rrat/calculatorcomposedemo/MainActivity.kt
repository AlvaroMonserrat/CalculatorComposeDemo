package com.rrat.calculatorcomposedemo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.rrat.calculatorcomposedemo.ui.theme.CalculatorComposeDemoTheme
import com.rrat.calculatorcomposedemo.ui.theme.MediumGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculatorComposeDemoTheme {
                val viewModifier = viewModel<CalculatorViewModel>()
                val state = viewModifier.state
                val buttonSpacing = 8.dp

                Calculator(
                    state = state,
                    onAction = viewModifier::onAction,
                    buttonSpacing = buttonSpacing,
                    modifier = Modifier
                        .fillMaxSize()
                        .background(MediumGray)
                        .padding(16.dp)
                )

            }
        }
    }
}

