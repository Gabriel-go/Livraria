package Controller;

import Model.ObraBEAN;
import Model.ObraDAO;
import java.util.ArrayList;


public class ObraController {
    public void addObra(ObraBEAN Obra) {
        ObraDAO.getInstance().insere(Obra);
    }
    
    public void alteraObra(ObraBEAN Obra) {
        ObraDAO.getInstance().altera(Obra);
    }
    
    public void inativaObra(int id) {
        ObraDAO.getInstance().inativa(id);
    }
    
    public void deleteContato(ObraBEAN Obra) {
        ObraDAO.getInstance().deleta(Obra);
    }

    public ArrayList<ObraBEAN> listaObraes(String nome) {
        return ObraDAO.getInstance().consultaTudoPessoa(nome);
    }
    
    public ObraBEAN buscaPessoaId(int id) {
        return ObraDAO.getInstance().buscaContato(id);
    } 
}
