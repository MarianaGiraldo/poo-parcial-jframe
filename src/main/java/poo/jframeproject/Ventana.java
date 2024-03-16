package poo.jframeproject;

import javax.swing.ImageIcon;

public class Ventana extends javax.swing.JFrame {

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
        layoutTitulo.setHorizontalGroup(
            layoutTitulo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layoutTitulo.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(tituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
        );
        layoutTitulo.setVerticalGroup(
            layoutTitulo.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutTitulo.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(tituloTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        panelTabla.setBackground(new java.awt.Color(200, 252, 255));
        panelTabla.setPreferredSize(new java.awt.Dimension(600, 300));

        tabla.setBackground(new java.awt.Color(0, 51, 51));
        tabla.setForeground(new java.awt.Color(255, 255, 255));
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"algo", null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        tabla.setCellSelectionEnabled(true);
        tabla.setGridColor(new java.awt.Color(165, 206, 206));
        tabla.setName("Tabla");
        tabla.setRowHeight(25);
        tabla.setShowGrid(true);
        scrollPanel.setViewportView(tabla);

        javax.swing.GroupLayout layoutTabla = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(layoutTabla);
        layoutTabla.setHorizontalGroup(
            layoutTabla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutTabla.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layoutTabla.setVerticalGroup(
            layoutTabla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutTabla.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layoutTituloTabla = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layoutTituloTabla);
        layoutTituloTabla.setHorizontalGroup(
            layoutTituloTabla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTabla, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE)
        );
        layoutTituloTabla.setVerticalGroup(
            layoutTituloTabla.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layoutTituloTabla.createSequentialGroup()
                .addComponent(panelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ventana window = new Ventana();
        window.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel tituloTabla;
    private javax.swing.JPanel panelTitulo;
    private javax.swing.JPanel panelTabla;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
