function trans() {

    var viet = ["Tao", "Chuoi", "Chim"];
    var eng = ["Apple", "Banana", "Bird"];
    var transVoca = document.getElementById("transVoca");
    var i = 0;
    if ((viet.indexOf(transVoca.value)) !== -1) {
        i = viet.indexOf(transVoca.value);
        document.write(eng[i]);
    } else if ((eng.indexOf(transVoca.value)) !== -1) {
        i = eng.indexOf(transVoca.value);
        document.write(viet[i]);
    }else document.write("Du Lieu Nay Khong Ton Tai");
}