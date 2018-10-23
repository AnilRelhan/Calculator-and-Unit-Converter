public class JavaCalculator extends javax.swing.JFrame {
    
    double firstnum, secondnum, result, r = 1;
    String operations;
    double temp, temperature;
    String i1="Celsius", i2="Fahrenheit";
    double ti, time;
    String i3="Hour", i4="Second";
    double ma, mass;
    String i5="Kilogramme", i6="Gramme";
    double len, length;
    String i7="Kilometre", i8="Metre";
    
    public JavaCalculator() {
        initComponents();
    }                        
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btnOne = new javax.swing.JButton();
        btnEqual = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnPoint = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnNSquare = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        txtDisplay = new javax.swing.JTextField();
        btnPlus = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnDivision = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnBackspace1 = new javax.swing.JButton();
        btnFact = new javax.swing.JButton();
        btnTan = new javax.swing.JButton();
        btnCos = new javax.swing.JButton();
        btnSin = new javax.swing.JButton();
        btnLog = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnPi = new javax.swing.JButton();
        btnSqrt = new javax.swing.JButton();
        btnCbrt = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnSix6 = new javax.swing.JButton();
        btnBackspace = new javax.swing.JButton();
        btnFour4 = new javax.swing.JButton();
        btnEight8 = new javax.swing.JButton();
        item2 = new javax.swing.JComboBox<>();
        btnNine9 = new javax.swing.JButton();
        item1 = new javax.swing.JComboBox<>();
        btnSeven7 = new javax.swing.JButton();
        textField2 = new javax.swing.JTextField();
        btnZero0 = new javax.swing.JButton();
        btnDot = new javax.swing.JButton();
        btnTwo2 = new javax.swing.JButton();
        btnAC = new javax.swing.JButton();
        btnThree3 = new javax.swing.JButton();
        btnOne1 = new javax.swing.JButton();
        btnFive5 = new javax.swing.JButton();
        btnPlusMinus = new javax.swing.JButton();
        btnConvert = new javax.swing.JButton();
        textField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        btnDot3 = new javax.swing.JButton();
        textField8 = new javax.swing.JTextField();
        btnZero0000 = new javax.swing.JButton();
        btnOne1111 = new javax.swing.JButton();
        btnConvert3 = new javax.swing.JButton();
        btnTwo2222 = new javax.swing.JButton();
        btnAC3 = new javax.swing.JButton();
        btnThree3333 = new javax.swing.JButton();
        btnBackspace4 = new javax.swing.JButton();
        btnFour4444 = new javax.swing.JButton();
        btnFive5555 = new javax.swing.JButton();
        btnSix6666 = new javax.swing.JButton();
        btnSeven7777 = new javax.swing.JButton();
        item7 = new javax.swing.JComboBox<>();
        btnEight8888 = new javax.swing.JButton();
        item8 = new javax.swing.JComboBox<>();
        btnNine9999 = new javax.swing.JButton();
        textField7 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        btnSeven777 = new javax.swing.JButton();
        item6 = new javax.swing.JComboBox<>();
        btnEight888 = new javax.swing.JButton();
        btnNine999 = new javax.swing.JButton();
        btnDot2 = new javax.swing.JButton();
        btnZero000 = new javax.swing.JButton();
        btnAC2 = new javax.swing.JButton();
        btnConvert2 = new javax.swing.JButton();
        btnBackspace3 = new javax.swing.JButton();
        textField5 = new javax.swing.JTextField();
        textField6 = new javax.swing.JTextField();
        item5 = new javax.swing.JComboBox<>();
        btnOne111 = new javax.swing.JButton();
        btnTwo222 = new javax.swing.JButton();
        btnThree333 = new javax.swing.JButton();
        btnFour444 = new javax.swing.JButton();
        btnFive555 = new javax.swing.JButton();
        btnSix666 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnSeven77 = new javax.swing.JButton();
        btnThree33 = new javax.swing.JButton();
        item4 = new javax.swing.JComboBox<>();
        btnSix66 = new javax.swing.JButton();
        item3 = new javax.swing.JComboBox<>();
        btnNine99 = new javax.swing.JButton();
        btnAC1 = new javax.swing.JButton();
        btnBackspace2 = new javax.swing.JButton();
        btnOne11 = new javax.swing.JButton();
        btnZero00 = new javax.swing.JButton();
        btnTwo22 = new javax.swing.JButton();
        btnDot1 = new javax.swing.JButton();
        btnFive55 = new javax.swing.JButton();
        btnConvert1 = new javax.swing.JButton();
        btnFour44 = new javax.swing.JButton();
        btnEight88 = new javax.swing.JButton();
        textField3 = new javax.swing.JTextField();
        textField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jRadioButton1.setText("jRadioButton1");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnOne.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        btnEqual.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEqual.setText("=");
        btnEqual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualActionPerformed(evt);
            }
        });
        btnFive.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        btnZero.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        btnSix.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        btnClear.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnClear.setForeground(new java.awt.Color(255, 153, 51));
        btnClear.setText("AC");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        btnFour.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        btnPercent.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnPercent.setText("%");
        btnPercent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPercentActionPerformed(evt);
            }
        });
        btnEight.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        btnPoint.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnPoint.setText(".");
        btnPoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPointActionPerformed(evt);
            }
        });
        btnNine.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        btnNSquare.setFont(new java.awt.Font("Tahoma", 1, 11));
        btnNSquare.setText("<html>X<sup>n</sup></html>");
        btnNSquare.setToolTipText("");
        btnNSquare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNSquareActionPerformed(evt);
            }
        });
        btnSeven.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        btnSubtract.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        txtDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDisplayActionPerformed(evt);
            }
        });
        btnPlus.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnPlus.setText("+");
        btnPlus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusActionPerformed(evt);
            }
        });
        btnTwo.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        btnDivision.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDivision.setText("/");
        btnDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivisionActionPerformed(evt);
            }
        });
        btnThree.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        btnMultiply.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnMultiply.setText("*");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        btnBackspace1.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBackspace1.setText("<--");
        btnBackspace1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspace1ActionPerformed(evt);
            }
        });
        btnFact.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFact.setText("!");
        btnFact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFactActionPerformed(evt);
            }
        });
        btnTan.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTan.setText("tan");
        btnTan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTanActionPerformed(evt);
            }
        });
        btnCos.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnCos.setText("cos");
        btnCos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCosActionPerformed(evt);
            }
        });
        btnSin.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSin.setText("sin");
        btnSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSinActionPerformed(evt);
            }
        });
        btnLog.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnLog.setText("log");
        btnLog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogActionPerformed(evt);
            }
        });
        btnE.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnE.setText("e");
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });
        btnPi.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnPi.setText("pi");
        btnPi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiActionPerformed(evt);
            }
        });
        btnSqrt.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSqrt.setText("Sqrt");
        btnSqrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSqrtActionPerformed(evt);
            }
        });
        btnCbrt.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnCbrt.setText("Cbrt");
        btnCbrt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCbrtActionPerformed(evt);
            }
        });
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackspace1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSqrt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCbrt, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPlus, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtDisplay, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPi, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                            .addComponent(btnTan, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnNSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSubtract, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEqual, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(15, 15, 15))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackspace1, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPlus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCbrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSqrt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnPi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubtract, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNSquare, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFact, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMultiply, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                            .addComponent(btnSeven, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnEight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnZero, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnPoint, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnPercent, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnLog, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnEqual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(58, 58, 58))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jTabbedPane1.addTab("Calculator", jPanel2);
        btnSix6.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSix6.setText("6");
        btnSix6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSix6ActionPerformed(evt);
            }
        });
        btnBackspace.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBackspace.setText("<--");
        btnBackspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspaceActionPerformed(evt);
            }
        });
        btnFour4.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFour4.setText("4");
        btnFour4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFour4ActionPerformed(evt);
            }
        });
        btnEight8.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEight8.setText("8");
        btnEight8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEight8ActionPerformed(evt);
            }
        });
        item2.setFont(new java.awt.Font("Tahoma", 1, 11));
        item2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fahrenheit", "Kelvin", "Celsius" }));
        item2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item2ActionPerformed(evt);
            }
        });
        btnNine9.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnNine9.setText("9");
        btnNine9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNine9ActionPerformed(evt);
            }
        });
        item1.setFont(new java.awt.Font("Tahoma", 1, 11));
        item1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius", "Fahrenheit", "Kelvin" }));
        item1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1ActionPerformed(evt);
            }
        });
        btnSeven7.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSeven7.setText("7");
        btnSeven7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeven7ActionPerformed(evt);
            }
        });
        textField2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnZero0.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnZero0.setText("0");
        btnZero0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero0ActionPerformed(evt);
            }
        });
        btnDot.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDot.setText(".");
        btnDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDotActionPerformed(evt);
            }
        });
        btnTwo2.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTwo2.setText("2");
        btnTwo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwo2ActionPerformed(evt);
            }
        });
        btnAC.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAC.setForeground(new java.awt.Color(255, 153, 51));
        btnAC.setText("AC");
        btnAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnACActionPerformed(evt);
            }
        });
        btnThree3.setFont(new java.awt.Font("Tahoma", 1, 12)); 
        btnThree3.setText("3");
        btnThree3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThree3ActionPerformed(evt);
            }
        });
        btnOne1.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnOne1.setText("1");
        btnOne1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOne1ActionPerformed(evt);
            }
        });
        btnFive5.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFive5.setText("5");
        btnFive5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFive5ActionPerformed(evt);
            }
        });
        btnPlusMinus.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnPlusMinus.setText("+/-");
        btnPlusMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlusMinusActionPerformed(evt);
            }
        });
        btnConvert.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnConvert.setText("Convert");
        btnConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvertActionPerformed(evt);
            }
        });
        textField1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField1.setText("0");
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel1.setText("Temperature Converter");
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnThree3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnFour4, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnFive5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(btnSeven7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnEight8, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSix6, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnNine9, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnBackspace, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnZero0, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAC, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOne1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFour4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPlusMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero0, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Temperature", jPanel3);
        btnDot3.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDot3.setText(".");
        btnDot3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDot3ActionPerformed(evt);
            }
        });
        textField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        btnZero0000.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnZero0000.setText("0");
        btnZero0000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero0000ActionPerformed(evt);
            }
        });
        btnOne1111.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnOne1111.setText("1");
        btnOne1111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOne1111ActionPerformed(evt);
            }
        });
        btnConvert3.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnConvert3.setText("Convert");
        btnConvert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert3ActionPerformed(evt);
            }
        });
        btnTwo2222.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTwo2222.setText("2");
        btnTwo2222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwo2222ActionPerformed(evt);
            }
        });
        btnAC3.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAC3.setForeground(new java.awt.Color(255, 153, 51));
        btnAC3.setText("AC");
        btnAC3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAC3ActionPerformed(evt);
            }
        });
        btnThree3333.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnThree3333.setText("3");
        btnThree3333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThree3333ActionPerformed(evt);
            }
        });
        btnBackspace4.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBackspace4.setText("<--");
        btnBackspace4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspace4ActionPerformed(evt);
            }
        });
        btnFour4444.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFour4444.setText("4");
        btnFour4444.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFour4444ActionPerformed(evt);
            }
        });
        btnFive5555.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFive5555.setText("5");
        btnFive5555.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFive5555ActionPerformed(evt);
            }
        });
        btnSix6666.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSix6666.setText("6");
        btnSix6666.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSix6666ActionPerformed(evt);
            }
        });
        btnSeven7777.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSeven7777.setText("7");
        btnSeven7777.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeven7777ActionPerformed(evt);
            }
        });
        item7.setFont(new java.awt.Font("Tahoma", 1, 11));
        item7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilometre", "Metre", "Mile", "Yard", "Foot", "Inch" }));
        item7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item7ActionPerformed(evt);
            }
        });
        btnEight8888.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEight8888.setText("8");
        btnEight8888.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEight8888ActionPerformed(evt);
            }
        });
        item8.setFont(new java.awt.Font("Tahoma", 1, 11));
        item8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Metre", "Kilometre", "Mile", "Yard", "Foot", "Inch" }));
        item8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item8ActionPerformed(evt);
            }
        });
        btnNine9999.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnNine9999.setText("9");
        btnNine9999.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNine9999ActionPerformed(evt);
            }
        });
        textField7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField7.setText("0");
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel2.setText("   Length Converter");
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(btnFour4444, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFive5555, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(btnDot3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnZero0000, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(btnSeven7777, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEight8888, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(btnOne1111, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnTwo2222, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnConvert3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnNine9999, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnSix6666, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnThree3333, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnBackspace4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnAC3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel6Layout.createSequentialGroup()
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                    .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(10, 10, 10)))
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(textField7, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                                .addComponent(textField8)))))
                .addGap(51, 51, 51))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAC3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThree3333, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwo2222, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOne1111, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSix6666, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive5555, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFour4444, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine9999, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight8888, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven7777, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero0000, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Length", jPanel6);
        btnSeven777.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSeven777.setText("7");
        btnSeven777.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeven777ActionPerformed(evt);
            }
        });
        item6.setFont(new java.awt.Font("Tahoma", 1, 11));
        item6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gramme", "Kilogramme", "Quintal", "Tonne", "Pound" }));
        item6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item6ActionPerformed(evt);
            }
        });
        btnEight888.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEight888.setText("8");
        btnEight888.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEight888ActionPerformed(evt);
            }
        });
        btnNine999.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnNine999.setText("9");
        btnNine999.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNine999ActionPerformed(evt);
            }
        });
        btnDot2.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDot2.setText(".");
        btnDot2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDot2ActionPerformed(evt);
            }
        });
        btnZero000.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnZero000.setText("0");
        btnZero000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero000ActionPerformed(evt);
            }
        });
        btnAC2.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAC2.setText("AC");
        btnAC2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAC2ActionPerformed(evt);
            }
        });
        btnConvert2.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnConvert2.setText("Convert");
        btnConvert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert2ActionPerformed(evt);
            }
        });
        btnBackspace3.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBackspace3.setText("<--");
        btnBackspace3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspace3ActionPerformed(evt);
            }
        });
        textField5.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField5.setText("0");
        textField6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        item5.setFont(new java.awt.Font("Tahoma", 1, 11));
        item5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kilogramme", "Gramme", "Quintal", "Tonne", "Pound" }));
        item5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5ActionPerformed(evt);
            }
        });
        btnOne111.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnOne111.setText("1");
        btnOne111.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOne111ActionPerformed(evt);
            }
        });
        btnTwo222.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTwo222.setText("2");
        btnTwo222.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwo222ActionPerformed(evt);
            }
        });
        btnThree333.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnThree333.setText("3");
        btnThree333.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThree333ActionPerformed(evt);
            }
        });
        btnFour444.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFour444.setText("4");
        btnFour444.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFour444ActionPerformed(evt);
            }
        });
        btnFive555.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFive555.setText("5");
        btnFive555.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFive555ActionPerformed(evt);
            }
        });
        btnSix666.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSix666.setText("6");
        btnSix666.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSix666ActionPerformed(evt);
            }
        });
        jLabel3.setFont(new java.awt.Font("Arial", 1, 24));
        jLabel3.setText("    Mass Converter");
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnDot2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZero000, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConvert2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(item6, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnOne111, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnTwo222, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnFour444, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnFive555, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(btnSeven777, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnEight888, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(6, 6, 6)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSix666, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnNine999, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnThree333, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnBackspace3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAC2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnThree333, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnTwo222, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnOne111, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSix666, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive555, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFour444, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine999, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight888, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven777, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero000, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Mass", jPanel5);
        btnSeven77.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSeven77.setText("7");
        btnSeven77.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeven77ActionPerformed(evt);
            }
        });
        btnThree33.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnThree33.setText("3");
        btnThree33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThree33ActionPerformed(evt);
            }
        });
        item4.setFont(new java.awt.Font("Tahoma", 1, 11));
        item4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Second", "Day", "Year", "Hour", "Minute" }));
        item4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item4ActionPerformed(evt);
            }
        });
        btnSix66.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnSix66.setText("6");
        btnSix66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSix66ActionPerformed(evt);
            }
        });
        item3.setFont(new java.awt.Font("Tahoma", 1, 11));
        item3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hour", "Minute", "Second", "Day", "Year" }));
        item3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item3ActionPerformed(evt);
            }
        });
        btnNine99.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnNine99.setText("9");
        btnNine99.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNine99ActionPerformed(evt);
            }
        });
        btnAC1.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnAC1.setText("AC");
        btnAC1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAC1ActionPerformed(evt);
            }
        });
        btnBackspace2.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnBackspace2.setText("<--");
        btnBackspace2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackspace2ActionPerformed(evt);
            }
        });
        btnOne11.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnOne11.setText("1");
        btnOne11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOne11ActionPerformed(evt);
            }
        });
        btnZero00.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnZero00.setText("0");
        btnZero00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZero00ActionPerformed(evt);
            }
        });
        btnTwo22.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnTwo22.setText("2");
        btnTwo22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwo22ActionPerformed(evt);
            }
        });
        btnDot1.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnDot1.setText(".");
        btnDot1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDot1ActionPerformed(evt);
            }
        });
        btnFive55.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFive55.setText("5");
        btnFive55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFive55ActionPerformed(evt);
            }
        });
        btnConvert1.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnConvert1.setText("Convert");
        btnConvert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConvert1ActionPerformed(evt);
            }
        });
        btnFour44.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnFour44.setText("4");
        btnFour44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFour44ActionPerformed(evt);
            }
        });
        btnEight88.setFont(new java.awt.Font("Tahoma", 1, 12));
        btnEight88.setText("8");
        btnEight88.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEight88ActionPerformed(evt);
            }
        });
        textField3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        textField3.setText("0");
        textField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jLabel4.setFont(new java.awt.Font("Arial", 1, 28));
        jLabel4.setText("    Time Converter");
        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnSeven77, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEight88, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNine99, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnFour44, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFive55, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSix66, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(btnOne11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTwo22, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThree33, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBackspace2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAC1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(btnDot1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnZero00, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConvert1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textField4)
                            .addComponent(textField3))))
                .addGap(52, 52, 52))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnThree33, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTwo22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOne11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSix66, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFive55, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFour44, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnAC1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackspace2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine99, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight88, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeven77, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConvert1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnZero00, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDot1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Time", jPanel4);
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        pack();
    }
    private void txtDisplayActionPerformed(java.awt.event.ActionEvent evt) {
    }                                          
    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnOne.getText();
        txtDisplay.setText(Enternumber);
    }                                      
    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnTwo.getText();
        txtDisplay.setText(Enternumber);
    }                                      
    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnThree.getText();
        txtDisplay.setText(Enternumber);
    }                                        
    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnFour.getText();
        txtDisplay.setText(Enternumber);
    }                                       
    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnFive.getText();
        txtDisplay.setText(Enternumber);
    }                                       
    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnSix.getText();
        txtDisplay.setText(Enternumber);
    }                                      
    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnSeven.getText();
        txtDisplay.setText(Enternumber);
    }                                       
    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnEight.getText();
        txtDisplay.setText(Enternumber);
    }                                        
    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText()+btnNine.getText();
        txtDisplay.setText(Enternumber);
    }                                       
    private void btnPlusActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="+";
    }                                       
    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = txtDisplay.getText();
        if(Enternumber.length()>0){
            firstnum = Double.parseDouble(txtDisplay.getText());
            txtDisplay.setText("");
            operations="-";
        }
        else{
            txtDisplay.setText("-");
        }
    }                                           
    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="*";
    }                                           
    private void btnDivisionActionPerformed(java.awt.event.ActionEvent evt) {
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations="/";
    }                                           
    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = txtDisplay.getText()+btnZero.getText();
        txtDisplay.setText(Enternumber);
    }                                       
    private void btnEqualActionPerformed(java.awt.event.ActionEvent evt) {                                         
       if(operations.equals("sin")||operations.equals("cos")||operations.equals("tan")||operations.equals("log")){
           secondnum = Double.parseDouble(txtDisplay.getText().substring(4));
           double t=java.lang.Math.toRadians(secondnum);
           
           if(operations.equals("sin"))
               result=java.lang.Math.sin(t);
           else if(operations.equals("cos"))
               result=java.lang.Math.cos(t);
           else if(operations.equals("tan"))
               result=java.lang.Math.tan(t);
           else
               result=java.lang.Math.log10(secondnum);
       }
       else{
           secondnum = Double.parseDouble(txtDisplay.getText());
        
            if(operations.equals("+"))
                result = firstnum+secondnum;
            else if(operations.equals("-"))
                result = firstnum-secondnum;
            else if(operations.equals("*"))
                result = firstnum*secondnum;
            else if(operations.equals("/"))
                result = firstnum/secondnum;
            else if(operations.equals("%"))
                result = (firstnum/100)*secondnum;
            else if(operations.equals("^")){
                for(int i=1; i<=secondnum; i++){
                    r = firstnum*r; 
                }
                result = r;
            }
       }
       txtDisplay.setText(result+"");
    }
	private void btnFactActionPerformed(java.awt.event.ActionEvent evt) { 
        firstnum = Double.parseDouble(txtDisplay.getText());
        for(int i=1; i<=firstnum; i++){
            r=r*i;
        }
        txtDisplay.setText(r+"");
    }
    private void btnTanActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = txtDisplay.getText();
        if(Enternumber.length()==0){
            txtDisplay.setText("tan(");
            operations="tan";
        }
    }
    private void btnCosActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText();
        if(Enternumber.length()==0){
            txtDisplay.setText("cos(");
            operations="cos";
        }
    }
    private void btnSinActionPerformed(java.awt.event.ActionEvent evt) {   
        String Enternumber = txtDisplay.getText();
        if(Enternumber.length()==0){
            txtDisplay.setText("sin(");
            operations="sin";
        }
    }
    private void btnLogActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = txtDisplay.getText();
        if(Enternumber.length()==0){
            txtDisplay.setText("log(");
            operations="log";
        }
	}	
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {  
        secondnum = 0;
        r=1;
        result=0;
        txtDisplay.setText("");
    }                                        
    private void btnPointActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = txtDisplay.getText();
        if(Enternumber.indexOf('.')<0)
            Enternumber = txtDisplay.getText()+btnPoint.getText();
        else
            Enternumber = txtDisplay.getText();
        txtDisplay.setText(Enternumber);
    }                                        
    private void btnPercentActionPerformed(java.awt.event.ActionEvent evt) {  
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "%";
    }                                          
    private void btnNSquareActionPerformed(java.awt.event.ActionEvent evt) {   
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
        operations = "^";
    }                                          
    private void item2ActionPerformed(java.awt.event.ActionEvent evt) { 
        i2 = (String)item2.getSelectedItem();
    }                                     
    private void item1ActionPerformed(java.awt.event.ActionEvent evt) {
        i1 = (String)item1.getSelectedItem();
    }                                     
    private void btnTwo2ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField1.getText()+btnTwo2.getText();
        textField1.setText(Enternumber);
    }                                       
    private void btnConvertActionPerformed(java.awt.event.ActionEvent evt) {
        temp = Double.parseDouble(textField1.getText());
        
        if(i1.equals("Celsius") && i2.equals("Fahrenheit"))
            temperature = (temp*1.8)+32;
        else if(i1.equals("Celsius") && i2.equals("Kelvin"))
            temperature = (temp+273.15);
        else if(i1.equals("Celsius") && i2.equals("Celsius"))
            temperature = temp;
        
        else if(i1.equals("Kelvin") && i2.equals("Kelvin"))
            temperature = temp;
        else if(i1.equals("Kelvin") && i2.equals("Celsius"))
            temperature = temp-273.15;
        else if(i1.equals("Kelvin") && i2.equals("Fahrenheit"))
            temperature = 1.8*(temp-273.15)+32;
        
        else if(i1.equals("Fahrenheit") && i2.equals("Celsius"))
            temperature = (temp-32)/1.8;
        else if(i1.equals("Fahrenheit") && i2.equals("Kelvin"))
            temperature = (temp-32)/1.8+273.15;
        else if(i1.equals("Fahrenheit") && i2.equals("Fahrenheit"))
            temperature = temp;
        
        textField2.setText(temperature+"");
    }                                          
    private void btnOne1ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnOne1.getText();
        textField1.setText(Enternumber);
    }                                       
    private void btnFive5ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField1.getText()+btnFive5.getText();
        textField1.setText(Enternumber);
    }                                        
    private void btnSix6ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField1.getText()+btnSix6.getText();
        textField1.setText(Enternumber);
    }                                       
    private void btnFour4ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnFour4.getText();
        textField1.setText(Enternumber);
    }                                        
    private void btnEight8ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField1.getText()+btnEight8.getText();
        textField1.setText(Enternumber);
    }                                         
    private void btnNine9ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnNine9.getText();
        textField1.setText(Enternumber);
    }                                        
    private void btnSeven7ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnSeven7.getText();
        textField1.setText(Enternumber);
    }                                         
    private void btnZero0ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnZero0.getText();
        textField1.setText(Enternumber);
    }                                        
    private void btnDotActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField1.getText();
        if(Enternumber.indexOf('.')<0)
            Enternumber = textField1.getText()+btnPoint.getText();
        else
            Enternumber = textField1.getText();
        textField1.setText(Enternumber);
    }                                      
    private void btnACActionPerformed(java.awt.event.ActionEvent evt) {  
        textField1.setText("0");
        textField2.setText("");
    }                                     
    private void btnThree3ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField1.getText()+btnThree3.getText();
        textField1.setText(Enternumber);
    }                                         
    private void btnPlusMinusActionPerformed(java.awt.event.ActionEvent evt) { 
        double t = Double.parseDouble(textField1.getText());
        
        if(t>0 || t<0)
            textField1.setText(-t+"");
    }                                            
    private void btnBackspaceActionPerformed(java.awt.event.ActionEvent evt) {   
        String s;
        if(textField1.getText().length()>0){
            StringBuilder st = new StringBuilder(textField1.getText());
            st.deleteCharAt(textField1.getText().length()-1);
            
            s = st.toString();
            textField1.setText(s);
        }
    }                                            
    private void btnBackspace1ActionPerformed(java.awt.event.ActionEvent evt) {
        String s;
        if(txtDisplay.getText().length()>0){
            StringBuilder st = new StringBuilder(txtDisplay.getText());
            st.deleteCharAt(txtDisplay.getText().length()-1);
            
            s = st.toString();
            txtDisplay.setText(s);
        }
    }                                             
    private void item4ActionPerformed(java.awt.event.ActionEvent evt) { 
        i4 = (String)item4.getSelectedItem();
    }                                     
    private void item3ActionPerformed(java.awt.event.ActionEvent evt) {  
        i3 = (String)item3.getSelectedItem();
    }                                     
    private void btnOne11ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField3.getText()+btnOne11.getText();
        textField3.setText(Enternumber);
    }                                        
    private void btnTwo22ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField3.getText()+btnTwo22.getText();
        textField3.setText(Enternumber);
    }                                        
    private void btnFive55ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField3.getText()+btnFive55.getText();
        textField3.setText(Enternumber);
    }                                         
    private void btnFour44ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField3.getText()+btnFour44.getText();
        textField3.setText(Enternumber);
    }                                         
    private void btnEight88ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField3.getText()+btnEight88.getText();
        textField3.setText(Enternumber);
    }                                          
    private void btnSeven77ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField3.getText()+btnSeven77.getText();
        textField3.setText(Enternumber);
    }                                          
    private void btnThree33ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField3.getText()+btnThree33.getText();
        textField3.setText(Enternumber);
    }                                          
    private void btnSix66ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField3.getText()+btnSix66.getText();
        textField3.setText(Enternumber);
    }                                        
    private void btnNine99ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField3.getText()+btnNine99.getText();
        textField3.setText(Enternumber);
    }                                         
    private void btnAC1ActionPerformed(java.awt.event.ActionEvent evt) {   
        textField3.setText("0");
        textField4.setText("");
    }                                      
    private void btnBackspace2ActionPerformed(java.awt.event.ActionEvent evt) {  
        String s;
        if(textField3.getText().length()>0){
            StringBuilder st = new StringBuilder(textField3.getText());
            st.deleteCharAt(textField3.getText().length()-1);
            
            s = st.toString();
            textField3.setText(s);
        }
    }                                             
    private void btnZero00ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField3.getText()+btnZero00.getText();
        textField3.setText(Enternumber);
    }                                         
    private void btnDot1ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField3.getText();
        if(Enternumber.indexOf('.')<0)
            Enternumber = textField3.getText()+btnPoint.getText();
        else
            Enternumber = textField3.getText();
        textField3.setText(Enternumber);
    }                                       
    private void btnConvert1ActionPerformed(java.awt.event.ActionEvent evt) { 
        ti = Double.parseDouble(textField3.getText());
        
        if(i3.equals("Year") && i4.equals("Second"))
            time = ti*31536000;
        else if(i3.equals("Year") && i4.equals("Hour"))
            time = ti*8760;
        else if(i3.equals("Year") && i4.equals("Day"))
            time = ti*365;
        else if(i3.equals("Year") && i4.equals("Year"))
            time = ti;
        else if(i3.equals("Year") && i4.equals("Minute"))
            time = ti*525600;
        
        else if(i3.equals("Day") && i4.equals("Second"))
            time = ti*86400;
        else if(i3.equals("Day") && i4.equals("Hour"))
            time = ti*24;
        else if(i3.equals("Day") && i4.equals("Day"))
            time = ti;
        else if(i3.equals("Day") && i4.equals("Year"))
            time = ti/365;
        else if(i3.equals("Day") && i4.equals("Minute"))
            time = ti*1440;
        
        else if(i3.equals("Hour") && i4.equals("Second"))
            time = ti*3600;
        else if(i3.equals("Hour") && i4.equals("Hour"))
            time = ti;
        else if(i3.equals("Hour") && i4.equals("Day"))
            time = ti/24;
        else if(i3.equals("Hour") && i4.equals("Year"))
            time = ti/8760;
        else if(i3.equals("Hour") && i4.equals("Minute"))
            time = ti*60;
        
        else if(i3.equals("Minute") && i4.equals("Second"))
            time = ti*60;
        else if(i3.equals("Minute") && i4.equals("Hour"))
            time = ti/60;
        else if(i3.equals("Minute") && i4.equals("Day"))
            time = ti/1440;
        else if(i3.equals("Minute") && i4.equals("Year"))
            time = ti/525600;
        else if(i3.equals("Minute") && i4.equals("Minute"))
            time = ti;
        
        else if(i3.equals("Second") && i4.equals("Second"))
            time = ti;
        else if(i3.equals("Second") && i4.equals("Hour"))
            time = ti/3600;
        else if(i3.equals("Second") && i4.equals("Day"))
            time = ti/86400;
        else if(i3.equals("Second") && i4.equals("Year"))
            time = ti/315360000;
        else if(i3.equals("Second") && i4.equals("Minute"))
            time = ti/60;
        
        textField4.setText(time+"");
    }                                           
    private void item6ActionPerformed(java.awt.event.ActionEvent evt) {
        i6 = (String)item6.getSelectedItem();
    }                                     
    private void btnOne111ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField5.getText()+btnOne111.getText();
        textField5.setText(Enternumber);
    }
    private void btnTwo222ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnTwo222.getText();
        textField5.setText(Enternumber);
    }
    private void btnThree333ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnThree333.getText();
        textField5.setText(Enternumber);
    }
    private void btnFour444ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnFour444.getText();
        textField5.setText(Enternumber);
	}
    private void btnFive555ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnFive555.getText();
        textField5.setText(Enternumber);
    }
    private void btnSix666ActionPerformed(java.awt.event.ActionEvent evt) { 
        String Enternumber = textField5.getText()+btnSix666.getText();
        textField5.setText(Enternumber);
    }
    private void btnSeven777ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnSeven777.getText();
        textField5.setText(Enternumber);
    }
    private void btnEight888ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnEight888.getText();
        textField5.setText(Enternumber);
    }
    private void btnNine999ActionPerformed(java.awt.event.ActionEvent evt) {  
        String Enternumber = textField5.getText()+btnNine999.getText();
        textField5.setText(Enternumber);
    }
    private void btnDot2ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText();
        if(Enternumber.indexOf('.')<0)
            Enternumber = textField5.getText()+btnPoint.getText();
        else
            Enternumber = textField5.getText();
        textField5.setText(Enternumber);
    }
    private void btnZero000ActionPerformed(java.awt.event.ActionEvent evt) {
        String Enternumber = textField5.getText()+btnZero000.getText();
        textField5.setText(Enternumber);
    }
    private void btnAC2ActionPerformed(java.awt.event.ActionEvent evt) {  
        textField6.setText("");
    }
    private void btnConvert2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        ma = Double.parseDouble(textField5.getText());
        
        if(i5.equals("Kilogramme") && i6.equals("Gramme"))
            mass = ma*1000;
        else if(i5.equals("Kilogramme") && i6.equals("Kilogramme"))
            mass = ma;
        else if(i5.equals("Kilogramme") && i6.equals("Tonne"))
            mass = ma/1000;
        else if(i5.equals("Kilogramme") && i6.equals("Quintal"))
            mass = ma/100;
        else if(i5.equals("Kilogramme") && i6.equals("Pound"))
            mass = ma*2.20462262;
        
        else if(i5.equals("Quintal") && i6.equals("Pound"))
            mass = ma*220.462262;
        else if(i5.equals("Quintal") && i6.equals("Kilogramme"))
            mass = ma*100;
        else if(i5.equals("Quintal") && i6.equals("Gramme"))
            mass = ma*100000;
        else if(i5.equals("Quintal") && i6.equals("Quintal"))
            mass = ma;
        else if(i5.equals("Quintal") && i6.equals("Tonne"))
            mass = ma/10;
        
        else if(i5.equals("Tonne") && i6.equals("Tonne"))
            mass = ma;
        else if(i5.equals("Tonne") && i6.equals("Kilogramme"))
            mass = ma*1000;
        else if(i5.equals("Tonne") && i6.equals("Gramme"))
            mass = ma*1000000;
        else if(i5.equals("Tonne") && i6.equals("Quintal"))
            mass = ma*10;
        else if(i5.equals("Tonne") && i6.equals("Pound"))
            mass = ma*2204.62262;
        
        else if(i5.equals("Gramme") && i6.equals("Pound"))
            mass = ma/453.59237;
        else if(i5.equals("Gramme") && i6.equals("Kilogramme"))
            mass = ma/1000;
        else if(i5.equals("Gramme") && i6.equals("Quintal"))
            mass = ma/100000;
        else if(i5.equals("Gramme") && i6.equals("Tonne"))
            mass = ma/1000000;
        else if(i5.equals("Gramme") && i6.equals("Gramme"))
            mass = ma;
        
        else if(i5.equals("Pound") && i6.equals("Tonne"))
            mass = ma/2204.62262;
        else if(i5.equals("Pound") && i6.equals("Gramme"))
            mass = ma*453.59237;
        else if(i5.equals("Pound") && i6.equals("Kilogramme"))
            mass = ma/2.20462262;
        else if(i5.equals("Pound") && i6.equals("Quintal"))
            mass = ma/220.462262;
        else if(i5.equals("Pound") && i6.equals("Pound"))
            mass = ma;
        
        textField6.setText(mass+"");
    }
    private void btnBackspace3ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String s;
        if(textField5.getText().length()>0){
            StringBuilder st = new StringBuilder(textField5.getText());
            st.deleteCharAt(textField5.getText().length()-1);
            
            s = st.toString();
            textField5.setText(s);
        }
    }
    private void item5ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        i5 = (String)item5.getSelectedItem();
    }
    private void item7ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        i7 = (String)item7.getSelectedItem();
    }
    private void item8ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        i8 = (String)item8.getSelectedItem();
    }
    private void btnOne1111ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Enternumber = textField7.getText()+btnOne1111.getText();
        textField7.setText(Enternumber);
    }
    private void btnTwo2222ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Enternumber = textField7.getText()+btnTwo2222.getText();
        textField7.setText(Enternumber);
    }
    private void btnThree3333ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String Enternumber = textField7.getText()+btnThree3333.getText();
        textField7.setText(Enternumber);
    }
    private void btnFour4444ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String Enternumber = textField7.getText()+btnFour4444.getText();
        textField7.setText(Enternumber);
    }
    private void btnFive5555ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String Enternumber = textField7.getText()+btnFive5555.getText();
        textField7.setText(Enternumber);
    }
    private void btnSix6666ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        String Enternumber = textField7.getText()+btnSix6666.getText();
        textField7.setText(Enternumber);
    }
    private void btnSeven7777ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String Enternumber = textField7.getText()+btnSeven7777.getText();
        textField7.setText(Enternumber);
    }
    private void btnEight8888ActionPerformed(java.awt.event.ActionEvent evt) {                                             
        String Enternumber = textField7.getText()+btnEight8888.getText();
        textField7.setText(Enternumber);
    }
    private void btnNine9999ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String Enternumber = textField7.getText()+btnNine9999.getText();
        textField7.setText(Enternumber);
    }
    private void btnDot3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String Enternumber = textField7.getText();
        if(Enternumber.indexOf('.')<0)
            Enternumber = textField7.getText()+btnPoint.getText();
        else
            Enternumber = textField7.getText();
        textField7.setText(Enternumber);
    }
    private void btnZero0000ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        String Enternumber = textField7.getText()+btnZero0000.getText();
        textField7.setText(Enternumber);
    }
    private void btnConvert3ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        len = Double.parseDouble(textField7.getText());
        
        if(i7.equals("Kilometre") && i8.equals("Metre"))
            length = len*1000;
        else if(i7.equals("Kilometre") && i8.equals("Mile"))
            length = len*0.621371192;
        else if(i7.equals("Kilometre") && i8.equals("Yard"))
            length = len*1093.6133;
        else if(i7.equals("Kilometre") && i8.equals("Foot"))
            length = len*3280.8399;
        else if(i7.equals("Kilometre") && i8.equals("Inch"))
            length = len*39370.0787;
        else if(i7.equals("Kilometre") && i8.equals("Kilometre"))
            length = len;
        
        else if(i7.equals("Metre") && i8.equals("Kilometre"))
            length = len*0.001;
        else if(i7.equals("Metre") && i8.equals("Mile"))
            length = len*0.000621371192;
        else if(i7.equals("Metre") && i8.equals("Yard"))
            length = len*1.0936133;
        else if(i7.equals("Metre") && i8.equals("Foot"))
            length = len*3.2808399;
        else if(i7.equals("Metre") && i8.equals("Inch"))
            length = len*39.3700787;
        else if(i7.equals("Metre") && i8.equals("Metre"))
            length = len;
        
        else if(i7.equals("Yard") && i8.equals("Metre"))
            length = len*0.9144;
        else if(i7.equals("Yard") && i8.equals("Kilometre"))
            length = len*0.0009144;
        else if(i7.equals("Yard") && i8.equals("Foot"))
            length = len*3;
        else if(i7.equals("Yard") && i8.equals("Inch"))
            length = len*36;
        else if(i7.equals("Yard") && i8.equals("Mile"))
            length = len*0.000568181818;
        else if(i7.equals("Yard") && i8.equals("Yard"))
            length = len;
        
        else if(i7.equals("Mile") && i8.equals("Yard"))
            length = len*1760;
        else if(i7.equals("Mile") && i8.equals("Foot"))
            length = len*5280;
        else if(i7.equals("Mile") && i8.equals("Inch"))
            length = len*63360;
        else if(i7.equals("Mile") && i8.equals("Kilometre"))
            length = len*1.609344;
        else if(i7.equals("Mile") && i8.equals("Metre"))
            length = len*1609.344;
        else if(i7.equals("Mile") && i8.equals("Mile"))
            length = len;
        
        else if(i7.equals("Foot") && i8.equals("Mile"))
            length = len*0.000189393939;
        else if(i7.equals("Foot") && i8.equals("Kilometre"))
            length = len*0.0003048;
        else if(i7.equals("Foot") && i8.equals("Metre"))
            length = len*0.3048;
        else if(i7.equals("Foot") && i8.equals("Yard"))
            length = len/3;
        else if(i7.equals("Foot") && i8.equals("Inch"))
            length = len*12;
        else if(i7.equals("Foot") && i8.equals("Foot"))
            length = len;
        
        else if(i7.equals("Inch") && i8.equals("Foot"))
            length = len/12;
        else if(i7.equals("Inch") && i8.equals("Kilometre"))
            length = len/39370.0708;
        else if(i7.equals("Inch") && i8.equals("Metre"))
            length = len/39.3700787;
        else if(i7.equals("Inch") && i8.equals("Mile"))
            length = len/63360;
        else if(i7.equals("Inch") && i8.equals("Yard"))
            length = len/36;
        else if(i7.equals("Inch") && i8.equals("Inch"))
            length = len;
        
        textField8.setText(length+"");
    }
    private void btnAC3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        textField7.setText("0");
        textField8.setText("");
    }
    private void btnBackspace4ActionPerformed(java.awt.event.ActionEvent evt) {                                              
        String s;
        if(textField7.getText().length()>0){
            StringBuilder st = new StringBuilder(textField7.getText());
            st.deleteCharAt(textField7.getText().length()-1);
            
            s = st.toString();
            textField7.setText(s);
        }
    }
    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {                                     
        txtDisplay.setText("2.71828183");
    }
    private void btnPiActionPerformed(java.awt.event.ActionEvent evt) {                                      
        txtDisplay.setText("3.14159265");
    }
    private void btnSqrtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText(Math.sqrt(firstnum)+"");
    }
    private void btnCbrtActionPerformed(java.awt.event.ActionEvent evt) {                                        
        firstnum = Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText(Math.cbrt(firstnum)+"");
    }
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaCalculator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaCalculator().setVisible(true);
            }
        });
    }                   
    private javax.swing.JButton btnAC;
    private javax.swing.JButton btnAC1;
    private javax.swing.JButton btnAC2;
    private javax.swing.JButton btnAC3;
    private javax.swing.JButton btnBackspace;
    private javax.swing.JButton btnBackspace1;
    private javax.swing.JButton btnBackspace2;
    private javax.swing.JButton btnBackspace3;
    private javax.swing.JButton btnBackspace4;
    private javax.swing.JButton btnCbrt;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnConvert;
    private javax.swing.JButton btnConvert1;
    private javax.swing.JButton btnConvert2;
    private javax.swing.JButton btnConvert3;
    private javax.swing.JButton btnCos;
    private javax.swing.JButton btnDivision;
    private javax.swing.JButton btnDot;
    private javax.swing.JButton btnDot1;
    private javax.swing.JButton btnDot2;
    private javax.swing.JButton btnDot3;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEight8;
    private javax.swing.JButton btnEight88;
    private javax.swing.JButton btnEight888;
    private javax.swing.JButton btnEight8888;
    private javax.swing.JButton btnEqual;
    private javax.swing.JButton btnFact;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFive5;
    private javax.swing.JButton btnFive55;
    private javax.swing.JButton btnFive555;
    private javax.swing.JButton btnFive5555;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnFour4;
    private javax.swing.JButton btnFour44;
    private javax.swing.JButton btnFour444;
    private javax.swing.JButton btnFour4444;
    private javax.swing.JButton btnLog;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNSquare;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnNine9;
    private javax.swing.JButton btnNine99;
    private javax.swing.JButton btnNine999;
    private javax.swing.JButton btnNine9999;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnOne1;
    private javax.swing.JButton btnOne11;
    private javax.swing.JButton btnOne111;
    private javax.swing.JButton btnOne1111;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnPi;
    private javax.swing.JButton btnPlus;
    private javax.swing.JButton btnPlusMinus;
    private javax.swing.JButton btnPoint;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSeven7;
    private javax.swing.JButton btnSeven77;
    private javax.swing.JButton btnSeven777;
    private javax.swing.JButton btnSeven7777;
    private javax.swing.JButton btnSin;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSix6;
    private javax.swing.JButton btnSix66;
    private javax.swing.JButton btnSix666;
    private javax.swing.JButton btnSix6666;
    private javax.swing.JButton btnSqrt;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnTan;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnThree3;
    private javax.swing.JButton btnThree33;
    private javax.swing.JButton btnThree333;
    private javax.swing.JButton btnThree3333;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnTwo2;
    private javax.swing.JButton btnTwo22;
    private javax.swing.JButton btnTwo222;
    private javax.swing.JButton btnTwo2222;
    private javax.swing.JButton btnZero;
    private javax.swing.JButton btnZero0;
    private javax.swing.JButton btnZero00;
    private javax.swing.JButton btnZero000;
    private javax.swing.JButton btnZero0000;
    private javax.swing.JComboBox<String> item1;
    private javax.swing.JComboBox<String> item2;
    private javax.swing.JComboBox<String> item3;
    private javax.swing.JComboBox<String> item4;
    private javax.swing.JComboBox<String> item5;
    private javax.swing.JComboBox<String> item6;
    private javax.swing.JComboBox<String> item7;
    private javax.swing.JComboBox<String> item8;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField textField1;
    private javax.swing.JTextField textField2;
    private javax.swing.JTextField textField3;
    private javax.swing.JTextField textField4;
    private javax.swing.JTextField textField5;
    private javax.swing.JTextField textField6;
    private javax.swing.JTextField textField7;
    private javax.swing.JTextField textField8;
    private javax.swing.JTextField txtDisplay;              
}