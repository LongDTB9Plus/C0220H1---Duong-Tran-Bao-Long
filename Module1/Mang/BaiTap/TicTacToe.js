
var b = document.getElementById("carogame");
var turn = 0;
var board = [];
var data = "";
for (var i = 0; i < 3; i++) {
    board[i] = [".", ".", "."];
}

for (var i = 0; i < 3; i++) {
    data += "<br>";
    for (var j = 0; j < 3; j++) {
        data += board[i][j] + "&nbsp;&nbsp;";
    }
}

data += "<br/><br/><input type='button' value='Change Value' onclick='changeValue()'>"
b.innerHTML = data;
function changeValue() {
    var positionX = prompt("X: ")*1;
    var positionY = prompt("Y: ")*1;
    var symbolPlayer = "";
    data = "";
    if (turn % 2 === 0){
        symbolPlayer = "X";
        document.getElementById("xMovestate").innerText += [positionX,positionY];
        document.getElementById("xMovestate").innerText += "--";
    }else if (turn % 2 !== 0){
        symbolPlayer = "O";
        document.getElementById("oMovestate").innerText += [positionX,positionY];
        document.getElementById("oMovestate").innerText += "--";
    }
    board[positionX][positionY] = symbolPlayer;
    turn++;
    for (let i = 0; i < 3; i++) {
        data += "<br/>";
        for (let j = 0; j < 3; j++) {
            data += board[i][j] + "&nbsp;&nbsp;&nbsp;&nbsp;";
        }
    }
    data += "<br/><br/><input type='button' value='Change Value' onclick='changeValue()'>";
    b.innerHTML = "<hr/>" + data;
    for (var p =0; p < 3;p++){
        for(var m=0;m<3;m++){
            if((board[p][m] === board[p][m+1]) && (board[p][m] === board[p][m+2]) && (board[p][m] !== ".")){
                alert(board[p][m] + " Win");
            }if ((board[p][m] === board[p+1][m]) && (board[p][m] === board[p+2][m]) && (board[p][m] !== ".")){
                alert(board[p][m] + " Win");
            }if ((board[0][0] === board[1][1]) && (board[0][0] === board[2][2]) && (board[0][0] !== ".")){
                alert(board[0][0] + " Win");
            }if ((board[1][1] === board[0][2]) && (board[1][1] === board[2][0]) && (board[1][1] !== ".")){
                alert(board[1][1] + " Win");
            }
        }
    }

}
