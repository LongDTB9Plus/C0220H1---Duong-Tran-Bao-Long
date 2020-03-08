var height = prompt("Nhap Chieu Cao ")*1;



for (let i = 0; i < height; i++) {
    for (let j = height - i; j > 0; j--) {
        document.write("_");
    }
    for (let k = 1; k < i * 2 + 1; k++) {
        document.write("*");
    }
    for (let j = height - i; j > 0; j--) {
        document.write("__");
    }
    for (let k = 1; k < i * 2 + 1; k++) {
        document.write("*");
    }
    document.write("<br>");
}

for (let i = 0; i < height*2; i++) {
    for (let j = 0; j < i; j++) {
        document.write("_");
    }
    for (let k = height*3.9-(i*2-1); k > 1; k--) {
        document.write("*");
    }
    document.write("<br>");
}



