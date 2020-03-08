var array =[-3, 5, 1, 3, 2, 10,11];
var i = 1;
var x = array[array.length -1];
var y = array[0];
while (i <= array.length/2){
    x = array[i-1];
    array[i-1] = array[array.length -i];
    array[array.length - i] = x;
    i++;
}document.write(array.toString());