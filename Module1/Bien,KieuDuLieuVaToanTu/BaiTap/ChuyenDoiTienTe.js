function process() {
    var beforeConvert = document.getElementById("Amount");
    var fCurrency = document.getElementById("fromCurrency");
    var tCurrency = document.getElementById("toCurrency");
    var afterConvert;


    if (fCurrency.value == tCurrency.value) {
    document.write("Result:" + beforeConvert);
    }else if(fCurrency.value == "VND"){
            afterConvert = (parseInt(beforeConvert.value)*23000);
        }else if (fCurrency.value == "USD"){
            afterConvert = (parseInt(beforeConvert.value)/23000);
        }
    document.write("Result:" + afterConvert);
}