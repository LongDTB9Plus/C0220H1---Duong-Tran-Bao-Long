class Rectangle{
    get height() {
        return this._height;
    }

    set height(value) {
        this._height = value;
    }

    get width() {
        return this._width;
    }

    set width(value) {
        this._width = value;
    }
    squareCal(){
        return this.area = this._height * this._width;
    }

    diameterCal(){
        return this.diameter = (2*this._height) + (2*this._width);
    }
    createRectangle(){
        let canvas = document.getElementById("rectangle");
        let ctx = canvas.getContext("2d");
        ctx.fillStyle = "7685DB";
        ctx.fillRect(0,0,this._width,this._height);
    }
    constructor(height,width) {
        this._height = height;
        this._width = width;
        this.area = 0;
        this.diameter = 0;
    }

}
let rectangle = new Rectangle(50,100);
let diameter = rectangle.diameterCal();
let area = rectangle.squareCal();
rectangle.createRectangle();
alert(diameter);
alert(area);


