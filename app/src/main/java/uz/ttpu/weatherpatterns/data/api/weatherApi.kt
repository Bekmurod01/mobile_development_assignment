package uz.ttpu.weatherpatterns.data.api
import uz.ttpu.weatherpatterns.data.model.Weather

interface WeatherApi {
    suspend fun fetchWeather(city: String): Weather
}
