<script type="text/javascript" src="./js/jquery.js"></script>

<?php

include('./php/protect.php'); //inclui o arquivo que protege a página


?>

<html>
<head>
    <meta charset="UTF-8">
    <style>
        @import url('https://fonts.googleapis.com/css2?family=Chakra+Petch:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap');
        </style>
        <link rel="stylesheet" type="text/css" href="./css/login-page.css">
        <title>Projeto Lollapalooza - Desenvolvimento Mobile 6o Semestre</title>


  <header>
        <nav>
        <a href="index.html"><img class="nav-logo" src="./img/lolla-logo.png" /></a>
        <ul class="nav-list">
          <li><a href="./index.html">HOME</a></li>
          <li><a href="./regulamento.html">REGULAMENTO</a></li>
          <li><a href="./login.html">VERIFICAR CADASTRO</a></li>
          <li><a href="./php/logout.php">SAIR</a></li>
        </ul>
        </nav>
  </header>
  </head>
    <body>
  <main>
    <div id="bloco-sem-geral" class="bloco-sem-geral">
      <img src="./img/Lolla-Patins.png" class="arte-patins-horizontal">
  </div>
      <div id="bloco-login" class="bloco-geral-php" style="align-items: center;">
        <h2>Meu Cadastro</h2>
        <p class="bold">E-mail:</p>
        <p> <?php echo $_SESSION['email'] ?></p>
        <p class="bold">Data de Nascimento:</p>
        <p><?php echo $_SESSION['datan'] ?></p>
        <p class="bold">CPF:</p>
        <p><?php echo $_SESSION['cpf'] ?></p>
        <p class="bold">Endereço:</p>
        <p><?php echo $_SESSION['endereco'] ?></p>
        </div>

        <div id="bloco-login" class="bloco-geral-php" style="align-items: center;">
          <h2>Status do cadastro</h2>
          <form action="" style="display: block;">
              <p>Seu cadastro foi confirmado, fique atento ao seu e-mail para o resultado do sorteio. Caso vocë seja sorteado, seu ingresso também aparecerá nessa página</p>
          <script type="text/javascript" src="./js/main.js"></script>
  </main>
    </body>
</html>