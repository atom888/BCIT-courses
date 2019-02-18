import React, { Component } from 'react'

export class CarListItem extends Component {
  render() {
    return (
      <div>
        <br />
        <h1>Car {this.props.index +1}</h1>
        <img src={this.props.carList.imageUrl} style={{ width: 100 }}/>
        <h2> {this.props.carList.year} {this.props.carList.brand} {this.props.carList.make}</h2>
        <p>Price: ${this.props.carList.price}</p>
        <p>Condition: {this.props.carList.new ? 'New':'Used'}</p>
        <br />
      </div>
    )
  }
}

export default CarListItem
