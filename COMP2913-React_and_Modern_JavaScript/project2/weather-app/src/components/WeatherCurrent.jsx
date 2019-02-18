import React, { Component } from 'react'
import clearDay from '../assets/clear-day.png';
import cloud from '../assets/cloud.png';
import rain from '../assets/rain.png';
import snow from '../assets/snow.png';
import cloudyDay from '../assets/cloudy-day.png';
import wind from '../assets/wind.png';



class WeatherCurrent extends Component {
  render() {
    let weather;
    if (this.props.weather === 'Snow') {
        weather = (
            <img alt="snow" src={snow}/>
        )
    } else if (this.props.weather === 'Shower Rain' || this.props.weather === 'Rain') {
        weather = (
            <img alt="rain" src={rain}/>
        )
    } else if (this.props.weather === 'Clear Sky' || this.props.weather === 'Clear') {
        weather = (
            <img  alt="clear day" src={clearDay}/>
        )
    } else if ( this.props.weather === 'Scattered Clouds' || this.props.weather === 'Broken Clouds' || this.props.weather === 'Clouds') {
        weather = (
            <img alt="cloud" src={cloud}/>
        )
    } else if (this.props.weather === 'Few Clouds') {
        weather = (
            <img alt="cloud day" src={cloudyDay}/>
        )
    } else if (this.props.weather === 'Mist') {
        weather = (
            <img alt="wind" src={wind}/>
        )
    }


    return (
      <div>
        <h2 className="city">{this.props.city}</h2>
        <h3 className="temp">{this.props.temp} °C</h3>
        <div>{weather}</div>
        <h3 className="weather">{this.props.weather}</h3>
      </div>
    )
  }
}

export default WeatherCurrent
