package com.angelv.conversormoneda;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();

        try (Scanner scanner = new Scanner(System.in)) {
            String menu = """
                    ******************************************************************
                    Por favor seleccione una opción de conversion de moneda
                    1.- ARS - Peso argentino  -->  BRL - Real brasileño
                    2.- ARS - Peso argentino  -->  COP - Peso colombiano
                    3.- ARS - Peso argentino  -->  USD - Dólar estadounidense
                    4.- ARS - Peso argentino  -->  BOB - Boliviano boliviano
                    5.- ARS - Peso argentino  -->  CRC - Colón costarricense

                    6.- BRL - Real brasileño  -->  ARS - Peso argentino
                    7.- BRL - Real brasileño  -->  COP - Peso colombiano
                    8.- BRL - Real brasileño  -->  USD - Dólar estadounidense
                    9.- BRL - Real brasileño  -->  BOB - Boliviano boliviano
                    10.- BRL - Real brasileño  -->  CRC - Colón costarricense

                    11.- COP - Peso colombiano  -->  USD - Dólar estadounidense
                    12.- COP - Peso colombiano  -->  BRL - Real brasileño
                    13.- COP - Peso colombiano  -->  ARS - Peso argentino
                    14.- COP - Peso colombiano  -->  BOB - Boliviano boliviano
                    15.- COP - Peso colombiano  -->  CRC - Colón costarricense

                    16.- USD - Dólar estadounidense  -->  COP - Peso colombiano
                    17.- USD - Dólar estadounidense  -->  BRL - Real brasileño
                    18.- USD - Dólar estadounidense  -->  ARS - Peso argentino
                    19.- USD - Dólar estadounidense  -->  BOB - Boliviano boliviano
                    20.- USD - Dólar estadounidense  -->  CRC - Colón costarricense

                    21.- BOB - Boliviano boliviano  -->  ARS - Peso argentino
                    22.- BOB - Boliviano boliviano  -->  BRL - Real brasileño
                    23.- BOB - Boliviano boliviano  -->  COP - Peso colombiano
                    24.- BOB - Boliviano boliviano  -->  USD - Dólar estadounidense
                    25.- BOB - Boliviano boliviano  -->  CRC - Colón costarricense

                    26.- CRC - Colón costarricense  -->  ARS - Peso argentino
                    27.- CRC - Colón costarricense  -->  BRL - Real brasileño
                    28.- CRC - Colón costarricense  -->  COP - Peso colombiano
                    29.- CRC - Colón costarricense  -->  USD - Dólar estadounidense
                    30.- CRC - Colón costarricense  -->  BOB - Boliviano boliviano

                    31.- Salir
                    ******************************************************************
                    """;
            int seleccion = 0;
            while (seleccion != 31) {
                System.out.println(menu);
                seleccion = scanner.nextInt();

                switch (seleccion) {
                    case 1 -> handleConversion("ARS", "BRL", scanner, consulta);
                    case 2 -> handleConversion("ARS", "COP", scanner, consulta);
                    case 3 -> handleConversion("ARS", "USD", scanner, consulta);
                    case 4 -> handleConversion("ARS", "BOB", scanner, consulta);
                    case 5 -> handleConversion("ARS", "CRC", scanner, consulta);
                    case 6 -> handleConversion("BRL", "ARS", scanner, consulta);
                    case 7 -> handleConversion("BRL", "COP", scanner, consulta);
                    case 8 -> handleConversion("BRL", "USD", scanner, consulta);
                    case 9 -> handleConversion("BRL", "BOB", scanner, consulta);
                    case 10 -> handleConversion("BRL", "CRC", scanner, consulta);
                    case 11 -> handleConversion("COP", "USD", scanner, consulta);
                    case 12 -> handleConversion("COP", "BRL", scanner, consulta);
                    case 13 -> handleConversion("COP", "ARS", scanner, consulta);
                    case 14 -> handleConversion("COP", "BOB", scanner, consulta);
                    case 15 -> handleConversion("COP", "CRC", scanner, consulta);
                    case 16 -> handleConversion("USD", "COP", scanner, consulta);
                    case 17 -> handleConversion("USD", "BRL", scanner, consulta);
                    case 18 -> handleConversion("USD", "ARS", scanner, consulta);
                    case 19 -> handleConversion("USD", "BOB", scanner, consulta);
                    case 20 -> handleConversion("USD", "CRC", scanner, consulta);
                    case 21 -> handleConversion("BOB", "ARS", scanner, consulta);
                    case 22 -> handleConversion("BOB", "BRL", scanner, consulta);
                    case 23 -> handleConversion("BOB", "COP", scanner, consulta);
                    case 24 -> handleConversion("BOB", "USD", scanner, consulta);
                    case 25 -> handleConversion("BOB", "CRC", scanner, consulta);
                    case 26 -> handleConversion("CRC", "ARS", scanner, consulta);
                    case 27 -> handleConversion("CRC", "BRL", scanner, consulta);
                    case 28 -> handleConversion("CRC", "COP", scanner, consulta);
                    case 29 -> handleConversion("CRC", "USD", scanner, consulta);
                    case 30 -> handleConversion("CRC", "BOB", scanner, consulta);
                    default -> System.out.println("\n¡Hasta luego!");
                }
            }
        }
    }

    private static void handleConversion(String moneda_base, String moneda_destino, Scanner scanner, ConsultaConversion consulta) {
        System.out.println("Digite la cantidad que desea convertir: ");
        double cantidad = scanner.nextDouble();
        Moneda moneda = consulta.realizaConversion(moneda_base, moneda_destino, cantidad);
        System.out.println("El resultado de la conversión es: " + moneda.conversion_result() + " " + moneda_destino);
    }
}