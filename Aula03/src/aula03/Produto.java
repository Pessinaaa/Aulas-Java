package aula03;

public class Produto {
    String marca;
    String fabrica;
    String cod_barras;
    float preco;

    public Produto() {
    }
    
    public Produto(String marca, String fabrica, String cod_barras, float preco) {
        this.marca = marca;
        this.fabrica = fabrica;
        this.cod_barras = cod_barras;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getFabrica() {
        return fabrica;
    }

    public void setFabrica(String fabrica) {
        this.fabrica = fabrica;
    }

    public String getCod_barras() {
        return cod_barras;
    }

    public void setCod_barras(String cod_barras) {
        this.cod_barras = cod_barras;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    double numero(){
        double num = Math.random();
        return num;
    }
    
    void dobro(int n){
        int resp;
        resp = n * 2;
        System.out.println(resp);
    }
    
    int soma(int n, int m){
        int s;
        s = n + m;
        return s;
    }
}
