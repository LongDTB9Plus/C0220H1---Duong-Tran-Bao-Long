class Circle{
    get radius() {
        return this._radius;
    }

    set radius(value) {
        this._radius = value;
    }
    constructor(radius) {
        this.area = function () {
        return Math.PI * radius**2;
        }
        this._radius = radius;
    }


}
let ball = new Circle(20);
alert(ball.area());