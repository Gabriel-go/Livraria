package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AutorDAO {
    
    private static AutorDAO instance;
    
    public static AutorDAO getInstance() {
        if (instance == null) {
            instance = new AutorDAO();
        }
        return instance;
    }
    
    public int insere(AutorBEAN autor ){
        String query = "INSERT INTO autores (id_autor,nome_autor, status_autor) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, autor.getIdAutor(), autor.getNomeAutor(), autor.getStatusAutor());
    }
    
    public void altera (AutorBEAN autor){
        String query = "UPDATE autores SET nome_autor=?, status_autor=? WHERE id_autor = ?";
        MySQLDAO.executeQuery(query, autor.getNomeAutor(),autor.getStatusAutor(), autor.getIdAutor());
    }
    
    public void inativa (int id){
        String query = "UPDATE autores SET status_autor=? WHERE id_autor = ?";
        MySQLDAO.executeQuery(query,1, id);
    }
    
    public void deleta (AutorBEAN autor){
         MySQLDAO.executeQuery("DELETE FROM autor WHERE id_autor = ?", autor.getIdAutor());
    }
    
    public ArrayList<AutorBEAN> consultaTudoPessoa(String nome) {
        return listaContatos("SELECT * FROM autores where nome_autor LIKE '"+nome+"%' and status_autor = 0 ");
    }

    public ArrayList<AutorBEAN> listaContatos(String query) {
        ArrayList<AutorBEAN> lista = new ArrayList<AutorBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new AutorBEAN(rs.getInt("id_autor"),
                                        rs.getString("nome_autor"),
                                        rs.getInt("status_autor")));                
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    public AutorBEAN buscaContato(int id) {
        AutorBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM autores WHERE id_autor=?", id);
        try {
            if (rs.next()) {
                result = (new AutorBEAN(rs.getInt("id_autor"),
                                        rs.getString("nome_autor"),
                                        rs.getInt("status_autor")));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int consultaId(AutorBEAN autor) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
        "SELECT * FROM autor WHERE nome_autor= ? and status_autor= ? and id_autor =  ?",
        autor.getNomeAutor(),autor.getStatusAutor(),autor.getIdAutor());

 try {
            if (rs.next()) {
                result = rs.getInt("id");
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

}
