import React, { Component } from 'react'
import userData from '../userData.json'
import Profile from './Profile'
import '../App.css'

class UserView extends Component {
    constructor(props) {
        super(props);
        this.state = {
            userData: userData.results
        }
    }

  render() {
    const { userData } = this.state;
    return (
      <div>
        {userData.map((userData, index) => {
            return (
                <Profile key={userData + index} userData={userData} index = {index} className="profiles"/>
            );
        })}
      </div>
    )
  }
}

export default UserView
