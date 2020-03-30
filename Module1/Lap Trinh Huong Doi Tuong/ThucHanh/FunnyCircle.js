
class Circle{
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

    get radius() {
        return this._radius;
    }

    set radius(value) {
        this._radius = value;
    }
     constructor(x,y,radius) {
         this.speed = 20;
         this._x = x;
         this._y = y;
         this._radius = radius;
         this.color = getRandomColor();
}
move(){
        this._x += this.speed;
        this._y += this.speed;

}
draw(){
    ctx.beginPath();
    ctx.arc(this._x, this._y, this._radius, 0, 2 * Math.PI);
    ctx.fillStyle = this.color;
    ctx.fill();
}
}
function getRandomHex(){
    return Math.floor(Math.random()*255);
}

function getRandomColor(){
    var red = getRandomHex();
    var green = getRandomHex();
    var blue = getRandomHex();
    return "rgb(" + red + "," + blue + "," + green +")";
}
let ctx;
let x;
let y;
let color;
let array = [];
let canvas;

function createCircle(){
    canvas = document.getElementById("myCanvas");
     ctx = canvas.getContext("2d");
    let radius = Math.floor(Math.random() * 80);
     x = Math.random() * window.innerWidth;
     y = Math.random() * window.innerHeight;
     array.push(new Circle(x, y, radius));
    array[array.length-1].draw();

}

function createMultipleCircle(){
    for(let i = 0; i < 30; i++){
        createCircle();
    }
}

function moveAll() {
    ctx.clearRect(0,0,canvas.width,canvas.height);
    for (let i = 0; i < array.length; i++) {
        array[i].move();
        array[i].draw();
    }
}
createMultipleCircle();
setInterval(moveAll,1000);
