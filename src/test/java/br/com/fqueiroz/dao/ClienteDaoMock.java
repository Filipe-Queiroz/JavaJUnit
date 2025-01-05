package test.java.br.com.fqueiroz.dao;

import main.java.br.com.fqueiroz.dao.IClienteDAO;
import main.java.br.com.fqueiroz.domain.Cliente;
import main.java.br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;

import java.util.Collection;
import java.util.List;

public class ClienteDaoMock implements IClienteDAO {
    @Override
    public Boolean cadastrar(Cliente entity) throws TipoChaveNaoEncontradaException {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) throws TipoChaveNaoEncontradaException {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return List.of();
    }
//    @Override
//    public boolean salvar(Cliente cliente){
//        return true;
//    }
//    @Override
//    public Cliente buscarPorCPF(long cpf) {
//        Cliente cliente = new Cliente();
//        cliente.setCpf(cpf);
//        return cliente;
//    }
//    @Override
//    public void excluir(Long cpf) {
//    }
//    @Override
//    public void alterar(Cliente cliente) {
//    }


}
