function process() {
    var x = document.getElementById("good");
    var y = document.getElementById("fast");
    var z = document.getElementById("cheap");
    const a = [x, y, z];
    if ((x.checked == true) && (y.checked == true) && (z.checked == true))
    {
        var randomA = a[Math.floor(Math.random() * a.length)];
        randomA.checked = false;
    }
}

