import React, { Component } from 'react';
import ShoppingListHeader from './components/ShoppingListHeader';
import ShoppingList from './components/ShoppingList';

import './App.css';

class App extends Component {
  render() {
    return (
      <div className="App">
        <ShoppingListHeader />
        <ShoppingList />
      </div>
    );
  }
}

export default App;
