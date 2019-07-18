package Controller;
import java.util.ArrayList;
import java.util.Date;
import Model.AutorBEAN;
import Model.AutorDAO;

public class AutorController {
    public AutorController() {
    }

    public void addAutor(AutorBEAN autor) {
        AutorDAO.getInstance().insere(autor);
    }
    
    public void alteraAutor(AutorBEAN autor) {
        AutorDAO.getInstance().altera(autor);
    }
    
    public void inativaAutor(int id) {
        AutorDAO.getInstance().inativa(id);
    }
    
    public void deleteContato(AutorBEAN autor) {
        AutorDAO.getInstance().deleta(autor);
    }

    public ArrayList<AutorBEAN> listaAutores(String nome) {
        return AutorDAO.getInstance().consultaTudoPessoa(nome);
    }
    
    public AutorBEAN buscaPessoaId(int id) {
        return AutorDAO.getInstance().buscaContato(id);
    }
}
