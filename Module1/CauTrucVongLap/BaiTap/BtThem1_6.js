var count = [];
var total = 0;
for (i = 1; count.length <= 30; i++){
    if ((i % 7) === 0){
        total += i;
        count.push(i);
        i++;
    }
}document.writeln(total);