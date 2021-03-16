
package poolista1.pkg2;

import javax.swing.JOptionPane;


public class Aluno {
private String ra;
private String nome;
private float ac1;
private float ac2;
private float ag;
private float af;



public float calcularMedia(){
float media = (this.ac1 * 0.15f) + (this.ac2 * 0.30f) + (ag * 0.10f) + (af * 0.45f);  
return media;
}
public String verificarAprovacao(){
float media = this.calcularMedia();
if(media>=5){
    return "Aprovado";
}else{
    return "Reprovado";    
}}
public String imprimir(){
return "RA: "+ra+"\nNome: "+nome+"\nAC1: "+ac1+"\nAC2 "+ ac2+"\nAG: " + ag + "\nAF: " + af + "\nSituação: " + this.verificarAprovacao();
}

public String getRa() {
    return ra;
}

public void setRa(String ra) {
    this.ra = ra;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public float getAc1() {
    return ac1;
}

public void setAc1(float ac1) {
    this.ac1 = ac1;
}

public float getAc2() {
    return ac2;
}

public void setAc2(float ac2) {
    this.ac2 = ac2;
}

public float getAg() {
    return ag;
}

public void setAg(float ag) {
    this.ag = ag;
}

public float getAf() {
    return af;
}

public void setAf(float af) {
    this.af = af;
}
}
