let likecount = function (btnElement) {
    let val = btnElement.children[0].innerHTML;
    count = parseInt(val);
    count++;
    btnElement.children[0].innerHTML = count;
}

let addcomment = function (btnElement) {
    let usercomment = btnElement.parentElement.previousElementSibling.children[0].value;

    let comment = btnElement.parentElement.parentElement.parentElement.children[2].children[0];
    let newEle = comment.cloneNode(true);

    newEle.children[0].innerHTML = usercomment;

    btnElement.parentElement.parentElement.parentElement.children[2].appendChild(newEle);

}

let callDelete = function(btnElement)
{
    btnElement.parentElement.parentElement.remove();
}