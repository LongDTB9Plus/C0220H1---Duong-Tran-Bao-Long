let listProduce = [];
let a = document.getElementById("inVal");

function addVal() {
listProduce.push(a.value);
}
function editVal() {
    let elementChange = prompt("Nhap San Pham Ban Muon Thay The");
    let editNum = listProduce.indexOf(elementChange);
    if (editNum !== -1) {
        listProduce[editNum] = a.value;
    }else alert("Gia Tri Ban Nhap Khong Ton Tai");
}
function deleteVal() {
    let elementDelete = prompt("Nhap San Pham Muon Xoa");
    let deleteNum = listProduce.indexOf(elementDelete);
    if (deleteNum !== -1){
        listProduce.splice(deleteNum,deleteNum);
    }else alert("Gia Tri Ban Nhap Khong Ton Tai");
}
function showArray() {
document.getElementById("showResult").innerText = listProduce;
}