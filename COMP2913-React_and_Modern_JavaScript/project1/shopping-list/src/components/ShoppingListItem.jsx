import React, { Component } from 'react';
import '../App.css';

class ShoppingListItem extends Component {

    onClickRemove = () => {
        let index = parseInt(this.props.index);
        this.props.removeItem(index);
    }

  render() {
      
    return (
      <div>
        <li
            className='list-group-item'
        >
            <span className="shoppingItem">
                {this.props.shoppingItem} 
            </span>
            <span className="timeStamp"
            >{this.props.timeStamp}</span>
            <button 
            className="close"
            type="button" 
            onClick={this.onClickRemove}>X</button>
        </li>
      </div>
    )
  }
}

export default ShoppingListItem
