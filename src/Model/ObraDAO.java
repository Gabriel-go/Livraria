package Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ObraDAO {
    
    private static ObraDAO instance;
    
    public static ObraDAO getInstance() {
        if (instance == null) {
            instance = new ObraDAO();
        }
        return instance;
    }
    
    public int insere(ObraBEAN Obra ){
        String query = "INSERT INTO Obra (id_Obra,nome_Obra, status_Obra, editora_obra) VALUES (?,?,?,?)";
        return MySQLDAO.executeQuery(query, Obra.getIdObra(), Obra.getNomeObra(), Obra.getStatusObra(), Obra.getEditoraObra());
    }
    
    public void altera (ObraBEAN Obra){
        String query = "UPDATE Obra SET nome_Obra=?, status_Obra=?, editora_Obra=? WHERE id_Obra = ?";
        MySQLDAO.executeQuery(query, Obra.getNomeObra(),Obra.getStatusObra(), Obra.getEditoraObra(), Obra.getIdObra());
    }
    
    public void deleta (ObraBEAN Obra){
         MySQLDAO.executeQuery("DELETE FROM Obra WHERE id_Obra = ?", Obra.getIdObra());
    }
    
    public ArrayList<ObraBEAN> consultaTudoPessoa(String nome) {
        return listaContatos("SELECT * FROM Obra where nome_Obra LIKE '"+nome+"%' and status_Obra = 0 ORDER BY Nome_Obra");
    }

    public ArrayList<ObraBEAN> listaContatos(String query) {
        ArrayList<ObraBEAN> lista = new ArrayList<ObraBEAN>();
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(query);
        try {
            while (rs.next()) {
                lista.add(new ObraBEAN(rs.getInt("id_Obra"),
                                       rs.getString("nome_Obra"),
                                       rs.getInt("status_Obra"),
                                       rs.getInt("editora_Obra"))); 
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
    
    public void inativa (int id){
        String query = "UPDATE Obra SET status_Obra= ? WHERE id_Obra = ?";
        MySQLDAO.executeQuery(query,1, id);
    }

    public ObraBEAN buscaContato(int id) {
        ObraBEAN result = null;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet("SELECT * FROM Obra WHERE id_Obra=?", id);
        try {
            if (rs.next()) {
                result = (new ObraBEAN(rs.getInt("id_Obra"),
                                       rs.getString("nome_Obra"),
                                       rs.getInt("status_Obra"),
                                       rs.getInt("editora_Obra"))); 
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public int consultaId(ObraBEAN Obra) {
        int result = 0;
        ResultSet rs = null;
        rs = MySQLDAO.getResultSet(
        "SELECT * FROM Obra WHERE nome_Obra= ? and status_Obra= ? and id_Obra =  ?",
        Obra.getNomeObra(),Obra.getStatusObra(),Obra.getIdObra());

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
