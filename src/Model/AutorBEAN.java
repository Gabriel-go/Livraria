package Model;

public class AutorBEAN {
    private int idAutor;
    private String nomeAutor;
    private int statusAutor; 

    public AutorBEAN(){
        
    }
    public AutorBEAN(int iID, String sNome,int iStatus){
        this.idAutor = iID;
        this.nomeAutor = sNome;
        this.statusAutor = iStatus;        
    }
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getStatusAutor() {
        return statusAutor;
    }

    public void setStatusAutor(int statusAutor) {
        this.statusAutor = statusAutor;
    } 
}
