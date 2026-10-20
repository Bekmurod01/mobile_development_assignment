package uz.ttpu.weatherpatterns.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun WeatherScreen(
    status: String,
    onCitySelected: (String) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Text(
            text = status,
            style = MaterialTheme.typography.headlineSmall
        )

        Button(onClick = { onCitySelected("Tashkent") }) {
            Text("Tashkent")
        }

        Button(onClick = { onCitySelected("Samarkand") }) {
            Text("Samarkand")
        }

        Button(onClick = { onCitySelected("Bukhara") }) {
            Text("Bukhara")
        }

        Button(onClick = { onCitySelected("Atlantis") }) {
            Text("Atlantis (test error)")
        }
    }
}
