//Assignment #2

var counter = 0;
timerID = null;

function move() {
  var img6 = document.getElementById("gecko");

  img6.style.left = parseInt(img6.style.left) + 2 + "px";

}
function moveFast() {
  var img7 = document.getElementById("rhino");

  img7.style.left = parseInt(img7.style.left) + 2 + "px";
}




function update() {




      if (counter != 0) {
        return false;
      } else {
        var img1 = document.createElement("img");
        var img2 = document.createElement("img");
        var img3 = document.createElement("img");
        var img4 = document.createElement("img");
        var img5 = document.createElement("img");
        var img6 = document.createElement("img");
        var img7 = document.createElement("img");

        var img = document.getElementsByTagName("img");

        var text = document.createElement("p");
        var t = document.createTextNode("Push!");
        text.appendChild(t);

        img1.src = "images/dog.jpg";
        img2.src = "images/cat.jpg";
        img3.src = "images/fish.jpg";
        img4.src = "images/shark.jpg";
        img5.src = "images/turtle.jpg";
        img6.src = "images/gecko.jpg";
        img7.src = "images/rhino.jpg";

        img6.id = "gecko";
        img7.id = "rhino";

        img6.style.left = "1px";
        img7.style.left = "1px";

        img6.style.position = "absolute";
        img7.style.marginTop = "200px";
        img7.style.position = "absolute";

        var button = document.createElement("BUTTON");
        button.id = "push";


        document.getElementById("topDiv").appendChild(img1);
        document.getElementById("topDiv").appendChild(img2);
        document.getElementById("topDiv").appendChild(img3);
        document.getElementById("topDiv").appendChild(img4);
        document.getElementById("topDiv").appendChild(img5);

        document.body.appendChild(document.createElement('br'))
        document.body.appendChild(button);
        document.getElementById("push").appendChild(text);
        document.body.appendChild(document.createElement('br'))
        document.body.appendChild(img6);
        document.body.appendChild(document.createElement('br'))
        document.body.appendChild(img7);
        counter++;
      }





      for (let i = 0; i < img.length; i++) {
        if (i <= 4) {
            img[i].onclick = moveFirst;
        }
      }

      img6.ondblclick=function() {
        if (timerID == null) {
          timerID = setInterval("move()", 10);
        } else {
          clearInterval(timerID);
          timerID = null;
        }
       }

       img7.ondblclick=function() {
         if (timerID == null) {
           timerID = setInterval("moveFast()", 5);
         } else {
           clearInterval(timerID);
           timerID = null;
         }
        }

      $("button").click(function(){
        $("img").css("border", "1px solid red");
      })



      function moveFirst() {
          this.parentNode.insertBefore(this, this.parentNode.firstChild);
      }


}
