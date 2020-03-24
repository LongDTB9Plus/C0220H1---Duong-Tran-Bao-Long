var carLeft = 50;
var carTop = 50;
var carSpeed = 20;

class Hero {
    constructor(left, top, speed) {
        this.element = document.getElementById("car");
        this.left = carLeft;
        this.top = carTop;
        this.speed = carSpeed;
        this.element.innerHTML = this.displayCar();
    }
    displayCar(){
        return '<img ' +
            ' src="car.png"' +
            ' style="top: '+this.top+'px; left:'+this.left+'px;position:absolute;" />';
    }
    moveSelection(e) {

        switch (e.keyCode) {
            case 37:
                this.left -= this.speed;
                this.element.innerHTML = this.displayCar();
                break;
            case 38:
                this.top -= this.speed;
                this.element.innerHTML = this.displayCar();
                break;
            case 39:
                this.left += this.speed;
                this.element.innerHTML = this.displayCar();
                break;
            case 40:
                this.top += this.speed;
                this.element.innerHTML = this.displayCar();
                break;
        }
    }
}
let car = new Hero();
document.onkeydown = function (e) {
car.element = document.getElementById("car");
car.moveSelection(e);
};