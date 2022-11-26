<?php

if(!isset($_SESSION)){
    session_start();
}

session_destroy();

header('Location: ../login.html');

//aqui é para ser redirecionado o link quando o usuario quiser sair da pagina


?>

