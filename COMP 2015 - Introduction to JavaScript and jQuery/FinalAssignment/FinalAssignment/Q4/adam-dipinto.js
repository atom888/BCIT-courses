//Final Assignment

$(document).ready(function(){
  $(() => {
      $('img').css('border', 'solid red 2px');
    })
})

$(function(){
  $("img").click(function(){
    $(this).width("50px");
  })
})


onload = function () {

  var imgs = document.getElementsByTagName("img");

  for (let i = 0; i < imgs.length; i++) {
    imgs[i].onclick = function() {
      imgs[i].width = "50px";
    }
  }

}
