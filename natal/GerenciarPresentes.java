package app.natal;

public class GerenciarPresentes {

    private Presentes presentes;

    private String[] nomes = {"carro","boneco","fantasia","video games"};
    private double[] values = {100.0,50.32,10,5,1000,4000.0};
    private String[] types = {"brinquedo","eletronico"};

    public GerenciarPresentes() {

        presentes = new Presentes();

    }

    public void generatePresentes(int generate) {

        double newValue = 0;
        for (int i = 0; i < generate; i++) {

            int nome = (int)(Math.random() * 3);

            String newNome = this.nomes[nome];


            int type = (int)Math.round((Math.random() * 1));

            String newType = this.types[type];

            if (newType.contains("bri")) {

                int value = (int)(Math.random() * 3);

                newValue = this.values[value];

            }else {

                int value = (int)Math.round((Math.random() * 1));

                if (value == 0) {

                    newValue = this.values[4];

                }else{

                    newValue = this.values[5];

                }

            }

            this.presentes.addPresente(new Presente(newNome,newValue,newType));

        }

    }

    public void showPresente(int id) {

        Presente pre = presentes.readPresente(id);

        System.out.printf("Nome; %s\nTipo: %s\nValor: %.2f\n\n",pre.getName(),
                pre.getType(),
                pre.getValue());

    }

    public Presente readPresente(int id) {

        return presentes.readPresente(id);

    }

}
