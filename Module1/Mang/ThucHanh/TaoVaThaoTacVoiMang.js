var value = [];
var x = document.getElementById("inValue");

function addVal() {
    value.push(x.value);
}

function displayVal() {
   for ( var i = 1; i<= value.length;i++){
       document.writeln("Element" + i + "=" + value[i-1]);
       document.writeln("<br>");
   }

}