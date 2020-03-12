function process() {


var numberIn = (document.getElementById("valueIn").value)*1;
var numberOut = 0;
    operating(numberIn);
function operating(numIn) {
  numberOut = ++numIn;
document.getElementById("valueOut").innerText = numberOut.toString();
}

}