class App {

    public static void main(String[] args) {

        ContaCorrente conta01 = new ContaCorrente(100.0,false);
        double valor = conta01.sacar(50.0);
        System.out.println("Valor sacado: "+valor);
        System.out.println(conta01);
        boolean status = conta01.depositar(5.5);
        System.out.println((status) ? "Foi possivel depositar" : "Não foi possivel depositar");
        System.out.println(conta01);


    }

}
