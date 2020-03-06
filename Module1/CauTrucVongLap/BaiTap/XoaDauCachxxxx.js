var checkIndex = prompt("Nhap Chuoi");
var i = 0;
var resultIndex = "";
while (i <= checkIndex.length){
        resultIndex += checkIndex.charAt(checkIndex.length - 1) ;

    i++;
}
document.write(resultIndex);

