package Controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class KillController {

    private String os() {
        return System.getProperty("os.name");
    }

    public void listaProcessos() {

        String sistema = os();

        try {

            Process p;

            if (sistema.contains("Windows")) {
                p = Runtime.getRuntime().exec("TASKLIST /FO TABLE");
            } else {
                p = Runtime.getRuntime().exec("ps -ef");
            }

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String linha;

            while ((linha = reader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mataPid(String pid) {

        String sistema = os();

        try {

            if (sistema.contains("Windows")) {
                Runtime.getRuntime().exec("TASKKILL /PID " + pid);
            } else {
                Runtime.getRuntime().exec("kill -9 " + pid);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void mataNome(String nome) {

        String sistema = os();

        try {

            if (sistema.contains("Windows")) {
                Runtime.getRuntime().exec("TASKKILL /IM " + nome);
            } else {
                Runtime.getRuntime().exec("pkill -f " + nome);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}