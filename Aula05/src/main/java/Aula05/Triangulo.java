package Aula05;

public class Triangulo {
    private double altura, base;

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public double calculaArea(double base, double altura){
        double area = base * altura / 2;
        return area;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "altura=" + altura + ", base=" + base + '}';
    }
}
