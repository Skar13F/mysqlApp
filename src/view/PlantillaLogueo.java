package view;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class PlantillaLogueo extends JFrame implements ActionListener {

    private JPanel panelDerecho;
    private JPanel panelIzquierdo;
    private JButton bCerrar;
    private Cursor cMano;
    private ImageIcon iCerrar;
    private ImageIcon iFondo;
    private ImageIcon iDimAux;
    private ImageIcon iSvg1;
    private JLabel lFondo;
    private JLabel lSvg1;
    private JTextField tNombreUsuario;
    
    private Color colorPrincipal;
    private Color colorGrisOscuro;
    private Border bInferiorAzul;
    private Font fontMedia;
    
    private JComboBox cbTipoUsuario;
    
    public PlantillaLogueo() {
        //cursores
        this.cMano = new Cursor(Cursor.HAND_CURSOR);
        
        //Cargar fuente
        generarFuente();
        
        //Agregar imágenes
        iCerrar = new ImageIcon("resourses/images/cerrar.png");
        iFondo = new ImageIcon("resourses/images/fondo.png");
        iSvg1 = new ImageIcon("resourses/images/imagen1.png");

        //definición de colores
        colorPrincipal=new Color(60,78,120);
        colorGrisOscuro=new Color(80,80,80);
        
        bInferiorAzul=BorderFactory.createMatteBorder(0, 0, 2, 0, colorPrincipal);
        
        fontMedia=new Font("LuzSans-Book",Font.PLAIN,15);
        
        panelIzquierdo = new JPanel();
        panelIzquierdo.setSize(600, 500);
        panelIzquierdo.setLocation(0, 0);
        panelIzquierdo.setBackground(Color.BLACK);
        panelIzquierdo.setLayout(null);
        this.add(panelIzquierdo);

        panelDerecho = new JPanel();
        panelDerecho.setSize(400, 500);
        panelDerecho.setLocation(600, 0);
        panelDerecho.setBackground(Color.WHITE);
        panelDerecho.setLayout(null);
        this.add(panelDerecho);
        
        //Comoponentes del panel derecho
        tNombreUsuario = new JTextField("Nombre Usuario");
        tNombreUsuario.setSize(260,40);
        tNombreUsuario.setLocation((panelDerecho.getWidth()-tNombreUsuario.getWidth())/2, 130);
        tNombreUsuario.setHorizontalAlignment(SwingConstants.CENTER);
        tNombreUsuario.setForeground(colorPrincipal);
        tNombreUsuario.setBackground(Color.WHITE);
        tNombreUsuario.setCaretColor(colorGrisOscuro);
        tNombreUsuario.setFont(fontMedia);
        tNombreUsuario.setBorder(bInferiorAzul);
        panelDerecho.add(tNombreUsuario);
        
        tNombreUsuario.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if(tNombreUsuario.getText().equals("Nombre Usuario")){
                    tNombreUsuario.setText("");
                }
            }
                
            }
        );
        
        cbTipoUsuario=new JComboBox();
        cbTipoUsuario.addItem("Invitado");
        cbTipoUsuario.addItem("Admin");
        cbTipoUsuario.addItem("Superadmin");
        cbTipoUsuario.setSize(220,30);
        cbTipoUsuario.setLocation((panelDerecho.getWidth()-cbTipoUsuario.getWidth())/2,195);
        cbTipoUsuario.setBackground(Color.WHITE);
        cbTipoUsuario.setForeground(colorPrincipal);
        ((JLabel)cbTipoUsuario.getRenderer()).setHorizontalAlignment(SwingConstants.CENTER);
        panelDerecho.add(cbTipoUsuario);

        // colocar el fondo
        iDimAux = new ImageIcon(iSvg1.getImage().getScaledInstance(
                500, 345, Image.SCALE_AREA_AVERAGING));
        lSvg1 = new JLabel();
        lSvg1.setBounds(100, 100, 500, 345);
        lSvg1.setIcon(iDimAux);
        panelIzquierdo.add(lSvg1);
        
        iDimAux = new ImageIcon(iFondo.getImage().getScaledInstance(
                600, 600, Image.SCALE_AREA_AVERAGING));
        lFondo = new JLabel();
        lFondo.setBounds(0, 0, 600, 600);
        lFondo.setIcon(iDimAux);
        panelIzquierdo.add(lFondo);
        
        //Botones
        this.bCerrar = new JButton("X");
        this.bCerrar.setBounds(350, 10, 45, 30);
        this.bCerrar.setBackground(Color.BLUE);
        this.bCerrar.setForeground(Color.WHITE);
        this.bCerrar.setCursor(cMano);
        this.bCerrar.addActionListener(this);
        this.panelDerecho.add(this.bCerrar);
        iDimAux = new ImageIcon(iCerrar.getImage().getScaledInstance(
                30, 30, Image.SCALE_AREA_AVERAGING));

        this.bCerrar.setIcon(iDimAux);
        this.bCerrar.setFocusable(false);
        this.bCerrar.setBorder(null);
        this.bCerrar.setContentAreaFilled(false);

        //configurar el jframe
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(1000, 500);
        this.setLocationRelativeTo(this);
        this.setLayout(null);
        this.setUndecorated(true);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.getBCerrar()) {
            System.exit(0);
        }
    }

    public JButton getBCerrar() {
        return this.bCerrar;
    }
    
    //cargar fuente
    private void generarFuente(){
        try {
            GraphicsEnvironment ge=GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, new File("resourses/fonts/LUZRO.TTF")));
        } catch (Exception e) {
        }
    }
}
