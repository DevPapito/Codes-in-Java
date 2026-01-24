public final class App {

    public static void main(String[] args) {

        ArmaDeMao pistola = new Pistola("Glock",5);
        System.out.println(pistola);
        pistola.atirar();
        System.out.println(pistola);
        pistola.carregar();
        System.out.println(pistola);

        ArmaDeMao revolver = new Revolver("Magnum",20);
        System.out.println(revolver);
        revolver.atirar();
        System.out.println(revolver);
        revolver.carregar();
        System.out.println(revolver);

        RevolverSilenciado revolverSilenciado = new RevolverSilenciado("Magnum Silenciado",20);
        System.out.println(revolverSilenciado);
        revolverSilenciado.atirarSilenciado();
        System.out.println(revolverSilenciado);
        revolverSilenciado.carregar();
        System.out.println(revolverSilenciado);


    }

}
