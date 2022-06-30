/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

public class VistaCotizaciones extends javax.swing.JDialog {

    private Modelo.Constructora constructora;

    public VistaCotizaciones(Modelo.Constructora constructora, javax.swing.JFrame frame_padre) {
        super(frame_padre, true);
        this.constructora = constructora;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel19 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable6 = new javax.swing.JTable();
        jPanel20 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel23 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jPanel26 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jPanel28 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jPanel29 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jPanel30 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("COTIZACIONES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 208, 60));

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "VIVIENDA", "EDIFICIO", "CAMINO" }));
        jComboBox1.setBorder(null);
        jComboBox1.setFocusable(false);
        jComboBox1.setLightWeightPopupEnabled(false);
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 20, 250, 30));

        jLabel2.setFont(new java.awt.Font("Noto Sans", 1, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TIPO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, 250, 30));

        jPanel2.setBackground(new java.awt.Color(31, 31, 31));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("NAME");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 960, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 960, 20));

        jPanel8.setBackground(new java.awt.Color(67, 67, 67));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(67, 67, 67));
        jScrollPane5.setBorder(null);

        jTable5.setBackground(new java.awt.Color(45, 45, 45));
        jTable5.setForeground(new java.awt.Color(255, 102, 102));
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jTable5.setToolTipText("");
        jScrollPane5.setViewportView(jTable5);

        jPanel8.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, 280));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NOMBRE PROYECTO");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel8.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("<html>CANTIDAD DE TRABAJADORES");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 30));

        jPanel9.setBackground(new java.awt.Color(45, 45, 45));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setForeground(new java.awt.Color(255, 102, 102));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("0");
        jPanel9.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        jPanel10.setBackground(new java.awt.Color(45, 45, 45));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setForeground(new java.awt.Color(255, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("0");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 30));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("<html><p>DURACION APROXIMADA EN MESES<p>");
        jPanel11.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 30));

        jPanel12.setBackground(new java.awt.Color(45, 45, 45));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setForeground(new java.awt.Color(255, 102, 102));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel20.setText("0");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 30));

        jPanel8.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 370, 30));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("MATERIALES");
        jPanel13.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        jPanel8.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 180, 30));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("TOTAL");
        jPanel14.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel8.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 30));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("<html>SALARIO MENSUAL TRABAJADOR");
        jPanel15.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 30));

        jPanel16.setBackground(new java.awt.Color(45, 45, 45));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setForeground(new java.awt.Color(255, 102, 102));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("0");
        jPanel16.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 30));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("CANTIDAD DE FASES");
        jPanel17.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, 30));

        jPanel18.setBackground(new java.awt.Color(45, 45, 45));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setForeground(new java.awt.Color(255, 102, 102));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("0");
        jPanel18.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel8.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, 30));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, 460, 430));

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "VIVIENDA", "EDIFICIO", "CAMINO" }));
        jComboBox2.setBorder(null);
        jComboBox2.setFocusable(false);
        jComboBox2.setLightWeightPopupEnabled(false);
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 460, 40));

        jComboBox3.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox3.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE", "VIVIENDA", "EDIFICIO", "CAMINO" }));
        jComboBox3.setBorder(null);
        jComboBox3.setFocusable(false);
        jComboBox3.setLightWeightPopupEnabled(false);
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 30, 460, 40));

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("PROYECTO");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 460, 40));

        jLabel5.setFont(new java.awt.Font("Noto Sans", 1, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("PROYECTO");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 460, 40));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("INICIAR PROYECTO");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 520, 460, 40));

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("INICIAR PROYECTO");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 520, 460, 40));

        jPanel19.setBackground(new java.awt.Color(67, 67, 67));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane6.setBackground(new java.awt.Color(67, 67, 67));
        jScrollPane6.setBorder(null);

        jTable6.setBackground(new java.awt.Color(45, 45, 45));
        jTable6.setForeground(new java.awt.Color(255, 102, 102));
        jTable6.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable6);

        jPanel19.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 180, 280));

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("NOMBRE PROYECTO");
        jPanel20.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 50));

        jPanel21.setBackground(new java.awt.Color(51, 51, 51));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("<html>CANTIDAD DE TRABAJADORES");
        jPanel21.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 250, 30));

        jPanel22.setBackground(new java.awt.Color(45, 45, 45));
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setForeground(new java.awt.Color(255, 102, 102));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("0");
        jPanel22.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 250, 30));

        jPanel23.setBackground(new java.awt.Color(45, 45, 45));
        jPanel23.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setForeground(new java.awt.Color(255, 102, 102));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("0");
        jPanel23.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 250, 30));

        jPanel24.setBackground(new java.awt.Color(51, 51, 51));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("<html><p>DURACION APROXIMADA EN MESES<p>");
        jPanel24.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 250, 30));

        jPanel25.setBackground(new java.awt.Color(45, 45, 45));
        jPanel25.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel28.setForeground(new java.awt.Color(255, 102, 102));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel28.setText("0");
        jPanel25.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 360, 30));

        jPanel19.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 370, 30));

        jPanel26.setBackground(new java.awt.Color(51, 51, 51));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("MATERIALES");
        jPanel26.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 30));

        jPanel19.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, 180, 30));

        jPanel27.setBackground(new java.awt.Color(51, 51, 51));
        jPanel27.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel30.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("TOTAL");
        jPanel27.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 70, 30));

        jPanel19.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 70, 30));

        jPanel28.setBackground(new java.awt.Color(51, 51, 51));
        jPanel28.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("<html>SALARIO MENSUAL POR TRABAJADOR");
        jPanel28.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 250, 30));

        jPanel29.setBackground(new java.awt.Color(45, 45, 45));
        jPanel29.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setForeground(new java.awt.Color(255, 102, 102));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("0");
        jPanel29.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 250, 30));

        jPanel30.setBackground(new java.awt.Color(51, 51, 51));
        jPanel30.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("CANTIDAD DE FASES");
        jPanel30.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 250, 30));

        jPanel31.setBackground(new java.awt.Color(45, 45, 45));
        jPanel31.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setForeground(new java.awt.Color(255, 102, 102));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("0");
        jPanel31.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 30));

        jPanel19.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 250, 30));

        jPanel2.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 460, 430));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 592, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

        jComboBox2.removeAllItems();
        jComboBox3.removeAllItems();

        String[] indices = null;
        switch (this.jComboBox1.getSelectedIndex()) {
            case 1:
                indices = this.constructora.buscarProyectos(this.constructora.getProyectos("demo"), Modelo.Proyecto.VIVIENDA).split("-");
                break;
            case 2:
                indices = this.constructora.buscarProyectos(this.constructora.getProyectos("demo"), Modelo.Proyecto.EDIFICIO).split("-");
                break;
            case 3:
                indices = this.constructora.buscarProyectos(this.constructora.getProyectos("demo"), Modelo.Proyecto.CAMINO).split("-");
                break;
        }

        if (indices != null) {
            for (int i = 0; i < indices.length; i++) {
                jComboBox2.addItem(this.constructora.getProyectos("demo")[Integer.valueOf(indices[i])].getNombre() + ":" + this.constructora.getProyectos("demo")[Integer.valueOf(indices[i])].getId());
                jComboBox3.addItem(this.constructora.getProyectos("demo")[Integer.valueOf(indices[i])].getNombre() + ":" + this.constructora.getProyectos("demo")[Integer.valueOf(indices[i])].getId());
            }
        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        ((javax.swing.table.DefaultTableModel) jTable6.getModel()).getDataVector().removeAllElements();
        try {
            Modelo.Proyecto proyecto = this.constructora.buscarProyecto(this.constructora.getProyectos("demo"), Integer.valueOf(jComboBox2.getSelectedItem().toString().split(":")[1]));

            if (proyecto != null) {
                jLabel12.setText(proyecto.getNombre());
                jLabel16.setText(String.valueOf(proyecto.getCantTrabajadores()));
                jLabel17.setText(String.valueOf(proyecto.getDuracionEnMesesAprox()));
                jLabel32.setText(String.valueOf(proyecto.getSalarioXTrabajador()));
                jLabel34.setText(String.valueOf(proyecto.getFases().length));
                jLabel28.setText(String.valueOf(this.constructora.cotizarProyecto(proyecto)));

                Object[] arrayElementos = new Object[2];

                for (int i = 0; i < proyecto.getMateriales().length; i++) {
                    arrayElementos[0] = proyecto.getMateriales()[i].getNombre();
                    arrayElementos[1] = proyecto.getMateriales()[i].getPrecio();
                    ((javax.swing.table.DefaultTableModel) jTable6.getModel()).addRow(arrayElementos);
                }
            }
        } catch (Exception io) {
        }
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        ((javax.swing.table.DefaultTableModel) jTable5.getModel()).getDataVector().removeAllElements();
        try {
            Modelo.Proyecto proyecto = this.constructora.buscarProyecto(this.constructora.getProyectos("demo"), Integer.valueOf(jComboBox3.getSelectedItem().toString().split(":")[1]));

            if (proyecto != null) {
                jLabel6.setText(proyecto.getNombre());
                jLabel10.setText(String.valueOf(proyecto.getCantTrabajadores()));
                jLabel14.setText(String.valueOf(proyecto.getDuracionEnMesesAprox()));
                jLabel24.setText(String.valueOf(proyecto.getSalarioXTrabajador()));
                jLabel26.setText(String.valueOf(proyecto.getFases().length));
                jLabel20.setText(String.valueOf(this.constructora.cotizarProyecto(proyecto)));

                Object[] arrayElementos = new Object[2];

                for (int i = 0; i < proyecto.getMateriales().length; i++) {
                    arrayElementos[0] = proyecto.getMateriales()[i].getNombre();
                    arrayElementos[1] = proyecto.getMateriales()[i].getPrecio();
                    ((javax.swing.table.DefaultTableModel) jTable5.getModel()).addRow(arrayElementos);
                }
            }
        } catch (Exception io) {
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged


    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            VistaAgregarProyecto vista = new VistaAgregarProyecto(this, this.constructora, this.constructora.buscarProyecto(this.constructora.getProyectos("demo"), Integer.valueOf(jComboBox2.getSelectedItem().toString().split(":")[1])));
            vista.setVisible(true);
        } catch (Exception io) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un tipo de proyecto");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            VistaAgregarProyecto vista = new VistaAgregarProyecto(this, this.constructora, this.constructora.buscarProyecto(this.constructora.getProyectos("demo"), Integer.valueOf(jComboBox3.getSelectedItem().toString().split(":")[1])));
            vista.setVisible(true);
        } catch (Exception io) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error: Debe seleccionar un tipo de proyecto");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable5;
    private javax.swing.JTable jTable6;
    // End of variables declaration//GEN-END:variables
}