public class App {

    public static void main(String[] args) {

        Gun m9 = new Pistola(2,10,50);
        PistolaSilenciada m9Silicid = new PistolaSilenciada(2,10,50);
        m9Silicid.setSilenciador(true);

        System.out.println(m9.shoot(1));

        System.out.println(m9.toString());

        System.out.println(m9.shoot(1));

        System.out.println(m9.toString());

        System.out.println(m9.reload(10));

        System.out.println(m9.toString());

        // silenciada
        System.out.println(m9Silicid.shootSilenciado(1));

        System.out.println(m9Silicid.toString());

        System.out.println(m9Silicid.shoot(1));

        System.out.println(m9Silicid.toString());

        System.out.println(m9Silicid.reload(10));

        System.out.println(m9Silicid.toString());



    }

}
