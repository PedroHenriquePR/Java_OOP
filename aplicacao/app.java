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

    }

    public static void menugeoespacial(){
        
    }
}

   