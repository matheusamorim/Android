package pessoas;

public class Livro implements Publicacao{
    private String titulo;
    private Pessoa autor;
    private int totPagina;
    private boolean aberto;
    private  Pessoa leitor;
    private int pagAtual;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Pessoa getAutor() {
        return autor;
    }

    public void setAutor(Pessoa autor) {
        this.autor = autor;
    }

    public int getTotPagina() {
        return totPagina;
    }

    public void setTotPagina(int totPagina) {
        this.totPagina = totPagina;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
       this.pagAtual = pagAtual;
    }

    public Livro(String titulo, Pessoa autor, int totPagina, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPagina = totPagina;
        this.aberto = true;
        this.leitor = leitor;
        this.pagAtual = 0;
    }

    public void detalhes(){
        System.out.println("Livro{ " + " titulo= "+ titulo + "\n, autor= "
                + autor.getNome() + ",\n total de paginas= " + totPagina
                + ", pagina atual= " + pagAtual + " aberto="
                + aberto + " leitor= "+ leitor.getNome() + "}");
    }

    @Override
    public void abrir() {
        this.aberto = true;


    }

    @Override
    public void fechar() {
        this.aberto = false;

    }

    @Override
    public void folher(int p) {
        this.pagAtual = p;

    }

    @Override
    public void avacaPag() {
        this.pagAtual++;

    }

    @Override
    public void voltarPag() {
        this.pagAtual--;

    }
}
