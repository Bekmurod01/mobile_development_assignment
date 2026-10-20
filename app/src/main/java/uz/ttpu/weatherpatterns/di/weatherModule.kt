package uz.ttpu.weatherpatterns.di

import uz.ttpu.weatherpatterns.data.api.FakeWeatherApi
import uz.ttpu.weatherpatterns.data.repository.WeatherRepository

object WeatherModule {

    val repository = WeatherRepository(
        FakeWeatherApi(latencyMs = 3000)
    )
}
