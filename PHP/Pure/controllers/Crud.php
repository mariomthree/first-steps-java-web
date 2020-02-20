<?php 

interface Crud {

 	public function create($tablename, $fields = "", $values = null);

 	public function read($tablename, $fields="*", $condicion = "");
 	
 	public function update($tablename, $fields, $values, $condicion = null);
 	
 	public function delete($tablename, $values, $condicion = null);

}