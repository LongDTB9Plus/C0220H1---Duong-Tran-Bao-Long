function addTime(abc) {
    var timeCall = document.getElementById("timeCall");
    var money = 0;
    var afMoney = document.getElementById("result");
    var timeCallArray = [timeCall];
    var plusCount = (timeCallArray.split("+").length - 1) ;
    var i = 0;
     alert(plusCount);
    switch (abc) {
        case '+':
            if ( eval(timeCall.value) <= 50) {
                money = eval(timeCall.value) * 600;
            } else if (eval(timeCall.value)  <= 200) {
                money = 600 * 50 + (eval(timeCall.value) - 50) * 400;
            } else money = (600 * 50) + (400 * 150) + (eval(timeCall.value) - 200) * 200;
            afMoney.value = (afMoney.value * 1 + money);
            break;
        case 'c':
            afMoney.value = "0";
            break;
    }
}