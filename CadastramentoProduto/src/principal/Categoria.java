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
public class Categoria {
    private String nome;
    private String tipo;
    private String descricao;
    public void cadastrarCategoria(){
        this.nome = JOptionPane.showInputDialog("Entre com o nome da categoria: ");
        this.nome = JOptionPane.showInputDialog("Entre com o tipo da categoria: ");
        this.descricao = JOptionPane.showInputDialog("Entre com a descrição da categoria: ");
    }
    
    public void exibirCategoria(){
        JOptionPane.showMessageDialog(null, "Nome da categoria:" + this.nome +
                "\nTipo da categoria: " + this.tipo +
                "\nDescrição da categoria: " + this.descricao);
    }
}
