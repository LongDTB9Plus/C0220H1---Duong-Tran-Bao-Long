
let canvas;
let ctx;

class Ball {
    constructor(x,y,r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }
    drawBall(c){
        ctx.beginPath();
        ctx.arc(c.x, c.y, c.r, 0, Math.PI * 2, true);
        ctx.fill();
    }
}

class Bar {
    get x() {
        return this._x;
    }

    set x(value) {
        this._x = value;
    }

    get y() {
        return this._y;
    }

    set y(value) {
        this._y = value;
    }
    constructor(x, y) {
        this._x = x;
        this._y = y;
    }
}
function moveBar(e) {
    if (e.keyCode === 37) {
        if (bar._x - dxBar > 0)
            bar._x -= dxBar;
    } else if (e.keyCode === 39) {
        if ((bar._x + dxBar) < (canvas.width - barImg.width))
            bar._x += dxBar;
    }
}
let bar = new Bar(300,450);
let dx = 1;
let dy = 2;
let ball = new Ball(400,30,10);
let dxBar = 20;
let score = 0;
let scoreDisplay;
let barImg = new Image();
barImg.src = 'bar.png';
let timer ;
let scoreCount ;
function start() {
    document.onkeydown = function (e){
        moveBar(e)
    };
    canvas = document.getElementById("gameBoard");
    ctx = canvas.getContext("2d");
    ctx.drawImage(barImg, bar._x, bar._y);
    timer = setInterval(draw,10);
    scoreDisplay = document.getElementById("score");
    scoreCount = setInterval(countScore,1000);

}

function draw() {
    ctx.clearRect(0, 0, canvas.width, canvas.height);
    ctx.fillStyle = "#FAF7F8";
    ctx.fillRect(0, 0, canvas.width, canvas.height);
    ctx.fillStyle = "#003300";
    if (ball.x + dx > canvas.width || ball.x + dx < 0){
        dx = -dx;}
    if (ball.y + dy > bar._y && ball.x > bar._x && ball.x < bar._x + barImg.width){
        dy = -dy;}
    if (ball.y + dy > canvas.height || ball.y + dy < 0){
        dy = -dy;}
    ball.x += dx;
    ball.y += dy;
    ball.drawBall(ball);
    ctx.drawImage(barImg, bar._x, bar._y);
    if (ball.y > bar._y) {
        clearTimeout(timer);
        clearTimeout(scoreCount);
        ctx.clearRect(0, 0, canvas.width, canvas.height);
        alert("Game Over");
    }
}

function countScore() {
    score++;
    scoreDisplay.innerHTML = score.toString();
}
