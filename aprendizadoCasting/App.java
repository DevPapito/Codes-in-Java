public class App {

    public static void main(String[] args) {

        // Para classes sub e necessario realizar casting
        // Como em typecasting short a = (short) 10
        //Manage manage = new SubManage(); // Upcasting
        //SubManage sub = (SubManage) manage; // DownCasting

        Mouse mouse = new Mouse("Razer",50,20);
        mouse.start();

        do {

            mouse.mouse();

        }while(mouse.getCharge() > 0.0);

    }

}
