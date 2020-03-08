//Bai 1
// var myColor = ["Red", "Green", "White", "Black"];
//
// document.write(myColor);

//Bai 2
// var num =prompt("Nhap So ").toString();
// var res =[num[0]];
//
// for( var i=1;i<num.length;i++){
//     if ((num[i] % 2 === 0) && (num[i-1] % 2 === 0)){
//         res.push('-' , num[i]);
//     }else res.push(num[i]);
// }alert(res);

//Bai 3
var Upper = 'ABCDEFGHIJKLMNOPQRSTUVWXYZ';
var LOWER = 'abcdefghijklmnopqrstuvwxyz';
var inString = prompt("Nhap Chuoi");
var outString = [];

for (i=0;i<inString.length;i++){
    if (Upper.indexOf(inString[i]) !== -1 ){
        outString.push(inString[i].toLowerCase());
    }else if (LOWER.indexOf(inString[i]) !== -1){
        outString.push(inString[i].toUpperCase());
    }else outString.push(inString[i]);
}document.write(outString.join());