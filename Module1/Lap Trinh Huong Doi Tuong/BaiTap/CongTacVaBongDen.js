class Lamp {
    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }
    constructor(status) {
        this._status = status;
    }

}


class Switch {
    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }
    constructor(status) {
        this.lamp = new Lamp();
        this._status = status;
        this.lamp.status = this._status;
    }
    displayStatus(){
        this.lamp.status = this._status;
        document.getElementById("lamp").innerHTML = this.lamp.status;
    }
changeStatus(){
        switch (this._status) {
            case "ON":
                this._status = "OFF";
                document.getElementById("switch").innerHTML = this._status;
                this.displayStatus();
                console.log(this._status);
                break;
            case "OFF":
                this._status = "ON";
                document.getElementById("switch").innerHTML = this._status;
                this.displayStatus();
                console.log(this._status);
                break;
        }
}

}
let switchLamp = new Switch("ON");
document.getElementById("switch").innerHTML = switchLamp.status;