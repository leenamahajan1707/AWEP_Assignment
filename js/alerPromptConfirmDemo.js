function disp_alert() {
    let msg = "This is an alert box!!"
    alert(msg);
}

function disp_prompt() {
    var name = prompt("Please enter your name", "");

    if (name != null && name != "") {
        document.write("Hello " + name + " Welcome to javascript");
    }
}

function disp_confirm() {
    var r = confirm("Press a button");
    if (r == true) {
        document.write("You Pressed ok!");
    }
    else {
        document.write("You Pressed cancel!");
    }
}