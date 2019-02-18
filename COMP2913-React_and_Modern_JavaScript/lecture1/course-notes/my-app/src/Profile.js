import React, { Component } from 'react';

class Profile extends Component {
  render() {
    var styles = { width: 100, borderRadius: 5 };
    return (
      <div>
        <img
          style={styles}
          src={this.props.imageUrl}
        />
        {this.props.name.first}&nbsp;
        {this.props.name.last }
      </div>
    );
  }
}

export default Profile;
