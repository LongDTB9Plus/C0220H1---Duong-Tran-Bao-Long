var loadText = ["I","'","M"," ","A"," ","D","U","M","B"];


function process() {
    var insideDoc = document.getElementById("doc");
    var displayText = "";
    var t = insideDoc.value.length;
    if (t > 0) {
        for (var i = 0; i < t; i++) {
            displayText += loadText[i];
            insideDoc.value =displayText;
            if (i === (loadText.length-1)) {
                insideDoc.value = "";
                displayText = "";
            }
        }
    }


}
