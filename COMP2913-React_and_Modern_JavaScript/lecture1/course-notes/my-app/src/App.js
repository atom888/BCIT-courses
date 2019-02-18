import React, { Component } from 'react';
import Test from './Test';
import Profile from './Profile';
import logo from './logo.svg';
import './App.css';

class App extends Component {
  render() {
    var name = 'Daniel';
    return (
      <div className="App">
        <header className="App-header">
          <img src={logo} className="App-logo" alt="logo" />
          <label htmlFor="someFormEl">Label</label>
          <Test />
          <Profile
            name={{ first: 'Rex', last: 'Smith' }}
            imageUrl="https://cdn1.medicalnewstoday.com/content/images/articles/322/322868/golden-retriever-puppy.jpg"
          />
          <Profile
            name={{ first: 'Spike', last: 'The Great' }}
            imageUrl="https://www.cesarsway.com/sites/newcesarsway/files/styles/large_article_preview/public/Common-dog-behaviors-explained.jpg?itok=FSzwbBoi"
          />
        </header>
      </div>
    );
  }
}

export default App;
