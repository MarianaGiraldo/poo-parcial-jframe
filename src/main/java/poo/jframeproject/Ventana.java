package poo.jframeproject;

import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

    private javax.swing.JLabel tituloTabla;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
    }

    private void initComponents() {

        panelTitulo = new javax.swing.JPanel();
        tituloTabla = new javax.swing.JLabel();
        panelTabla = new javax.swing.JPanel();
        scrollPanel = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();

        setLocationRelativeTo(null);
        ImageIcon icono = new ImageIcon("unal.png");
        setIconImage(icono.getImage());

        // Dener ejecucion al cerrar la ventana
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(600, 400));
        setResizable(false);

        panelTitulo.setBackground(new java.awt.Color(255, 229, 188));

        tituloTabla.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 15));
        tituloTabla.setForeground(new java.awt.Color(0, 0, 0));
        tituloTabla.setText("Lista de algo");
        tituloTabla.setAlignmentY(0.0F);
        tituloTabla.setSize(new java.awt.Dimension(86, 14));

        javax.swing.GroupLayout layoutTitulo = new javax.swing.GroupLayout(panelTitulo);
        panelTitulo.setLayout(layoutTitulo);

        add(tituloTabla);
        panelTabla.setBackground(new java.awt.Color(200, 252, 255));
        panelTabla.setPreferredSize(new java.awt.Dimension(600, 300));

        tabla.setBackground(new java.awt.Color(0, 51, 51));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {
                        { 1, "Jeff Bezos", 190, "Amazon", "EE. UU.", 58 },
                        { 2, "Elon Musk", 170, "Tesla-SpaceX", "EE. UU.", 50 },
                        { 3, "Bernard Arnault", 155, "LVMH", "Francia", 72 },
                        { 4, "Bill Gates", 125, "Microsoft", "EE. UU.", 66 },
                        { 5, "Mark Zuckerberg", 118, "Facebook", "EE. UU.", 37 },
                        { 6, "Warren Buffett", 118, "Berkshire Hathaway", "EE. UU.", 91 },
                        { 7, "Larry Page", 104, "Google", "EE. UU.", 48 },
                        { 8, "Sergey Brin", 101, "Google", "EE. UU.", 48 },
                        { 9, "Mukesh Ambani", 84, "Reliance Industries", "India", 64 },
                        { 10, "Larry Ellison", 84, "Oracle", "EE. UU.", 77 },
                        { 11, "Steve Ballmer", 77, "Microsoft", "EE. UU.", 65 },
                        { 12, "Francoise Bettencourt-Meyers", 73, "L'Oreal", "Francia", 68 },
                        { 13, "Zhong Shanshan", 71, "Nongfu Spring, Wantai Pharma", "China", 67 },
                        { 14, "Amancio Ortega", 70, "Inditex (Zara)", "España", 85 },
                        { 15, "Alice Walton", 67, "Walmart", "EE. UU.", 72 },
                        { 16, "Jim Walton", 66, "Walmart", "EE. UU.", 73 },
                        { 17, "Rob Walton", 66, "Walmart", "EE. UU.", 77 },
                        { 18, "Ma Huateng", 65, "Tencent", "China", 50 },
                        { 19, "Michael Bloomberg", 65, "Bloomberg LP", "EE. UU.", 80 },
                        { 20, "Phil Knight", 62, "Nike", "EE. UU.", 84 },
                        { 21, "Colin Zheng Huang", 62, "Pinduoduo", "China", 42 },
                        { 22, "Charles Koch", 60, "Koch Industries", "EE. UU.", 86 },
                        { 23, "Julia Koch", 60, "Koch Industries", "EE. UU.", 59 },
                        { 24, "Jacqueline Mars", 60, "Mars", "EE. UU.", 82 },
                        { 25, "John Mars", 60, "Mars", "EE. UU.", 86 },
                        { 26, "Zhong Huijuan", 59, "Hansoh Pharmaceutical", "China", 61 },
                        { 27, "Jack Ma", 58, "Alibaba", "China", 57 },
                        { 28, "Wang Xing", 57, "Meituan", "China", 42 },
                        { 29, "Hui Ka Yan", 56, "Evergrande Group", "China", 63 },
                        { 30, "Beate Heister & Karl Albrecht Jr.", 55, "Aldi Nord, Trader Joe's", "Alemania", null }
                },
                new String[] {
                        "#", "Nombre", "Riqueza (Miles de Millones de Dólares)", "Empresa", "Nacionalidad", "Edad"
                }));
        tabla.setCellSelectionEnabled(false);
        tabla.setGridColor(new java.awt.Color(165, 206, 206));
        tabla.setName("Tabla");
        tabla.setRowHeight(25);
        tabla.setDragEnabled(false);
        
        tabla.setShowGrid(true);
        tabla.setEnabled(false);
        scrollPanel.setViewportView(tabla);

        javax.swing.GroupLayout layoutTabla = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(layoutTabla);
        add(scrollPanel);
        

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana window = new Ventana();
        window.setVisible(true);
    }
}
