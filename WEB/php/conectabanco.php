<?php
session_start();
    

    $servername = "localhost";
    $username = "root";
    $password = "";
    $dbname = "TrabalhowebRIR";

    global $pdo;


    try {
           $pdo = new PDO("mysql:host=$servername;dbname=$dbname", $username, $password);
           $pdo->setAttribute(PDO::ATTR_ERRMODE, PDO::ERRMODE_EXCEPTION);
         } catch(PDOException $e) 
            {
               echo "Erro: " . $e->getMessage();
               exit;
            }
           
?> 
