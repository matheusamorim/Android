package animal;

public class Main {
    public static void main(String[] args) {
        Cao c = new Cao("Labrador", "MATHEUSD E AMORIM");
        c.setNome(c.caixaBaixa());
        System.out.println(c.getNome());


    }
}
