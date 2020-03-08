var array =[-3, 5, 1, 3, 2, 10,11];
var x = prompt("Nhap Gia Tri Can Tim")*1;
for( var i =0; i < array.length;i++){
    if ( x === array[i]){
        alert("Vi Tri Cua Gia Tri Can Tim:" + i);
        break;
    }alert("Gia Tri Khong Ton Tai Trong Mang");
}