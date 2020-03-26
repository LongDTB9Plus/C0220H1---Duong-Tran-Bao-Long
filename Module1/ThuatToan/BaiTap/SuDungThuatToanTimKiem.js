let phoneNumber = ["03233","03333","03433","03533","12333","3232","34334"];
let phoneViettel = [];
let isViettel = /^[0][3][2345]?[0-9]*$/;

for( let i = 0; i< phoneNumber.length; i++){
    if (isViettel.test(phoneNumber[i])){
        phoneViettel.push(phoneNumber[i])
    }
}
alert(phoneViettel);