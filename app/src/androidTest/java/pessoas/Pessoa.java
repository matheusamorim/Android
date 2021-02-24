package pessoas;

public class Pessoa {

    private String nome;
    private int idade;
    private  int sexo;

    public Pessoa(String nome, int idade, int sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    public void fazerAniversario(){
        this.idade = this.idade++;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
}
