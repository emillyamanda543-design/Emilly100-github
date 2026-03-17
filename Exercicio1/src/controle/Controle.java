package controle;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Controle {

    private String os() {
        return System.getProperty("os.name");
    }

    public void ip() {
        String sistema = os();

        try {
            Process p;

            if (sistema.contains("Windows")) {
                p = Runtime.getRuntime().exec("ipconfig");
            } else {
                p = Runtime.getRuntime().exec("ip addr");
            }

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String linha;

            while ((linha = reader.readLine()) != null) {

                if (linha.contains("IPv4")) {
                    System.out.println(linha.trim());
                }

                if (linha.contains("inet ")) {
                    String[] partes = linha.split(" ");
                    System.out.println("IPv4: " + partes[5]);
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void ping() {
        String sistema = os();

        try {

            Process p;

            if (sistema.contains("Windows")) {
                p = Runtime.getRuntime().exec("ping -4 -n 10 www.google.com.br");
            } else {
                p = Runtime.getRuntime().exec("ping -4 -c 10 www.google.com.br");
            }

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String linha;

            while ((linha = reader.readLine()) != null) {

                if (linha.contains("Average") || linha.contains("avg")) {
                    System.out.println(linha);
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}