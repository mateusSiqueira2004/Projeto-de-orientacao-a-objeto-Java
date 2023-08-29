
package getesetters;

import javax.swing.JOptionPane;

public class Animal {

   
    public static void main(String[] args) {
        cachorro c1 = new cachorro();
        String nomeCachorro = JOptionPane.showInputDialog("informe o nome do cachorro");
        c1.setNome(nomeCachorro);
        String idadeCachorro = JOptionPane.showInputDialog("informe a idade do cachorro");
        c1.setIdade(Integer.parseInt(idadeCachorro));
        String generoCachorro = JOptionPane.showInputDialog("informe o genero do cachorro");
        c1.setGenero(generoCachorro);
        String pelagemCachorro = JOptionPane.showInputDialog("informe a cor da pelagem do cachorro");
        c1.setPelagem(pelagemCachorro);
        String porteCachorro = JOptionPane.showInputDialog("informe o porte do cachorro");
        c1.setPorte(porteCachorro);
        String racaCachorro = JOptionPane.showInputDialog("informe a raca do cachorro");
        c1.setRaca(racaCachorro);

JOptionPane.showMessageDialog(null,"o nome do seu cachorro é "+c1.getNome()+
        "\ne a idade é "+c1.getIdade()+
        "\no genero é "+c1.getGenero()+
        "\no tipo de pelagem é "+c1.getPelagem()+ 
        "\no porte é "+c1.getPorte()+
        "\ne a raca é "+c1.getRaca(),"CACHORRO",JOptionPane.PLAIN_MESSAGE);

    }}


