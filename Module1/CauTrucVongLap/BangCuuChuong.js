let sout;
var value = 0;
sout = "<table border='1' width='800' cellspacing='0' cellpadding='10'>";
for (i = 1; i <= 10; i++) {
    sout = sout + "<tr>";
    for (j = 1; j <= 10; j++) {
        value = i * j ;
        sout = sout + "<td>" + i + "*" + j + "=" + value + "</td>"
        value = 0;
    }
    sout = sout + "</tr>";
}
sout = sout + "</table>";
document.write(sout);