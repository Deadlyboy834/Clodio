package app.clodio.alarm

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import app.clodio.alarm.AlarmData.Companion.getRandomAlarm

@Composable
fun AlarmList() {
    LazyColumn(
        modifier = Modifier
            .offset(y = 100.dp)
            .size(width = 350.dp, height = 500.dp)
            .background(
                Color.DarkGray,
                shape = RoundedCornerShape(10.dp)
            ),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        val randomAlarmData: List<AlarmData> = (1..10).map{getRandomAlarm()}

        items(randomAlarmData) { alarm ->
            AlarmBox(alarm)
        }
    }
}