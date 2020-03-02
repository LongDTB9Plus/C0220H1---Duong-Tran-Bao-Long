var result = document.getElementById("result");

function giatrivao(abc) {
    switch (abc) {
        case "c":
            result.value = "";
            break;
        case "eq":
            result.value = eval(result.value);
            break;
        default:
            result.value += (abc);
    }



}