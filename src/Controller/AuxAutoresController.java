package Controller;

import Model.AuxAutoresBEAN;
import Model.AuxAutoresDAO;
import java.util.ArrayList;

public class AuxAutoresController {
    public AuxAutoresController() {
    }
    
    public void addAutor(AuxAutoresBEAN autor) {
        AuxAutoresDAO.getInstance().insere(autor);
    }
    
    static public void deleteContato(AuxAutoresBEAN autor) {
        AuxAutoresDAO.getInstance().deleta(autor);
    }
    public ArrayList<AuxAutoresBEAN> listaAutores(int id) {
        return AuxAutoresDAO.getInstance().consultaTudoPessoa(id);
    }
}
