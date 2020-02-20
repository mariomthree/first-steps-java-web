<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta charset="UTF-8">
        <title></title>
    </head>
    <body>
        <?php
        require_once './models/Pais.php';
        require_once './controllers/PaisController.php';

        //Registar
        /*
          $pais = new Pais();
          $pais->setNome("Guine");
          $pais->setDescricao("Bissau we On");
          $paisController = new PaisController();
          $paisController->registarPais($pais);
         */

        //Actualizar
        /*
          $pais = new Pais(4, "Sao Tome", "Principe we on");
          $paisController = new PaisController();
          $paisController->actualizarPais($pais);
         */

        //Remover
        /*
          $id = 3;
          $paisController = new PaisController();
          $paisController->removerPais($id);
         */

        //Listar os dados
        /*
          $paisController = new PaisController();
          $dados = $paisController->dadosPais();
          var_dump($dados);
         */

       //Pesquisas 
        $paisController = new PaisController();
       //$dados = $paisController->pesquisarNome("Gui");//Pesquisar pelo nome
        $dados = $paisController->pesquisarId(2);//Pesquisar pelo Id
        var_dump($dados);

        //-----------------------------------------------------------
        //---------------------------------------------------------------
        //-----------------------------------------------------------------
        /*
         * $dao = new DAO();
          $tablename = 'usuarios';
          $values = array(5);
          $condicion = "WHERE id = ?";
          $dao->delete($tablename,$values,$condicion);
         */
        /*
          // $tablename = "usuarios";
          // $fields    = 'id,nome, user,senha';
          // $values    = array('Carlos', 'carlitos', '0125');

          $tablename = "usuarios";
          $fields    = '';
          $values    = array('Carlos', 'carlitos', '0125');

          $dao->create($tablename,$fields,$values);
         */

        /*
          $tablename = "usuarios";
          //$data = $dao->read($tablename)

          $fields = 'nome';
          $condicion = 'WHERE id = 2';
          $data = $dao->read($tablename,$fields,$condicion);

          var_dump($data);
         */

        /*
          $tablename = 'usuarios';
          $fields = array("user","senha");
          $values = array("new user","new senha",2);
          $condicion = "WHERE id = ?";
          $dao->update($tablename,$fields,$values,$condicion);
         */

        /*      $tablename = 'usuarios';
          $values = array(2);
          $condicion = "WHERE id = ?";
          $dao->delete($tablename,$values,$condicion);
         */
        /* $tablename = 'usuarios';
          $values;
          $condicion = "WHERE id = ?";
          $dao->delete($tablename); */
        ?>
    </body>
</html>
