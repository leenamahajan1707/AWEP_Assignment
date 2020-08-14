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
    ele.style.display = "flex";
    ele.style.justifyContent = "space-between";
    ele.style.marginBottom = "4px";

    let child1 = document.createElement("div");
    //inserting the value
    child1.textContent = userComment;

    let child2 = document.createElement("button");
    child2.textContent = "Delete";

    ele.appendChild(child1);
    ele.appendChild(child2);

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