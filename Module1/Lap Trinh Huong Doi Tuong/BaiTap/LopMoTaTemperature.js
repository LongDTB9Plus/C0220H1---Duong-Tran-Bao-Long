class Temperature {
    get c() {
        return this._c;
    }

    set c(value) {
        this._c = value;
    }
    convertToF(){
     return    this._f = this._c * 1.8 + 32;
    }
    convertToK(){
        return this._k = this._c + 273.15;
    }
    constructor(c) {
        this._c = c;
        this._f = 0;
        this._k = 0;
    }
}
let temp = new Temperature(prompt("Nhap Gia Tri Do C"));
let checkTemp = false;
while (checkTemp === false) {
    if (temp.c > -272){
        checkTemp = true;
    }else temp = new Temperature(prompt("Nhap Gia Tri Do C"));
}
let tempF = temp.convertToF();
let tempK = temp.convertToK();
alert("F:" +tempF +"\nK" +tempK);