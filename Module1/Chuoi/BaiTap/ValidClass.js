let classCheck = document.getElementById("class");
let classValid = /^[CAP]+([0-9]{4,4})+[GHIKLM]$/;
function submit() {
    classValid =/(^[CAP]?)+([0-9]{4,4})+[GHIKLM]$/;
    if (classValid.test(classCheck.value)){
        alert("Class Valid");
    }else alert("Class UnValid");
}