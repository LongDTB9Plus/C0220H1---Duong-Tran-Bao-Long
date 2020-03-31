let regexp = /^[0-9]{5}(?:-[0-9]{4})?$/;
function is_usZipCode(str) {
    return regexp.test(str);

}
var zipcode = "03201-2150";
    console.log(is_usZipCode(zipcode));
zipcode = '7892';
console.log(is_usZipCode(zipcode));