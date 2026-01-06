class App {

    public static void main(String[] args) {

        Garrafa garrafa = new Garrafa(150f);
        Copo copo = new Copo(0);
        copo.encher(garrafa.esvaziar(50));

        garrafa.mostrarLiquido();
        copo.mostrarLiquido();

    }

}
