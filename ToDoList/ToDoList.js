function addItem() {
    let val = document.querySelector("input").value;
    const err = document.querySelector("#error");
    if (val == "") {
        err.style.visibility = "visible";
        err.style.color = "Red";
    }
    else {
        err.style.visibility = "hidden";
        let item = document.querySelector("#ref-id").cloneNode(true);
        item.children[0].innerHTML = val;
        item.removeAttribute("id");
        item.style.visibility = "visible";

        let additem = document.querySelector("#list");
        additem.insertBefore(item, additem.firstChild);
    }
    //clean code
    document.querySelector("input").value = "";


}

function deleteItem(btnElement) {
    btnElement.parentElement.remove();
}



// sir
// const email = document.getElementById("mail"); 
// email.addEventListener("input", function (event) {
//     if (email.validity.typeMismatch) {
//         email.setCustomValidity("I am expecting an e-mail address!");
//     } else {
//         email.setCustomValidity("");
//     }
// });
