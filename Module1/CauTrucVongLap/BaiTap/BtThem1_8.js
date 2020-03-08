function process() {
    var x = prompt("Nhap So Bat Dau")*1;
    var y = prompt("Nhap So Ket Thuc")*1;
    var z = Math.floor(Math.random() * y) + x;
    var doan = 0;
    for (i = 0; i < 3; i++){
        doan = prompt("Nhap So Doan")*1;
        if (doan === z){
            alert("Chinh Xac");
            break;
        }else if ( i !== 2){
            alert("Ban Doan Sai");
        }else alert("Game Over")
    }

}