package animal;

public class Cao extends  Animal {


    public  String caixaBaixa(){
        return nome.toLowerCase();
    }
    public Cao(String especie, String nome) {
        super(especie, nome);
    }

    @Override
    public String caixaAlta() {
        return null;
    }
}
