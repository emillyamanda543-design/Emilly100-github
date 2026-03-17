package controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class DistroController {

    private String os() {
        return System.getProperty("os.name");
    }

    public void exibeDistro() {

        String sistema = os();

        if (!sistema.contains("Linux")) {
            System.out.println("Este programa funciona apenas em Linux.");
            return;
        }

        try {

            Process p = Runtime.getRuntime().exec("cat /etc/os-release");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(p.getInputStream()));

            String linha;

            while ((linha = reader.readLine()) != null) {

                if (linha.contains("NAME=") || linha.contains("VERSION=")) {
                    System.out.println(linha);
                }

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}