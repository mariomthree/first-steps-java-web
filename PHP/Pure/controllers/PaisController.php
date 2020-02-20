<?php 

require_once 'DAO.php';

class PaisController extends DAO {

    private $dao;
    private $nomeTabela = "pais";

    function __construct() {
        parent::__construct();
        $this->dao = new DAO();
    }

    public function registarPais(Pais $pais) {

        $campos = "id,nome,descricao";

        $valores = array(
            $pais->getId(),
            $pais->getNome(),
            $pais->getDescricao(),
        );
        $this->dao->create($this->nomeTabela, $campos, $valores);
    }

    public function actualizarPais(Pais $pais) {

        $campos = array(
            "nome",
            "descricao"
        );

        $valores = array(
            $pais->getNome(),
            $pais->getDescricao(),
            $pais->getId()
        );
        $condicao = "WHERE id = ?";
        $this->dao->update($this->nomeTabela, $campos, $valores, $condicao);
    }

    public function removerPais($id) {

        $valores = array(
            $id
        );
        $condicao = "WHERE id = ?";
        $this->dao->delete($this->nomeTabela, $valores, $condicao);
    }

    public function dadosPais() {
        return $this->dao->read($this->nomeTabela);
    }

    public function pesquisarNome($nome) {

        $campos = "*";
        $condicao = "WHERE nome LIKE '%$nome%'";
        return $this->dao->read($this->nomeTabela, $campos, $condicao);
    }

    public function pesquisarId($id) {

        $campos = "*";
        $condicao = "WHERE id = $id";
        return $this->dao->read($this->nomeTabela, $campos, $condicao);
    }

}
