import java.util.ArrayList;
import java.util.Scanner;
public class eXercicios {
    //-----------------------------------------------------//
    //                   Variaveis                         //
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> gabarito = new ArrayList<Integer>();
    ArrayList<Integer> aposta = new ArrayList<Integer>();
    ArrayList<Integer> vetorD = new ArrayList<>();
    ArrayList<Integer> vetorD2 = new ArrayList<>();
    ArrayList<Integer> arrayA = new ArrayList<>();
    ArrayList<Integer> arrayB = new ArrayList<>();
    ArrayList<String> nomes = new ArrayList<>();
    ArrayList<Double> medias = new ArrayList<>();
    ArrayList<Integer> vetor = new ArrayList<>();
    int maiorValor = 0;
    int menorValor = 0;
    int posicaoMaior = 0;
    int posicaoMenor = 0;
    String alunoMaioMedia = "";
    double maiorMedia = -1;
    int opcao = 0;

    int num = 0;

    int i = 0;

    //-----------------------------------------------------//

    void text(){
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("--------------------------------------------------");
        System.out.println("1 - Exercício 1");
        System.out.println("2 - Exercício 2");
        System.out.println("3 - Exercício 3");
        System.out.println("4 - Exercício 4");
        System.out.println("5 - Exercício 5");
        System.out.println("0 - Finalizar o programa");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
    }

    void menu(){
        text();
        opcao = scan.nextInt();

        if (opcao == 1){
            exe01();
        }
        else if (opcao == 2){
            exe02();
        }
        else if (opcao == 3){
            exe03();
        }
        else if (opcao == 4){
            exe04();
        }
        else if (opcao == 5){
            exe05();
        }
        else if (opcao == 0){
            System.out.println("--------------------------------------------------");
            System.out.println("Sou o Vítor Henrique");
            System.out.println("Matricula: 202312227");
            System.out.println("--------------------------------------------------");
            System.out.println("Obrigado por utilzar o programa :) !!");
            System.out.println("--------------------------------------------------");
            System.exit(0);
        }
        else {
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            menu();
        }

    }


    void exe01(){
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao jogo do bixo 2.0");
        System.out.println("--------------------------------------------------");
        System.out.println("1 - Insirir os números da loto");
        System.out.println("2 - Insirir os números da loto");
        System.out.println("0 - Voltar ao menu");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
        opcao = scan.nextInt();

        // Insirir os números da loto
        if (opcao ==  1){
            i = 1;
            System.out.println("--------------------------------------------------");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Insirir os números da loto");
            System.out.println("0 - Voltar ao menu");
            System.out.println("--------------------------------------------------");
            System.out.print("Digite aqui: ");
            opcao = scan.nextInt();
            // Insirir os números da loto
            if (opcao == 1){
                if (gabarito.size() == 5){
                    i = 4;
                    while (i > 0){
                        gabarito.remove(i);
                        i--;
                    }
                    gabarito.remove(0);
                }
                for (; i < 6; i++){
                    System.out.print("Digite o " +i+ "º número: ");
                    num = scan.nextInt();
                    gabarito.add(num);
                }
                System.out.println("--------------------------------------------------");
                System.out.println("Esse é o seu gabarito de aposta: " +gabarito);
                System.out.print("0 - Voltar ao menu: ");
                Integer nulo = scan.nextInt();
                System.out.println("--------------------------------------------------");
                exe01();
            }

            // Voltar ao menu
            else if (opcao == 0) {
                System.out.println("Voltando ao menu...");
                exe01();
            }
        }

        // Insirir os números da loto
        else if (opcao == 2) {
            System.out.println("--------------------------------------------------");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("--------------------------------------------------");
            System.out.println("1 - Apostar os números");
            System.out.println("0 - Voltar ao menu");
            System.out.println("--------------------------------------------------");
            System.out.print("Digite aqui: ");
            opcao = scan.nextInt();
            // Apostar os números
            if (opcao == 1){
                System.out.println("Digite os números da loto:");
                i = 9;
                if (aposta.size() == 10){
                    while (i > 0){
                        aposta.remove(i);
                        i--;
                    }
                    aposta.remove(0);
                }
                i = 1;
                for (; i < 11; i++){
                    System.out.print("Digite o " +i+ "º número: ");
                    num = scan.nextInt();
                    aposta.add(num);
                }
                i = 0;
                for (int element : aposta){
                    if (gabarito.contains(element)){
                        i++;
                    }
                }
                if (i == 5){
                    System.out.println("--------------------------------------------------");
                    System.out.println("Você acertou " +i+ " números");
                    System.out.println("Parabens você ganhou a loto!");
                    System.out.println("--------------------------------------------------");
                }
                else {
                    System.out.println("--------------------------------------------------");
                    System.out.println("Você acertou " +i+ " números");
                    System.out.println("Desculpa mas não foi dessa vez");
                    System.out.println("--------------------------------------------------");
                }
                System.out.println("--------------------------------------------------");
                System.out.println("Essa foi a sua cartela de de aposta: " +aposta);
                System.out.print("0 - Voltar ao menu: ");
                Integer nulo = scan.nextInt();
                System.out.println("--------------------------------------------------");
                exe01();
            }
            // Voltar ao menu
            else if (opcao == 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("Voltando ao menu...");
                System.out.println("--------------------------------------------------");
                exe01();
            }
        }

        // Voltar ao menu
        else if (opcao == 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Voltando ao menu...");
            System.out.println("--------------------------------------------------");
            menu();
        }

        // Opção errada
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            System.out.println("--------------------------------------------------");
            menu();
        }
    }
    void exe02(){
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao removedor de números negativos/nulos: ");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Digitar os números");
        System.out.println("2 - Imprimir");
        System.out.println("0 - Voltar ao menu");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
        opcao = scan.nextInt();

        // Digitar os números
        if (opcao == 1){
            System.out.println("--------------------------------------------------");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Digitar os números");
            System.out.println("0 - Voltar ao menu");
            System.out.println("--------------------------------------------------");
            System.out.print("Digite aqui: ");

            // Digitar os números
            if (opcao == 1){

                System.out.println("Digite os 10 elementos negativos/nulos para o array D:");

                if (vetorD.size() != 0 & vetorD2.size() != 0){
                    while (i > 0){
                        vetorD.remove(i);
                        vetorD2.remove(i);
                        i--;
                    }
                    vetorD.remove(0);
                    vetorD2.remove(0);
                }
                for (int i = 1; i < 11; i++) {
                    System.out.print("Digite o " +i+ "º Valor: ");
                    vetorD.add(scan.nextInt());
                }


                for (Integer elemento : vetorD) {
                    if (elemento > 0) {
                        vetorD2.add(elemento);
                    }
                }

                System.out.println("--------------------------------------------------");
                System.out.print("0 - Voltar ao menu: ");
                Integer nulo = scan.nextInt();
                System.out.println("--------------------------------------------------");
                exe02();
            }

            // Voltar ao menu
            else if (opcao == 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("Voltando ao menu...");
                System.out.println("--------------------------------------------------");
                menu();
            }

            // Opção errada
            else {
                System.out.println("--------------------------------------------------");
                System.out.println("Digite uma opção valida!");
                System.out.println("                        ");
                System.out.println("--------------------------------------------------");
                menu();

            }

        }


        // Imprimir
        else if (opcao == 2){
            System.out.println("--------------------------------------------------");
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("1 - Mostrar os vetores");
            System.out.println("0 - Voltar ao menu");
            System.out.println("--------------------------------------------------");
            System.out.print("Digite aqui: ");
            opcao = scan.nextInt();

            // Mostrar os vetores
            if (opcao == 1){
                System.out.println("--------------------------------------------------");
                System.out.println("Vetor com numeros negativos: " +vetorD);
                System.out.println("Vetor sem numeros negativos: " +vetorD2);
                System.out.println("--------------------------------------------------");
                System.out.println("   ");
                System.out.println("--------------------------------------------------");
                System.out.print("0 - Voltar ao menu: ");
                Integer nulo = scan.nextInt();
                System.out.println("--------------------------------------------------");
                exe02();
            }

            // Voltar ao menu
            else if (opcao == 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("Voltando ao menu...");
                System.out.println("--------------------------------------------------");
                menu();
            }

            // Opção errada
            else {
                System.out.println("--------------------------------------------------");
                System.out.println("Digite uma opção valida!");
                System.out.println("                        ");
                System.out.println("--------------------------------------------------");
                menu();

            }

        }

        // Voltar ao menu
        else if (opcao == 0) {
                System.out.println("--------------------------------------------------");
                System.out.println("Voltando ao menu...");
                System.out.println("--------------------------------------------------");
                menu();
        }

        // Opção errada
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            System.out.println("--------------------------------------------------");
            menu();

        }
    }
    void exe03(){
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao inverter array|yarra: ");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Digitar os números para inverter");
        System.out.println("2 - Imprimir os dois arrays (A e B)");
        System.out.println("0 - Voltar ao menu");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
        opcao = scan.nextInt();

        // Digitar os números para inverter
        if (opcao == 1){
            System.out.println("Digite 5 números inteiros:");
            if (arrayA.size() != 0 & arrayB.size() != 0){
                while (i > 0){
                    arrayA.remove(i);
                    arrayB.remove(i);
                    i--;
                }
                arrayA.remove(0);
                arrayB.remove(0);
            }
            for (int i = 1; i < 6; i++) {
                System.out.print("Digite o " +i+ "º número: ");
                arrayA.add(scan.nextInt());
            }

            for (int i = arrayA.size() - 1; i >= 0; i--) {
                arrayB.add(arrayA.get(i));
            }
            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe03();
        }

        // Imprimir os dois arrays (A e B)
        else if (opcao == 2){
            System.out.println("--------------------------------------------------");
            System.out.println("Vetor original: " +arrayA);
            System.out.println("Vetor invertido: " +arrayB);
            System.out.println("--------------------------------------------------");
            System.out.println("   ");
            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe03();
        }

        // Voltar ao menu
        else if (opcao == 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Voltando ao menu...");
            System.out.println("--------------------------------------------------");
            menu();
        }

        // Opção errada
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            System.out.println("--------------------------------------------------");
            menu();

        }
    }
    void exe04(){
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao inverter array|yarra: ");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Digitar o nome e media dos alunos");
        System.out.println("2 - Imprimir as notas dos alunos");
        System.out.println("0 - Voltar ao menu");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
        opcao = scan.nextInt();

        // Digitar os números para inverter
        if (opcao == 1){
            if (nomes.size() != 0 & medias.size() != 0){
                while (i > 0){
                    nomes.remove(i);
                    medias.remove(i);
                    i--;
                }
                nomes.remove(0);
                medias.remove(0);
            }
            for (int i = 1; i < 8; i++) {
                System.out.print("Digite o nome do aluno " + i + "º : ");
                String nome = scan.next();
                nomes.add(nome);
            }

            for (int i = 1; i < 8; i++) {
                System.out.print("Digite a média final do aluno " + i + "º : ");
                double media = scan.nextDouble();
                medias.add(media);
            }

            for (int i = 0; i < 7; i++) {
                if (medias.get(i) > maiorMedia) {
                    alunoMaioMedia = nomes.get(i);
                    maiorMedia = medias.get(i);
                }
            }

            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe04();
        }

        // Imprimir as notas dos alunos
        else if (opcao == 2){

            System.out.println("O aluno com a maior média é: " + alunoMaioMedia+" com a média de: "+ maiorMedia);

            System.out.println("Nota necessária para aprovação no exame final:");
            for (int i = 0; i < 7; i++) {
                if (medias.get(i) < 7) {
                    double notaNecessaria = 7 - medias.get(i);
                    System.out.println(nomes.get(i) + ": " + notaNecessaria);
                }
            }
            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe04();
        }

        // Voltar ao menu
        else if (opcao == 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Voltando ao menu...");
            System.out.println("--------------------------------------------------");
            menu();
        }

        // Opção errada
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            System.out.println("--------------------------------------------------");
            menu();

        }
    }
    void exe05(){
        System.out.println("--------------------------------------------------");
        System.out.println("Bem vindo ao inverter array|yarra: ");
        System.out.println("--------------------------------------------------");
        System.out.println("Escolha uma das opções abaixo: ");
        System.out.println("1 - Digitar os números");
        System.out.println("2 - Imprimir o maior e menor número");
        System.out.println("0 - Voltar ao menu");
        System.out.println("--------------------------------------------------");
        System.out.print("Digite aqui: ");
        opcao = scan.nextInt();

        // Digitar os números
        if (opcao == 1){
            if (vetor.size() != 0){
                while (i > 0){
                    vetor.remove(i);
                    i--;
                }
                vetor.remove(0);
            }
            for (int i = 1; i < 21; i++) {
                System.out.print("Digite o valor da posição " +i+ "º : ");
                int valor = scan.nextInt();
                vetor.add(valor);
            }

            /*int maiorValor = vetor.get(0);
            int menorValor = vetor.get(0);*/

            for (int i = 0; i < vetor.size(); i++) {
                int valorAtual = vetor.get(i);

                if (valorAtual > maiorValor) {
                    maiorValor = valorAtual;
                    posicaoMaior = i;
                }

            }
            for (int i = 0; i < vetor.size(); i++) {
                int valorAtual = vetor.get(i);
                if (valorAtual > menorValor & valorAtual < maiorValor) {
                    if (menorValor <= 0){
                        menorValor = valorAtual;
                        posicaoMenor = i;
                    }
                }
            }

            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe05();
        }

        // Imprimir o maior e menor número
        else if (opcao == 2){
            System.out.println("--------------------------------------------------");
            System.out.println("Maior valor: " +maiorValor+ " na posição: " +posicaoMaior);
            System.out.println("Menor valor: " +menorValor+ " na posição: " +posicaoMenor);
            System.out.println("--------------------------------------------------");
            System.out.println("   ");
            System.out.println("--------------------------------------------------");
            System.out.print("0 - Voltar ao menu: ");
            Integer nulo = scan.nextInt();
            System.out.println("--------------------------------------------------");
            exe05();
        }

        // Voltar ao menu
        else if (opcao == 0) {
            System.out.println("--------------------------------------------------");
            System.out.println("Voltando ao menu...");
            System.out.println("--------------------------------------------------");
            menu();
        }

        // Opção errada
        else {
            System.out.println("--------------------------------------------------");
            System.out.println("Digite uma opção valida!");
            System.out.println("                        ");
            System.out.println("--------------------------------------------------");
            menu();

        }
    }


}
