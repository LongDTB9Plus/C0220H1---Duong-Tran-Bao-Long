var weight = prompt("Nhap Can Nang (kg)") ;
var height = prompt("Nhap Chieu Cao (m)") ;
var bmi = weight / (height**2);

if (bmi < 18.5) {
    alert("Underweight");
}else if (bmi < 25) {
    alert("Normal");
}else if (bmi < 30) {
    alert("Overweight");
}else {alert("Obese")
}