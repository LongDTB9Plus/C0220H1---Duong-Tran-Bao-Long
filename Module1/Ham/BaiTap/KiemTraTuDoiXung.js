var stringIn = prompt("Nhap Tu Can Kiem Tra").trim();
var result = true;
function isPalindrome(abc) {
    for( var i = 0; i < (abc.length)/2;i++){
        if (abc.charAt(i) !== abc.charAt(abc.length - 1 -i)){
            result = false;
        }
    } alert(result);
}

isPalindrome(stringIn);