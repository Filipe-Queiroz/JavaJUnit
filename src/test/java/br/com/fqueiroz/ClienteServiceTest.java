package test.java.br.com.fqueiroz;

import main.java.br.com.fqueiroz.dao.IClienteDAO;
import main.java.br.com.fqueiroz.domain.Cliente;
import main.java.br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;
import main.java.br.com.fqueiroz.services.ClienteService;
import main.java.br.com.fqueiroz.services.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.fqueiroz.dao.ClienteDaoMock;

public class ClienteServiceTest {

    private IClienteService clienteService;

    private Cliente cliente;

    public ClienteServiceTest() {
        IClienteDAO dao = new ClienteDaoMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init() {
        cliente = new Cliente();
        cliente.setCpf(1234567890l);
        cliente.setNome("Filipe");
        cliente.setCidade("Itajaí");
        cliente.setEnd("Rua");
        cliente.setEstado("SC");
        cliente.setNum(8);
        cliente.setTel(47999999999l);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteService.buscarPorCPF(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Filipe Queiroz");
        clienteService.alterar(cliente);
        Assert.assertEquals("Filipe Queiroz", cliente.getNome());
    }
}
