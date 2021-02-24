package heranca;

public class Funcionario extends Pessoa {
   private String setor;
   private  String trabalho;

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getTrabalho() {
        return trabalho;
    }

    public void setTrabalho(String trabalho) {
        this.trabalho = trabalho;
    }

    public void mudaTrabalho(String novoTrabalho){
       this.trabalho = novoTrabalho;
   }
}
