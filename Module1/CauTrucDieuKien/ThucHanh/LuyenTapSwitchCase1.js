var trinhduyet = prompt("Nhap Vao Trinh Duyet Ban Su Dung");

switch (trinhduyet) {
    case 'Edge':
        alert("You've got the Edge!");
        break;
    case 'Chrome':
    case 'FireFox':
    case 'Safari':
    case 'Opera':
        alert("Okay we support these browsers too");
        break;
    default:
        alert("We hope that this page looks ok!");
}