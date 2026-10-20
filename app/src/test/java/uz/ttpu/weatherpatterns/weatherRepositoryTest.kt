package uz.ttpu.weatherpatterns.data.repository

import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test
import uz.ttpu.weatherpatterns.data.api.FakeWeatherApi

class WeatherRepositoryTest {

    private val repository =
        WeatherRepository(FakeWeatherApi(latencyMs = 0))

    @Test
    fun known_city_returns_success() = runBlocking {
        val result = repository.getWeather("Tashkent")

        assertTrue(result.isSuccess)
        assertEquals(24, result.getOrThrow().temperatureC)
    }

    @Test
    fun unknown_city_returns_failure() = runBlocking {
        val result = repository.getWeather("Atlantis")

        assertTrue(result.isFailure)
    }
}
