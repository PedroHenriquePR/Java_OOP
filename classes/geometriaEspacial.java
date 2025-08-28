package classes;

public class geometriaEspacial {

    //cubo
    
    public double volumecubo(double aresta){
            return aresta * aresta * aresta;
    }

    public double arealateralcubo(double aresta){
            return 4 * (aresta * aresta);
    }

    public double areatotalcubo(double aresta){
            return 6 * (aresta * aresta);
    }

    //esfera

    public double volumeesfera(double raio){
        return (4/3) * Math.PI * (raio * raio * raio);
    }

    public double areaesfera(double raio){
        return 4 * Math.PI * (raio * raio);
    }

    //cone

    public double volumecone(double raio, double altura){
        return Math.PI * (raio * raio) * altura / 3;
    }

    public double arealateralcone(double raio, double geratriz){
        return Math.PI * raio * geratriz;
    }

    public double basecone(double raio){
        return Math.PI * (raio * raio);
    }

    //cilindro

    public double volumecilindro(double raio, double altura){
        return Math.PI * (raio * raio) * altura;
    }

    public double areabasecilindro(double raio){
        return Math.PI * (raio * raio);
    }

    public double arealateralcilindro(double raio, double altura){
        return 2 * Math.PI * raio * altura;
    }

    public double areatotalcilindro(double arealateralcilindro, double areabasecilindro){
        return 2 * areabasecilindro + arealateralcilindro;
    }

    //paralelepípedo

    public double volumeparalelepípedo(double largura, double comprimento, double altura){
        return largura * comprimento * altura;
    }

    public double areatotalparalelepípedo(double largura, double comprimento, double altura){
        return 2 * (largura * comprimento + largura * altura + comprimento * altura);
    }

    //piramide

    public double volumepiramide(double areabase, double altura){
        return areabase * altura / 3;
    }

    public double areapiramide(double areabase, double arealateral){
        return areabase + arealateral;
    }

             




}