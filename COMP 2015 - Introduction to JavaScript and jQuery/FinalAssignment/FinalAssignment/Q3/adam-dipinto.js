//Final Assignment


//FORM TEXTBOX
$(function(){

  document.forms[0].onsubmit = function() {
  if(!document.getElementById('t').value){
    return false;
  }
}


    var links = document.getElementsByTagName('a');

    for (let i = 0; i < links.length; i++) {
      links[i].onclick = function(event) {
        if (links[i].href.includes("bcit")) {
          event.preventDefault();
        }
      }
    }




  });
