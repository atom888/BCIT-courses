import React, { Component } from 'react';
import '../App.css';

class ShoppingListForm extends Component {
    constructor(props) {
        super(props);
        this.state = {
            shoppingListItem: ''
        };
    }

    handleChange = (e) => {
        const { name, value } = e.target;

        this.setState({
            [name]: value 
        })
    }

    handleSubmit = (e) => {
        e.preventDefault();
        let newItemValue = this.state.shoppingListItem;
        if (newItemValue !== '') {
            this.props.addItem(newItemValue);
            this.setState({
                shoppingListItem: ''
            });
        }
        console.log('Submit', this.state);
    }

  render() {
    return (
      <div>
        <form 
        className="form-inline"
        onSubmit={this.handleSubmit}>
            <input
                placeholder="Add shopping item..."
                className="form-control"
                name="shoppingListItem"
                value={this.state.shoppingListItem}
                onChange={this.handleChange}
            />
            <button 
            type="submit">
            Add to Shopping List</button>
        </form>
      </div>
    );
  }
}

export default ShoppingListForm
