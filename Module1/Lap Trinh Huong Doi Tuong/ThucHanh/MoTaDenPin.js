let timer;
class Battery{
    get energy() {
        return this._energy;
    }

    set energy(value) {
        this._energy = value;
    }
    constructor(energy) {
        this._energy = energy;
    }
    decreaseEnergy(){
        console.log(this._energy);
        this._energy = this._energy - 1;
        document.getElementById("lampBatt").innerText = this._energy.toString();
    }
}

class Lamp{
    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }
    constructor(status) {
        this.batt = new Battery(100);
        this._status = status;
        this. statusLight = false;
    }
    light() {
        switch (this.statusLight) {
            case false:
                 timer = setInterval(this.batt.decreaseEnergy,1000);
                this.statusLight = true;
                break;
            case true:
                clearInterval(timer);
                this.statusLight = false;
                break;
        }
    }
    statusChange(){
        switch (this._status) {
            case "ON":
                this._status = "OFF";
                document.getElementById("status").innerHTML = this._status;
                document.getElementById("lampStatus").innerHTML = this._status;
                break;
            case "OFF":
                this._status = "ON";
                document.getElementById("status").innerHTML = this._status;
                document.getElementById("lampStatus").innerHTML = this._status;
                break;
        }
    }
}
let lamp = new Lamp("ON");
document.getElementById("lampStatus").innerHTML = lamp.status;
document.getElementById("status").innerHTML = lamp._status;
document.getElementById("lampBatt").innerHTML = lamp.batt.energy.toString();

