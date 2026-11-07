package app.clodio.alarm

import androidx.compose.foundation.background

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import app.clodio.ALARM_BOX_COLOR
import app.clodio.ALARM_BOX_HEIGHT
import app.clodio.ALARM_BOX_TIME_FONT_SIZE
import app.clodio.ALARM_BOX_TIME_FONT_WEIGHT
import app.clodio.ALARM_BOX_TIME_PADDING
import app.clodio.ROUNDED_BOX

@Composable
fun AlarmBox(alarmData : AlarmData) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(ALARM_BOX_HEIGHT)
            .background(
                color = ALARM_BOX_COLOR,
                shape = ROUNDED_BOX
            )
    ) {
        Text(
            text = alarmData.time.toString(),
            fontSize = ALARM_BOX_TIME_FONT_SIZE,
            fontWeight = ALARM_BOX_TIME_FONT_WEIGHT,
            modifier = Modifier
                .align(Alignment.CenterStart)
                .padding(start = ALARM_BOX_TIME_PADDING)
        )

        Switch(
            checked = alarmData.enabled,
            onCheckedChange = {alarmData.enabled = it}
        )
    }
}