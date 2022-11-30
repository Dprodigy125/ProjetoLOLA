<script type="text/javascript" src="./js/jquery.js"></script>

<html>
    <head>
    <meta charset="UTF-8">
        <link rel="stylesheet" type="text/css" href="./css/login-page.css">
        <title>Projeto Lollapalooza - Desenvolvimento Mobile 6o Semestre</title>
        <style>
          @import url('https://fonts.googleapis.com/css2?family=Chakra+Petch:ital,wght@0,300;0,400;0,500;0,600;0,700;1,300;1,400;1,500;1,600;1,700&family=Merriweather:ital,wght@0,300;0,400;0,700;0,900;1,300;1,400;1,700;1,900&display=swap');
          </style>
    </head>

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
  
  <body>
  <main>
      <div id="bloco-login" class="bloco-ticket bloco-login">
        <img src="">
        <h2>Página do Sorteio</h2>
       
        <?php
        require './php/conectabanco.php';

        
   
      
        $sql1 = "SELECT id, NomeCompleto, CPF, dataida FROM pseudo_dados where Nivel <> 'adm' ORDER BY RAND() LIMIT 1";
        $sql1 = $pdo->prepare($sql1);
        $sql1->execute();
        $sorteio = $sql1->fetch();
        
        $_SESSION['id'] = $sorteio['id'];
        $_SESSION['nome'] = $sorteio['NomeCompleto'];
        $_SESSION['cpf'] = $sorteio['CPF'];
        $_SESSION['dia']= $sorteio['dataida'];
        
        if(isset($_POST['botao'])) {
          $sql1 = "SELECT id, NomeCompleto, CPF, dataida FROM pseudo_dados where Nivel <> 'adm' ORDER BY RAND() LIMIT 1";
          $sql1 = $pdo->prepare($sql1);
          $sql1->execute();
          $sorteio = $sql1->fetch();
          
          $_SESSION['id'] = $sorteio['id'];
          $_SESSION['nome'] = $sorteio['NomeCompleto'];
          $_SESSION['cpf'] = $sorteio['CPF'];
          $_SESSION['dia']= $sorteio['dataida'];
          
          echo ("O sorteado foi:<br> " . $_SESSION['nome'] . "<br><br>CPF: " . $_SESSION['cpf'] . "<br>Dia escolhido: " . " " .$_SESSION['dia']);
      }
      
        
      
        
       


        ?>
           
     
        <form method="post">
            

        <input class="submit" type="submit" value="Sortear" name="botao">
        </div>
        <div><p><?php $_SESSION['nome']  ?></p></div>
        <div id="bloco-sem-ticket" class="bloco-sem-ticket">
          <img src="./img/arte-rock.png" class="arte-rock-vertical">
          <img src="./img/arte-rock-horizontal.png" class="arte-rock-horizontal">
      </div>
    </div> 

    </div>
          <script type="text/javascript" src="./js/main.js"></script>
        </main>
        </body>

</html>
