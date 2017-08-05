//Assignment#1

function update() {
  var p = document.getElementsByTagName("p");
  var x = document.getElementsByClassName("change");


  for (let i = 0; i < x.length; i++) {
    x[i].onmouseover = function () {
      this.style.color = "red";
    }
    x[i].onmouseout = function () {
      this.style.color = "black";
    }
  }

  for (let i = 0; i < p.length; i++) {
    p[i].onclick = function () {
      this.style.border = "dashed black 2px";
    }
  }


    var topImgs = document.getElementById("top").getElementsByTagName("img");
    var middleImgs = document.getElementById("middle").getElementsByTagName("img");

    for (let i = 0; i < topImgs.length; i++) {
      topImgs[i].ondblclick = function() {
        this.style.display = "none";
      }
    }

    for (let i = 0; i < middleImgs.length; i++) {
      middleImgs[i].ondblclick = function() {
        this.style.display = "none";
      }
    }

    var bottomLinks = document.getElementById("bottom").getElementsByTagName("a");
    // console.log(bottomLinks);
    for (let i = 0; i < bottomLinks.length; i++) {
      // console.log(bottomLinks[i].href);
      bottomLinks[i].onclick = function(event) {
        debugger;
        if (bottomLinks[i].href.includes("nhl")) {
          event.preventDefault();
        }
      }

    }


}
