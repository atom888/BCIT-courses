//Lab 5
timerID = null;
const ALL_IMAGES = 15;

function grow() {
  var large = document.getElementById("large");

  large.style.width = parseInt(large.style.width) + 1 + "px";
  large.style.heigth = parseInt(large.style.height) + 1 + "px";
}

function moveDown() {
  var large = document.getElementById("large");

  large.style.top = parseInt(large.style.top) + 2 + "px";
  console.log(large.style.top)
}


onload = function init() {

  var body = document.createElement('body');
  document.head.appendChild(body);

  h1 = document.createElement('h1');
  h1.appendChild(document.createTextNode('Hello, Welcome to Lab 5.'));
  document.body.appendChild(h1);

  var div1 = document.createElement('div');
  div1.id = "0";
  var div2 = document.createElement('div');
  div2.id = "1";
  var div3 = document.createElement('div');
  div3.id = "2";
  var div4 = document.createElement('div');
  div4.id = "3";
  var div5 = document.createElement('div');
  div5.id = "4";


  document.body.appendChild(div1);
  document.body.appendChild(div2);
  document.body.appendChild(div3);
  document.body.appendChild(div4);
  document.body.appendChild(div5);

  var h1 = document.createElement('h1');
  h1.appendChild(document.createTextNode('Image Liker by Adam Dipinto.'));
  div1.appendChild(h1);


  var h2 = document.createElement('h2');
  h2.className = 'instructions';
  h2.appendChild(document.createTextNode('- All Images -'));
  div2.appendChild(h2);


  var h2 = document.createElement('h2');
  h2.className = 'instructions';
  h2.appendChild(document.createTextNode('- Images I Like -'));
  div3.appendChild(h2);


  var h2 = document.createElement('h2');
  h2.className = 'instructions';
  h2.appendChild(document.createTextNode('- Images I Hate -'));
  div4.appendChild(h2);

  var input = document.createElement('input');
  input.type = 'button';
  input.id = "resetButton";
  input.value = 'Reset!'
  div5.appendChild(input);

  divBuilder();

  function divBuilder () {
    for (let i = 0; i <= 14; i++) {
      var img = document.createElement('img');
      img.id = "img" + i;
      img.src = "images/" + i + ".jpg";
      img.style.margin = "4px";
      img.style.width = "120px";
      img.style.height = "120px";
      img.style.border = "red solid 1px"

      div1.appendChild(img);

      img.onclick = moveFirst;

    }
  }




  var imgLarge = document.createElement("img");
  imgLarge.src = "images/15.jpg";
  imgLarge.id = "large"
  imgLarge.style.width = "100px";
  imgLarge.style.marginLeft = "500px";
  imgLarge.style.position = "relative";
  imgLarge.style.top = "1px";
  document.body.appendChild(imgLarge);


  function moveFirst() {
    if (this.nextSibling == null) {
      if(this.parentNode.nextSibling != null) {
        this.parentNode.nextSibling.appendChild(this);
      } else {
        this.parentNode.previousSibling.appendChild(this);
      }
    } else {
      this.parentNode.insertBefore(this.nextSibling, this);
    }
  }

  imgLarge.onmouseover = function() {
    if (timerID == null) {
      timerID = setInterval("grow()", 100);
    } else {
      clearInterval(timerID);
      timerID = null;
    }
  }

  imgLarge.onclick = function () {
    if (timerID == null) {
      timerID = setInterval("moveDown()", 100);
    } else {
      clearInterval(timerID);
      timerID = null;
    }
  }

  resetButton.onclick = function () {
    // debugger;
    var img = document.getElementsByTagName('img');
    for (let i = 0; i < ALL_IMAGES; i++) {
        document.getElementById("img"+ i).remove();
      }
    divBuilder();

  }

}
