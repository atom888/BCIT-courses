import React, { Component } from 'react';
import '../App.css';

class UserInput extends Component {
  render() {
    return (
        <div>
            <div className="row">
                <div className="col s2 offset-s3 center-align ">
                    <button onClick={() => this.props.game('Rock')} className="btn btn-floating btn-large valign-wrapper circle" value="Rock">
                        <span className="symbol valign center-block">👊</span>
                    </button>
                </div>
                <div className="col s2 offset-s3 center-align">
                    <button onClick={() => this.props.game('Paper')} className="btn btn-floating btn-large valign-wrapper circle" value="Paper">
                        <span className="symbol valign center-block">✋️</span>
                    </button>
                </div>
                <div className="col s2 offset-s3 center-align">
                    <button onClick={() => this.props.game('Scissors')} className="btn btn-floating btn-large valign-wrapper circle" value="Scissors">
                        <span className="symbol valign center-block">✌️</span>
                    </button>
                </div>
            </div>
        </div>
    )
  }
}

export default UserInput;
