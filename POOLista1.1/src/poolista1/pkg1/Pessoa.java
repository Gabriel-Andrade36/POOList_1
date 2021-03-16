package poolista1.pkg1;

import javax.swing.JOptionPane;


public class Pessoa {
    private String cpf;
    private String nome;
    private char sexo = 'i';
    private int idade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
      sexo = Character.toUpperCase(sexo);
        System.out.println(sexo);
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
public void imprimir(){
   String sexoS;
   if(getSexo()==('M')){
   sexoS="Masculino";
   }else if(getSexo()==('F')){
   sexoS="Feminino";    
   }else{
   sexoS="Indefinido";    
   }
JOptionPane.showMessageDialog(null,"CPF: "+getCpf()+"\nNome: "+getNome()+"\nSexo: "+sexoS+"\nIdade: "+getIdade(),"Status",01);
}   
}
    