/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;
 import vista.frmregistro;
/**
 *
 * @author Estudiante
 */
public class ctrlregistro implements MouseListener{
    
   frmregistro vista;
   
   public ctrlregistro (frmregistro vista){
       this.vista = vista;
       vista.btnregistrar.addMouseListener(this);
       
   
   }
   
    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getSource() == vista.btnregistrar) {
            
            // validaciones
            //1 Campos vacias
            if (vista.txtnombre.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista,"llene todos los campos");
                
            }
            
             if (vista.txtcorreo.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista,"llene todos los campos");
                
            }
              if (vista.txtcontrasena.getText().isEmpty()) {
                JOptionPane.showMessageDialog(vista,"llene todos los campos");
                
            }
            
            
            if (!vista.txtcorreo.getText().contains("@") || !vista.txtcorreo.getText().contains(".")) {
                JOptionPane.showMessageDialog(vista,"Ingrese un correo valido ");
                
            }
            
               if (vista.txtcontrasena.getText().length() < 6) {
                JOptionPane.showMessageDialog(vista,"Ingrese mas de 6 caracteres ");
                
            }
               
               if (vista.txtedad.getText().length() > 2 ) {
                JOptionPane.showMessageDialog(vista,"Ingrese una edad valida");
                
            }
               
               try {
                   int edadnumerica = Integer.parseInt(vista.txtedad.getText());
            } catch (Exception ex) {
             JOptionPane.showMessageDialog(vista,"Ingrese numeros");
             return;

            }
              
                 
            
            
            
        }
    }
        

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
    
}
                                                                                                                   
