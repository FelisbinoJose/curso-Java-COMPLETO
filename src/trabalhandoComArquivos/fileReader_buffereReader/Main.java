package trabalhandoComArquivos.fileReader_buffereReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Leitura de arquivo com FileReader e BufferedReader.

        File path = new File("C:\\CURSOS\\Java COMPLETO - Nelio Alves\\in.txt");

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String linha = br.readLine();

            while (linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }
    }
}
