package trabalhandoComArquivos.InfoCaminhoArquivo;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o caminho do arquivo: ");

        String strPath = sc.nextLine();

        File path = new File(strPath);

        System.out.println("Nome do arquivo: " + path.getName());
        System.out.println("Caminho do arquivo: " + path.getParent());
        System.out.println("Caminho do arquivo completo: " + path.getParent());



        sc.close();


    }

}
