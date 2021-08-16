function updateOnlineUsers() {

    var ajax = new XMLHttpRequest();

    setInterval(function () {
        ajax.open("GET","/fetch-online-users.do");
        ajax.send();
        ajax.onreadystatechange = function (ev) {
            if(ajax.readyState == 4){
                document.getElementById("onlineUsers").innerText =  ajax.response;
            }
        }
    },1000); //Ajax polling //websocket //SSE

}