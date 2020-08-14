function changemouseover() {
    let ele = document.querySelector('div').children[0];
    ele.style.backgroundColor = 'lightgreen';
    ele.style.color = 'blue';
    ele.innerHTML = 'My world';
}


function changemouseout() {
    let ele = document.querySelector('div').children[0];
    ele.style.backgroundColor = 'cadetblue';
    ele.style.color = 'black';
    ele.innerHTML = 'Hello World';
}