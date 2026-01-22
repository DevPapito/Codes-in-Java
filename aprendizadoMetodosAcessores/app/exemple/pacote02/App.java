package app.exemple.pacote02;

// Teste de classe publica

import app.exemple.pacote01.ElementoPublico01;
//import app.exemple.pacote01.ElementoProtected01;
import app.exemple.pacote01.ElementoSub01;
import app.exemple.pacote01.ElementoPrivate02;
import app.exemple.pacote01.ClasseAtributoNoModSub;
import app.exemple.pacote01.ClasseProtectedSub;
import app.exemple.pacote01.ClasseProtected;

public class App {

    public static void main(String[] args) {

        //ElementoPublico01 pu = new ElementoPublico01();
        //ElementoProtected01 pro = new ElementoProtected01();
        //ElementoSub01 sub = new ElementoSub01();
        //ElementoPrivate02 pri = new ElementoPrivate02();

        ClasseAtributoNoModSub sub = new ClasseAtributoNoModSub();
        sub.run();

        ClasseProtectedSub proS = new ClasseProtectedSub();
        proS.run();

        Sub s = new Sub();
        s.run();

        ClasseProtected pro = new ClasseProtected();
        System.out.println(pro.nome);
        System.out.println(pro.idade);


    }

}
