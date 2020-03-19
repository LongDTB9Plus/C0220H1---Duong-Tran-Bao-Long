class Mouse{
    get weight() {
        return this._weight;
    }

    set weight(value) {
        this._weight = value;
    }

    get speed() {
        return this._speed;
    }

    set speed(value) {
        this._speed = value;
    }

    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }
    constructor(weight,speed,status) {
        this._weight = weight;
        this._speed = speed;
        this._status = status;
    }
    displayMouseStatus(){
        document.getElementById("jerryMouse").innerHTML ="weight: "+ this._weight + " speed: " +this._speed + " status: " + this._status;
    }
    reborn(){
            this._status = Math.round(Math.random() );
            if (this._status === 0){
                this._status = 'alive';
                this._speed = Math.round((Math.random()*40) + 10);
                this.displayMouseStatus();
            }else if (this._status === 1){
                this._status = 'dead';
                this._weight = Math.round((Math.random()*40) + 20);
                this._speed = 0;
                this.displayMouseStatus();
            }
    }
}
class Cat{
    get weight() {
        return this._weight;
    }

    set weight(value) {
        this._weight = value;
    }

    get speed() {
        return this._speed;
    }

    set speed(value) {
        this._speed = value;
    }
    constructor(weight,speed) {
        this._weight = weight;
        this._speed = speed;
    }
    displayWeight(){
        document.getElementById("tomCat").innerHTML = this._weight;
    }
    huntMouse(){
        if ((jerry.status === "alive") && (this._speed > jerry.speed)){
            this._weight += jerry.weight;
            jerry.status = 'dead';
            console.log("Jerry is Dead");
            this.displayWeight();
        }else if (this._speed <= jerry.speed){
            console.log("Jerry escaped");
        }else if (jerry.status === 'dead'){
            console.log('This is just a corpse');
        }
            this.displayWeight();
    }
}
let jerry = new Mouse(20,20,"alive");
jerry.displayMouseStatus();
let tom = new Cat(40,30,);
tom.displayWeight();
function begin() {
jerry.displayMouseStatus();
tom.displayWeight();
tom.huntMouse();
jerry.reborn();
}
function Continue(){
    game = setInterval(begin,300);
}
let game = setInterval(begin,300);
function stop() {
    clearInterval(game);
}
