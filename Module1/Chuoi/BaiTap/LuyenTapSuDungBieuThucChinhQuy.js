// // Bai 1
// let monthDate = document.getElementById("valueIN");
// let validDate = /^[0-3][0-9]+(\/[0-1][0-9])+(\/[0-2]([0-9]{3,3}))$/;
// function submit() {
//     if(validDate.test(monthDate.value)){
//         alert("Valid");
//     }else alert("Unvalid");
// }
//
// // Bai 2
// let stringIn = document.getElementById("valueIN");
// let count = /[a-zA-Z]/g;
//
// function submit() {
//   let result = stringIn.value.match(count);
//     alert(result.length);
// }
//
// //Bai 3:
// let stringIN = document.getElementById("valueIN");
// let checkConsonant = /[aieuoy]/ig;
// let checkVowel = /[bcdghklmnpqrstvx]/ig;
// function submit() {
// let resultConsonant = stringIN.value.match(checkConsonant);
// let resultVowel = stringIN.value.match(checkVowel);
// alert("So Nguyen Am: " + resultConsonant.length + "\nSo Phu Am : " + resultVowel.length);
// }
//
// //Bai4: Kiem Tra Ma So Bao Mat
// let pinCode = document.getElementById("valueIN");
// let checkPin = /[0-9]{4}$/;
// function submit() {
//     if ((checkPin.test(pinCode.value)) && pinCode.value.length <= 8 ){
//         alert("Hop Le");
//     }else alert("Failed");
// }