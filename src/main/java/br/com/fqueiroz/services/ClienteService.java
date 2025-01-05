package main.java.br.com.fqueiroz.services;

import main.java.br.com.fqueiroz.dao.ClienteDAO;
import main.java.br.com.fqueiroz.dao.IClienteDAO;
import main.java.br.com.fqueiroz.domain.Cliente;
import main.java.br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;

public class ClienteService implements IClienteService {

    private IClienteDAO clienteDAO;

    public ClienteService(IClienteDAO clienteDAO) {
        this.clienteDAO = clienteDAO;
    }

    @Override
    public boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        return clienteDAO.cadastrar(cliente);
    }

    @Override
    public Cliente buscarPorCPF(long cpf) {
        return clienteDAO.consultar(cpf);
    }

    @Override
    public void excluir(long cpf) {
        clienteDAO.excluir(cpf);
    }

    @Override
    public void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException {
        clienteDAO.alterar(cliente);
    }
}
