
class Apple{
    get weight() {
        return this._weight;
    }

    set weight(value) {
        this._weight = value;
    }
    constructor(weight) {
        this._weight = weight;
        this.infor = 0;
        this._weight = weight;
    }
    displayApple(){
            this.infor = 0;
            this.infor = parseInt(this._weight);
            document.getElementById("appleweight").innerHTML = this.infor;
    }
    checkEmpty(){
        if (this._weight === 0){
            return false;
        }else return true;
    }
    renewApple() {
        if (this.checkEmpty() === false) {
            this._weight = 10;
            this.displayApple();
        }
    }
    dereaseWeight(){
        this._weight = this._weight -1;
        this.displayApple();
    }
}

class Human {
    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get weight() {
        return this._weight;
    }

    set weight(value) {
        this._weight = value;
    }

    get gender() {
        return this._gender;
    }

    set gender(value) {
        this._gender = value;
    }
    constructor(name,weight,gender) {
        this.gender = true;
        this._name = name;
        this._weight = weight;
        this._gender = gender;
        this.count = 1;
        this.infor = "";
    }
    displayHuman(){
        this.infor = this.gender +"<br>"+ this._weight;
        document.getElementById(this.name).innerHTML = this.infor;
    }
checkGender(){
       if (this._gender === 'Male'){
       return  true;
       }else return false;
}
checkApple(){
        if (a.checkEmpty() === true){
            return true;
        }else return false;
}
say(){
        console.log("Yummy,Yummy");
}
eatTurn(){
        if (this.count % 2 === 0){
            this.count++;
            return false;
        }else this.count++;
        return true;
}
eatApple(){
        if (this.checkApple()===true){
            switch (this.checkGender()){
                case true:
                    if (this.eatTurn() === true){
                        this.say();
                        this._weight = this._weight +1;
                        a.dereaseWeight();
                        this.displayHuman()
                        console.log(a.weight)
                    }
                    break;
                case false:
                    if(this.eatTurn() === false) {
                        this.say();
                        this._weight = this._weight + 1;
                        a.dereaseWeight();
                        this.displayHuman()
                        console.log(a.weight);
                    }
                    break;
            }a.displayApple();
            }
}
}
let a = new Apple(10);

let adam = new Human('Adam',70, 'Male');

let eva = new Human('Eva',45,'Female');

let game = setInterval(start,2000);
function start() {
    a.displayApple();
    adam.displayHuman();
    eva.displayHuman();
        if (a.checkEmpty() === true) {
            adam.eatApple();
            eva.eatApple();
        }else a.renewApple();
}

function stop() {
   clearInterval(game);
}