
package view;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class InicioJuego extends JFrame implements ActionListener{
    private JPanel panelprincipal;
    
    private JButton bJugar;
    private JButton bInstrucciones;
    private JButton bSalir;
    
    private ImageIcon iFondo;
    private ImageIcon iDimAux;
    
    private JLabel lFondo;
    
    public InicioJuego(){
        iFondo = new ImageIcon("resourses/images/gFondo.gif");
        
        panelprincipal = new JPanel();
        panelprincipal.setSize(550, 450);
        panelprincipal.setLocation(0, 0);
        panelprincipal.setBackground(Color.BLACK);
        //panelIzquierdo.setBackground(Color.WHITE);
        panelprincipal.setLayout(null);
        this.add(panelprincipal);
        
        this.bJugar = new JButton("Jugar");//botón ingresar
        this.bJugar.setBounds(350, 10, 80, 30);
        this.bJugar.setForeground(Color.WHITE);
        //this.bJugar.setCursor(cMano);
        this.bJugar.addActionListener(this);
        this.bJugar.setLocation((panelprincipal.getWidth()-bJugar.getWidth())/2,100);
        this.panelprincipal.add(this.bJugar);
        this.bJugar.setFocusable(false);
        this.bJugar.setBorder(null);
        this.bJugar.setContentAreaFilled(false);
        
        this.bInstrucciones = new JButton("Instrucciones");//botón ingresar
        this.bInstrucciones.setBounds(350, 10, 120, 30);
        this.bInstrucciones.setForeground(Color.WHITE);
        //this.bInstrucciones.setCursor(cMano);
        this.bInstrucciones.addActionListener(this);
        this.bInstrucciones.setLocation((panelprincipal.getWidth()-bInstrucciones.getWidth())/2,bJugar.getY()+80);
        this.panelprincipal.add(this.bInstrucciones);
        this.bInstrucciones.setFocusable(false);
        this.bInstrucciones.setBorder(null);
        this.bInstrucciones.setContentAreaFilled(false);
        
        this.bSalir = new JButton("Salir");//botón ingresar
        this.bSalir.setBounds(350, 10, 80, 30);
        this.bSalir.setForeground(Color.WHITE);
        //this.bSalir.setCursor(cMano);
        this.bSalir.addActionListener(this);
        this.bSalir.setLocation((panelprincipal.getWidth()-bSalir.getWidth())/2,bInstrucciones.getY()+90);
        this.panelprincipal.add(this.bSalir);
        this.bSalir.setFocusable(false);
        this.bSalir.setBorder(null);
        this.bSalir.setContentAreaFilled(false);
        
        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(
                panelprincipal.getWidth(), panelprincipal.getHeight(), Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, panelprincipal.getWidth(), panelprincipal.getHeight());
        lFondo.setIcon(iFondo);
        panelprincipal.add(lFondo);
        
        //configurar el jframe
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(550, 450);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
    
}
