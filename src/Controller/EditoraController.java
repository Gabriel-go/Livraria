package Controller;

import Model.EditoraBEAN;
import Model.EditoraDAO;
import java.util.ArrayList;


public class EditoraController {
    
public EditoraController() {
    }

    public void addEditora(EditoraBEAN Editora) {
        EditoraDAO.getInstance().insere(Editora);
    }
    
    public void alteraEditora(EditoraBEAN Editora) {
        EditoraDAO.getInstance().altera(Editora);
    }
    
    public void inativaEditora(int id) {
        EditoraDAO.getInstance().inativa(id);
    }
    
    public void deleteContato(EditoraBEAN Editora) {
        EditoraDAO.getInstance().deleta(Editora);
    }

    public ArrayList<EditoraBEAN> listaEditoraes(String nome) {
        return EditoraDAO.getInstance().consultaTudoPessoa(nome);
    }
    
    public EditoraBEAN buscaPessoaId(int id) {
        return EditoraDAO.getInstance().buscaContato(id);
    }   
    
}
