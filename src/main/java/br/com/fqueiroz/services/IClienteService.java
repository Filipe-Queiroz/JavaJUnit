package main.java.br.com.fqueiroz.services;

import main.java.br.com.fqueiroz.domain.Cliente;
import main.java.br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;

public interface IClienteService {
    boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    Cliente buscarPorCPF(long cpf);

    void excluir(long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException;
}
