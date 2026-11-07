package app.clodio

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Boxes
val ROUNDED_BOX: RoundedCornerShape = RoundedCornerShape(10.dp)

// AlarmBox
val ALARM_BOX_HEIGHT: Dp = 100.dp
val ALARM_BOX_COLOR: Color = Color(0xFF2C2C2C)
val ALARM_BOX_TIME_PADDING: Dp = 15.dp
val ALARM_BOX_TIME_FONT_SIZE: TextUnit = 30.sp
val ALARM_BOX_TIME_FONT_WEIGHT: FontWeight = FontWeight(450)

object Routes {
    const val HOME: String = "home"
}