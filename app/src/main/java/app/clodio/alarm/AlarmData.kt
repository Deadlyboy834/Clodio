package app.clodio.alarm

import java.time.LocalTime
import kotlin.random.Random

data class AlarmData(
    var time: LocalTime,
    var name: String,
    var daysEnabled: MutableList<Boolean>,
    var enabled: Boolean
) {
    companion object {
        fun getRandomAlarm(): AlarmData {
            return AlarmData(
                time = LocalTime.of(
                    Random.nextInt(0, 24),
                    Random.nextInt(0, 60),
                ),
                name = "Alarm ${Random.nextInt(0, 1000)}",
                enabled = Random.nextBoolean(),
                daysEnabled = (1..7).map { Random.nextBoolean() }.toMutableList()
            )
        }
    }
}