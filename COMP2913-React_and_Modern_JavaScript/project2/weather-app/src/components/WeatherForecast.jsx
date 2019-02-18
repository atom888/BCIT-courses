import React, { Component } from 'react';
import clearDay from '../assets/clear-day.png';
import cloud from '../assets/cloud.png';
import rain from '../assets/rain.png';
import snow from '../assets/snow.png';
import cloudyDay from '../assets/cloudy-day.png';
import wind from '../assets/wind.png';

class WeatherForecast extends Component {

  render() {
    let weather;
    if (this.props.forecast.weather[0].main === 'Snow') {
        weather = (
            <img alt="snow" src={snow}/>
        )
    } else if (this.props.forecast.weather[0].main === 'Shower Rain' || this.props.forecast.weather[0].main === 'Rain') {
        weather = (
            <img alt="rain" src={rain}/>
        )
    } else if (this.props.forecast.weather[0].main === 'Clear Sky' || this.props.forecast.weather[0].main === 'Clear') {
        weather = (
            <img  alt="clear day" src={clearDay}/>
        )
    } else if ( this.props.forecast.weather[0].main === 'Scattered Clouds' || this.props.forecast.weather[0].main === 'Broken Clouds' || this.props.forecast.weather[0].main === 'Clouds') {
        weather = (
            <img alt="cloud" src={cloud}/>
        )
    } else if (this.props.forecast.weather[0].main === 'Few Clouds') {
        weather = (
            <img alt="cloud day" src={cloudyDay}/>
        )
    } else if (this.props.forecast.weather[0].main === 'Mist') {
        weather = (
            <img alt="wind" src={wind}/>
        )
    }

    return (
      <div>
        <span className="forecastTime">{this.props.time}</span>
        <div className="weatherForecastIcon">{ weather }</div>
        <span className="temp">{this.props.forecast.main.temp}</span>
        <span className="temp">{this.props.forecast.weather[0].main.temp} °C</span>
      </div>
    )
  }
}

export default WeatherForecast
