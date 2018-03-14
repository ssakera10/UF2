package com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


public class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().printDiamond('m');
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */
        return false;
    }

    boolean isPangram(String text){
        for (int a=0; a<alphabet.length; a++) {
            boolean encontrada = false;

            for (int i = 0; i < text.length(); i++) {
                if (alphabet[a] == text.charAt(i)) {
                    encontrada = true;
                }
            }package com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


public class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().exercices();
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */

        return false;
    }

    boolean isPangram(String text){
        /* Un pangrama es una oración que usa todas las letras del alfabeto al menos una vez. */
        return false;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */

        String letra;
        for (int letra=0; letra==alphabet.length(); letra++) {
            return false;
        }

    boolean isArmstrong(int number) {
        /* Un número de Armstrong es un número que es la suma de sus propios dígitos,
        cada uno elevado a la potencia de la cantidad de dígitos.*/
        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
       int puntos = 0;
    word=word.toLowerCase();
       for (int i = 0; i<word.length(); i++){
          if (word.charAt(i) == 'a' || word.charAt(i)== 'e' || word.charAt(i)== 'i' || word.charAt(i)== 'o' || word.charAt(i)== 'u' || word.charAt(i)== 'l' || word.charAt(i)== 'n'|| word.charAt(i)== 'r'|| word.charAt(i)== 's' || word.charAt(i)== 't') {
              puntos += 1;

          } else if (word.charAt(i) == 'd' || word.charAt(i)== 'g') {
              puntos += 2;

          }else if (word.charAt(i) == 'b' || word.charAt(i)== 'c'|| word.charAt(i)== 'm'|| word.charAt(i)== 'p') {
              puntos += 3;

          }else if (word.charAt(i) == 'f' || word.charAt(i)== 'h'|| word.charAt(i)== 'v'|| word.charAt(i)== 'w'|| word.charAt(i)== 'y') {
              puntos += 4;

          }else if (word.charAt(i) == 'k' ) {
              puntos += 5;

          }else if (word.charAt(i) == 'j' || word.charAt(i)== 'x') {
              puntos += 8;

          }else if (word.charAt(i) == 'q' || word.charAt(i)== 'z') {
              puntos += 10;

        return puntos;
    }

    String getProverb(String[]Object words;
        words) {
        }
        }
        String proverb = "";

        Object words;
        for (int i = 0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {
package com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


public class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().exercices();
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */
        return false;
    }

    boolean isPangram(String text){
        /* Un pangrama es una oración que usa todas las letras del alfabeto al menos una vez. */
        return false;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */
        return false;
    }

    boolean isArmstrong(int number) {
        /* Un número de Armstrong es un número que es la suma de sus propios dígitos,
        cada uno elevado a la potencia de la cantidad de dígitos.*/
        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
        return 0;
    }

    String getProverb(String[] words) {
        String proverb = "";

        for (int i=0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {

        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        /* Las filas se convierten en columnas, y las columnas se convierten en filas */
        return new int[][]{{}};
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la ipackage com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


public class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().exercices();
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */
        return false;
    }

    boolean isPangram(String text){
        /* Un pangrama es una oración que usa todas las letras del alfabeto al menos una vez. */
        return false;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */
        return false;
    }

    boolean isArmstrong(int number) {
        /* Un número de Armstrong es un número que es la suma de sus propios dígitos,
        cada uno elevado a la potencia de la cantidad de dígitos.*/
        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
        return 0;
    }

    String getProverb(String[] words) {
        String proverb = "";

        for (int i=0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {

        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        /* Las filas se convierten en columnas, y las columnas se convierten en filas */
        return new int[][]{{}};
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la izquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        return "";
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('e'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERpackage com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().exercices();
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */
        return false;
    }

    boolean isPangram(String text){
        /* Un pangrama es una oración que usa todas las letras del alfabeto al menos una vez. */
        return false;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */
        return false;
    }

    boolean isArmstrong(int number) {
        /* Un número de Armstrong es un número que es la suma de sus propios dígitos,
        cada uno elevado a la potencia de la cantidad de dígitos.*/
        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
        return 0;
    }

    String getProverb(String[] words) {
        String proverb = "";

        for (int i=0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {

        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        /* Las filas se convierten en columnas, y las columnas se convierten en filas */
        return new int[][]{{}};
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la izquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        return "";
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('e'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERpackage com.company;

/* http://exercism.io/exercises/java/ */

import java.util.Arrays;


public class Main {

    char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

    public static void main(String[] args) {
        new Main().exercices();
    }

    boolean isPalindrome(String text){
        /* Un palíndromo es una cadena que se lee igual hacia adelante y hacia detrás */
        return false;
    }

    boolean isPangram(String text){
        /* Un pangrama es una oración que usa todas las letras del alfabeto al menos una vez. */
        return false;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */
        return false;
    }

    boolean isArmstrong(int number) {
        /* Un número de Armstrong es un número que es la suma de sus propios dígitos,
        cada uno elevado a la potencia de la cantidad de dígitos.*/
        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
        return 0;
    }

    String getProverb(String[] words) {
        String proverb = "";

        for (int i=0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {

        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        /* Las filas se convierten en columnas, y las columnas se convierten en filas */
        return new int[][]{{}};
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la izquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        return "";
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('e'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}ROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}ROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}zquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        return "";
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('e'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}
        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        /* Las filas se convierten en columnas, y las columnas se convierten en filas */
        return new int[][]{{}};
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la izquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        return "";
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('e'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}

            if (!encontrada) {
                return false;
            }
        }

        return true;
    }

    boolean isHeterogram(String text) {
        /* Un heterograma es una cadena en la que ninguna letra está más de una vez */
        return false;
    }

    boolean isLipogram(String text, char letter){
        /* Un lipograma es una cadena en el que se omite una letra */
        return false;
    }

    boolean isArmstrong(int number) {
        int resultado = 0;
        int digitos=0;

        for(digitos=1; number/(int) Math.pow(10,digitos)>0; digitos++);

        for(int i=0; i<digitos; i++){
            resultado += Math.pow(number/(int)Math.pow(10,i)%10, digitos);
        }

        if(resultado == number) return  true;

        return false;
    }

    String getRNATranscription(String DNA){
        /* Dada una cadena de ADN, su cadena de ARN transcrita se forma reemplazando cada nucleótido con su complemento:
        G -> C
        C -> G
        T -> A
        A -> U
        */
        return "";
    }

    int getHammingDistance(String string1, String string2) {
        /* La distancia Hamming es el numero de caracteres diferentes entre una cadena y otra*/
        return 0;
    }

    String getAcronym(String text) {
        return "";
    }

    int getScrabbleScore(String word) {
        /* Dada una palabra, calcula el puntaje del scrabble para esa palabra.
        Letter                          Value
        A, E, I, O, U, L, N, R, S, T       1
        D, G                               2
        B, C, M, P                         3
        F, H, V, W, Y                      4
        K                                  5
        J, X                               8
        Q, Z                               10
        */
        return 0;
    }

    String getProverb(String[] words) {
        String proverb = "";

        for (int i=0; i<words.length-1; i++) {
            proverb += "For want of a " + words[i] + " the " + words[i+1] + " was lost.\n";
        }

        proverb += "And all for the want of a " + words[0] + ".";

        return proverb;
    }

    boolean isValidLuhn(long number){
        /*
        Ejemplo: 4539 1488 0343 6467
        El primer paso del algoritmo de Luhn es duplicar cada segundo dígito, comenzando desde la derecha.
        Estaremos duplicando:
        4_3_ 1_8_ 0_4_ 6_6_
        Si duplicar el número resulta en un número mayor que 9, resta 9 del producto.
        Los resultados de nuestra duplicación:
        8569 2478 0383 3437
        Luego sume todos los dígitos:
        8 + 5 + 6 + 9 + 2 + 4 + 7 + 8 + 0 + 3 + 8 + 3 + 3 + 4 + 3 + 7 = 80
        Si la suma es divisible por 10, el número es válido. Este numero es valido!
        */
        return false;
    }

    String atbashCipher(String text) {
        /* El cifrado de Atbash es un cifrado de sustitución simple que se basa en
        transponer todas las letras del alfabeto de modo que el alfabeto resultante esté al revés.
        La primera letra se reemplaza con la última letra, la segunda con la penúltima, y así sucesivamente.
           Plain:  abcdefghijklmnopqrstuvwxyz
           Cipher: zyxwvutsrqponmlkjihgfedcba
        */
        return "";
    }

    String rotCipher(String text, int key) {

        String cifrado = "";

        for (int l = 0; l<text.length(); l++) {
            char letra = text.charAt(l);
            if (letra == ' ') {
                cifrado += ' ';
            } else {
                int posicionLetra = 0;
                for (int i = 0; i < alphabet.length; i++) {
                    if (alphabet[i] == letra) {
                        posicionLetra = i;
                        break;
                    }
                }
                cifrado += alphabet[(posicionLetra + key) % 26];
            }
        }

        return cifrado;
    }

    String squareCipher(String text) {
        /* El texto original debe organizarse en un rectángulo.
        El tamaño del rectángulo ( Filas x Columnas) debe decidirse por la longitud del mensaje,
        de modo que , [Columnas >= Filas] y [Columnas - Filas <= 1]
        El mensaje codificado se obtiene leyendo las columnas que van de izquierda a derecha. */
        return "";
    }

    int[][] transposeMatrix(int[][] matrix) {
        int filas = matrix.length;
        int columnas = matrix[0].length;

        int[][] resultado = new int[columnas][filas];


        for (int j=0; j<filas; j++) {
            for (int i = 0; i<columnas; i++) {
                resultado[i][j] = matrix[j][i];
            }
        }


        return resultado;
    }

    int[] robotSimulator(String instructions) {
        /* Los robots tienen tres movimientos posibles:
            R = girar a la derecha
            L = girar a la izquierda
            A = avanzar
            Los robots se colocan inicalmente en la posición {0,0} en una dirección Norte
            Luego, el robot recibe una serie de instrucciones, y realiza dichos movimientos
            Se retorna la posición final del robot.
        */

        return new int[]{0,0};
    }

    boolean isSublist(int[] a, int[] b) {
        /* Determinar si 'a' está dentro de 'b' */

        return false;
    }

    String printDiamond(char letter) {
        String diamond = "";

        int posicion = 0;
        for(; alphabet[posicion] != letter; posicion++);

        for(int fila = 0; fila < posicion*2+1; fila++) {
            for( int columna=0; columna < posicion*2+1; columna++) {
                if (columna+fila == posicion || columna-fila == posicion) {
                    diamond += alphabet[fila];
                } else if (fila-columna == posicion || columna+fila == posicion*3) {
                    diamond += alphabet[posicion*2-fila];
                } else {
                    diamond += '.';
                }
            }
            diamond += "\n";
        }


        System.out.println(diamond);
        return diamond;
    }

    void exercices() {
        test("isPalindrome(\"amanaplanacanalpanama\")", isPalindrome("amanaplanacanalpanama"), true);
        test("isPangram(\"the quick brown fox jumps over the lazy dog\")", isPangram("the quick brown fox jumps over the lazy dog"), true);
        test("isHeterogram(\"the big dwarf only jumps.\")", isHeterogram("the big dwarf only jumps."), true);
        test("isLipogram(\"mary had a tiny lamb\", 'e')", isLipogram("mary had a tiny lamb", 'e'), true);
        test("isArmstrong(153)", isArmstrong(153), true);
        test("getRNATranscription(\"UGCACCAGAAUU\")", getRNATranscription("UGCACCAGAAUU"), "ACGTGGTCTTAA");
        test("getHammingDistance(\"Hamming\", \"Lemming\")", getHammingDistance("Hamming", "Lemming"), 2);
        test("getAcronym(\"Three Letter Acronym\")", getAcronym("Three Letter Acronym"), "TLA");
        test("getScrabbleScore(\"Java\")", getScrabbleScore("Java"), 8+1+4+1);
        test("getProverb(new String[] {\"nail\", \"shoe\", \"horse\", \"rider\", \"message\", \"battle\", \"kingdom\"})",
                getProverb(new String[] {"nail", "shoe", "horse", "rider", "message", "battle", "kingdom"}),
                "For want of a nail the shoe was lost.\n" +
                        "For want of a shoe the horse was lost.\n" +
                        "For want of a horse the rider was lost.\n" +
                        "For want of a rider the message was lost.\n" +
                        "For want of a message the battle was lost.\n" +
                        "For want of a battle the kingdom was lost.\n" +
                        "And all for the want of a nail.");
        test("isValidLuhn(4539_1488_0343_6467L)", isValidLuhn(4539_1488_0343_6467L), true);
        test("atbashCipher(\"the quick brown fox\")", atbashCipher("the quick brown fox"), "gsv jfrxp yildm ulc");
        test("rotCipher(\"the quick brown fox\", 13)", rotCipher("the quick brown fox", 13), "gur dhvpx oebja sbk");
        test("squareCipher(\"the quick brown fox\")", squareCipher("the quick brown fox"), "tub hirfecoo kwxq n ");
        test("transposeMatrix(new int[][] {{1,2,3}, {4,5,6}})", transposeMatrix(new int[][] {{1,2,3}, {4,5,6}}), new int[][] {{1,4},{2,5}, {3,6}});
        test("robotSimulator(\"RAALAAALALAA\")", robotSimulator("RAALAAALALAA"), new int[]{1,1});
        test("isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2})", isSublist(new int[]{1,1,2}, new int[]{0,1,1,1,2,1,2}), true);
        test("printDiamond('e')", printDiamond('c'),
                "....a....\n" +
                        "...b.b...\n" +
                        "..c...c..\n" +
                        ".d.....d.\n" +
                        "e.......e\n" +
                        ".d.....d.\n" +
                        "..c...c..\n" +
                        "...b.b...\n" +
                        "....a....\n");
    }

    <T> void test(String method, T result, T expected){
        String correct = "\033[1;91mERROR\033[0m";
        String stringResult = String.valueOf(result);
        String stringExpected = String.valueOf(expected);

        try {
            if (Arrays.deepEquals((int[][]) expected, (int[][]) result)){
                correct = "\033[1;92mOK\033[0m";
            }
            stringResult = Arrays.deepToString((int[][]) result);
            stringExpected = Arrays.deepToString((int[][]) expected);
        } catch (Exception e){
            try {
                if (Arrays.equals((int[]) expected, (int[]) result)){
                    correct = "\033[1;92mOK\033[0m";
                }
                stringResult = Arrays.toString((int[]) result);
                stringExpected = Arrays.toString((int[]) expected);
            } catch (Exception e2){
                if (expected.equals(result)) {
                    correct = "\033[1;92mOK\033[0m";
                }
            }
        }

        System.out.println(String.format("\033[104;97m%-24s\033[0m", method)
                + " " + correct
                + "\n\033[1mresult\033[0m:\n" + stringResult
                + "\n\033[1mexpected\033[0m:\n" + stringExpected
                + "\n" );
    }
}