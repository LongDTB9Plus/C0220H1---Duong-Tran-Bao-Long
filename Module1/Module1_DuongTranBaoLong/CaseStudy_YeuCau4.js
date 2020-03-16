var customerList = [];
var displayList = "";
for( var i = 1; i <= customerList.length; i++){
    displayList += "\n" + i + ": " + customerList[i-1];
}
while (true) {
    var choose = prompt("Xin Lua Chon Chuc Nang: \n 1: Add Name Customer. \n 2:Delete Customer. \n 3: Hiển Thị Danh Sách Theo Alphabet");
    switch (choose) {
        case "1":
            var addMaountCheck = true;
            var addAmount = prompt("Xin Nhap So Khach Hang Muon Them") * 1;
            do {
                if ((Number.isInteger(addAmount) === false) || ((addAmount) < 0)) {
                    addMaountCheck = false;
                    addAmount = prompt("So Khong Hop Le\nXin Nhap So Khach Hang Muon Them La So Nguyen Duong.") * 1;
                }else addMaountCheck = true;
            }while(addMaountCheck === false);
            for (var i = 0; i < addAmount; i++) {
                var name = prompt("Nhap Ten Khach Hang").trim();
                name = name.toLowerCase();
                name = name.substring(0, 1).toUpperCase() + name.substring(1);
                for (p = 1; p < name.length; p++) {
                    if (name.charAt(p) === " ") {
                        name = name.substring(0, p) + name.substring(p, p + 2).toUpperCase() + name.substring(p + 2);
                    }
                }
                customerList.push(name);
            }
            break;
        case "2":
            var nameCheck = false;
            while (nameCheck === false) {
                var deleteName = prompt("Xin Nhap Ten Khach Hang Ban Muon Xoa\n" + displayList).trim();
                deleteName = deleteName.toLowerCase();
                deleteName = deleteName.substring(0, 1).toUpperCase() + deleteName.substring(1);
                for (p = 1; p < deleteName.length; p++) {
                    if (deleteName.charAt(p) === " ") {
                        deleteName = deleteName.substring(0, p) + deleteName.substring(p, p + 2).toUpperCase() + deleteName.substring(p + 2);
                    }
                }
                if (customerList.indexOf(deleteName) !== -1) {
                    var numdel = customerList.indexOf(deleteName);
                    customerList.splice(numdel, numdel);
                    displayList = "";
                    for (var i = 1; i <= customerList.length; i++) {
                        displayList += "\n" + i + ": " + customerList[i - 1];
                    } nameCheck = true;
                }else alert("Ten " + deleteName + " Khong Ton Tai");
            }
            alert(displayList);
            break;
        case "3":
            var alphabetList = customerList;
            alphabetList.sort();
            displayList = "";
            for( var i = 1; i <= alphabetList.length; i++){
                displayList += "\n" + i + ": " + alphabetList[i-1];
            }
            alert(displayList);
            break;
        default: alert("Failed!");
    }
}
