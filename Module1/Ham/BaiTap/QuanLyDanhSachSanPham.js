var listProduce = [];
var a = document.getElementById("inVal");
let data = "";
let i =0;
function addVal(inVal) {
    listProduce.push(inVal);
    data += "<br/><br/>" + listProduce[listProduce.length-1] + "&nbsp;&nbsp;&nbsp;&nbsp;" + "<button onclick="+"editVal("+i+")"+">EDIT</button>" + '<button onclick="deleteVal('+i+')">DELETE</button>';
    document.getElementById("showResult").innerHTML = "";
    document.getElementById("showResult").innerHTML = "<hr/>" + data;
    i++;
}

function editVal(editVal) {
    document.getElementById("showResult").innerHTML = "";
    data = "";//Xoá list đang hiển thị
    listProduce[editVal] = prompt("Nhap San Pham Ban Muon Thay The");//Thay Phần Tử Vị Trí Của Tham Số Tương Ứng
    for(var p =0; p < listProduce.length; p++){
        data += "<br/><br/>" + listProduce[p] + "&nbsp;&nbsp;&nbsp;&nbsp;" + "<button onclick="+"editVal("+p+")"+">EDIT</button>" + '<button onclick="deleteVal('+p+')">DELETE</button>';
        document.getElementById("showResult").innerHTML = "<hr/>" + data;
    }// In Lại list sản phẩm sau thay đổi
    }
function deleteVal(deleVal) {
    document.getElementById("showResult").innerHTML = "";
    data = "";//Xoá list đang hiển thị
    listProduce.splice(deleVal,deleVal);//xoá Phần Tử Vị Trí Của Tham Số Tương Ứng
    for (var t = 0; t < listProduce.length; t++) {
        data += "<br/><br/>" + listProduce[t] + "&nbsp;&nbsp;&nbsp;&nbsp;" + "<button onclick=" + "editVal(" + t + ")" + ">EDIT</button>" + '<button onclick="deleteVal(' + t + ')">DELETE</button>';
        document.getElementById("showResult").innerHTML = "<hr/>" + data;
// In Lại list sản phẩm sau thay đổi
    }
}
function showArray() {
document.getElementById("showResult").innerText = listProduce;
}