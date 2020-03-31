let array = [["funny-cat1_part1x1.jpg",
            "funny-cat1_part2x1.jpg",
            "funny-cat1_part3x1.jpg",
            "funny-cat1_part4x1.jpg",
            "funny-cat1_part5x1.jpg"],
            ["monkey_part1x1.jpg",
            "monkey_part2x1.jpg",
            "monkey_part3x1.jpg",
            "monkey_part4x1.jpg",
            "monkey_part5x1.jpg"],
            ["panda_swap_part1x1.jpg",
            "panda_swap_part2x1.jpg",
            "panda_swap_part3x1.jpg",
             "panda_swap_part4x1.jpg",
            "panda_swap_part5x1.jpg"]];
let image = ["","","","",""];


function displayImage(imgpos1,imgpos2) {
    image[imgpos2] = array[imgpos1][imgpos2];
    document.getElementById("img"+imgpos2).src = image[imgpos2];
}
function setImagesRandom() {
    for (let i=0; i < 5; i++)
    {
        let num1 = Math.floor ((Math.random() * 3));
        displayImage(num1, i);
    }
}
setImagesRandom();

function changeImage(imgpos2) {
    let num1 = Math.floor ((Math.random() * 3));
    displayImage(num1,imgpos2)
    checkWin();
}

function checkWin() {
    let countWin = 0;
for ( let p = 0; p < array.length; p++){
    for ( let i = 0; i < image.length; i ++){
        if(array[p].indexOf(image[i]) !== -1){
            countWin++;
            if (countWin === 5){
                alert("Win");
            }
        }else countWin = 0;
    }
    }

}