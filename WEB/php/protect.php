<?php

if(!isset($_SESSION)){

    session_start();
}

if(!isset($_SESSION['id'])){
    die("header ./login.html");

}

//aqui vai bloquear no caso do usario tiver passado pelo logout

?>