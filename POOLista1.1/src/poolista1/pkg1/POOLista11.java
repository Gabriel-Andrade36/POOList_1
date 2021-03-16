
package poolista1.pkg1;
import javax.swing.JOptionPane;

public class POOLista11 {

   
    public static void main(String[] args) {
    
Pessoa pessoa = new Pessoa();    
int opc=0;

while(opc!=3){
opc=Integer.parseInt(JOptionPane.showInputDialog(null,"Escolha:\n1- Criar pessoa\n2- Mostrar pessoa\n3- Sair"));

switch(opc){
    case 1:
         pessoa.setCpf(JOptionPane.showInputDialog(null,"Insira o CPF(apenas digitos):"));
         pessoa.setNome(JOptionPane.showInputDialog(null,"Insira o nome:"));
         pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null,"Insira a idade(apenas números):")));
         pessoa.setSexo(JOptionPane.showInputDialog(null,"Insira o sexo(masculino ou feminino):").charAt(0));
         break;
   
    case 2:pessoa.imprimir();break;
         
    case 3:break;   
          
    default: JOptionPane.showMessageDialog(null,"Opção incorrespondente.\nResumo: opção inserida é inválida","Erro",0);
         
}
    
}
    
    
    
    
}
}