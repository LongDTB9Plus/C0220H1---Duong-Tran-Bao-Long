function validate() {
    let username = document.getElementById("inputUsername").value;
    let password = document.getElementById("inputPassword").value;
    let rePassword = document.getElementById("inputRePassword").value;
    let fullName = document.getElementById("inputFullName").value;
    let email = document.getElementById("inputEmail").value;
    let address = document.getElementById("inputAddress").value;
    let phoneNumber = document.getElementById("inputPhoneNumber").value;

    let valid = true;
    if (username.length < 1) {
        document.getElementById("inputUsernameError").innerText = "This field is required";
        document.getElementById("inputUsernameError").style.display = "block";
        valid = false;
    }else if (username === 'admin'){
        document.getElementById("message").innerText = "Your username already exist.";
        $('#modalSuccess').modal();
        valid = false;
    }
    if (password.length < 1) {
        document.getElementById("inputPasswordError").innerText = "This field is required";
        document.getElementById("inputPasswordError").style.display = "block";
        valid = false;
    } else if (password.length > 16) {
        document.getElementById("inputPasswordError").innerText = "Passwords length cannot exceed 16 characters";
        document.getElementById("inputPasswordError").style.display = "block";
        valid = false;
    }
    if (rePassword.length < 1) {
        document.getElementById("inputRePasswordError").innerText = "This field is required";
        document.getElementById("inputRePasswordError").style.display = "block";
        valid = false;
    } else if (rePassword !== password) {
        document.getElementById("inputRePasswordError").innerText = "Password confirmation doesn't match Password";
        document.getElementById("inputRePasswordError").style.display = "block";
        valid = false;
    }
    if (fullName.length < 1) {
        document.getElementById("inputFullNameError").innerText = "This field is required";
        document.getElementById("inputFullNameError").style.display = "block";
        valid = false;
    }
    if (email.length < 1) {
        document.getElementById("inputEmailError").innerText = "This field is required";
        document.getElementById("inputEmailError").style.display = "block";
        valid = false;
    } else if (!email.match(/^[a-zA-Z0-9_]*@[a-zA-Z0-9_]*\.[a-zA-Z]{3}$/)) {
        document.getElementById("inputEmailError").innerText = "Email must match pattern: abc@def.com";
        document.getElementById("inputEmailError").style.display = "block";
        valid = false;
    }
    if (address.length < 1) {
        document.getElementById("inputAddressError").innerText = "This field is required";
        document.getElementById("inputAddressError").style.display = "block";
    }
    if (phoneNumber.length < 1) {
        document.getElementById("inputPhoneNumberError").innerText = "This field is required";
        document.getElementById("inputPhoneNumberError").style.display = "block";
        valid = false;
    } else if (isNaN(Number(phoneNumber))) {
        document.getElementById("inputPhoneNumberError").innerText = "This field only accept number";
        document.getElementById("inputPhoneNumberError").style.display = "block";
        valid = false;
    } else if ((phoneNumber.length !== 10) && (phoneNumber.length !== 12)) {
        document.getElementById("inputPhoneNumberError").innerText = "Phone Number must contain 10 or 12 number";
        document.getElementById("inputPhoneNumberError").style.display = "block";
        valid = false;
    }


    if (valid === true) {
        document.getElementById("message").innerText = "Register Successfully!.";
        $('#modalSuccess').modal();
        setTimeout(function () {
            window.location.href = "./list_member.html"
        }, 5000);
    }
    return false;
}
