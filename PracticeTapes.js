function loginConfirm() {
    const password = document.getElementById("password")
    if (password === "PracticeTapes"){
        alert("Yay");
        window.location="PracticeTapesMain1.html";
    }
    else {
        alert("Please enter the correct password to enter");
    }
}

const request = new XMLHttpRequest();
request.onload =  function(){

const Tapes = JSON.parse(this.responseText);
}
request.open('GET', JSONLINK!!!!!!!!!!!!!!!!!!!!!!!!!);
request.send();

function showAllSongs() {
    const song;

    for (i = 0; i < Tapes.length; i++) {
        song += Tapes.id[i] +" "+ Tapes.songName[i];
        document.getElementById("SongList").innerHTML += song;
        //Print this to screen??
    }
}

function findSongLink() {

    const songtolink = document.getElementById("songToFind");
    
    for (i = 0; i < Tapes.length; i++) {
        if (Tapes.songName.value[i]===songtolink){
            //return Tapes.url[i] as a link to screen??
        }
        else
        i++;
    }
}

function addSong() {
const idToAdd = document.getElementById(newSongId);
const songToAdd = document.getElementById(newSongName);
const linkToAdd = document.getElementById(newLink);

const SongSubmit = [{
    "id": idToAdd,
    "url": linkToAdd,
    "songName": songToAdd,
  }]
/*WHAT GOES HERE!?*/ JSON.stringify(SongSubmit);
//How do I chuck this to Java/MySQL?
}  

function goHome() {
    window.location="PracticeTapesMain1.html";
}