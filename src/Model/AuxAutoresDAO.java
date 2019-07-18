package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class AuxAutoresDAO {
    private static AuxAutoresDAO instance;
    
    public static AuxAutoresDAO getInstance() {
        if (instance == null) {
            instance = new AuxAutoresDAO();
        }
        return instance;
    }
    public int insere(AuxAutoresBEAN autor ){
        String query = "INSERT INTO auxAutores (id_autores,nome_autor, id_livros) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, autor.getIdAutores(), autor.getNomeautor(), autor.getIdLivros());
    }
    
    public void deleta (AuxAutoresBEAN autor){
         MySQLDAO.executeQuery("DELETE FROM auxautores WHERE id_livros = ? and id_autores = ?", autor.getIdLivros(),autor.getIdAutores());
    }
    public ArrayList<AuxAutoresBEAN> consultaTudoPessoa(int id) {
        return listaContatos("SELECT * FROM auxautores where id_livros = "+id);
    }
    
    public ArrayList<AuxAutoresBEAN> listaContatos(String query) {
        ArrayList<AuxAutoresBEAN> lista = new ArrayList<AuxAutoresBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AuxAutoresBEAN(rs.getInt("id_livros"),
                                             rs.getInt("id_autores"),
                                             rs.getString("nome_autor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
}
