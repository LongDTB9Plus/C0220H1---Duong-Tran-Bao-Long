let stringTest = "Toi Yeu Ngon Ngu Lap Trinh Javascript";
let checkStr = /[a]/ig;
console.log(stringTest.match(checkStr));
console.log(stringTest.split(""));
let checkCount = /[a-z]/ig;
console.log(stringTest.match(checkCount));
console.log(stringTest.replace("Javascript","Typescript"));