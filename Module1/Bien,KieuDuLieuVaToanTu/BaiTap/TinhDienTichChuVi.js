function process() {
    var banKinh = document.getElementById("R");
    var S = parseInt(banKinh.value)**2 *Math.PI;
    var C = parseInt(banKinh.value)*2 *Math.PI;
    resultS.innerText = 'Ban Kinh Hinh Tron:'+S;

    resultC.innerText = 'Chu Vi Hinh Tron:'+C;
}


