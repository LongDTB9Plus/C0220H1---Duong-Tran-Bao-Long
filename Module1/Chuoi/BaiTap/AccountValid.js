let accountCheck = document.getElementById("account");
let accountValid = /^[_a-z0-9]{6,}$/;
function submit() {
    accountValid =/^[_a-z0-9]{6,}$/;
    if (accountValid.test(accountCheck.value)){
        alert("Account Valid");
    }else alert("Account UnValid");
}