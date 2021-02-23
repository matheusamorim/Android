package lutador;

public class Lutador implements  LutadorInterface {
    private  String nome;
    private  String nacionalidade;
    private int idade;
    private Double altura, peso;
    private String categoria;
    private int derrota, vitorias, empate;


   public Lutador(String nome, String nacionalidade, int idade, Double altura, Double peso) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso < 50) {
            setCategoria("Invaida");
            this.peso = peso;
        } else if (peso <= 73.3) {
            setCategoria("Leve");
            this.peso = peso;
        } else if (peso <= 83.9) {
            setCategoria("Medio");
            this.peso = peso;
        } else if(peso <= 120.9){
            setCategoria("Pesado".toUpperCase());
        }
        else{
            setCategoria("Muito pesasdo");
        }
    }
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getVitoria() {
        return vitorias;
    }

    public void setVitoria(int vitoria) {
        this.vitorias = vitoria;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }

    @Override
    public void apresenta(Lutador l1) {
        System.out.printf("%s%s%s%s%s%s%s%s%s%n", " Diretamente da ", l1.getNacionalidade(),
                " Com ",  l1.getAltura(), " de Altura ", l1.getPeso(), " e quilos", " Com Vocês ",
                l1.getNome().toUpperCase());

    }

    @Override
    public void status(Lutador l) {
        System.out.println("############## STATUS DO LUTADOR ################");
        System.out.printf("%s%s%n","Total de vitorias: ",l.getVitoria());
        System.out.printf("%s%s%n", "Total de empates: ", l.getEmpate());
        System.out.printf("%s%s%n", "Total de derrotas: ", l.getDerrota());

    }

    @Override
    public void ganhaLuta() {
        setVitoria(this.vitorias + 1);

    }

    @Override
    public void perdeLuta() {
        setDerrota(this.derrota + 1);

    }

    @Override
    public void empatarLuta() {
        setEmpate(this.derrota + 1);

    }
}
