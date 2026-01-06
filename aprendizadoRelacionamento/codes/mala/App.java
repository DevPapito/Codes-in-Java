public class App {

    public static void main(String[] args) {

        Mala mala = new Mala(new Espaco("espaco-01"));
        mala.getEspacoFixo().addIten(new Iten("Notebook"));
        mala.getEspacoFixo().addIten(new Iten("Maça Old"));

        Espaco espaco02 = new Espaco("espaco-02");

        espaco02.addIten(new Iten("Roupa suja"));
        espaco02.addIten(new Iten("Tenis limpo"));
        espaco02.addIten(new Iten("Camiseta limpa"));
        espaco02.addIten(new Iten("Cueca rosa limpa"));
        espaco02.addIten(new Iten("Cueca verde limpa"));

        mala.addEspacoAdicional(espaco02);
        mala.verEspacoEItens();

    }

}
