import React, { Component } from 'react';
import '../App.css'; 

export class StopWatch extends Component {
    constructor(props) {
        super(props);
        this.state = {
            secondsElapsed: 0,
            status: false
        };

        // bind all functions
        this.handleStartClick = this.handleStartClick.bind(this);
        this.handleResetClick = this.handleResetClick.bind(this);
    }

    handleStartClick = () => {
        this.setState(state => {
            if (state.status) {
                clearInterval(this.timer);
            } else {
                this.timer = setInterval (() => {
                    this.setState({
                        secondsElapsed: this.state.secondsElapsed + 1,
                    })
                }, 1000);
            }
            return {status: !state.status};
        })
    }

    handleResetClick() {
        clearInterval(this.timer);
        this.setState({
            secondsElapsed: 0,
            status: false
        });
    }

  render() {
    const { status, secondsElapsed } = this.state;
    const formattedSeconds = (sec) => Math.floor(sec/60) + ':' + ('0' + sec % 60).slice(-2);

    return (
      <div className="stopwatch">
        <h2 className="stopwatch-timer">{formattedSeconds(this.state.secondsElapsed)}</h2>
        <button className="start-btn btn" onClick={this.handleStartClick}>{status ? 'Stop' : 'Start'}</button>
        <button className="btn" onClick={this.handleResetClick}>Reset</button>
      </div>
    )
  }
}

export default StopWatch;
