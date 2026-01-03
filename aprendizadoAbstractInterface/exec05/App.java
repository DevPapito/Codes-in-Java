public class App {

    public static void main(String[] args) {

        ServicoExportacao serv = new ServicoExportacao(new ExportarCSV());
        serv.export("FILE.pdf");

    }


}
