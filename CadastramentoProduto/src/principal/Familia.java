/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author TuRaN
 */
public class Familia {
    private String nome;
    private String tipo;
    
    public void cadastrarFamilia(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome da família do produto: ");
        this.tipo = JOptionPane.showInputDialog("Entre com o tipo da família do produto: ");
    }
    
    public void exibirFamilia(){
        JOptionPane.showMessageDialog(null, "Nome da família:" + this.nome +
                "\nTipo da família: " + this.tipo);
    }
}
