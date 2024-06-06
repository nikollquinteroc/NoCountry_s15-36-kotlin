package com.example.saleapp.view.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.saleapp.R

val roboto = FontFamily(
    Font(R.font.roboto_regular,FontWeight.Normal),
    Font(R.font.roboto_medium,FontWeight.Normal),
    Font(R.font.roboto_bold, FontWeight.Bold)
)

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp,
    ),
    bodyLarge = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 16.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight(400),
        fontSize = 14.sp,
        lineHeight = 16.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight(400),
        fontSize = 12.sp,
        lineHeight = 16.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = roboto,
        fontWeight = FontWeight(400),
        fontSize = 8.sp
    )

)