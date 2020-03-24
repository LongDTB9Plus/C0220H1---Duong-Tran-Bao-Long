class yourDate {
    get year() {
        return this._year;
    }

    set year(value) {
        this._year = value;
    }

    get month() {
        return this._month;
    }

    set month(value) {
        this._month = value;
    }

    get day() {
        return this._day;
    }

    set day(value) {
        this._day = value;
    }
    constructor(year,month,day,) {
        this._year = year;
        this._month = month;
        this._day = day;
    }
    livingYear(){
        return  (d.getFullYear() - this._year);
    }
    livingMonth(){
        return this.livingYear() * 12;
    }
    livingDay(){
        return this.livingYear()*365;
    }
    livingHour(){
        return this.livingDay()*24;
    }
    livingMinute(){
        return this.livingHour()*50;
    }
    livingSecond(){
        return this.livingMinute()*60;
    }
    diplayLivingTime(){
        alert("Toi Da Song :" + this.livingYear() + " Nam" +
            "\nToi Da Song :" + this.livingMonth() + " Thang" +
            "\nToi Da Song :" + this.livingDay() + " Ngay" +
            "\nToi Da Song :" + this.livingHour() + " Gio" +
            "\nToi Da Song :" + this.livingMinute() + " Phut" +
            "\nToi Da Song :" + this.livingSecond() + " Giay"
        );
    }
}
let d = new Date();
let myTime = new yourDate(0,0,0);
    myTime.day = prompt("Nhap Ngay Sinh: ")*1;
    myTime.month = prompt("Nhap Thang Sinh: ")*1;
    myTime.year = prompt("Nhap Nam Sinh: ")*1;
    myTime.diplayLivingTime();

