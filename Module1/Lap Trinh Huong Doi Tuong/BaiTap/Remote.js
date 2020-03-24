class TV{
    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }

    get channel() {
        return this._channel;
    }

    set channel(value) {
        this._channel = value;
    }

    get volume() {
        return this._volume;
    }

    set volume(value) {
        this._volume = value;
    }
    constructor(status,channel,volume) {
        this._status = status;
        this._channel = channel;
        this._volume = volume;
        this.display ="";
    }
    checkStatus(){
        switch (this._status) {
            case "ON":
                return true;
            case "OFF":
                return false;
        }
    }
    displayTV(){
        this.display = "Status" + this._status + "&#10" + "Channel: " + this._channel + "&#10" + "Volume: " + this._volume;
        document.getElementById("TV").innerHTML = this.display;
    }
}

class Remote{
    increseVolume(control){
        if (sony.status === "ON"){
            switch (control) {
                case 'increase':
                    sony.volume++;
                    sony.displayTV();
                    break;
                case 'decrease':
                    sony.volume--;
                    sony.displayTV();
                    break;
            }
        }
    }
    channelChange(){
        if (sony.status === "ON") {
            sony.channel = document.getElementById("channel").value;
            sony.displayTV();
        }
    }
    turnOnTV(){
        switch (sony.status) {
            case "ON":
                sony.status = "OFF";
                document.getElementById("status").innerText = "OFF";
                document.getElementById("TV").disabled = true ;
                break;
            case "OFF":
                sony.status = "ON";
                document.getElementById("status").innerText = "ON";
                document.getElementById("TV").disabled = false ;
                sony.displayTV();
                break;
        }
    }
}
let sony = new TV("ON",7,30);
sony.displayTV();
let sonyRemote = new Remote();
sonyRemote.increseVolume();