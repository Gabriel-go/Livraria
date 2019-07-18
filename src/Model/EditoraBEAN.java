package Model;

public class EditoraBEAN {

    public EditoraBEAN(){
        
    }
    
    public EditoraBEAN(int idEditora, int statusEditora, String nomeEditora) {
        this.idEditora = idEditora;
        this.statusEditora = statusEditora;
        this.nomeEditora = nomeEditora;
    }
    private int idEditora;
    private int statusEditora;
    private String nomeEditora;

    public int getIdEditora() {
        return idEditora;
    }

    public void setIdEditora(int idEditora) {
        this.idEditora = idEditora;
    }

    public int getStatusEditora() {
        return statusEditora;
    }

    public void setStatusEditora(int statusEditora) {
        this.statusEditora = statusEditora;
    }

    public String getNomeEditora() {
        return nomeEditora;
    }

    public void setNomeEditora(String nomeEditora) {
        this.nomeEditora = nomeEditora;
    }
    
    
}
