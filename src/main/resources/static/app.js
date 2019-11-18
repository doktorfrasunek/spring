$(function(){
   $(".button-collapse").sideNav({edge: 'right'});
});

function mark(event){
    event.preventDefault();
    var form = event.target;
    $(form).removeClass('mark');
    $(form).removeClass('favorite');
    $(form).addClass('unmark');
    $(form).addClass('favorite');
    $(form).click(unmark);

}

function unmark(event){
    event.preventDefault();
    var form = event.target;
    $(form).removeClass('unmark');
    $(form).removeClass('favorite');
    $(form).addClass('mark');
    $(form).addClass('favorite');
    $(form).click(mark);

}

$('.mark').click(function(event){
    event.preventDefault();
    var form = event.target;
    $(form).removeClass('mark');
    $(form).removeClass('favorite');
    $(form).addClass('unmark');
    $(form).addClass('favorite');
    $(form).click(unmark);

});

$('.unmark').click(function(event){
    event.preventDefault();
    var form = event.target;
    $(form).removeClass('unmark');
    $(form).removeClass('favorite');
    $(form).addClass('mark');
    $(form).addClass('favorite');
    $(form).click(mark);

});