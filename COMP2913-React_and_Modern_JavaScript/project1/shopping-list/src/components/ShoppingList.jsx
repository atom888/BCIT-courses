import React, { Component } from 'react'
import ShoppingListItem from './ShoppingListItem';
import ShoppingListForm from './ShoppingListForm';
import '../App.css';


class ShoppingList extends Component {
    constructor(props) {
        super(props);
        this.state = {
            shoppingItems: [],
            timeStamp: ''
        }
    }

    removeItem = (itemIndex) => {
        // splice is incorrect since mutating the state - need to something like filter
        this.state.shoppingItems.splice(itemIndex, 1);

        this.setState({
            shoppingItems: this.state.shoppingItems
        })
    }

    addItem = (value) => {
        let item = value;
        let timestamp = new Date().toLocaleString();
        

        this.setState({
            shoppingItems: this.state.shoppingItems.concat([item]),
            timeStamp: [timestamp]
        });
    }

  render() {
      const items = this.state.shoppingItems;
      const timeStamp = this.state.timeStamp;
      const shoppingItems = items.map((item, index) => {
        return (
            <ShoppingListItem 
            key={item + index} 
            shoppingItem={item} 
            timeStamp={timeStamp}
            index={index} 
            removeItem={this.removeItem}/>
        );
      })
    return (
      <div>
          <ShoppingListForm addItem={this.addItem}/>
          <ul 
          className='list-group'
          >
              {shoppingItems}
          </ul>
      </div>
    )
  }
}

export default ShoppingList
