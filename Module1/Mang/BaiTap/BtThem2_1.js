var a = [[1, 2, 1, 24], [8, 11, 9, 4], [7, 0, 7, 27], [7, 4, 28, 14], [3, 10, 26, 7]];

for (var i in a)
{
    document.write("row " +" = " + i +":");
    for (var j in a[i])
    {
        document.write(" " + a[i][j]);
    }document.write("<br>");
}