package trabalhandoComArquivos.lendoArquivoTexto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Lendo o conteúdo de um arquivo Txt

        File path = new File("C:\\TESTE\\in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(path);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }



    }
}
