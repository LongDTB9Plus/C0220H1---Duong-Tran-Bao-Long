var feetValue = document.getElementById("feetVal");
var metersValue = document.getElementById("metersVal");

function convertToMetersProcess(fNum) {
    metersValue.value = 0.305 * fNum;
}

function convertToFeetProcess(mVal) {
    feetValue.value = 3.279 * mVal;
}

function convToMeters() {
    convertToMetersProcess(feetValue.value);
}

function convToFeet() {
convertToFeetProcess(metersValue.value);
}