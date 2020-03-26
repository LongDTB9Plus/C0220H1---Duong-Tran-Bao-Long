let productsList = ["sony","samsung","apple"];
let loopMainMenu = true;

while (loopMainMenu === true) {
    let mainMenu = prompt("1:Display Products List\n  2:Add Products\n  3:Rename Product\n  4: Delete Product");
    switch (mainMenu) {
        case "1":
            alert(productsList);
            break;
        case "2":
            productsList.push(prompt("Nhap San Pham"));
            break;
        case "3":
            let search = prompt("Nhap Ten San Pham Can Thay Doi");
            let i = productsList.indexOf(search);
            productsList[i] = prompt("Nhap Ten Muon Sua");
            break;
        case "4":
            let searchDelete = prompt("Nhap Ten San Pham Can Xoa");
            let p = productsList.indexOf(searchDelete);
            productsList.splice(p, p);
            alert(productsList);
            break;
        case "5":
            loopMainMenu = false;
            break;
        default:
            mainMenu = prompt("1:Display Products List\n  2:Add Products\n  3:Rename Product\n  4: Delete Product");
    }
}