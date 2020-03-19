class Mobile {
    get name() {
        return this._name;
    }

    set name(value) {
        this._name = value;
    }

    get battery() {
        return this._battery;
    }

    set battery(value) {
        this._battery = value;
    }

    get status() {
        return this._status;
    }

    set status(value) {
        this._status = value;
    }


    constructor(name, battery, status,) {
        this.batteryOntime = this._battery;
        this._messageCreate = "";
        this._name = name;
        this._battery = battery;
        this._status = status;
        this.inboxRe = "";
        this.inboxSent = "";
        this.inbox = "";
        this.inboxNew = "";
    }
        batteryDisplay(){
        this.batteryOntime = this.battery;
        document.getElementById("battery" + this.name ).value = this.batteryOntime ;

        }
        usePhone(){
        this._battery--;
            this.batteryDisplay();
        }
        chargePhone(){
        this._battery = 100;
            this.batteryDisplay();
        }
        statusChange(){
            switch (this._status) {
                case "ON":
                    this._status = "OFF";
                    this.batteryDisplay();
                    document.getElementById(this.name + "Turn").innerText = this.status;
                    break;
                case "OFF":
                    this._status = "ON";
                    this.batteryDisplay();
                    document.getElementById(this.name + "Turn").innerText = this.status;
                    break;

            }
        }
        loadInbox(){
        this.usePhone();
            document.getElementById("message" + this.name).innerText = "";
        document.getElementById("message" + this.name).innerHTML += this.inbox;
        }
        loadSentInbox(){
        this.usePhone();
        document.getElementById("sentMessage" + this.name).innerHTML = this.inboxSent;
        }
        receiveMessage(messageReceive){
        this.usePhone();
        document.getElementById("newMessage" + this.name).value = messageReceive;
        this.inboxNew += messageReceive;
        this.inbox += messageReceive + "&#10";
        }
        sendMessage(addSend){
        this.usePhone();
        let messageCreate = document.getElementById("createMesaage" + this.name).value;
        this.inboxSent += messageCreate + "&#10";
        addSend.receiveMessage(messageCreate);

        }

}

let Nokia = new Mobile("Nokia",30,"ON");



let IPhone = new Mobile("IPhone",50,"ON");

