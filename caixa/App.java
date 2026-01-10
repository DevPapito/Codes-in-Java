class App {

    public static void main(String[] args) {

        Fechador fechador = new Fechador("Roberto!");
        Caixa caixa = new Caixa("BrinquedosSol LTDA");
        caixa.abrir(fechador.abrirCaixa());
        caixa.addIten(new Iten("Brinquedo-01"));
        caixa.addIten(new Iten("Brinquedo-02"));
        caixa.addIten(new Iten("Brinquedo-03"));
        caixa.fechar(fechador.fecharCaixa());
        fechador.concluirTrabalho(caixa);


    }

}
