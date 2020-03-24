let numberCheck = document.getElementById("number");
let numberValid = "";
function submit() {
    numberValid =/^[0-9][0-9]-[0]([0-9]+)$/;
    if (numberValid.test(numberCheck.value)){
        alert("Mobile Number Valid");
    }else alert("Mobile Number UnValid");
}