package app.lib;

public class Calculadora implements CalculadoraMethods {


    @Override
    public int soma(int a, int b) {

        return (a+ b);

    }

    @Override
    public int sub(int a, int b) {

        return (a - b);

    }

    @Override
    public double div(int a, int b) {

        return (a / b);

    }

    @Override
    public int mult(int a, int b) {

        return (a * b);

    }

}
