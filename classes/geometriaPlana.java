package classes;

public class geometriaPlana {

    public  void quadrado (double lado, double area, double perimetro){
        area = lado * lado;
        perimetro = lado * 4;
        System.out.println("A área do quadrado é: " + area);
    }

    public void triangulo (double base, double altura, double area, double perimetro){
        area = (base * altura) / 2;
        perimetro = base + (2 * Math.sqrt((base * base) + (altura * altura)));
        System.out.println("A área do triângulo é: " + area);
    }

    public void circunferencia (double raio, double area, double perimetro){
        area = Math.PI * raio * raio;
    }

}   