package com.setjy.workoutapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.setjy.workoutapp.R

val MontserratFontFamily = FontFamily(
    Font(R.font.montserrat_extra_light, FontWeight.ExtraLight, FontStyle.Normal),
//    Font(R.font.montserrat_extra_light, FontWeight.ExtraLight, FontStyle.Italic),
    Font(R.font.montserrat_light, FontWeight.Light, FontStyle.Normal),
    Font(R.font.montserrat_light_italic, FontWeight.Light, FontStyle.Italic),
    Font(R.font.montserrat_thin, FontWeight.Thin, FontStyle.Normal),
    Font(R.font.montserrat_thin_italic, FontWeight.Thin, FontStyle.Italic),
    Font(R.font.montserrat_medium, FontWeight.Medium, FontStyle.Normal),
    Font(R.font.montserrat_medium_italic, FontWeight.Medium, FontStyle.Italic),
    Font(R.font.montserrat_regular, FontWeight.Normal, FontStyle.Normal),
    Font(R.font.montserrat_italic, FontWeight.Normal, FontStyle.Italic),
    Font(R.font.montserrat_semi_bold, FontWeight.SemiBold, FontStyle.Normal),
    Font(R.font.montserrat_semi_bold_italic, FontWeight.SemiBold, FontStyle.Italic),
    Font(R.font.montserrat_bold, FontWeight.Bold, FontStyle.Normal),
    Font(R.font.montserrat_bold_italic, FontWeight.Bold, FontStyle.Italic),
    Font(R.font.montserrat_extra_bold, FontWeight.ExtraBold, FontStyle.Normal),
    Font(R.font.montserrat_extra_bold_italic, FontWeight.ExtraBold, FontStyle.Italic),
    Font(R.font.montserrat_black, FontWeight.Black, FontStyle.Normal),
    Font(R.font.montserrat_black_italic, FontWeight.Black, FontStyle.Italic)
)


val Typography = Typography(
    //text in palettes
    h1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    //timer header
    h2 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    ),
    // current workout header
    h3 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp
    ),
    //textFields
    h4 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.Normal,
        fontStyle = FontStyle.Normal,
        fontSize = 15.sp
    ),
    //already have an account?
//    h6 = TextStyle(
//        fontFamily = MontserratFontFamily,
//        fontWeight = FontWeight.Medium,
//        fontSize = 10.sp
//    ),
    //workout body
    body1 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp
    ),
    //modifiers
    body2 = TextStyle(
        fontFamily = MontserratFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 12.sp
    ),
//    button = TextStyle(
//        fontFamily = MontserratFontFamily,
//        fontWeight = FontWeight.Bold,
//        fontSize = 14.sp
//    ),
//    caption = TextStyle(
//        fontFamily = MontserratFontFamily,
//        fontWeight = FontWeight.Medium,
//        fontSize = 8.sp
//    )
)