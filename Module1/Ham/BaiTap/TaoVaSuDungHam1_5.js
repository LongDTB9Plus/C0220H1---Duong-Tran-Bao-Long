var stars = ["Polaris","Aldebaran","Deneb","Vega","Altair","Dubhe" ,"Regulus"];
var constellation = ["Ursa","Minor","Taurus","Cygnus","Lyra","Aquila","Ursa Major","Leo"];
var starsPostion = 0;
function searchStars(star) {
    if (stars.indexOf(star) !== -1){
        starsPostion = stars.indexOf(star);
        alert(constellation[starsPostion]);
    }else  alert(star + " Not Found");
}
var starsInput = prompt("Nhap Ngoi Sao Can Tim");
searchStars(starsInput);