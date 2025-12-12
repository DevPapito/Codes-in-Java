class LabelExemple {

    public static void main(String[] args) {

        for (int i =0; i< 4; i++) {

            // Java permite programação com labels
            // Como em linguagens de baixo nivel ou a propria JVM
            // Nao é boa pratica e nunca e usado

            label1: {

                label2: {

                    label3: {

                        if (i==1) {

                            // goto

                            break label1;// sai da label e vai para
                                         // ponto go

                        }

                        if (i==2) {

                            break label2;

                        }

                        if (i == 3) {

                            break label3;

                        }


                    System.out.println("Label3");

                    }
                 System.out.println("Label2");

                }
             System.out.println("Label1");

            }
            // resto do codigo

        }

    }

}
