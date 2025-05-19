package trabalhandoComArquivos.bloco_try_with_ressource;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Utilizando o bloco try-with-ressource para leitura arquivos.

        File path = new File("C:\\CURSOS\\Java COMPLETO - Nelio Alves\\in.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linha = br.readLine();

            while(linha != null){
                System.out.println(linha);
                linha = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro: " +  e.getMessage());
        }
    }
}
