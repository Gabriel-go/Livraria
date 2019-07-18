package Model;


public class AuxAutoresBEAN {
    private int idLivros;
    private int idAutores;
    private String nomeautor;

    public int getIdLivros() {
        return idLivros;
    }

    public void setIdLivros(int idLivros) {
        this.idLivros = idLivros;
    }

    public int getIdAutores() {
        return idAutores;
    }

    public void setIdAutores(int idAutores) {
        this.idAutores = idAutores;
    }

    public String getNomeautor() {
        return nomeautor;
    }

    public void setNomeautor(String nomeautor) {
        this.nomeautor = nomeautor;
    }

    public AuxAutoresBEAN(int idLivros, int idAutores, String nomeautor) {
        this.idLivros = idLivros;
        this.idAutores = idAutores;
        this.nomeautor = nomeautor;
    }
    public AuxAutoresBEAN(){
          
    }
}
