var loadText = ["I","'","M"," ","A"," ","D","U","M","B"];
var displayText ="";
function process() {

    var insideDoc = document.getElementsByName("doc");
    var t = insideDoc.length;
    if (t > 0) {
        for (var i = 0; i < t; i++) {
            displayText += loadText[i];
            if (i === (loadText.length-1)) {
                insideDoc.value = "";
                displayText = "";
            }
        }
    }
    insideDoc.value = displayText;
    displayText = "";
    setTimeout("process()",1);
}