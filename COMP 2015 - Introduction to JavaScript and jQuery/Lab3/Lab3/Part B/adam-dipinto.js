//Adam Dipinto Lab 3b

$(function(){
	$('img').click(function(){
		$(this).css('border', '#FF0000 solid thick');
	});
});

$(function(){
	$('p').dblclick(function(){
		$(this).css('color', '#0000FF');
	});
});

$(function(){
	$('#div1 img').mouseover(function(){
		$(this).width(100);
	});
});

$(function(){
	$('#div3 p').mouseover(function(){
		$(this).css('backgroundColor', '#FFFF00')
	});
});
