package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EditoraDAO {
    
    private static EditoraDAO instance;
    
    public static EditoraDAO getInstance() {
        if (instance == null) {
            instance = new EditoraDAO();
        }
        return instance;
    }
    
    public int insere(EditoraBEAN editora ){
        String query = "INSERT INTO editora (id_editora,nome_editora, status_editora) VALUES (?,?,?)";
        return MySQLDAO.executeQuery(query, editora.getIdEditora(), editora.getNomeEditora(), editora.getStatusEditora());
    }
    
    public void altera (EditoraBEAN editora){
        String query = "UPDATE editora SET nome_editora=?, status_editora=? WHERE id_editora = ?";
        MySQLDAO.executeQuery(query, editora.getIdEditora(),editora.getStatusEditora(), editora.getIdEditora());
    }
    
    public void deleta (EditoraBEAN editora){
         MySQLDAO.executeQuery("DELETE FROM editora WHERE id_editora = ?", editora.getIdEditora());
    }
    
    public ArrayList<EditoraBEAN> consultaTudoPessoa(String nome) {
        return listaContatos("SELECT * FROM editora where nome_editora LIKE '"+nome+"%' and status_editora = 0 ORDER BY Nome_editora");
    }

    public ArrayList<EditoraBEAN> listaContatos(String query) {
        ArrayList<EditoraBEAN> lista = new ArrayList<EditoraBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new EditoraBEAN(rs.getInt("id_editora"),
                                          rs.getInt("status_editora"),
                                          rs.getString("nome_editora"))); 
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void inativa (int id){
        String query = "UPDATE editora SET status_editora= ? WHERE id_editora = ?";
        MySQLDAO.executeQuery(query,1, id);
    }

    public EditoraBEAN buscaContato(int id) {
        EditoraBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM editora WHERE id_editora=?", id);
        try {
            if (rs.next()) {
                result = (new EditoraBEAN(rs.getInt("id_editora"),
                                          rs.getInt("status_editora"),
                                          rs.getString("nome_editora"))); 
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int consultaId(EditoraBEAN editora) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
        "SELECT * FROM editora WHERE nome_editora= ? and status_editora= ? and id_editora =  ?",
        editora.getNomeEditora(),editora.getStatusEditora(),editora.getIdEditora());

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
