let emailCheck = document.getElementById("email");
let emailValid = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
function submit() {
    emailValid = /^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\.[A-Za-z0-9]+)$/;
    if (emailValid.test(emailCheck.value)){
        alert("Email Valid");
    }else alert("Email UnValid");
}