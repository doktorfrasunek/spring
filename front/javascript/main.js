var buttons = document.querySelectorAll('input')
function handlesubmit(event){
    event.preventDefault();
    alert("lol");
}
buttons.forEach(function(a){
    a.addEventListener('click', handlesubmit)
})