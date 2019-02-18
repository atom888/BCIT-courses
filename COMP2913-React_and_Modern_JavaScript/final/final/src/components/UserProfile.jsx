import React, { Component } from "react";
// import "../assets/UserProfileStyle.css";
import "../UserProfileStyle.css";

class UserProfile extends Component {
  constructor(props) {
    super(props);
    this.state = {
      isCanadian: false,
      isAmerican: false,
      isMale: false,
      isFemale: false
    };
  }
  render() {
    let gender;
    let flag;

    if (this.props.userData.gender === "male") {
      gender = (
        <img
          className="profile_gender"
          alt="male"
          src="https://www.freeiconspng.com/uploads/male-icon-0.jpg"
        />
      );
    } else {
      gender = (
        <img
          className="profile_gender"
          alt="female"
          src="https://www.freeiconspng.com/uploads/female-icon-5.png"
        />
      );
    }

    if (this.props.userData.nat === "CA") {
      flag = (
        <span className="profile_nat" role="img">
          🇨🇦
        </span>
      );
    } else if (this.props.userData.nat === "US") {
      flag = (
        <span className="profile_nat" role="img">
          🇺🇸
        </span>
      );
    }

    return (
      <div className="profile">
        <img
          className="profile_image"
          alt="profile"
          src={this.props.userData.picture.medium}
        />
        {flag}
        <h3 className="profile_name">
          {this.props.userData.name.first}
          {this.props.userData.name.last}
          {gender}
        </h3>
        <p className="profile_email">
          <b>Email:</b>
          <br />
          {this.props.userData.email}
        </p>
        <p className="profile_location">
          {this.props.userData.location.city},
          {this.props.userData.location.state}
        </p>
        <button
          onClick={() => this.props.onDelete(this.props.userData.id.value)}
        >
          Delete
        </button>
      </div>
    );
  }
}

export default UserProfile;
