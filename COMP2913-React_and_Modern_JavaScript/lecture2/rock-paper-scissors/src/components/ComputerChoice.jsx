import React, { Component } from 'react';
import '../App.css';

class ComputerChoice extends Component {
  render() {
    return (
        <div>
        <br />
            <div className="row">
            <h5 className="col s12 center-align">
                <span className="title">Computer Chose:</span>{" "}
                {this.props.computerChoice}
            </h5>
            </div>
        </div>
    )
  }
}

export default  ComputerChoice;
