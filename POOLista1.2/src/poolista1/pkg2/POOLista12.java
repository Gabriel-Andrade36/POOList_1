package poolista1.pkg2;

import javax.swing.JOptionPane;


public class POOLista12 {

    public static void main(String[] args) {
 Aluno aluno = new Aluno();
    int opc=0;

while(opc!=3){
opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha:\n1- Criar pessoa\n2- Mostrar pessoa\n3- Sair"));

switch(opc){
    case 1:
         aluno.setRa(JOptionPane.showInputDialog(null,"Insira o RA(apenas digitos):"));
         aluno.setNome(JOptionPane.showInputDialog(null,"Insira o nome:"));
         aluno.setAc1(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a AC1(apenas números):")));
         aluno.setAc2(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a AC2(apenas números):")));
         aluno.setAg(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a AG(apenas números):")));
         aluno.setAf(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a AF(apenas números):")));
        
         break;
   
    case 2:JOptionPane.showMessageDialog(null,aluno.imprimir());break;
         
    case 3:break;   
          
    default: JOptionPane.showMessageDialog(null,"Opção incorrespondente.\nResumo: opção inserida é inválida","Erro",0);
    
    
    }
    
}
}}