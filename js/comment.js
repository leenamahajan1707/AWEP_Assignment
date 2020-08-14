//simple dynamic adding comment program

likecount = 0;
commentcount = 0;

function like() {
    let ele = document.querySelector('button');
    likecount++;
    ele.innerHTML = "like " + likecount;


}

function addcomment() {
    commentcount++;

    //reading value from input box
    let userComment = document.querySelector('#inputId').value;

    //creating new dynamic element
    let ele = document.createElement("div");
    //inserting the value
    ele.textContent = userComment;

    //give styeling to element
    if ((commentcount % 2) == 0) {

        ele.style.background = "green";
    }
    else {
        ele.style.background = "orange";
    }
    ele.style.padding = "1vh";
    ele.style.margin = "1vh";

    //appending comment at last
    //document.querySelector('#comment').appendChild(ele);

    //adding comment at begining
    const commentBox = document.querySelector('#comment');
    commentBox.insertBefore(ele, commentBox.firstChild);


}