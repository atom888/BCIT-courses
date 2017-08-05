//Adam Dipinto - Lab 3a

function update() {
  var ims = document.getElementsByTagName("img");
  var div1images = document.getElementById("div1").getElementsByTagName("img");
  var pars = document.getElementsByTagName("p");
  var div3pars = document.getElementById("div3").getElementsByTagName("p");

  for (let i = 0; i < ims.length; i++) {
    ims[i].onclick = function() {
      this.style.outline = "thick solid #FF0000";
    }
  }

  for (let i = 0; i < div1images.length; i++) {
    div1images[i].onmouseover = function() {
      this.width = 100;
    }
  }

  for (let i = 0; i < pars.length; i++) {
    pars[i].ondblclick = function() {
      this.style.color = "#0000FF";
    }
  }

  for (let i = 0; i < div3pars.length; i++) {
    div3pars[i].onmouseover = function() {
      this.style.backgroundColor = "#FFFF00";
    }
  }

}

document.onload = update();
