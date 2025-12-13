import java.text.DecimalFormat;

class Exec20 {

    public static void main(String[] args) {

        double dollar = 1;
        double real = dollar * 5.42;

        DecimalFormat df = new DecimalFormat();
        df.applyPattern("###.00R$");
        //df.applyPattern("###,00R$");

        double[] A = new double[20];

        for (int i = 0; i < A.length; i++) {

            if (i == 0)A[i] += 2;

            A[i] += (real * i);

        }

        String dollarView = "";
        for (double dol : A) {

            dollarView = df.format(dol);
            System.out.println(dollarView.replace(".",","));

        }

    }

}
