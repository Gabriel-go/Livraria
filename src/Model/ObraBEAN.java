package Model;

public class ObraBEAN {
    
    private int idObra;
    private String nomeObra;
    private int statusObra;
    private int editoraObra;

    public ObraBEAN(){
        
    }
    public ObraBEAN(int idObra, String nomeObra, int statusObra, int editoraObra) {
        this.idObra = idObra;
        this.nomeObra = nomeObra;
        this.statusObra = statusObra;
        this.editoraObra = editoraObra;
    }
    
    public int getIdObra() {
        return idObra;
    }

    public void setIdObra(int idObra) {
        this.idObra = idObra;
    }

    public String getNomeObra() {
        return nomeObra;
    }

    public void setNomeObra(String nomeObra) {
        this.nomeObra = nomeObra;
    }

    public int getStatusObra() {
        return statusObra;
    }

    public void setStatusObra(int statusObra) {
        this.statusObra = statusObra;
    }

    public int getEditoraObra() {
        return editoraObra;
    }

    public void setEditoraObra(int editoraObra) {
        this.editoraObra = editoraObra;
    }       
    
}
