var a =[];
var b = prompt("Nhap So Phan Tu Muon Nhap Vao:");
var c = prompt("So Can Kiem Tra :");
var count = 0;

    function inputArray(x) {
    for( var i = 0; i<x;i++){
        a.push(prompt("Nhap Phan Tu:")) ;
    }
    }
    inputArray(b);

    function check(z) {
    for (var p = 0; p < a.length;p++){
        if (a[p] == z){
            count++;
        }
    }if (count === 0){
        document.write("-1")
        }else document.write(count);
    count = 0;
    }

check(c);