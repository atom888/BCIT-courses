//Final Assignment

timerID = null;

function move() {
var imgX = document.getElementById("x");

imgX.style.left = parseInt(imgX.style.left) + 1 + "px";
}

onload = function setup() {

  var myH1 = document.createElement('h1');
  myH1.appendChild(document.createTextNode("JavaScript"));

  var breakLine = document.createElement('br');
  var firstDiv = document.createElement('div');
  firstDiv.style.background = "red";

  var myImg = document.createElement('img');
  myImg.src = "images/a.jpg";
  myImg.style.width = "200px";
  myImg.style.margin = "100px";
  firstDiv.appendChild(myImg);

  var myImgTwo = document.createElement('img');
  myImgTwo.src = "images/x.jpg";
  myImgTwo.id = "x";
  myImgTwo.style.width = "150px";
  myImgTwo.style.position = "absolute";
  myImgTwo.style.left = "1px";

  document.body.appendChild(myH1);
  document.body.appendChild(breakLine);
  document.body.appendChild(firstDiv);
  document.body.appendChild(breakLine);
  document.body.appendChild(myImgTwo);


  myImgTwo.onclick = function() {
    if (timerID == null) {
      timerID = setInterval("move()", 100);
    } else {
      clearInterval(timerID);
      timerID = null;
    }
  }

}
