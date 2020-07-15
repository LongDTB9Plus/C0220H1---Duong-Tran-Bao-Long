$(document).ready(function () {

    let dataMusic = {
        listMusic: [
            {
                "id": "0",
                "name": 'Haru Haru',
                "artist": 'Big Bang',
                "url": 'music/Haru Haru - Big Bang.mp3',
                "cover": 'Img/7584.jpg'
            },
            {
                "id": "1",
                "name": 'Blue',
                "artist": 'Big Bang',
                "url": 'music/Blue - Big Bang.mp3',
                "cover": 'Img/10983.jpg'
            },
            {
                "id": "2",
                "name": 'Bang Bang Bang',
                "artist": 'Big Bang',
                "url": 'music/Bang Bang Bang - Big Bang.mp3',
                "cover": 'Img/67014.jpg'
            },
            {
                "id": "3",
                "name": 'Loser',
                "artist": 'Big Bang',
                "url": 'music/Loser - Big Bang.mp3',
                "cover": 'Img/67014.jpg'
            },
        ],
    };
    let loopMusicTemplate = $('#loop-music-template').html();
    let loopMusicTemplateCompile = Handlebars.compile(loopMusicTemplate);
    let loopMusicTemplateWithData =loopMusicTemplateCompile(dataMusic);
    $('#list-music').html(loopMusicTemplateWithData);
    $(".album-poster").on('click', function (e) {
        var dataSwitchId = $(this).attr('data-switch');
        ap.list.switch(dataSwitchId);
        ap.play();
        $("#aplayer").addClass('showPlayer');
    });

    let arrayResult = [];

    dataMusic.listMusic.forEach((item, i) => {
        arrayResult[i] = item;
    });

    const ap = new APlayer({
        container: document.getElementById('aplayer'),
        listFolded: true,
        mini: false,
        theme: 'black',
        audio: arrayResult
    });
});





