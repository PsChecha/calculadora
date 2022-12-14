
package visual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class frm_calcu extends javax.swing.JFrame implements ActionListener {

 
    float r,n1,n2;
    String i,d;
    char op;
    public frm_calcu() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    private void initComponents() {

        menuBar1 = new java.awt.MenuBar();
        menu1 = new java.awt.Menu();
        menu2 = new java.awt.Menu();
        escritorio = new javax.swing.JDesktopPane();
        pn_layout = new javax.swing.JPanel();
        btb_sum = new javax.swing.JButton();
        btb_del = new javax.swing.JButton();
        btb_7 = new javax.swing.JButton();
        btb_2 = new javax.swing.JButton();
        btb_3 = new javax.swing.JButton();
        btb_igual = new javax.swing.JButton();
        btb_clearScreen = new javax.swing.JButton();
        btb_divi = new javax.swing.JButton();
        btb_clear = new javax.swing.JButton();
        btb_0 = new javax.swing.JButton();
        btb_resta = new javax.swing.JButton();
        btb_dot = new javax.swing.JButton();
        btb_4 = new javax.swing.JButton();
        btb_6 = new javax.swing.JButton();
        btb_1 = new javax.swing.JButton();
        btb_5 = new javax.swing.JButton();
        txt_input = new javax.swing.JTextField();
        btb_module = new javax.swing.JButton();
        btb_8 = new javax.swing.JButton();
        btb_9 = new javax.swing.JButton();
        btb_multi1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mb_opciones = new javax.swing.JMenu();
        sm_nuevo = new javax.swing.JMenuItem();
        sm_Historial = new javax.swing.JMenuItem();
        mb_ayuda = new javax.swing.JMenu();
        sm_manual = new javax.swing.JMenuItem();

        menu1.setLabel("File");
        menuBar1.add(menu1);

        menu2.setLabel("Edit");
        menuBar1.add(menu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));
        setForeground(new java.awt.Color(0, 0, 0));

        pn_layout.setBackground(new java.awt.Color(0, 0, 0));

        btb_sum.setBackground(new java.awt.Color(0, 0, 102));
        btb_sum.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_sum.setForeground(new java.awt.Color(255, 255, 255));
        btb_sum.setText("+");
        btb_sum.setBorder(null);
        btb_sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_sumActionPerformed(evt);
            }
        });

        btb_del.setBackground(new java.awt.Color(0, 0, 102));
        btb_del.setFont(new java.awt.Font("Arial Black", 0, 18)); //
        btb_del.setForeground(new java.awt.Color(255, 255, 255));
        btb_del.setText("<--");
        btb_del.setBorder(null);
        btb_del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_delActionPerformed(evt);
            }
        });

        btb_7.setBackground(new java.awt.Color(0, 0, 102));
        btb_7.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_7.setForeground(new java.awt.Color(255, 255, 255));
        btb_7.setText("7");
        btb_7.setBorder(null);
        btb_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_7ActionPerformed(evt);
            }
        });

        btb_2.setBackground(new java.awt.Color(0, 0, 102));
        btb_2.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_2.setForeground(new java.awt.Color(255, 255, 255));
        btb_2.setText("2");
        btb_2.setBorder(null);
        btb_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_2ActionPerformed(evt);
            }
        });

        btb_3.setBackground(new java.awt.Color(0, 0, 102));
        btb_3.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_3.setForeground(new java.awt.Color(255, 255, 255));
        btb_3.setText("3");
        btb_3.setBorder(null);
        btb_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_3ActionPerformed(evt);
            }
        });

        btb_igual.setBackground(new java.awt.Color(0, 0, 102));
        btb_igual.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_igual.setForeground(new java.awt.Color(255, 255, 255));
        btb_igual.setText("=");
        btb_igual.setBorder(null);
        btb_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_igualActionPerformed(evt);
            }
        });

        btb_clearScreen.setBackground(new java.awt.Color(0, 0, 102));
        btb_clearScreen.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_clearScreen.setForeground(new java.awt.Color(255, 255, 255));
        btb_clearScreen.setText("CE");
        btb_clearScreen.setBorder(null);
        btb_clearScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_clearScreenActionPerformed(evt);
            }
        });

        btb_divi.setBackground(new java.awt.Color(0, 0, 102));
        btb_divi.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_divi.setForeground(new java.awt.Color(255, 255, 255));
        btb_divi.setText("/");
        btb_divi.setBorder(null);
        btb_divi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_diviActionPerformed(evt);
            }
        });

        btb_clear.setBackground(new java.awt.Color(0, 0, 102));
        btb_clear.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_clear.setForeground(new java.awt.Color(255, 255, 255));
        btb_clear.setText("C");
        btb_clear.setBorder(null);
        btb_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_clearActionPerformed(evt);
            }
        });

        btb_0.setBackground(new java.awt.Color(0, 0, 102));
        btb_0.setFont(new java.awt.Font("Arial Black", 0, 18));
        btb_0.setForeground(new java.awt.Color(255, 255, 255));
        btb_0.setText("0");
        btb_0.setBorder(null);
        btb_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_0ActionPerformed(evt);
            }
        });

        btb_resta.setBackground(new java.awt.Color(0, 0, 102));
        btb_resta.setFont(new java.awt.Font("Arial Black", 0, 18));
        btb_resta.setForeground(new java.awt.Color(255, 255, 255));
        btb_resta.setText("-");
        btb_resta.setBorder(null);
        btb_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_restaActionPerformed(evt);
            }
        });

        btb_dot.setBackground(new java.awt.Color(0, 0, 102));
        btb_dot.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_dot.setForeground(new java.awt.Color(255, 255, 255));
        btb_dot.setText(".");
        btb_dot.setBorder(null);
        btb_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_dotActionPerformed(evt);
            }
        });

        btb_4.setBackground(new java.awt.Color(0, 0, 102));
        btb_4.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_4.setForeground(new java.awt.Color(255, 255, 255));
        btb_4.setText("4");
        btb_4.setBorder(null);
        btb_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_4ActionPerformed(evt);
            }
        });

        btb_6.setBackground(new java.awt.Color(0, 0, 102));
        btb_6.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_6.setForeground(new java.awt.Color(255, 255, 255));
        btb_6.setText("6");
        btb_6.setBorder(null);
        btb_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_6ActionPerformed(evt);
            }
        });

        btb_1.setBackground(new java.awt.Color(0, 0, 102));
        btb_1.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_1.setForeground(new java.awt.Color(255, 255, 255));
        btb_1.setText("1");
        btb_1.setBorder(null);
        btb_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_1ActionPerformed(evt);
            }
        });

        btb_5.setBackground(new java.awt.Color(0, 0, 102));
        btb_5.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_5.setForeground(new java.awt.Color(255, 255, 255));
        btb_5.setText("5");
        btb_5.setBorder(null);
        btb_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_5ActionPerformed(evt);
            }
        });

        txt_input.setBackground(new java.awt.Color(0, 0, 102));
        txt_input.setFont(new java.awt.Font("agave Nerd Font Mono", 0, 24)); 
        txt_input.setForeground(new java.awt.Color(255, 255, 255));
        txt_input.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt_input.setBorder(null);
        txt_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_inputActionPerformed(evt);
            }
        });

        btb_module.setBackground(new java.awt.Color(0, 0, 102));
        btb_module.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_module.setForeground(new java.awt.Color(255, 255, 255));
        btb_module.setText("mod");
        btb_module.setBorder(null);
        btb_module.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_moduleActionPerformed(evt);
            }
        });

        btb_8.setBackground(new java.awt.Color(0, 0, 102));
        btb_8.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_8.setForeground(new java.awt.Color(255, 255, 255));
        btb_8.setText("8");
        btb_8.setBorder(null);
        btb_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_8ActionPerformed(evt);
            }
        });

        btb_9.setBackground(new java.awt.Color(0, 0, 102));
        btb_9.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_9.setForeground(new java.awt.Color(255, 255, 255));
        btb_9.setText("9");
        btb_9.setBorder(null);
        btb_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_9ActionPerformed(evt);
            }
        });
        btb_9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btb_9KeyPressed(evt);
            }
        });

        btb_multi1.setBackground(new java.awt.Color(0, 0, 102));
        btb_multi1.setFont(new java.awt.Font("Arial Black", 0, 18)); 
        btb_multi1.setForeground(new java.awt.Color(255, 255, 255));
        btb_multi1.setText("X");
        btb_multi1.setBorder(null);
        btb_multi1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btb_multi1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pn_layoutLayout = new javax.swing.GroupLayout(pn_layout);
        pn_layout.setLayout(pn_layoutLayout);
        pn_layoutLayout.setHorizontalGroup(
            pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_layoutLayout.createSequentialGroup()
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_layoutLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pn_layoutLayout.createSequentialGroup()
                                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_layoutLayout.createSequentialGroup()
                                        .addComponent(btb_module, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btb_clearScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btb_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_layoutLayout.createSequentialGroup()
                                        .addComponent(btb_7, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btb_8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btb_9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_layoutLayout.createSequentialGroup()
                                        .addComponent(btb_multi1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, Short.MAX_VALUE))
                                    .addComponent(btb_del, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(pn_layoutLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pn_layoutLayout.createSequentialGroup()
                                        .addComponent(btb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btb_5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btb_6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pn_layoutLayout.createSequentialGroup()
                                        .addComponent(btb_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btb_0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(btb_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btb_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btb_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pn_layoutLayout.createSequentialGroup()
                                    .addComponent(btb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6)
                                    .addComponent(btb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btb_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );
        pn_layoutLayout.setVerticalGroup(
            pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_layoutLayout.createSequentialGroup()
                .addComponent(txt_input, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btb_module, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_clearScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_del, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btb_7, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_multi1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btb_4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btb_5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btb_6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btb_resta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btb_1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btb_0, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btb_dot, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pn_layoutLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(pn_layoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btb_divi, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btb_igual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        escritorio.setLayer(pn_layout, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pn_layout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 153));
        jMenuBar1.setBorder(null);
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        mb_opciones.setBorder(null);
        mb_opciones.setForeground(new java.awt.Color(255, 255, 255));
        mb_opciones.setText("Opciones");

        sm_nuevo.setBackground(new java.awt.Color(51, 51, 51));
        sm_nuevo.setForeground(new java.awt.Color(255, 255, 255));
        sm_nuevo.setText("Nuevo");
        sm_nuevo.setBorder(null);
        sm_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_nuevoActionPerformed(evt);
            }
        });
        mb_opciones.add(sm_nuevo);

        sm_Historial.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        sm_Historial.setBackground(new java.awt.Color(51, 51, 51));
        sm_Historial.setForeground(new java.awt.Color(255, 255, 255));
        sm_Historial.setText("Historial");
        sm_Historial.setBorder(null);
        sm_Historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_HistorialActionPerformed(evt);
            }
        });
        mb_opciones.add(sm_Historial);

        jMenuBar1.add(mb_opciones);

        mb_ayuda.setBorder(null);
        mb_ayuda.setForeground(new java.awt.Color(255, 255, 255));
        mb_ayuda.setText("Ayuda");

        sm_manual.setBackground(new java.awt.Color(51, 51, 51));
        sm_manual.setForeground(new java.awt.Color(255, 255, 255));
        sm_manual.setText("Manual");
        sm_manual.setBorder(null);
        sm_manual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sm_manualActionPerformed(evt);
            }
        });
        mb_ayuda.add(sm_manual);

        jMenuBar1.add(mb_ayuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void sm_nuevoActionPerformed(java.awt.event.ActionEvent evt) {
        try {
                File.insert("Nuevo");
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                }   
        frm_calcu fm = new frm_calcu();
        fm.show();
    }

    @SuppressWarnings({"static-access", "UseSpecificCatch"})
    private void sm_HistorialActionPerformed(java.awt.event.ActionEvent evt) {
        
        ifrm_historial fm = new ifrm_historial();
        escritorio.add(fm);
        fm.show();
         
         
 
         
        java.io.File file = new java.io.File("D:/UNI/4tosemestre/prograll/tarea_calcu/Calcu/ext/bitacora.txt");
          try {
                   
            FileReader reader = new FileReader(file);
            try (BufferedReader br = new BufferedReader(reader)) {
                fm.txt_showh.read(br, null);
           
            }
              fm.txt_showh.requestFocus();
        } catch (Exception e) {
                System.out.print(e);
             }
        
    }

    private void btb_multi1ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
          n1=Float.parseFloat(txt_input.getText());
        i=null;
        txt_input.setText("x");
        op='x';
  
        
    }

    private void btb_9ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();

        if (i==null){
            txt_input.setText("9");
        }else{
        txt_input.setText(i+"9");
        }
        i=txt_input.getText();

       
    }

    private void btb_moduleActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
          n1=Float.parseFloat(txt_input.getText());
          txt_input.setText("mod");
        i=null;
        op='%';
   
        
        
    }

    private void btb_clearActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
        txt_input.setText("");
        i=null;
        
    }

    private void btb_7ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
  
        if (i==null){
            txt_input.setText("7");
        }else{
        txt_input.setText(i+"7");
        
        }
        i=txt_input.getText();
    
        
    }

    private void btb_delActionPerformed(java.awt.event.ActionEvent evt) {
       d=txt_input.getText();
       txt_input.setText(d.replace("[6]",""));
       
       
      
    }

    private void sm_manualActionPerformed(java.awt.event.ActionEvent evt) {
        ifrm_ayuda fm  = new ifrm_ayuda();
        escritorio.add(fm);
        fm.show();
        
    }
    private void btb_sumActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();

        n1=Float.parseFloat(txt_input.getText());
        i=null;
        txt_input.setText("+");
        op='+';
        
    
        
        
    }

    private void btb_1ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
        if(i==null){
            txt_input.setText("1");
        }else{
        txt_input.setText(i+"1");
       }
        i=txt_input.getText();
    
        

    }

    private void btb_2ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
             txt_input.setText("2");
         }else{
        txt_input.setText(i+"2");
        }
         i=txt_input.getText();
  
        
    }

    private void btb_3ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
             txt_input.setText("3");
         }else{
        txt_input.setText(i+"3");
        }
         i=txt_input.getText();
  
        
    }

    private void btb_4ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
          txt_input.setText("4");
         }else{
        txt_input.setText(i+"4");
       }
         i=txt_input.getText();
  
        
    }

    private void btb_5ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
             txt_input.setText("5");
         }else{
        txt_input.setText(i+"5");
        }
         i=txt_input.getText();
   
        
    }

    private void btb_6ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
             txt_input.setText("6");
         }else{
        txt_input.setText(i+"6");
        }
         i=txt_input.getText();

        
    }

    private void btb_8ActionPerformed(java.awt.event.ActionEvent evt) {
        audio.play();
         if(i==null){
             txt_input.setText("8");
         }else{
        txt_input.setText(i+"8");
        }
         i=txt_input.getText();
 
         
        
    }//GEN-LAST:event_btb_8ActionPerformed

    private void btb_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_0ActionPerformed
        // TODO add your handling code here:
        audio.play();

         if(i==null){
             txt_input.setText("0");
         }else{
        txt_input.setText(i+"0");
        }
         i=txt_input.getText();

         
    
    }//GEN-LAST:event_btb_0ActionPerformed

    private void btb_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_dotActionPerformed
        // TODO add your handling code here:
        audio.play();
         if(i==null){
             txt_input.setText(".");
         }else{
        txt_input.setText(i+".");
        }
         i=txt_input.getText();
   
    }//GEN-LAST:event_btb_dotActionPerformed

    private void btb_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_igualActionPerformed
        // TODO add your handling code here:
        audio.play();
       
        switch(op){
            case '+':
                n2=Float.parseFloat(txt_input.getText());
                r=n1+n2; 
                txt_input.setText(Float.toString(n1)+" + "+Float.toString(n2)+" = "+Float.toString(r));i=null;
                try {
                File.insert(txt_input.getText());
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                }       
                break;
            case '-':
                n2=Float.parseFloat(txt_input.getText());
                r=n1-n2; 
                txt_input.setText(Float.toString(n1)+" - "+Float.toString(n2)+" = "+Float.toString(r));
                i=null;
                try {
                File.insert(txt_input.getText());
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                } break;
            case 'x':
                n2=Float.parseFloat(txt_input.getText());
                r=n1*n2; 
                txt_input.setText(Float.toString(n1)+" x "+Float.toString(n2)+" = "+Float.toString(r));
                i=null;
                try {
                File.insert(txt_input.getText());
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                } break;
                
            case '/':
                n2=Float.parseFloat(txt_input.getText());
                r=n1/n2; 
                txt_input.setText(Float.toString(n1)+" / "+Float.toString(n2)+" = "+Float.toString(r));
                i=null;
                try {
                File.insert(txt_input.getText());
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                } break;
            case '%':
                n2=Float.parseFloat(txt_input.getText());
                r=n1%n2; 
                txt_input.setText(Float.toString(n1)+" // "+Float.toString(n2)+" = "+Float.toString(r));
                i=null;
                try {
                File.insert(txt_input.getText());
                } catch (IOException ex) {
                    Logger.getLogger(frm_calcu.class.getName()).log(Level.SEVERE, null, ex);
                } break;
                
                
                
        }
        
        
    }//GEN-LAST:event_btb_igualActionPerformed

    private void btb_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_restaActionPerformed
        // TODO add your handling code here:
        audio.play();
         n1=Float.parseFloat(txt_input.getText());
        i=null;
        
        txt_input.setText("-");
        //txt_input.setText("suma: "+n1);
        op='-';
 
        
    }//GEN-LAST:event_btb_restaActionPerformed

    private void btb_diviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_diviActionPerformed
        // TODO add your handling code here:
        audio.play();
         n1=Float.parseFloat(txt_input.getText());
        i=null;
        txt_input.setText("/");
        //txt_input.setText("suma: "+n1);
        op='/';
 
       
        
    }//GEN-LAST:event_btb_diviActionPerformed

    private void btb_clearScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btb_clearScreenActionPerformed
        // TODO add your handling code here:
        audio.play();
        txt_input.setText("");
        n1=0;
        n2=0;
        i=null;
        
    }//GEN-LAST:event_btb_clearScreenActionPerformed

    private void txt_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_inputActionPerformed

    private void btb_9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btb_9KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btb_9KeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frm_calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_calcu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_calcu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btb_0;
    private javax.swing.JButton btb_1;
    private javax.swing.JButton btb_2;
    private javax.swing.JButton btb_3;
    private javax.swing.JButton btb_4;
    private javax.swing.JButton btb_5;
    private javax.swing.JButton btb_6;
    private javax.swing.JButton btb_7;
    private javax.swing.JButton btb_8;
    private javax.swing.JButton btb_9;
    private javax.swing.JButton btb_clear;
    private javax.swing.JButton btb_clearScreen;
    private javax.swing.JButton btb_del;
    private javax.swing.JButton btb_divi;
    private javax.swing.JButton btb_dot;
    private javax.swing.JButton btb_igual;
    private javax.swing.JButton btb_module;
    private javax.swing.JButton btb_multi1;
    private javax.swing.JButton btb_resta;
    private javax.swing.JButton btb_sum;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mb_ayuda;
    private javax.swing.JMenu mb_opciones;
    private java.awt.Menu menu1;
    private java.awt.Menu menu2;
    private java.awt.MenuBar menuBar1;
    private javax.swing.JPanel pn_layout;
    private javax.swing.JMenuItem sm_Historial;
    private javax.swing.JMenuItem sm_manual;
    private javax.swing.JMenuItem sm_nuevo;
    private javax.swing.JTextField txt_input;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
