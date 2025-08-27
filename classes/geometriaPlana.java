package classes;

public class geometriaPlana {

    public double areaquadrado (double lado){
        return lado * lado; 
    }

    public double perimetroquadrado (double lado){
        return lado * 4;

    }

    public double areatriangulo (double base, double altura){
        return (base * altura) / 2;
    }

    public double perimetrotriangulo (double lado){
        return lado + lado + lado;
    }

    public double arearetangulo (double base, double altura){
        return base * altura;
    }

    public double perimetroretangulo (double base, double altura){
        return 2 * (base + altura);
    }

    public double areacircunferencia (double raio){
        return Math.PI * raio * raio;
    }

    public double comprimentocircunferencia (double raio){
        return 2 * Math.PI * raio;
    }

    public double areatrapezio (double basemaior, double basemenor, double altura){
        return ((basemaior + basemenor) * altura) / 2;
    }

     public double perimetrotrapezio (double lado1, double lado2, double lado3, double lado4){
        return lado1 + lado2 + lado3 + lado4;
    }

    public double arealosango (double diagonalmaior, double diagonalmenor){
        return (diagonalmenor * diagonalmaior)/ 2;
    }

    public double perimetrolosango (double lado){
        return lado * 4;
    }


    

    

}   