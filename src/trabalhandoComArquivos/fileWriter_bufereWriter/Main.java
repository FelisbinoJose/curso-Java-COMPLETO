package trabalhandoComArquivos.fileWriter_bufereWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

        //Utilizando FileWriter e BufferdWriter para escrever em arquivos

        String [] linha = new String[] {"Good morning", "Good afternoom", "Good night" };

        File path = new File("C:\\CURSOS\\Java COMPLETO - Nelio Alves\\out.txt");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))){
            for (String l : linha){
                bw.write(l);
                bw.newLine();
            }

        } catch (IOException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
