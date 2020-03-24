let num = Math.round(Math.random()*100);
console.log(num);
let checkWin = false;
let max = 100;
let min = 0;
let guessNum = 0;

function poolNum() {
    if (guessNum === num) {
        checkWin = true;
    } else if ((guessNum <= max) && (guessNum >= min)) {
        return guessNum;
    }else return 101;
}
function game() {
     guessNum = prompt("Nhap So Trong Khoang" + min + "-" + max) * 1;
    poolNum();
    while (checkWin === false) {
        if (poolNum() < num){
            min = poolNum();
            guessNum = prompt("False\n" + "Nhap So Trong Khoang" + min + "-" + max) * 1;
        }else if (poolNum() === 101){
            guessNum = prompt("False\n" + "Nhap So Trong Khoang" + min + "-" + max) * 1;
        }else if (poolNum() === num){
            max = poolNum();
            guessNum = prompt("False\n" + "Nhap So Trong Khoang" + min + "-" + max) * 1;
        }
    }alert("You Won")
    }
