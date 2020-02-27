function tinhDiem() {
    var dLy = document.getElementById("pL");
    var dHoa = document.getElementById("pH");
    var dSinh = document.getElementById("pS");
    var dTrungBinh = (parseInt(dLy.value) + parseInt(dHoa.value) + parseInt(dSinh.value)) / 3;
    document.write(dTrungBinh);
}

