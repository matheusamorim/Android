package heranca;

public class Pessoa {
    private int idade;
    private String nome;
    private String sexo;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void faseAniversario(){
        this.idade++;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idade=" + idade +
                ", nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                '}';
    }
}
