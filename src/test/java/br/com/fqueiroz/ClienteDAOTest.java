package test.java.br.com.fqueiroz;

import main.java.br.com.fqueiroz.dao.ClienteDAO;
import main.java.br.com.fqueiroz.dao.IClienteDAO;
import main.java.br.com.fqueiroz.domain.Cliente;
import main.java.br.com.fqueiroz.exceptions.TipoChaveNaoEncontradaException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import test.java.br.com.fqueiroz.dao.ClienteDaoMock;

public class ClienteDAOTest {

    private IClienteDAO clienteDao;

    private Cliente cliente;

    public ClienteDAOTest() {
        clienteDao = new ClienteDaoMock();
    }

    @Before
    public void init() throws TipoChaveNaoEncontradaException {
        cliente = new Cliente();
        cliente.setCpf(1234567890l);
        cliente.setNome("Filipe");
        cliente.setCidade("Itajaí");
        cliente.setEnd("Rua");
        cliente.setEstado("SC");
        cliente.setNum(8);
        cliente.setTel(47999999999l);
        clienteDao.cadastrar(cliente);
    }

    @Test
    public void pesquisarCliente() {
        Cliente clienteConsultado = clienteDao.consultar(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        boolean retorno = clienteDao.cadastrar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente() {
        clienteDao.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("Filipe Queiroz");
        clienteDao.alterar(cliente);

        Assert.assertEquals("Filipe Queiroz", cliente.getNome());
    }
}
