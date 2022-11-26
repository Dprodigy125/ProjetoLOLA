<?php

namespace TrabalhoRIR;

class usuario {

    public function login($email, $senha){
        global $pdo;

        $sql = "SELECT * FROM pseudo_dados WHERE email = :email AND senha = :senha ";
        $sql = $pdo->prepare($sql);
        $sql->bindvalue("senha", $senha);
        $sql->bindvalue("email", $email);
        $sql->execute();

        if($sql->rowCount() > 0){
            $dado = $sql->fetch();

            $_SESSION['id'] = $dado['id'];
            $_SESSION['nome'] = $dado['NomeCompleto'];
            $_SESSION['email'] = $dado['Email'];
            $_SESSION['cpf'] = $dado['CPF'];
            $_SESSION['datan']= $dado['DataNascimento'];
            $_SESSION['endereco']= $dado['Endereco'];
            $_SESSION['nivel']= $dado['Nivel'];
            $_SESSION['dia']= $dado['DataIda'];
            $_SESSION['justificativa']= $dado['Justificativa'];


            return true;
        
        }

        else{ 
            return false;
        }

    }

   

}
?>