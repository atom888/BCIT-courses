import React, { Component } from "react";
import Axios from "axios";
import UserProfile from "./components/UserProfile";
import "./App.css";

class App extends Component {
  constructor(props) {
    super(props);

    this.state = {
      userData: []
    };
  }

  componentDidMount() {
    this.fetchUserData();
  }

  fetchUserData() {
    Axios.get("https://randomuser.me/api/?results=25")
      .then(response => {
        this.setState({
          userData: response.data.results
        });
      })
      .catch(error => {
        console.log(error);
      });
  }

  handleDelete = id => {
    const updateUserData = this.state.userData.filter(
      user => user.id.value !== id
    );

    this.setState({
      userData: updateUserData
    });
  };

  render() {
    const { userData } = this.state;
    return (
      <div className="App">
        <ul>
          {userData.map((user, index) => {
            return (
              <UserProfile
                key={user + index}
                userData={user}
                onDelete={this.handleDelete}
              />
            );
          })}
        </ul>
      </div>
    );
  }
}

export default App;
