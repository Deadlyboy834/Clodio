package app.clodio.alarm

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AlarmBox(alarmData : AlarmData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(
                Color.LightGray,
                shape = RoundedCornerShape(10.dp)
            )
            .clickable(
                onClickLabel = "Open alarm",
                role = Role.Button
            ){

            }
    ) {
        Text(
            text = alarmData.time.toString(),
            fontSize = 20.sp,
            fontWeight = FontWeight(100),
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = 10.dp)
        )
    }
}