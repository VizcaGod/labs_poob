import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;

public class TantFantGUI extends JFrame {
    FlowLayout pruebaLayout = new FlowLayout();
    /**
     * Constructor para TantFant
     */
    public TantFantGUI(){
        prepareElements();
        prepareActions();
        prepareElementsMenu();
    }
    public static void main(String[] args) {
        TantFantGUI t1 = new TantFantGUI();
        t1.setVisible(true);
    }
    /**
     * clase que define las dimensiones de la ventana para Tant Fant
     */
    public void prepareElements(){
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width/4, dim.height/4);
        setMinimumSize(new Dimension(200,200));
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void prepareActions() {

    }
     public void prepareElementsMenu(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        JButton nuevo = new JButton("Nuevo");
        nuevo.setBounds(0, 0, 100, 40);
        //nuevo.addActionListener(this);
        panel.add(nuevo);
        JButton abrir = new JButton("abrir");
        abrir.setBounds(0, 0, 100, 40);
        //abrir.addActionListener(this);
        panel.add(abrir);
        JButton salvar = new JButton("salvar");
        salvar.setBounds(0, 0, 100, 40);
        //salvar.addActionListener(this);
        panel.add(salvar);
        JButton cargar = new JButton("cargar");
        cargar.setBounds(0, 0, 100, 40);
        //cargar.addActionListener(this);
        panel.add(cargar);
     }
     /**
     public void prepareActions(ActionEvent e) {

     }
      */

}
