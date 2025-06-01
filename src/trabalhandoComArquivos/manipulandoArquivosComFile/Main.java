package trabalhandoComArquivos.manipulandoArquivosComFile;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Listando pasta e arquivos a partir do caminho informado.
        //Criando uma nova pasta.

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o caminho das pastas e arquivos: ");
        String strPath = sc.nextLine();

        File path = new File(strPath);

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("\nPastas:");
        for (File f : folders){
            System.out.println(f);
        }

        File[] files = path.listFiles(File::isFile);
        System.out.println("\nArquivos:");
        for (File f : files){
            System.out.println(f);
        }

        boolean sucesso = new File(strPath + "\\NOVA PASTA").mkdir();
        System.out.println("A pasta foi criada " + sucesso);

        sc.close();
    }
}
