var array =[-3, 5, 1, 13, 2, 10,11];
var max = array[0];

for (var i =0;i<array.length;i++){
    if (array[i] > max){
        max = array[i];
    }
}document.writeln(max);