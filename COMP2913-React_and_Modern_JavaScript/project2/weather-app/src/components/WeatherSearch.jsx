import React, { Component } from 'react'
import WeatherCurrent from './WeatherCurrent';
import Axios from 'axios';
import WeatherForecast from './WeatherForecast';

class WeatherSearch extends Component {
    constructor(props) {
        super(props);

        this.state = {
            city: '-',
            temp: '-',
            weather: '',
            forecasts: [],
            formattedTime: []

        }
    }

    componentDidMount() {
        this.fetchWeather();
    }

    componentDidUpdate(prevProps, prevState) {
        if (prevState.city !== this.state.city) {
            this.fetchWeather();
        }
    }

    handleChange = (e) => {
        const { name, value } = e.target;
        this.setState({
            [name] : value
        });
    }

    fetchWeather() {
        const key = "276fec29e55ea62ae91d3765da073a36"

        Axios.get(`https://api.openweathermap.org/data/2.5/weather?q=${this.state.city},ca&units=metric&appid=${key}`)
        .then((response) => {

            this.setState({
                city: response.data.name,
                temp: Math.floor(response.data.main.temp),
                weather: response.data.weather[0].main
            })
        })
        .catch((error) => {
            this.setState({
                city: "-",
                temp: "-",
                weather: "-"
            })
            console.log(error);
        });

        Axios.get(`https://api.openweathermap.org/data/2.5/forecast?q=${this.state.city},ca&units=metric&appid=${key}`).then((response) => {
            
            // Take the response and collect the first 5 items and set as State - possibly slice the first 5 items
            // map forecast array into weatherforacast component - passing along all data and only calling necessary info through props

            // let temp = response.data.list(0, 6).map(i => {

            // })

            this.setState({
                forecasts: response.data.list
            });
        })
        .catch((error) => {
            console.log(error);
        })
    }

  render() {
      let forecasts = this.state.forecasts;
      
      
    return (
      <div>
        <form>
            <select
                name="city"
                value={this.state.city}
                onChange={this.handleChange}
            >
                <option value="" />
                <option value="Vancouver">Vancouver</option>
                <option value="Calgary">Calgary</option>
                <option value="Saskatchewan">Saskatchewan</option>
                <option value="Winnipeg">Winnipeg</option>
                <option value="Toronto">Toronto</option>
                <option value="Halifax">Halifax</option>
            </select>
        </form>
        <WeatherCurrent city={this.state.city} temp={this.state.temp} weather={this.state.weather}/>
        <h3 className="header">Hourly Forecast</h3>
        <ul className="forecastDisplay">
            {forecasts
            .filter((forecast, index) => (index < 6))
            .map((forecast, index) => {
                return (
                    <li className="forecastDisplayItems" key={forecast + index}>
                        <WeatherForecast key={index} forecast={forecast} time = {forecast.dt_txt.split(" ").pop()}/>
                    </li>
                );
            })}
        </ul>
        
      </div>
    )
  }
}

export default WeatherSearch
