function addcomment() {
    let usercomment = document.querySelector('#inputId').value;

    let ele = document.querySelector('#referenceCommentId').cloneNode(true);
    ele.removeAttribute("id"); //good practice to keep unique id.
    ele.style.visibility = "visible"; //to do not show the comment in html
    ele.children[0].innerHTML = usercomment;
    ele.style.margin = "1vh";


    ele.style.backgroundColor = "Green";

    const commentBox = document.querySelector('#comment');
    commentBox.insertBefore(ele, commentBox.firstChild);

    // clean the input box
    document.querySelector("#inputId").value = "";

}

function deleteComment(btnElement) {
    btnElement.parentElement.remove();
}