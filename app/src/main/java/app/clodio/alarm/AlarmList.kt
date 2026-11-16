package app.clodio.alarm

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.platform.LocalWindowInfo
import androidx.compose.ui.unit.dp
import app.clodio.Constants.Boxes.ROUNDED_BOX
import app.clodio.alarm.AlarmData.Companion.getRandomAlarm

@Composable
fun AlarmList() {
    LazyColumn(
        modifier = Modifier
            .offset(
                x = with(receiver = LocalDensity.current) {
                    (LocalWindowInfo.current.containerSize.width * 0.025f).toDp()
                },
                y = with(receiver = LocalDensity.current) {
                (LocalWindowInfo.current.containerSize.height * 0.35f).toDp()
            })
            .fillMaxWidth(fraction = 0.95f)
            .fillMaxHeight(fraction = 0.65f)
            .background(
                Color.DarkGray,
                shape = ROUNDED_BOX
            ),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        val randomAlarmData: List<AlarmData> = (1..10).map{getRandomAlarm()}

        items(randomAlarmData) { alarm ->
            AlarmBox(alarmData = alarm)
        }
    }
}