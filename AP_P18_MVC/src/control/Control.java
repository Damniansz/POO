/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Modelo;
import vista.Vista;
/**
 *
 * @author ESPE
 */
public class Control implements ActionListener {
    private Vista view;
    private Modelo model;
    
    public Control (Vista view, Modelo model){
        this.view = view;
        this.model = model;
        this.view.btnSumar.addActionListener(this);
        this.view.rest.addActionListener(this);
        this.view.mult.addActionListener(this);
        this.view.div.addActionListener(this);
       
    }
    public void iniciar (){
        view.setTitle("Usted va a sumar por medio de MVC");
        view.setLocationRelativeTo(null);
        view.txtN1.setText(String.valueOf(model.getV1()));
        view.txtN2.setText(String.valueOf(model.getV2()));
        view.txtResult.setText(String.valueOf(model.getTotal()));
        
    }
    
    public void actionPerformed(ActionEvent e){
        model.setV1(Integer.valueOf(view.txtN1.getText()));
        model.setV2(Integer.valueOf(view.txtN2.getText()));
         if (e.getSource()==view.btnSumar){
            model.sumar();
            
        }
        if (e.getSource()==view.rest){
            model.resta();
            
        }
         if (e.getSource()==view.mult){
            model.mult();
        }
          if (e.getSource()==view.div){
            model.div();
        }
        
        view.txtResult.setText(String.valueOf(model.getTotal()));
        
        
    }

   
    
}
