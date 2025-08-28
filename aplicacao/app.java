package aplicacao;
import classes.geometriaEspacial;
import classes.geometriaPlana;
import java.util.Scanner;

public class app {
    private static geometriaPlana geoplana = new geometriaPlana();
    private static geometriaEspacial geoespacial = new geometriaEspacial();
    private static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
      exibirMenu();
    }

    private static void exibirMenu(){
    while (true) { 
    System.out.println("Escolha quais operações fazer");
    System.out.println("1. Geometria plana");
    System.out.println("2. Geometria espacial");

    int opcao = ler.nextInt();
    
    switch (opcao) {
        case 1:
        menugeoplana();  
            break;
        case 2:
        menugeoespacial();
        default:
        System.out.println("Opção inválida");
             }
        }
    }

    public static void menugeoplana(){
        while(true) {
            System.out.println("Escolha uma forma para fazer a operação");
            System.out.println("1. Quadrado");
            System.out.println("2. Triângulo");
            System.out.println("3. Retângulo");
            System.out.println("4. Circunferência");
            System.out.println("5. Trapézio");
            System.out.println("6. Losango");
            System.out.println("0. Sair");
            int opcao = ler.nextInt();

            switch (opcao) {
                case 0:
                    return;
                case 1:
                    calcularquadrado();
                    break;
                case 2: 
                    calculartriangulo();
                    break;
                case 3:
                    calcularretangulo();
                    break;
                case 4: 
                    calcularcircunferencia();
                    break;
                case 5:
                    calculartrapezio();
                    break;
                case 6: 
                    calcularlosango();
                    break;
                default:
                    System.out.println("Erro");
            }

        }
    }

    public static void menugeoespacial(){
        while(true){
            System.out.println("Escolha uma forma para fazer a operação");
            System.out.println("1. Cubo");
            System.out.println("2. Esfera");
            System.out.println("3. Cone");
            System.out.println("4. Cilindro");
            System.out.println("5. Paralelepípedo");
            System.out.println("6. Pirâmide");
            System.out.println("0.Sair");

            int opcao = ler.nextInt();

            switch (opcao) {
                case 0 :
                    return;
                case 1:
                    calcularcubo();
                    break;
                case 2: 
                    calcularesfera();
                    break;
                case 3:
                    calcularcone();
                    break;
                case 4:
                    calcularcilindro();
                    break;
                case 5: 
                    calcularparalelepipedo();
                    break;
                case 6: 
                    calcularpiramide();
                    break;
                default:
                    System.out.println("Erro");
            }
        }
    }
    
    private static void calcularquadrado(){
        System.out.print("Digite a lado do quadrado: ");
        double lado = ler.nextDouble();
        
        System.out.println("Área: " + geoplana.areaquadrado(lado));
        System.out.println("Perímetro: " + geoplana.perimetroquadrado(lado));
    }

    private static void calculartriangulo(){
        System.out.print("Digite a base do triângulo: ");
        double base = ler.nextDouble();
        System.out.print("Digite a altura do triângulo: ");
        double altura = ler.nextDouble();
        System.out.print("Digite o lado do triângulo: ");
        double lado = ler.nextDouble();
        System.out.println("Área: " + geoplana.areatriangulo(base, altura));
        System.out.println("Perímetro: " + geoplana.perimetrotriangulo(lado));
    }

    private static void calcularretangulo(){
        System.out.print("Digite a base do retângulo: ");
        double base = ler.nextDouble();
        System.out.print("Digite a altura do retângulo: ");
        double altura = ler.nextDouble();
        System.out.println("Área: " + geoplana.arearetangulo(base, altura));
        System.out.println("Perímetro: " + geoplana.perimetroretangulo(base, altura));
    }

    private static void calcularcircunferencia(){
        System.out.print("Digite o raio da circunferência");
        double raio = ler.nextDouble();
        System.out.println("Área: " + geoplana.areacircunferencia(raio));
        System.out.println("Comprimento: " + geoplana.comprimentocircunferencia(raio));
    }

    private static void calculartrapezio(){
        System.out.print("Digite a base menor do trapézio: ");
        double basemenor = ler.nextDouble();
        System.out.print("Digite a base maior do trapézio: ");
        double basemaior  = ler.nextDouble();
        System.out.print("Digite a altura do trapézio: ");
        double altura = ler.nextDouble();
        System.out.print("Digite o lado1 do trapézio: ");
        double lado1 = ler.nextDouble();
        System.out.print("Digite o lado2 do trapézio: ");
        double lado2 = ler.nextDouble();
        System.out.print("Digite o lado3 do trapézio: ");
        double lado3 = ler.nextDouble();
        System.out.print("Digite o lado4 do trapézio: ");
        double lado4 = ler.nextDouble();
        System.out.println("Área: " + geoplana.areatrapezio(basemaior, basemenor, altura));
        System.out.println("Perímetro: " + geoplana.perimetrotrapezio(lado1, lado2, lado3, lado4));
    }

    private static void calcularlosango(){
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalmenor = ler.nextDouble();
        System.out.print("Digite a diagonal maior do losango: ");
        double digaonalmaior = ler.nextDouble();
        System.out.print("Digite o lado do losango: ");
        double lado = ler.nextDouble();
        System.out.println("Área: " + geoplana.arealosango(digaonalmaior, diagonalmenor));
        System.out.println("Perímetro: " +geoplana.perimetrolosango(lado));
    }

    private static void calcularcubo(){
        System.out.print("Digite a aresta do cubo: ");
        double aresta = ler.nextDouble();
        System.out.println("Volume: " + geoespacial.volumecubo(aresta));
        System.out.println("Área lateral: " + geoespacial.arealateralcubo(aresta));
        System.out.println("Área total: " + geoespacial.areatotalcubo(aresta));
    }

    private static void calcularesfera(){
        System.out.print("Digite o raio da esfera: ");
        double raio = ler.nextDouble();
        System.out.println("Área: " + geoespacial.areaesfera(raio));
        System.out.println("Volume: " + geoespacial.volumeesfera(raio));
    }
    
    private static void calcularcone(){
        System.out.print("Digite o raio do cone: ");
        double raio = ler.nextDouble();
        System.out.print("Digite a altura do cone: ");
        double altura = ler.nextDouble();
        System.out.print("Digite a geratriz do cone: ");
        double geratriz = ler.nextDouble();
        System.out.println("Volume: " + geoespacial.volumecone(raio, altura));
        System.out.println("Área lateral: " + geoespacial.arealateralcone(raio, geratriz));
        System.out.println("Base: " + geoespacial.basecone(raio));
    }

    private static void calcularcilindro(){
        System.out.print("Digite o raio do cilindro: ");
        double raio = ler.nextDouble();
        System.out.print("Digite a altura do cilindro: ");
        double altura = ler.nextDouble();
        System.out.println("Volume: " + geoespacial.volumecilindro(raio, altura));
        System.out.println("Área da base: " + geoespacial.areabasecilindro(raio));
        System.out.println("Área lateral: " + geoespacial.arealateralcilindro(raio, altura));
        System.out.println("Área total: " + geoespacial.areatotalcilindro(altura, raio));

    }

    private static void  calcularparalelepipedo(){
        System.out.print("Digite a largura do paralelepípedo: ");
        double largura = ler.nextDouble();
        System.out.print("Digite o comprimento do paralelepípedo: ");
        double comprimento = ler.nextDouble();
        System.out.print("Digite a altura do paralelepípedo: ");
        double altura = ler.nextDouble();
        System.out.println("Volume: " + geoespacial.areatotalparalelepípedo(largura, comprimento, altura));
        System.out.println("Área total: " + geoespacial.areatotalparalelepípedo(largura, comprimento, altura));

    }
    
    private static void calcularpiramide(){
        System.out.print("Digite a área da base da pirâmide: ");
        double areabase = ler.nextDouble();
        System.out.print("Digite a área lateral da pirâmide: ");
        double arealateral = ler.nextDouble();
        System.out.print("Digite a altura da pirâmide: ");
        double altura = ler.nextDouble();
        System.out.println("Volume: " +geoespacial.volumepiramide(areabase, altura));
        System.out.println("Área: " + geoespacial.areapiramide(areabase, arealateral));
    }

    
    
}