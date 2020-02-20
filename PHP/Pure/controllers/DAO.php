<?php

require_once 'config/Connection.php';
require_once 'controllers/Crud.php';

class DAO implements Crud {

    private $connection;

    public function __construct() {
        $this->connection = Connection::connect();
    }

    public function create($tablename, $fields = "", $values = null) {

        $numparams = "";
        for ($i = 0; $i < count($values); $i++) {
            $numparams .= ",?";
        }
        $numparams = substr($numparams, 1);
         
        $sql = "INSERT INTO $tablename ($fields)  VALUES ($numparams)";
        $this->connection = $this->connection->prepare($sql);
        $this->connection->execute($values);
    }

    public function read($tablename, $fields = "*", $condicion = "") {

        $sql = "SELECT $fields FROM $tablename $condicion";
        $this->connection = $this->connection->prepare($sql);
        $this->connection->execute();

        return $this->connection->fetchAll();
    }

    public function update($tablename, $fields, $values, $condicion = null) {

        $fields_update = "";

        for ($i = 0; $i < count($fields); $i++) {
            $fields_update .= ", $fields[$i] = ?";
        }
        
        $fields_update = substr($fields_update, 2);

        $sql = "UPDATE $tablename SET $fields_update";
        $sql .= isset($condicion) ? " $condicion" : "";
        
        $this->connection = $this->connection->prepare($sql);
        $this->connection->execute($values);
    }

    public function delete($tablename, $values, $condicion = null) {

        $sql = "DELETE FROM $tablename";
        $sql .= isset($condicion) ? " $condicion" : "";
        $this->connection = $this->connection->prepare($sql);
        $this->connection->execute($values);
    }

}
