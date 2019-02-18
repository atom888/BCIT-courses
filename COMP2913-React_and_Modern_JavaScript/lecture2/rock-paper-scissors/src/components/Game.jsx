import React, { Component } from 'react';
import UserInput from '../components/UserInput';
import ScoreList from '../components/ScoreList';
import ComputerChoice from '../components/ComputerChoice';
import Results from '../components/Results';
import '../App.css';

class Game extends Component {
    constructor(props) {
        super(props)
        this.state = {
            human: 0,
            humanChoice: "",
            computer: 0,
            computerChoice: "",
            results: "",
            winner: "",
            visible: false 
        };

        // bind all functions
        this.computerChoice = this.computerChoice.bind(this);
        this.game = this.game.bind(this);
        this.handleResetClick= this.handleResetClick.bind(this);
    }

    // Computer Weapon Pick
    computerChoice = () => {
        let choicesArray = ['Paper', 'Rock', 'Scissors'];
        let computerResponse = choicesArray[Math.floor(Math.random() *3)];
        console.log(computerResponse);
        return computerResponse;

    }

    // Human Weapon Pick
    game = (userInput) => {
        let computerChoice = this.computerChoice();
        
        this.setState({
            humanChoice: userInput,
            computerChoice: computerChoice
        });

        if (userInput === computerChoice) {
            this.setState({
                results: "Tie!",
                winner: ""
            });
        } else if (
            (userInput === 'Rock' && computerChoice === 'Scissors') || 
            (userInput === 'Paper' && computerChoice === 'Rock') || 
            (userInput === 'Scissors' && computerChoice === 'Paper')) {
                this.setState({
                    results: "You Win!",
                    winner: "Human",
                    human: this.state.human +1,
                    visible: true                   
                });
        } else {
            this.setState({
                results: "Computer Wins!",
                winner: "Computer",
                computer: this.state.computer +1,
                visible: true  
            });
        }
    }
    // Reset Game 
    handleResetClick = () => {
        this.setState({
            human: 0,
            computer: 0,
            results: "",
            winner: "",
            visible: false
        });
    }

    componentDidUpdate() {
        console.log(this.state);
        if ((this.state.human == 5) || (this.state.computer == 5)) {
            alert(this.state.results);
            this.handleResetClick();
        } 
    }

  render() {
      let showComputer, showResults;
      
      if (this.state.visible) {
        showComputer = (<ComputerChoice computerChoice={this.state.computerChoice} />);
        showResults = (<Results results={this.state.results} winner={this.state.winner} />);
      } else {
          showComputer = <div className="row addPadding" />
          showResults = <div className="row addPadding" />
      }

    return (
      <div className="container">
        <div className="wrapper valign-wrapper">
            <div className="valign center">
                <h1 className="center">Rock Paper Scissors</h1>
                <ScoreList humanscore={this.state.human} computerscore={this.state.computer}/>
                {showComputer}
                {showResults}
                <UserInput game={this.game}/>
                <button onClick={this.handleResetClick}>
                    Reset
                </button>
            </div>
        </div>
      </div>
    )
  }
}

export default Game;
