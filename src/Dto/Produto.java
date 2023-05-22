package Dto;
public class Produto {
    private String nome;
    private String fabricante;
    private String concentração;
    private double preco;
    private int qtd;
    
     public Produto() {

    }
    public Produto(String nome, String fabricante, String concentração, double preco, int qtd) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.concentração = concentração;
        this.preco = preco;
        this.qtd = qtd;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getConcentração() {
        return concentração;
    }

    public void setConcentração(String concentração) {
        this.concentração = concentração;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
       @Override
    public String toString() {
        return getNome(); //To change body of generated methods, choose Tools | Templates.
    }
    
}