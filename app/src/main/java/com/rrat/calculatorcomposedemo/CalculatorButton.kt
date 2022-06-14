package com.rrat.calculatorcomposedemo

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.rrat.calculatorcomposedemo.ui.theme.CalculatorComposeDemoTheme


@Composable
fun CalculatorButton(
    symbol: String,
    modifier: Modifier,
    onCLick: () -> Unit
){
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .clip(CircleShape)
            .clickable { onCLick() }
            .then(modifier)
    ){
        Text(
            text = symbol,
            fontSize = 36.sp,
            color = Color.White
        )
    }
}

@Preview
@Composable
fun PreviewCalculatorButton()
{
    CalculatorComposeDemoTheme{
        CalculatorButton("10", Modifier.padding(all=4.dp)) { onClick() }
    }
}

fun onClick()
{

}