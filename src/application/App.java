package application;

import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> produtos = new ArrayList<>();

        System.out.print("Digite o caminho do arquivo: ");

        try (BufferedReader bf = new BufferedReader(new FileReader(sc.nextLine()))) {

            String linha = bf.readLine();
            while (linha != null) {
                String[] split = linha.split(",");
                String nome = split[0];
                double preco = Double.parseDouble(split[1]);
                produtos.add(new Product(nome, preco));
                linha = bf.readLine();
            }
            sc.close();
        } catch (IOException e) {
            System.out.println("Errot " + e.getMessage());
        }

        double precoMedio = produtos.stream().mapToDouble(Product::getPrice).sum() / produtos.size();

        System.out.println("Preço Médio Dos Produtos: " + String.format("%.2f", precoMedio));
        System.out.println();

        List<Product> lista = produtos.stream().filter(p -> p.getPrice() < precoMedio).collect(Collectors.toList());
        Collections.sort(lista);
        lista.forEach(System.out::println);

    }
}
