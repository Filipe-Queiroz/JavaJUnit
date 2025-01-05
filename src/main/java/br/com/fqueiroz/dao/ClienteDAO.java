package main.java.br.com.fqueiroz.dao;

import main.java.br.com.fqueiroz.dao.generics.GenericDAO;
import main.java.br.com.fqueiroz.domain.Cliente;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

    public ClienteDAO() {
        super();
    }

    @Override
    public Class<Cliente> getTipoClasse() {
        return Cliente.class;
    }

    @Override
    public void atualiarDados(Cliente entity, Cliente entityCadastrado) {

    }

//    @Override
//    public boolean salvar(Cliente cliente) {
//        return true;
//    }
//
//    @Override
//    public Cliente buscarPorCPF(long cpf) {
//        return null;
//    }
//
//    @Override
//    public void excluir(Long cpf) {
//
//    }
//
//    @Override
//    public void alterar(Cliente cliente) {
//
//    }

}
