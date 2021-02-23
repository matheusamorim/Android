package lutador;

public class Main {
    public static void main(String[] args) {
        Lutas ufc001 = new Lutas();
        Lutador[] l = new Lutador[4];
        l[0] = new Lutador("Mathe", "Brasil", 25, 1.88, 85.8);
        l[1] = new Lutador("joão", "EUA", 58, 1.90, 78.0);

        ufc001.marcarLuta(l[0], l[1]);
        ufc001.lutar();

    }
}
