package br.com.alura.screenmatch.exercicios.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o limite do cartão: ");
        double limite = sc.nextDouble();
        CartaoDeCredito cartaoDeCredito = new CartaoDeCredito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.print("Digite a descrição da compra: ");
            String descricao = sc.next();
            System.out.println("Digite o valor da compra");
            double valor = sc.nextDouble();
            Compra compra = new Compra(descricao, valor);

            boolean compraRealizada = cartaoDeCredito.lancaCompra(compra);

            if (compraRealizada) {
                System.out.println("Compra realizada com sucesso!");
                System.out.println("Digite 0 para sair ou 1 para continuar");
                sair = sc.nextInt();
            } else {
                System.out.println("Compra não realizada. Saldo insuficiente.");
                sair = 0;
            }
        }

        System.out.println("-------------------------");
        System.out.println("Compras realizadas: ");
        Collections.sort(cartaoDeCredito.getCompras());

        for (Compra compra : cartaoDeCredito.getCompras()) {
            System.out.println(compra);
        }

        System.out.println("-------------------------");
        System.out.println("Saldo restante: " + cartaoDeCredito.getSaldo());
    }

}