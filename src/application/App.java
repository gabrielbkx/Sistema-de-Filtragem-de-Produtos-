package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    private static final String DELIMITADOR = ",";

    public static void main(String[] args) {

        List<Product> produtos = new ArrayList<>();
        System.out.print("Digite o caminho do arquivo: ");

        try (Scanner sc = new Scanner(System.in);
             BufferedReader bf = new BufferedReader(new FileReader(sc.nextLine()))) {

            String linha = bf.readLine();
            while (linha != null) {
                String[] split = linha.split(DELIMITADOR);
                produtos.add(new Product(split[0],Double.parseDouble(split[1])));
                linha = bf.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro " + e.getMessage());
        }

            double precoMedio = produtos.isEmpty() ? 0.0 : produtos.stream()
                    .mapToDouble(Product::getPrice)
                    .sum() / produtos.size();

            System.out.println("Preço Médio Dos Produtos: " + String.format("%.2f", precoMedio));
            System.out.println();

            List<Product> lista = produtos.stream()
                    .filter(p -> p.getPrice() < precoMedio)
                    .sorted().collect(Collectors.toList());

            lista.forEach(System.out::println);

    }
}
