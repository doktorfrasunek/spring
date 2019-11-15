$(function(){
   $(".button-collapse").sideNav({edge: 'right'});
});

$('.mark.favorite').click(function(event){
    event.preventDefault();
    var form = event.target;
    alert(form);
});

$('.unmark.favorite').click(function(event){
    event.preventDefault();
    var form = event.target;
    alert(form);
});