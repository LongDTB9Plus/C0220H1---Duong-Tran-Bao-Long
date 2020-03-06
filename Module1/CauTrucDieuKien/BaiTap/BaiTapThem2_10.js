function addNum(abc) {
    var electricNum = document.getElementById("electricNum");
    var afMoney = document.getElementById("result");
    switch (abc) {
        case '+':
            if (eval(electricNum.value) <= 50) {
                afMoney.value = eval(electricNum.value) * 1000;
            } else if (eval(electricNum.value) <= 200) {
                afMoney.value = 1000 * 50 + (eval(electricNum.value) - 50) * 2000;
            } else afMoney.value = (1000 * 50) + (2000 * 150) + (eval(electricNum.value) - 200) * 2500;
            break;
        case 'c':
            afMoney.value = "0";
            break;
    }
}