import React, { Component } from 'react'
import UserView from './UserView';
import '../App.css';

class LoginView extends Component {
    constructor(props) {
        super(props);
        this.state = {
            isLoggedIn: false
        };
    }

    handleClick = (e) =>  {
        e.preventDefault();
        this.setState({
            isLoggedIn: true
        });
    }

  render() {
      let view;
      if (this.state.isLoggedIn) {
          view = (
              <UserView />
          );
      } else {
          view = (
            <div className="login">
                <form className="modalForm">
                    <input className="input"type="text" ref="username" placeholder="username"/>
                    <input className="input"type="password" ref="password" placeholder="password"/>
                </form>
                <button className="loginRow" onClick={this.handleClick}>Login</button>
            </div>
          );
      }
    return (
      <div className="loginMain">
        {view}
      </div>
    )
  }
}

export default LoginView
