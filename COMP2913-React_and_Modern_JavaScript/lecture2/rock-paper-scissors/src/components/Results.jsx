import React, { Component } from 'react';
import '../App.css';

class Results extends Component {
  render() {
    return (
        <div>
        <div className="row">
          <h5 className="col s12 center-align">
            <span className="title">Result:</span> {this.props.results}
          </h5>
        </div>
      </div>
    )
  }
}

export default Results;