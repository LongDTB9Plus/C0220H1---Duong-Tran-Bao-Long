var stupid = ["I","'","M"," ","A"," ","D","U","M","B"];
var displayText ="";
function process() {

    var insideDoc = document.getElementsByName("doc");
    var t = insideDoc.length;
    if (t > 0) {
        for (var i = 0; i <= t; i++) {
            displayText += stupid[i];
            if (i === (stupid.length-1)) {
                insideDoc.value = "";
                displayText = "";
            }
        }
    }
    insideDoc.value = displayText;
    displayText = "";
    setTimeout("process()",1);
}