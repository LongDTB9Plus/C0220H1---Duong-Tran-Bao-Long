var a =[];
var b = prompt("Nhap so phan tu");
var count = 0;
for( var i=0;i < b;i++){
    var c = prompt("Nhap phan tu")*1;
    a.push(c);
    if (typeof c == 'number'){
        count++;
    }
}document.write(count);
