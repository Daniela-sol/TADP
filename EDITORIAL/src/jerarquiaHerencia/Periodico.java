/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jerarquiaHerencia;

/**
 *
 * @author Daniela
 */
public class Periodico extends Publicacion implements Periodicidad{
    private String editor;

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor;
    }
    
}
