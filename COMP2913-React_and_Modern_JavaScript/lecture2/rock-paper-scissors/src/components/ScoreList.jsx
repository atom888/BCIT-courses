import React, { Component } from 'react';
import '../App.css';

class ScoreList extends Component {
  render() {
    return (
        <div>
            <br/>
            <div className="scoreBox">
                <div className="row">
                    <div className="col s12 center-align">
                        <h5>
                            <span className="title center-align">Score</span>
                        </h5>
                        <br/>
                        <div className="row">
                            <h5>
                                <span className="">Computer: {this.props.computerscore}</span>
                            </h5>
                        </div>
                        <div className="row">
                            <h5>
                                <span className="">Human: {this.props.humanscore}</span>
                            </h5>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
  }
}

export default ScoreList;