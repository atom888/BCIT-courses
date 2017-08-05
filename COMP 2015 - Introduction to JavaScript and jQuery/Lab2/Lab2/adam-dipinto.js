//Adam Dipinto - Lab 2

//Days left till Christmas
function christmas() {
  var christmasDate = new Date;
  christmasDate.setFullYear(2017,11,25);

  var today = new Date();
  var difference = christmasDate.getTime() - today.getTime();

  var minutes = 1000*60;
  var hours = minutes*60;
  var days = hours*24;

  window.alert(Math.round(difference/days) + " days until Christmas")
}
document.onload = christmas();

//Hockey Array
function hockey() {
  var hockeyTeams = new Array();
  hockeyTeams = ['Anaheim Ducks','Chicago Blackhawks', 'Boston Bruins', 'Carolina Hurricanes', 'Arizon Coyotes', 'Colorado Avalance', 'Buffalo Sabres', 'Columbus Blue Jackets', 'Calgary Flames', 'Dalla Stars', 'Detroit Red Wings', 'New Jersey Devils', 'Edmonton Oliers', 'Minnesota Wild', 'Florida Panthers', 'New York Islanders', 'Los Angeles Kings', 'Nashville Predators', 'Montreal Candadiens', 'New York Rangers', 'San Jose Sharks', 'St. Louis Blues', 'Ottawa Senators', 'Philadelphia Flyers', 'Vancouver Canucks', 'Winnipeg Jets', 'Tampa Bay Lightning', 'Pittsburg Penguins', 'Toronto Maple Leafs', 'Washington Capitals'];

  var index = 0;
  while (index < hockeyTeams.length) {
    if (hockeyTeams[index].includes("an")) {
    window.alert(hockeyTeams[index]);
    }
    index++;
  }
}

document.onload = hockey();
//Red Borders

function borders() {
  var images = document.images;
  for (var i = 0; i < images.length; i++) {
    images[i].style.outline = "thick solid #FF0000";
  }

  var allImages = document.getElementsByTagName("img");
  for (var i = 0; i < allImages.length; i++) {
    allImages[i].width = 100;
  }
}
