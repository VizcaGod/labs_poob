import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class TantFantGUI extends JFrame {
    private File currentFile;
    private boolean saved;
    Component parent;
    JButton nuevo = new JButton("Nuevo");
    JButton abrir = new JButton("Abrir");
    JButton guardar = new JButton("Guardar");
    JButton cargar = new JButton("Cargar");
    /**
     * Constructor para TantFant
     */
    public TantFantGUI() {
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
    public void prepareElements() {
        Toolkit t = Toolkit.getDefaultToolkit();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setSize(dim.width / 4, dim.height / 4);
        setMinimumSize(new Dimension(200, 200));
        this.setLocationRelativeTo(null);
    }

    private void prepareActions() {
        abrir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                open();
            }
        });


        guardar.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                save();
            }
        });
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                close();
            }
        });
    }

    public void prepareElementsMenu() {
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);
        nuevo.setBounds(0, 0, 100, 40);
        panel.add(nuevo);
        abrir.setBounds(0, 0, 100, 40);
        panel.add(abrir);
        guardar.setBounds(0, 0, 100, 40);
        panel.add(guardar);
        cargar.setBounds(0, 0, 100, 40);
        panel.add(cargar);
        //abrir.addActionListener(new ActionListener() {});
    }

    private void prepareActions(ActionEvent e) {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /*Window Actions*/
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                exit();
            }
        });
    }

    private void exit() {
        System.exit(0);
    }

    private boolean save() {
        boolean saved = false;
        if (currentFile != null) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setSelectedFile(currentFile);
            fileChooser.showSaveDialog(null);
        }
        return saved;
    }
    private void open() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));

        int result = fileChooser.showOpenDialog(parent);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file:"+ selectedFile.getAbsolutePath());
        }
        }

    private void close() {
        System.exit(0);
    }
}



