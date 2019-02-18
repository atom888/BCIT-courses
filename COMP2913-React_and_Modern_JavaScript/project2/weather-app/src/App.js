import React, { Component } from 'react';
import './App.css';
import WeatherHeader from './components/WeatherHeader';
import WeatherSearch from './components/WeatherSearch';

class App extends Component {
  render() {
    return (
      <div className="App">
        <WeatherHeader />
        <WeatherSearch />
      </div>
    );
  }
}

export default App;
