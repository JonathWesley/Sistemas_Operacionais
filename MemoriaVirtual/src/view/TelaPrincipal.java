package view;

import java.math.BigInteger;

public class TelaPrincipal extends javax.swing.JFrame {
    //criando a memoria
    public classes.VirtualMemory memoria = new classes.VirtualMemory();
    public classes.VirtualMemory memoriaExercicio = new classes.VirtualMemory();
    
    //inicia os componentes graficos
    public TelaPrincipal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel28 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        PanelInicial = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        PanelTutorial1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoEndereco1 = new javax.swing.JTextField();
        campoEndereco2 = new javax.swing.JTextField();
        campoEndereco3 = new javax.swing.JTextField();
        campoEndereco4 = new javax.swing.JTextField();
        campoEndereco5 = new javax.swing.JTextField();
        campoEndereco6 = new javax.swing.JTextField();
        campoConteudo1 = new javax.swing.JTextField();
        campoConteudo2 = new javax.swing.JTextField();
        campoConteudo3 = new javax.swing.JTextField();
        campoConteudo4 = new javax.swing.JTextField();
        campoConteudo5 = new javax.swing.JTextField();
        campoConteudo6 = new javax.swing.JTextField();
        botaoContinuarT1 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        PanelTutorial2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        campoPDBR = new javax.swing.JTextField();
        campoVM = new javax.swing.JTextField();
        botaoContinuarT2 = new javax.swing.JButton();
        botaoVoltar2 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelTutorial3 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        VmHex = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        VmBin = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        VmP1 = new javax.swing.JLabel();
        VmP2 = new javax.swing.JLabel();
        VmP3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        botaoContinuarT3 = new javax.swing.JButton();
        botaoVoltar3 = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        PtnBIN = new javax.swing.JLabel();
        PnBIN = new javax.swing.JLabel();
        OffsetBIN = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        PanelTutorial4 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        PdbrLabel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        PageTableNumberLabel = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PageTableNumberx4Label = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        somaPTNandPDBR = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        valorFisico = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        conteudo = new javax.swing.JLabel();
        botaoContinuarT4 = new javax.swing.JButton();
        botaoVoltar4 = new javax.swing.JButton();
        jLabel34 = new javax.swing.JLabel();
        PanelTutorial5 = new javax.swing.JPanel();
        bits_31_12 = new javax.swing.JLabel();
        bits_11_7 = new javax.swing.JLabel();
        bits_6 = new javax.swing.JLabel();
        bits_5 = new javax.swing.JLabel();
        bits_4_3 = new javax.swing.JLabel();
        bits_2 = new javax.swing.JLabel();
        bits_1 = new javax.swing.JLabel();
        bits_0 = new javax.swing.JLabel();
        botaoContinuarT5 = new javax.swing.JButton();
        botaoVoltar5 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        AdressPanel = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        PanelTutorial6 = new javax.swing.JPanel();
        adressPageTable = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        PageNumberLabel = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        PageNumberx4Label = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        adressAndPN = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        valorFisico1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        conteudo1 = new javax.swing.JLabel();
        botaoContinuarT6 = new javax.swing.JButton();
        botaoVoltar6 = new javax.swing.JButton();
        jLabel36 = new javax.swing.JLabel();
        PanelTutorial7 = new javax.swing.JPanel();
        bits_31_121 = new javax.swing.JLabel();
        bits_11_71 = new javax.swing.JLabel();
        bits_61 = new javax.swing.JLabel();
        bits_51 = new javax.swing.JLabel();
        bits_4_31 = new javax.swing.JLabel();
        bits_21 = new javax.swing.JLabel();
        bits_11 = new javax.swing.JLabel();
        bits_01 = new javax.swing.JLabel();
        botaoContinuar7 = new javax.swing.JButton();
        botaoVoltar7 = new javax.swing.JButton();
        jLabel37 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        endPanel7 = new javax.swing.JLabel();
        PanelTutorial8 = new javax.swing.JPanel();
        Encerrar = new javax.swing.JButton();
        pageEntryStart = new javax.swing.JLabel();
        physicalAdress = new javax.swing.JLabel();
        finalContent = new javax.swing.JLabel();
        botaoVoltar8 = new javax.swing.JButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        PanelSobre1 = new javax.swing.JPanel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        PanelEx1 = new javax.swing.JPanel();
        jLabel69 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        campoEnderecoE5 = new javax.swing.JTextField();
        campoEnderecoE2 = new javax.swing.JTextField();
        campoEnderecoE3 = new javax.swing.JTextField();
        campoEnderecoE4 = new javax.swing.JTextField();
        campoEnderecoE1 = new javax.swing.JTextField();
        campoEnderecoE6 = new javax.swing.JTextField();
        campoConteudoE1 = new javax.swing.JTextField();
        campoConteudoE2 = new javax.swing.JTextField();
        campoConteudoE3 = new javax.swing.JTextField();
        campoConteudoE4 = new javax.swing.JTextField();
        campoConteudoE5 = new javax.swing.JTextField();
        campoConteudoE6 = new javax.swing.JTextField();
        botaoContinuarE1 = new javax.swing.JButton();
        VoltarE1 = new javax.swing.JButton();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        campoPDBRE = new javax.swing.JTextField();
        campoVME = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        PanelEx2 = new javax.swing.JPanel();
        botaoContinuarE2 = new javax.swing.JButton();
        VoltarE2 = new javax.swing.JButton();
        jLabel79 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        correcaoLabel = new javax.swing.JLabel();
        PanelEx3 = new javax.swing.JPanel();
        botaoContinuarE3 = new javax.swing.JButton();
        VoltarE3 = new javax.swing.JButton();
        jLabel87 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        correcaoLabel2 = new javax.swing.JLabel();
        PanelEx4 = new javax.swing.JPanel();
        jLabel102 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jTextField30 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jLabel91 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jTextField32 = new javax.swing.JTextField();
        VoltarE4 = new javax.swing.JButton();
        jLabel125 = new javax.swing.JLabel();
        botaoContinuarE4 = new javax.swing.JButton();
        correcaoLabel3 = new javax.swing.JLabel();
        menu = new javax.swing.JMenuBar();
        menu_tutorial_btn = new javax.swing.JMenu();
        menu_exercicio_btn = new javax.swing.JMenu();
        menu_sobre_btn = new javax.swing.JMenu();

        jRadioButton1.setText("jRadioButton1");

        jLabel28.setText("jLabel28");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Memória Virtual");
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        PanelPrincipal.setLayout(new java.awt.CardLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("MEMÓRIA VIRTUAL:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel30.setText("Algorítmo de Paginação de Memória");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelInicialLayout = new javax.swing.GroupLayout(PanelInicial);
        PanelInicial.setLayout(PanelInicialLayout);
        PanelInicialLayout.setHorizontalGroup(
            PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicialLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(PanelInicialLayout.createSequentialGroup()
                        .addGap(0, 249, Short.MAX_VALUE)
                        .addComponent(jLabel30)
                        .addGap(0, 250, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(161, 161, 161))
        );
        PanelInicialLayout.setVerticalGroup(
            PanelInicialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicialLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel30)
                .addGap(211, 211, 211))
        );

        PanelPrincipal.add(PanelInicial, "card4");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Endereço:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Conteúdo:");

        campoEndereco1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco1.setText("0x0001a038");
        campoEndereco1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEndereco1ActionPerformed(evt);
            }
        });

        campoEndereco2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco2.setText("0x000b4b9c");

        campoEndereco3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco3.setText("0x000b91a0");

        campoEndereco4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco4.setText("0x001b31cc");

        campoEndereco5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco5.setText("0x001b3458");
        campoEndereco5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEndereco5ActionPerformed(evt);
            }
        });

        campoEndereco6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEndereco6.setText("0x003a9054");

        campoConteudo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo1.setText("0x000b4045");

        campoConteudo2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo2.setText("0x236b12c1");
        campoConteudo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConteudo2ActionPerformed(evt);
            }
        });

        campoConteudo3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo3.setText("0x1b9d8fc5");
        campoConteudo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConteudo3ActionPerformed(evt);
            }
        });

        campoConteudo4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo4.setText("0x003a9067");

        campoConteudo5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo5.setText("0x0001a067");

        campoConteudo6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudo6.setText("0x000b9067");

        botaoContinuarT1.setText(">>");
        botaoContinuarT1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT1MouseClicked(evt);
            }
        });
        botaoContinuarT1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarT1ActionPerformed(evt);
            }
        });

        jButton1.setText("<<");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("1/8");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("Abaixo encontra-se a tabela demonstrando os endereços");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("da memória física e seus respectivos conteudos");

        javax.swing.GroupLayout PanelTutorial1Layout = new javax.swing.GroupLayout(PanelTutorial1);
        PanelTutorial1.setLayout(PanelTutorial1Layout);
        PanelTutorial1Layout.setHorizontalGroup(
            PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial1Layout.createSequentialGroup()
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoContinuarT1))
                    .addGroup(PanelTutorial1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTutorial1Layout.createSequentialGroup()
                                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(campoEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoConteudo1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(campoConteudo6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoConteudo2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoConteudo3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoConteudo4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoConteudo5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel32)
                            .addComponent(jLabel31))
                        .addGap(0, 424, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelTutorial1Layout.setVerticalGroup(
            PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jLabel31)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel32)
                .addGap(56, 56, 56)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConteudo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEndereco4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEndereco6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addGroup(PanelTutorial1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT1)
                    .addComponent(jButton1)
                    .addComponent(jLabel21))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial1, "card2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Valor do PDBR:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Valor da VM:");

        campoPDBR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPDBR.setText("0x001b3000");

        campoVM.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoVM.setText("0x1cc151a0");

        botaoContinuarT2.setText(">>");
        botaoContinuarT2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT2MouseClicked(evt);
            }
        });

        botaoVoltar2.setText("<<");
        botaoVoltar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar2MouseClicked(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("2/8");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Esses são os valores do PDBR (process desriptor base register), que diz para");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("a CPU onde o diretório começa, e o endereço VM (virtual memory)");

        javax.swing.GroupLayout PanelTutorial2Layout = new javax.swing.GroupLayout(PanelTutorial2);
        PanelTutorial2.setLayout(PanelTutorial2Layout);
        PanelTutorial2Layout.setHorizontalGroup(
            PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial2Layout.createSequentialGroup()
                .addContainerGap(763, Short.MAX_VALUE)
                .addComponent(botaoVoltar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel27)
                .addGap(8, 8, 8)
                .addComponent(botaoContinuarT2)
                .addContainerGap())
            .addGroup(PanelTutorial2Layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel29)
                    .addGroup(PanelTutorial2Layout.createSequentialGroup()
                        .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoPDBR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(53, 53, 53)
                        .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(campoVM, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTutorial2Layout.setVerticalGroup(
            PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial2Layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel29)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPDBR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoVM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addGroup(PanelTutorial2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT2)
                    .addComponent(botaoVoltar2)
                    .addComponent(jLabel27))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial2, "card5");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("A partir da VM: ");

        VmHex.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VmHex.setText("a");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText(" Forma binária: ");

        VmBin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VmBin.setText("a");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Divide-se o binário em três partes:");

        VmP1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VmP1.setText("jLabel12 ");

        VmP2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VmP2.setText("jLabel13");

        VmP3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        VmP3.setText("jLabel14");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Page Table Number(10):");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Page Number(10):");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Offset(12):");

        botaoContinuarT3.setText(">>");
        botaoContinuarT3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT3MouseClicked(evt);
            }
        });
        botaoContinuarT3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarT3ActionPerformed(evt);
            }
        });

        botaoVoltar3.setText("<<");
        botaoVoltar3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar3MouseClicked(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("3/8");

        PtnBIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PtnBIN.setText("jLabel39");

        PnBIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PnBIN.setText("jLabel40");

        OffsetBIN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        OffsetBIN.setText("jLabel41");

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("- respectivamente em Hexadecimal -");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("- respectivamente em Hexadecimal -");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("- respectivamente em Hexadecimal -");

        javax.swing.GroupLayout PanelTutorial3Layout = new javax.swing.GroupLayout(PanelTutorial3);
        PanelTutorial3.setLayout(PanelTutorial3Layout);
        PanelTutorial3Layout.setHorizontalGroup(
            PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(PanelTutorial3Layout.createSequentialGroup()
                .addContainerGap(132, Short.MAX_VALUE)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTutorial3Layout.createSequentialGroup()
                        .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VmHex, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(VmBin)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelTutorial3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8))
                                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(OffsetBIN)
                                            .addComponent(PnBIN)))
                                    .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(PtnBIN)))
                                .addGap(64, 64, 64)
                                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                        .addComponent(jLabel41)
                                        .addGap(18, 18, 18)
                                        .addComponent(VmP3))
                                    .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                        .addComponent(jLabel40)
                                        .addGap(18, 18, 18)
                                        .addComponent(VmP2))
                                    .addGroup(PanelTutorial3Layout.createSequentialGroup()
                                        .addComponent(jLabel39)
                                        .addGap(18, 18, 18)
                                        .addComponent(VmP1))))
                            .addComponent(jLabel11))))
                .addContainerGap(187, Short.MAX_VALUE))
            .addGroup(PanelTutorial3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoVoltar3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuarT3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTutorial3Layout.setVerticalGroup(
            PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VmHex, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VmBin)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(76, 76, 76)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VmP1)
                        .addComponent(jLabel39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(PtnBIN)))
                .addGap(18, 18, 18)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(PnBIN))
                    .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(VmP2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel40)))
                .addGap(18, 18, 18)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VmP3)
                    .addComponent(jLabel12)
                    .addComponent(OffsetBIN)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                .addGroup(PanelTutorial3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT3)
                    .addComponent(botaoVoltar3)
                    .addComponent(jLabel33))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial3, "card6");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("O diretorio começa em: ");

        PdbrLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PdbrLabel.setText("a");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("<html>Pega-se o offset simplesmente por multiplicar o Page Table Number por 4,<br>  ou fazendo o left shift no mesmo</html>");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel15.setText("Page Table Number: ");

        PageTableNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PageTableNumberLabel.setText("a");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Page Table Number com left shift: ");

        PageTableNumberx4Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PageTableNumberx4Label.setText("a");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setText("Entao soma-se este valor ao PDBR:");

        somaPTNandPDBR.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        somaPTNandPDBR.setText("a");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel18.setText("resultando no valor:");

        valorFisico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorFisico.setText("a");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setText("Olhando esse valor na tabela, temos o seguinte conteudo: ");

        conteudo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conteudo.setText("a");

        botaoContinuarT4.setText(">>");
        botaoContinuarT4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT4MouseClicked(evt);
            }
        });

        botaoVoltar4.setText("<<");
        botaoVoltar4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar4MouseClicked(evt);
            }
        });
        botaoVoltar4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar4ActionPerformed(evt);
            }
        });

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setText("4/8");

        javax.swing.GroupLayout PanelTutorial4Layout = new javax.swing.GroupLayout(PanelTutorial4);
        PanelTutorial4.setLayout(PanelTutorial4Layout);
        PanelTutorial4Layout.setHorizontalGroup(
            PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial4Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial4Layout.createSequentialGroup()
                        .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PageTableNumberLabel))
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PdbrLabel))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PageTableNumberx4Label))
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(conteudo))
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(valorFisico))
                            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(18, 18, 18)
                                .addComponent(somaPTNandPDBR)))
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial4Layout.createSequentialGroup()
                        .addComponent(botaoVoltar4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuarT4)
                .addContainerGap())
        );
        PanelTutorial4Layout.setVerticalGroup(
            PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial4Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(PdbrLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(PageTableNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(PageTableNumberx4Label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(somaPTNandPDBR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(valorFisico))
                .addGap(18, 18, 18)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(conteudo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addGroup(PanelTutorial4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT4)
                    .addComponent(botaoVoltar4)
                    .addComponent(jLabel34))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial4, "card7");

        bits_31_12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_31_12.setText("jLabel27");

        bits_11_7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_11_7.setText("jLabel28");

        bits_6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_6.setText("jLabel29");

        bits_5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_5.setText("jLabel30");

        bits_4_3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_4_3.setText("jLabel31");

        bits_2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_2.setText("jLabel32");

        bits_1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_1.setText("jLabel33");

        bits_0.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_0.setText("jLabel34");

        botaoContinuarT5.setText(">>");
        botaoContinuarT5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT5MouseClicked(evt);
            }
        });

        botaoVoltar5.setText("<<");
        botaoVoltar5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar5MouseClicked(evt);
            }
        });
        botaoVoltar5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoVoltar5ActionPerformed(evt);
            }
        });

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("5/8");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel42.setText("O endereço contém:");

        AdressPanel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AdressPanel.setText("a");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel43.setText("Bit(s)");

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("31-12");

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("11-7");

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("6");

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("5");

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("4-3");

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("2");

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("1");

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("0");

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel52.setText("Conteúdo");

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel53.setText("Decodificando, nos motra:");

        javax.swing.GroupLayout PanelTutorial5Layout = new javax.swing.GroupLayout(PanelTutorial5);
        PanelTutorial5.setLayout(PanelTutorial5Layout);
        PanelTutorial5Layout.setHorizontalGroup(
            PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial5Layout.createSequentialGroup()
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoContinuarT5))
                    .addGroup(PanelTutorial5Layout.createSequentialGroup()
                        .addContainerGap(367, Short.MAX_VALUE)
                        .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel45)
                            .addComponent(jLabel44)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50)
                            .addComponent(jLabel51)
                            .addComponent(jLabel43)
                            .addComponent(jLabel48)
                            .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel46, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel47, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(38, 38, 38)
                        .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel52)
                            .addComponent(bits_31_12)
                            .addGroup(PanelTutorial5Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bits_0)
                                    .addComponent(bits_1)
                                    .addComponent(bits_2)
                                    .addComponent(bits_4_3)
                                    .addComponent(bits_5)
                                    .addComponent(bits_11_7)
                                    .addComponent(bits_6))))
                        .addGap(0, 368, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial5Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addGroup(PanelTutorial5Layout.createSequentialGroup()
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(AdressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTutorial5Layout.setVerticalGroup(
            PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial5Layout.createSequentialGroup()
                .addContainerGap(88, Short.MAX_VALUE)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(AdressPanel))
                .addGap(18, 18, 18)
                .addComponent(jLabel53)
                .addGap(40, 40, 40)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel52))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_31_12)
                    .addComponent(jLabel44))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_11_7)
                    .addComponent(jLabel45))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_6)
                    .addComponent(jLabel46))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_5)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_4_3)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_2)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_1)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_0)
                    .addComponent(jLabel51))
                .addGap(99, 99, 99)
                .addGroup(PanelTutorial5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT5)
                    .addComponent(botaoVoltar5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel35))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial5, "card9");

        adressPageTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adressPageTable.setText("a");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel20.setText("Adress of the page table:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setText("Page Number:");

        PageNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PageNumberLabel.setText("a");

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setText("Page Number com left shift: ");

        PageNumberx4Label.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        PageNumberx4Label.setText("a");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setText("Soma:");

        adressAndPN.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        adressAndPN.setText("a");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel25.setText("Resultando no valor:");

        valorFisico1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        valorFisico1.setText("a");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel26.setText("Olhando esse valor na tabela, temos o seguinte conteudo: ");

        conteudo1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        conteudo1.setText("a");

        botaoContinuarT6.setText(">>");
        botaoContinuarT6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarT6MouseClicked(evt);
            }
        });

        botaoVoltar6.setText("<<");
        botaoVoltar6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar6MouseClicked(evt);
            }
        });

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel36.setText("6/8");

        javax.swing.GroupLayout PanelTutorial6Layout = new javax.swing.GroupLayout(PanelTutorial6);
        PanelTutorial6.setLayout(PanelTutorial6Layout);
        PanelTutorial6Layout.setHorizontalGroup(
            PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial6Layout.createSequentialGroup()
                .addContainerGap(767, Short.MAX_VALUE)
                .addComponent(botaoVoltar6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel36)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoContinuarT6)
                .addContainerGap())
            .addGroup(PanelTutorial6Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(adressPageTable))
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(conteudo1))
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(adressAndPN))
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PageNumberx4Label))
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PageNumberLabel))
                    .addGroup(PanelTutorial6Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valorFisico1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTutorial6Layout.setVerticalGroup(
            PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial6Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(adressPageTable))
                .addGap(31, 31, 31)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(PageNumberLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(PageNumberx4Label))
                .addGap(27, 27, 27)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(adressAndPN))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(valorFisico1))
                .addGap(28, 28, 28)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(conteudo1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addGroup(PanelTutorial6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarT6)
                    .addComponent(botaoVoltar6)
                    .addComponent(jLabel36))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial6, "card8");

        bits_31_121.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_31_121.setText("jLabel27");

        bits_11_71.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_11_71.setText("jLabel28");

        bits_61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_61.setText("jLabel29");

        bits_51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_51.setText("jLabel30");

        bits_4_31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_4_31.setText("jLabel31");

        bits_21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_21.setText("jLabel32");

        bits_11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_11.setText("jLabel33");

        bits_01.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bits_01.setText("jLabel34");

        botaoContinuar7.setText(">>");
        botaoContinuar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuar7MouseClicked(evt);
            }
        });

        botaoVoltar7.setText("<<");
        botaoVoltar7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar7MouseClicked(evt);
            }
        });

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel37.setText("7/8");

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("31-12");

        jLabel55.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel55.setText("11-7");

        jLabel56.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel56.setText("6");

        jLabel57.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel57.setText("5");

        jLabel58.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel58.setText("4-3");

        jLabel59.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel59.setText("2");

        jLabel60.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel60.setText("1");

        jLabel61.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel61.setText("0");

        jLabel62.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel62.setText("Bit(s)");

        jLabel63.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel63.setText("Conteúdo");

        jLabel64.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel64.setText("O endereço contém:");

        jLabel65.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel65.setText("Decodificando, nos mostra:");

        endPanel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        endPanel7.setText("a");

        javax.swing.GroupLayout PanelTutorial7Layout = new javax.swing.GroupLayout(PanelTutorial7);
        PanelTutorial7.setLayout(PanelTutorial7Layout);
        PanelTutorial7Layout.setHorizontalGroup(
            PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTutorial7Layout.createSequentialGroup()
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTutorial7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoVoltar7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoContinuar7))
                    .addGroup(PanelTutorial7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel61)
                            .addComponent(jLabel59)
                            .addGroup(PanelTutorial7Layout.createSequentialGroup()
                                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel54)
                                    .addComponent(jLabel62)
                                    .addComponent(jLabel55)
                                    .addComponent(jLabel56)
                                    .addComponent(jLabel57)
                                    .addComponent(jLabel58)
                                    .addComponent(jLabel60))
                                .addGap(28, 28, 28)
                                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bits_51)
                                    .addComponent(bits_61)
                                    .addComponent(bits_31_121)
                                    .addComponent(jLabel63)
                                    .addComponent(bits_11_71)
                                    .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(bits_11)
                                        .addComponent(bits_4_31)
                                        .addComponent(bits_21)
                                        .addComponent(bits_01)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(PanelTutorial7Layout.createSequentialGroup()
                .addContainerGap(343, Short.MAX_VALUE)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTutorial7Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(endPanel7))
                    .addComponent(jLabel65))
                .addContainerGap(344, Short.MAX_VALUE))
        );
        PanelTutorial7Layout.setVerticalGroup(
            PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial7Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(endPanel7))
                .addGap(18, 18, 18)
                .addComponent(jLabel65)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel62)
                    .addComponent(jLabel63))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_31_121)
                    .addComponent(jLabel54))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel55)
                    .addComponent(bits_11_71, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_61)
                    .addComponent(jLabel56))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_51)
                    .addComponent(jLabel57))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_4_31)
                    .addComponent(jLabel58))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_21)
                    .addComponent(jLabel59))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel60)
                    .addComponent(bits_11, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bits_01)
                    .addComponent(jLabel61))
                .addGap(99, 99, 99)
                .addGroup(PanelTutorial7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuar7)
                    .addComponent(botaoVoltar7)
                    .addComponent(jLabel37))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial7, "card10");

        Encerrar.setText(">>");
        Encerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncerrarMouseClicked(evt);
            }
        });

        pageEntryStart.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pageEntryStart.setText("jLabel21");

        physicalAdress.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        physicalAdress.setText("jLabel27");

        finalContent.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        finalContent.setText("jLabel29");

        botaoVoltar8.setText("<<");
        botaoVoltar8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoVoltar8MouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel38.setText("8/8");

        jLabel66.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel66.setText("E por fim, somando o endereço que a página começa com o offset,");

        jLabel68.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel68.setText("nos diz o dado que está na memória física");

        jLabel70.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel71.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel71.setText("Começo");

        jLabel72.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel72.setText("Começo + Offset");

        jLabel73.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel73.setText("Dado");

        javax.swing.GroupLayout PanelTutorial8Layout = new javax.swing.GroupLayout(PanelTutorial8);
        PanelTutorial8.setLayout(PanelTutorial8Layout);
        PanelTutorial8Layout.setHorizontalGroup(
            PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial8Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel66)
                    .addComponent(jLabel68))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(PanelTutorial8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel67, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial8Layout.createSequentialGroup()
                        .addComponent(botaoVoltar8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Encerrar)))
                .addContainerGap())
            .addGroup(PanelTutorial8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pageEntryStart)
                    .addComponent(jLabel71))
                .addGap(83, 83, 83)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelTutorial8Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(physicalAdress)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel70))
                    .addComponent(jLabel72))
                .addGap(65, 65, 65)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel73)
                    .addComponent(finalContent))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelTutorial8Layout.setVerticalGroup(
            PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTutorial8Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel66)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel68)
                .addGap(18, 18, 18)
                .addComponent(jLabel67)
                .addGap(77, 77, 77)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel71)
                    .addComponent(jLabel72)
                    .addComponent(jLabel73))
                .addGap(18, 18, 18)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pageEntryStart)
                    .addComponent(physicalAdress)
                    .addComponent(finalContent)
                    .addComponent(jLabel70))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addGroup(PanelTutorial8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Encerrar)
                    .addComponent(botaoVoltar8)
                    .addComponent(jLabel38))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelTutorial8, "card11");

        PanelSobre1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelSobre1MouseClicked(evt);
            }
        });

        jLabel126.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel126.setText("DESENVOLVEDORES");

        jLabel127.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel127.setText("Jonath Wesley Herdt");

        jLabel128.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel128.setText("Matheus Emanuel Carraro de Souza");

        jLabel129.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel129.setText("Disciplina: Sistemas Operacionais");

        jLabel130.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel130.setText("Professor: Fabricio Bortoluzzi");

        jLabel131.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel131.setText("Curso: Engenharia de Computação");

        jLabel132.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel132.setText("Universidade: UNIVALI");

        javax.swing.GroupLayout PanelSobre1Layout = new javax.swing.GroupLayout(PanelSobre1);
        PanelSobre1.setLayout(PanelSobre1Layout);
        PanelSobre1Layout.setHorizontalGroup(
            PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSobre1Layout.createSequentialGroup()
                .addGroup(PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelSobre1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel129)
                            .addComponent(jLabel130)
                            .addComponent(jLabel131)
                            .addComponent(jLabel132)))
                    .addGroup(PanelSobre1Layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelSobre1Layout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabel126))
                            .addGroup(PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel128, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(PanelSobre1Layout.createSequentialGroup()
                                    .addGap(55, 55, 55)
                                    .addComponent(jLabel127)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(327, Short.MAX_VALUE))
        );
        PanelSobre1Layout.setVerticalGroup(
            PanelSobre1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelSobre1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel126)
                .addGap(120, 120, 120)
                .addComponent(jLabel127)
                .addGap(18, 18, 18)
                .addComponent(jLabel128)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(jLabel129)
                .addGap(10, 10, 10)
                .addComponent(jLabel130)
                .addGap(10, 10, 10)
                .addComponent(jLabel131)
                .addGap(10, 10, 10)
                .addComponent(jLabel132)
                .addGap(10, 10, 10))
        );

        PanelPrincipal.add(PanelSobre1, "card3");

        PanelEx1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PanelEx1MouseClicked(evt);
            }
        });

        jLabel69.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel69.setText("Endereço:");

        jLabel74.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel74.setText("Conteúdo:");

        campoEnderecoE5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE5.setText("0x001b3458");
        campoEnderecoE5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoE5ActionPerformed(evt);
            }
        });

        campoEnderecoE2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE2.setText("0x000b4b9c");

        campoEnderecoE3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE3.setText("0x000b91a0");

        campoEnderecoE4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE4.setText("0x001b31cc");

        campoEnderecoE1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE1.setText("0x0001a038");
        campoEnderecoE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnderecoE1ActionPerformed(evt);
            }
        });

        campoEnderecoE6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoEnderecoE6.setText("0x003a9054");

        campoConteudoE1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE1.setText("0x000b4045");

        campoConteudoE2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE2.setText("0x236b12c1");
        campoConteudoE2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConteudoE2ActionPerformed(evt);
            }
        });

        campoConteudoE3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE3.setText("0x1b9d8fc5");
        campoConteudoE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConteudoE3ActionPerformed(evt);
            }
        });

        campoConteudoE4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE4.setText("0x003a9067");

        campoConteudoE5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE5.setText("0x0001a067");

        campoConteudoE6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoConteudoE6.setText("0x000b9067");

        botaoContinuarE1.setText(">>");
        botaoContinuarE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarE1MouseClicked(evt);
            }
        });
        botaoContinuarE1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarE1ActionPerformed(evt);
            }
        });

        VoltarE1.setText("<<");
        VoltarE1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarE1MouseClicked(evt);
            }
        });

        jLabel75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("1/4");

        jLabel76.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("Preencha os valores de endereço");

        jLabel81.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("Digite os valores de PDBR e VM");

        jLabel83.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel83.setText("Valor do PDBR:");

        campoPDBRE.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoPDBRE.setText("0x001b3000");

        campoVME.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campoVME.setText("0x1cc151a0");

        jLabel92.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel92.setText("Valor da VM:");

        jLabel93.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel93.setText(" e os respectivos conteudos");

        jLabel78.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel78.setText("Assumindo os valores");

        javax.swing.GroupLayout PanelEx1Layout = new javax.swing.GroupLayout(PanelEx1);
        PanelEx1.setLayout(PanelEx1Layout);
        PanelEx1Layout.setHorizontalGroup(
            PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx1Layout.createSequentialGroup()
                .addContainerGap(178, Short.MAX_VALUE)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx1Layout.createSequentialGroup()
                        .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelEx1Layout.createSequentialGroup()
                                    .addComponent(jLabel76)
                                    .addGap(95, 95, 95)
                                    .addComponent(jLabel81))
                                .addGroup(PanelEx1Layout.createSequentialGroup()
                                    .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel69)
                                        .addComponent(campoEnderecoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEnderecoE2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEnderecoE3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEnderecoE4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEnderecoE5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoEnderecoE6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(43, 43, 43)
                                    .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoConteudoE6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoConteudoE3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoConteudoE4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoConteudoE5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoConteudoE1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(campoConteudoE2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel74))
                                    .addGap(110, 110, 110)
                                    .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(campoPDBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel83))
                                    .addGap(53, 53, 53)
                                    .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel92)
                                        .addComponent(campoVME, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jLabel93))
                            .addComponent(VoltarE1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel75, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoContinuarE1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx1Layout.createSequentialGroup()
                        .addComponent(jLabel78)
                        .addGap(323, 323, 323))))
        );
        PanelEx1Layout.setVerticalGroup(
            PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel78)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel81))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel93)
                .addGap(53, 53, 53)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelEx1Layout.createSequentialGroup()
                        .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel69)
                            .addComponent(jLabel74))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoEnderecoE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoConteudoE1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEx1Layout.createSequentialGroup()
                        .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel83)
                            .addComponent(jLabel92))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoPDBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoVME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudoE2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudoE3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoConteudoE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoEnderecoE4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudoE5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEnderecoE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoConteudoE6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(PanelEx1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarE1)
                    .addComponent(VoltarE1)
                    .addComponent(jLabel75))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelEx1, "card12");

        botaoContinuarE2.setText(">>");
        botaoContinuarE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarE2MouseClicked(evt);
            }
        });

        VoltarE2.setText("<<");
        VoltarE2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarE2MouseClicked(evt);
            }
        });

        jLabel79.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("2/4");

        jLabel94.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel94.setText("Digite a forma binaria do VM");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel95.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel95.setText("Faça a divisam dos campos do VM:");

        jLabel96.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel96.setText("Page Table Number(10):");

        jLabel97.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel97.setText("Page Number(10):");

        jLabel98.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel98.setText("Offset(12):");

        jLabel99.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel99.setText("- respectivamente em Hexadecimal -");

        jLabel100.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel100.setText("- respectivamente em Hexadecimal -");

        jLabel101.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel101.setText("- respectivamente em Hexadecimal -");

        jLabel82.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel82.setText("Organizando os campos");

        correcaoLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        correcaoLabel.setForeground(new java.awt.Color(255, 102, 51));
        correcaoLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelEx2Layout = new javax.swing.GroupLayout(PanelEx2);
        PanelEx2.setLayout(PanelEx2Layout);
        PanelEx2Layout.setHorizontalGroup(
            PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx2Layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx2Layout.createSequentialGroup()
                        .addComponent(VoltarE2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel79)
                        .addGap(8, 8, 8)
                        .addComponent(botaoContinuarE2)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx2Layout.createSequentialGroup()
                        .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx2Layout.createSequentialGroup()
                                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel98)
                                    .addComponent(jLabel97)
                                    .addComponent(jLabel96))
                                .addGap(18, 18, 18)
                                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)
                                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEx2Layout.createSequentialGroup()
                                        .addComponent(jLabel99)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelEx2Layout.createSequentialGroup()
                                        .addComponent(jLabel100)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelEx2Layout.createSequentialGroup()
                                        .addComponent(jLabel101)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(PanelEx2Layout.createSequentialGroup()
                                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel95)
                                    .addGroup(PanelEx2Layout.createSequentialGroup()
                                        .addComponent(jLabel94)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(152, 152, 152)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx2Layout.createSequentialGroup()
                        .addComponent(correcaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(221, 221, 221))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx2Layout.createSequentialGroup()
                        .addComponent(jLabel82)
                        .addGap(315, 315, 315))))
        );
        PanelEx2Layout.setVerticalGroup(
            PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel82)
                .addGap(58, 58, 58)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel95)
                .addGap(39, 39, 39)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel96)
                    .addComponent(jLabel101)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel97)
                    .addComponent(jLabel100)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel98)
                    .addComponent(jLabel99)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76)
                .addComponent(correcaoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73)
                .addGroup(PanelEx2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoContinuarE2)
                    .addComponent(VoltarE2)
                    .addComponent(jLabel79))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelEx2, "card13");

        botaoContinuarE3.setText(">>");
        botaoContinuarE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarE3MouseClicked(evt);
            }
        });
        botaoContinuarE3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarE3ActionPerformed(evt);
            }
        });

        VoltarE3.setText("<<");
        VoltarE3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarE3MouseClicked(evt);
            }
        });

        jLabel87.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("3/4");

        jLabel77.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel77.setText("Atribuições");

        jLabel80.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel80.setText("O diretório começa em:");

        jLabel84.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel84.setText("Page Table Number com left shift:");

        jLabel85.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel85.setText("Page Table Number + PDBR:");

        jLabel86.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel86.setText("Conteúdo na tabela através do valor da soma:");

        jLabel103.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel103.setText("0");

        jLabel104.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel104.setText("1");

        jLabel105.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel105.setText("2");

        jLabel106.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel106.setText("4-3");

        jLabel107.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel107.setText("5");

        jLabel108.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel108.setText("6");

        jLabel109.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel109.setText("11-7");

        jLabel110.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel110.setText("31-12");

        jLabel111.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel111.setText("Bit(s)");

        jLabel112.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel112.setText("Conteúdo");

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        correcaoLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        correcaoLabel2.setForeground(new java.awt.Color(255, 153, 51));
        correcaoLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelEx3Layout = new javax.swing.GroupLayout(PanelEx3);
        PanelEx3.setLayout(PanelEx3Layout);
        PanelEx3Layout.setHorizontalGroup(
            PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx3Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx3Layout.createSequentialGroup()
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel109)
                            .addComponent(jLabel110)
                            .addComponent(jLabel105)
                            .addComponent(jLabel104)
                            .addComponent(jLabel103)
                            .addComponent(jLabel111)
                            .addComponent(jLabel106)
                            .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel108, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel107, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(38, 38, 38)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEx3Layout.createSequentialGroup()
                                .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelEx3Layout.createSequentialGroup()
                                        .addComponent(jLabel112)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 561, Short.MAX_VALUE))
                                    .addGroup(PanelEx3Layout.createSequentialGroup()
                                        .addComponent(jTextField19)
                                        .addGap(383, 383, 383)))
                                .addComponent(VoltarE3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel87, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botaoContinuarE3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelEx3Layout.createSequentialGroup()
                                .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(jTextField16)
                                    .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField15, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField17, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(correcaoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))))
                    .addGroup(PanelEx3Layout.createSequentialGroup()
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel77)
                            .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelEx3Layout.createSequentialGroup()
                                    .addComponent(jLabel84)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx3Layout.createSequentialGroup()
                                    .addComponent(jLabel80)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx3Layout.createSequentialGroup()
                                    .addComponent(jLabel85)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx3Layout.createSequentialGroup()
                                    .addComponent(jLabel86)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelEx3Layout.setVerticalGroup(
            PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx3Layout.createSequentialGroup()
                .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEx3Layout.createSequentialGroup()
                        .addContainerGap(264, Short.MAX_VALUE)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel111)
                            .addComponent(jLabel112))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel110)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel109)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel108)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel107, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel106)
                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correcaoLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel105)
                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel104)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel103)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(PanelEx3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel77)
                        .addGap(29, 29, 29)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel84)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel85)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel86)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelEx3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botaoContinuarE3)
                            .addComponent(VoltarE3)
                            .addComponent(jLabel87))))
                .addContainerGap())
        );

        PanelPrincipal.add(PanelEx3, "card14");

        jLabel102.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel102.setText("Atribuições");

        jLabel113.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel113.setText("0");

        jTextField20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField21ActionPerformed(evt);
            }
        });

        jLabel114.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel114.setText("1");

        jLabel115.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel115.setText("2");

        jTextField22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel116.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel116.setText("4-3");

        jLabel117.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel117.setText("5");

        jTextField24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel118.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel118.setText("6");

        jLabel119.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel119.setText("11-7");

        jTextField26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField26ActionPerformed(evt);
            }
        });

        jTextField27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel120.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel120.setText("31-12");

        jLabel121.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel121.setText("Bit(s)");

        jLabel122.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel122.setText("Conteúdo");

        jLabel88.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel88.setText("Conteúdo na tabela através do valor da soma:");

        jTextField28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel89.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel89.setText("Page Number(left shift) + Endereço(Page Table):");

        jLabel90.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel90.setText("Page Number com left shift:");

        jTextField30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jTextField31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel91.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel91.setText("Endereço do Page Table:");

        jLabel123.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel123.setText("Dado na memória física:");

        jLabel124.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel124.setText("(Começo + Offset)");

        jTextField32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        VoltarE4.setText("<<");
        VoltarE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VoltarE4MouseClicked(evt);
            }
        });

        jLabel125.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("4/4");

        botaoContinuarE4.setText(">>");
        botaoContinuarE4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botaoContinuarE4MouseClicked(evt);
            }
        });
        botaoContinuarE4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoContinuarE4ActionPerformed(evt);
            }
        });

        correcaoLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        correcaoLabel3.setForeground(new java.awt.Color(255, 153, 51));
        correcaoLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelEx4Layout = new javax.swing.GroupLayout(PanelEx4);
        PanelEx4.setLayout(PanelEx4Layout);
        PanelEx4Layout.setHorizontalGroup(
            PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx4Layout.createSequentialGroup()
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel119)
                            .addComponent(jLabel120)
                            .addComponent(jLabel115)
                            .addComponent(jLabel114)
                            .addComponent(jLabel113)
                            .addComponent(jLabel121)
                            .addComponent(jLabel116)
                            .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel118, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel117, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(38, 38, 38)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField20, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(jTextField21)
                            .addComponent(jTextField22)
                            .addComponent(jTextField23)
                            .addComponent(jTextField24)
                            .addComponent(jTextField25)
                            .addComponent(jTextField26)
                            .addComponent(jLabel122)
                            .addComponent(jTextField27))
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEx4Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel124)
                                    .addGroup(PanelEx4Layout.createSequentialGroup()
                                        .addComponent(jLabel123)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx4Layout.createSequentialGroup()
                                .addGap(377, 377, 377)
                                .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx4Layout.createSequentialGroup()
                                        .addComponent(VoltarE4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel125, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(botaoContinuarE4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelEx4Layout.createSequentialGroup()
                                        .addComponent(correcaoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(124, 124, 124))))))
                    .addGroup(PanelEx4Layout.createSequentialGroup()
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel102)
                            .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(PanelEx4Layout.createSequentialGroup()
                                    .addComponent(jLabel88)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx4Layout.createSequentialGroup()
                                    .addComponent(jLabel91)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx4Layout.createSequentialGroup()
                                    .addComponent(jLabel90)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(PanelEx4Layout.createSequentialGroup()
                                    .addComponent(jLabel89)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        PanelEx4Layout.setVerticalGroup(
            PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelEx4Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel102)
                .addGap(26, 26, 26)
                .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelEx4Layout.createSequentialGroup()
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel121)
                            .addComponent(jLabel122))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel120)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel119)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel118)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel116)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(correcaoLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel115)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel114)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(botaoContinuarE4)
                                .addComponent(VoltarE4)
                                .addComponent(jLabel125))
                            .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel113)
                                .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(PanelEx4Layout.createSequentialGroup()
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel91)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel90)
                            .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel89)
                            .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel88)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(PanelEx4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel123)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel124)
                        .addGap(212, 212, 212)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        PanelPrincipal.add(PanelEx4, "card15");

        menu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        menu.setMargin(new java.awt.Insets(10, 5, 10, 5));

        menu_tutorial_btn.setText("Tutorial");
        menu_tutorial_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_tutorial_btn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        menu_tutorial_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_tutorial_btnMouseClicked(evt);
            }
        });
        menu_tutorial_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_tutorial_btnActionPerformed(evt);
            }
        });
        menu.add(menu_tutorial_btn);

        menu_exercicio_btn.setText("Exercício");
        menu_exercicio_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_exercicio_btn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        menu_exercicio_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_exercicio_btnMouseClicked(evt);
            }
        });
        menu.add(menu_exercicio_btn);

        menu_sobre_btn.setText("Sobre");
        menu_sobre_btn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        menu_sobre_btn.setMargin(new java.awt.Insets(5, 5, 5, 5));
        menu_sobre_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu_sobre_btnMouseClicked(evt);
            }
        });
        menu_sobre_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menu_sobre_btnActionPerformed(evt);
            }
        });
        menu.add(menu_sobre_btn);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void menu_tutorial_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_tutorial_btnActionPerformed
        
    }//GEN-LAST:event_menu_tutorial_btnActionPerformed

    private void menu_tutorial_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_tutorial_btnMouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_menu_tutorial_btnMouseClicked

    private void campoConteudo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConteudo2ActionPerformed

    }//GEN-LAST:event_campoConteudo2ActionPerformed

    private void menu_sobre_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menu_sobre_btnActionPerformed
        
    }//GEN-LAST:event_menu_sobre_btnActionPerformed

    private void menu_sobre_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_sobre_btnMouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelSobre1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_menu_sobre_btnMouseClicked

    private void botaoContinuarT1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT1MouseClicked
        //cria uma tabela auxiliar para coletar os dados digitados pelo usuario
        String [][] aux = new String[6][2];
        aux[0][0] = campoEndereco1.getText();
        aux[0][1] = campoConteudo1.getText();
        aux[1][0] = campoEndereco2.getText();
        aux[1][1] = campoConteudo2.getText();
        aux[2][0] = campoEndereco3.getText();
        aux[2][1] = campoConteudo3.getText();
        aux[3][0] = campoEndereco4.getText();
        aux[3][1] = campoConteudo4.getText();
        aux[4][0] = campoEndereco5.getText();
        aux[4][1] = campoConteudo5.getText();
        aux[5][0] = campoEndereco6.getText();
        aux[5][1] = campoConteudo6.getText();
        
        //retira o "0x" caso o usuario tenha digitado para o hexadecimal
        for(int i=0; i<6; i++){
            for(int j=0; j<2; j++){
                if(aux[i][j].charAt(1) == 'x'){
                    aux[i][j] = aux[i][j].substring(2);
                }
            }
        }
        
        //salva tabela digitada na memoria
        memoria.setEnderecoConteudo(aux);
        
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial2);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT1MouseClicked

    private void campoEndereco1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEndereco1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEndereco1ActionPerformed

    private void botaoContinuarT1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarT1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarT1ActionPerformed

    private void botaoContinuarT2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT2MouseClicked
        //coleta os dados digitados pelo usuario e retira o "0x" do hexadecimal
        String Pdbr = campoPDBR.getText();
        if(Pdbr.charAt(1) == 'x'){
            Pdbr = Pdbr.substring(2);
        }
        String Vm = campoVM.getText();
        if(Vm.charAt(1) == 'x'){
            Vm = Vm.substring(2);
        }
        
        //salva os dados na memoria
        memoria.setPdbr(Pdbr);
        memoria.setVirtualMemory(Vm);
        
        //passa o valor da VM de hexadecimal para um binario de 32 caracteres
        String bin = new BigInteger(memoria.getVirtualMemory(), 16).toString(2);
        bin = memoria.completarZerosEsquerda(bin, 32);
        
        String PtnBin = bin.substring(0,10);
        String PnBin = bin.substring(10,20);
        String OffsetBin = bin.substring(20,32);
        
        //separa os 32 caracteres em partes de 10,10 e 12
        String Ptn = Integer.toString(Integer.parseInt(bin.substring(0,10),2),16);
        String Pn = Integer.toString(Integer.parseInt(bin.substring(10,20),2),16);
        String Offset = Integer.toString(Integer.parseInt(bin.substring(20,32),2),16);
        Ptn = memoria.completarZerosEsquerda(Ptn,3);
        Pn = memoria.completarZerosEsquerda(Pn,3);
        Offset = memoria.completarZerosEsquerda(Offset,3);
        
        memoria.setPageTableNumber(Ptn);
        memoria.setPageNumber(Pn);
        memoria.setOffset(Offset);
        
        //mostra os valores nos labels da tela
        VmBin.setText(bin);
        VmHex.setText("0x"+memoria.getVirtualMemory());
        VmP1.setText("0x"+memoria.getPageTableNumber());
        VmP2.setText("0x"+memoria.getPageNumber());
        VmP3.setText("0x"+memoria.getOffset());
        PtnBIN.setText(PtnBin);
        PnBIN.setText(PnBin);
        OffsetBIN.setText(OffsetBin);
        
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial3);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT2MouseClicked

    private void botaoContinuarT4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT4MouseClicked
        memoria.setContentDirectoryStart(memoria.leftShift(memoria.getContentDirectory().substring(0, 5), 3));
        
        String tabela[] = new String [8];
        tabela = memoria.montarTabelaDiretorio();
        
        //mostra os valores nos labels da tela
        bits_31_12.setText("0x"+tabela[0]);
        bits_11_7.setText("0x"+tabela[1]);
        bits_6.setText(tabela[2]);
        bits_5.setText(tabela[3]);
        bits_4_3.setText(tabela[4]);
        bits_2.setText(tabela[5]);
        bits_1.setText(tabela[6]);
        bits_0.setText(tabela[7]);
        
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial5);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT4MouseClicked

    private void botaoContinuarT6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT6MouseClicked
        memoria.setContentPageEntryStart(memoria.leftShift(memoria.getContentPageEntry().substring(0, 5), 3));

        String tabela[] = new String [8];
        tabela = memoria.montarTabelaPageEntry();
        
        //mostra os valores nos labels da tela
        bits_31_121.setText("0x"+tabela[0]);
        bits_11_71.setText("0x"+tabela[1]);
        bits_61.setText(tabela[2]);
        bits_51.setText(tabela[3]);
        bits_4_31.setText(tabela[4]);
        bits_21.setText(tabela[5]);
        bits_11.setText(tabela[6]);
        bits_01.setText(tabela[7]);
        endPanel7.setText("0x"+memoria.getContentPageEntry());

        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial7);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT6MouseClicked

    private void botaoContinuarT5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT5MouseClicked
        //hexadecimal para binario
        String PnBin = new BigInteger(memoria.getPageNumber(), 16).toString(2);
        //left shift
        String PnBinLS = memoria.leftShift(PnBin, 2);
        //binario para hexadecimal
        String PnHexLS = Integer.toString(Integer.parseInt(PnBinLS,2),16);
        //completa os 0 à esquerda para ficar com 3 caracteres
        PnHexLS = memoria.completarZerosEsquerda(PnHexLS, 3);
        memoria.setPageNumberLS(PnHexLS);

        //realiza a soma do diretoiro + PN com left shift
        BigInteger PnDec = new BigInteger(memoria.getPageNumberLS(), 16);
        BigInteger adressStartDec = new BigInteger(memoria.getContentDirectoryStart(), 16);
        String soma = PnDec.add(adressStartDec).toString();
        String somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoria.completarZerosEsquerda(somaHex,8);
        memoria.setAdressPageEntry(somaHex);
        
        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoria.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoria.setContentPageEntry(memoria.getEnderecoConteudo()[i][1]);
            }
        }
        
        //mostra os valores nos labels da tela
        adressPageTable.setText("0x"+memoria.getContentDirectoryStart());
        PageNumberLabel.setText("0x"+memoria.getPageNumber());
        PageNumberx4Label.setText("0x"+memoria.getPageNumberLS());
        adressAndPN.setText("0x"+memoria.getContentDirectoryStart()+" + "+"0x"+memoria.getPageNumberLS());
        valorFisico1.setText("0x"+memoria.getAdressPageEntry());
        conteudo1.setText("0x"+memoria.getContentPageEntry());

        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial6);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT5MouseClicked

    private void EncerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncerrarMouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelInicial);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_EncerrarMouseClicked

    private void botaoVoltar5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar5ActionPerformed
        
    }//GEN-LAST:event_botaoVoltar5ActionPerformed

    private void botaoVoltar5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar5MouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial4);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar5MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelInicial);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_jButton1MouseClicked

    private void botaoVoltar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar2MouseClicked
        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar2MouseClicked

    private void botaoVoltar4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar4MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial3);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar4MouseClicked

    private void botaoVoltar6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar6MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial5);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar6MouseClicked

    private void botaoVoltar8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar8MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial7);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar8MouseClicked

    private void campoEndereco5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEndereco5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEndereco5ActionPerformed

    private void campoConteudo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConteudo3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConteudo3ActionPerformed

    private void botaoVoltar4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoVoltar4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoVoltar4ActionPerformed

    private void botaoVoltar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar7MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial6);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar7MouseClicked

    private void botaoContinuar7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuar7MouseClicked
        //realiza a soma do PageEntry + Offset
        BigInteger offsetDec = new BigInteger(memoria.getOffset(), 16);
        BigInteger adressStartDec = new BigInteger(memoria.getContentPageEntryStart(), 16);
        String soma = offsetDec.add(adressStartDec).toString();
        String somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoria.completarZerosEsquerda(somaHex,8);
        memoria.setAdressPhysivalMemory(somaHex);

        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoria.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoria.setContentPhysicalMemory(memoria.getEnderecoConteudo()[i][1]);
            }
        }

        //mostra os valores nos labels da tela
        pageEntryStart.setText("0x"+memoria.getContentPageEntryStart());
        physicalAdress.setText("0x"+memoria.getAdressPhysivalMemory());
        finalContent.setText("0x"+memoria.getContentPhysicalMemory());

        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial8);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuar7MouseClicked

    private void PanelSobre1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelSobre1MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_PanelSobre1MouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseClicked

    private void PanelEx1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelEx1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_PanelEx1MouseClicked

    private void menu_exercicio_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu_exercicio_btnMouseClicked
        // TODO add your handling code here:
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_menu_exercicio_btnMouseClicked

    private void campoEnderecoE5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoE5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoE5ActionPerformed

    private void campoEnderecoE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnderecoE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoEnderecoE1ActionPerformed

    private void campoConteudoE2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConteudoE2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConteudoE2ActionPerformed

    private void campoConteudoE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConteudoE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoConteudoE3ActionPerformed

    private void botaoContinuarE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarE1MouseClicked
        //cria uma tabela auxiliar para coletar os dados digitados pelo usuario
        String [][] aux = new String[6][2];
        aux[0][0] = campoEnderecoE1.getText();
        aux[0][1] = campoConteudoE1.getText();
        aux[1][0] = campoEnderecoE2.getText();
        aux[1][1] = campoConteudoE2.getText();
        aux[2][0] = campoEnderecoE3.getText();
        aux[2][1] = campoConteudoE3.getText();
        aux[3][0] = campoEnderecoE4.getText();
        aux[3][1] = campoConteudoE4.getText();
        aux[4][0] = campoEnderecoE5.getText();
        aux[4][1] = campoConteudoE5.getText();
        aux[5][0] = campoEnderecoE6.getText();
        aux[5][1] = campoConteudoE6.getText();
        
        //retira o "0x" caso o usuario tenha digitado para o hexadecimal
        for(int i=0; i<6; i++){
            for(int j=0; j<2; j++){
                if(aux[i][j].charAt(1) == 'x'){
                    aux[i][j] = aux[i][j].substring(2);
                }
            }
        }
        
        //salva tabela digitada na memoria
        memoriaExercicio.setEnderecoConteudo(aux);
        
        String Pdbr = campoPDBR.getText();
        if(Pdbr.charAt(1) == 'x'){
            Pdbr = Pdbr.substring(2);
        }
        String Vm = campoVM.getText();
        if(Vm.charAt(1) == 'x'){
            Vm = Vm.substring(2);
        }
        
        //salva os dados na memoria
        memoriaExercicio.setPdbr(Pdbr);
        memoriaExercicio.setVirtualMemory(Vm);
        
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx2);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarE1MouseClicked

    private void botaoContinuarE1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarE1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarE1ActionPerformed

    private void VoltarE1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarE1MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelPrincipal);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_VoltarE1MouseClicked

    private void botaoContinuarE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarE3MouseClicked
        boolean correcao = true;
         
        if(!memoriaExercicio.getPdbr().equals(jTextField1.getText()))
            correcao = false;
        
        //hexadecimal para binario
        String PtnBin = new BigInteger(memoriaExercicio.getPageTableNumber(), 16).toString(2);

        //completa os zeros à esquerda para ficar com 10 caracteres
        PtnBin = memoriaExercicio.completarZerosEsquerda(PtnBin, 10);
        
        //left shift
        PtnBin = memoriaExercicio.leftShift(PtnBin, 2);
        
        //binario para hexadecimal
        String PtnHex = Integer.toString(Integer.parseInt(PtnBin,2),16);

        //completa os 0 à esquerda para ficar com 3 caracteres
        PtnHex = memoriaExercicio.completarZerosEsquerda(PtnHex, 3);
        memoriaExercicio.setPageTableNumberLS(PtnHex);
        
        if(!PtnHex.equals(jTextField2.getText()))
            correcao = false;

        //realiza a soma do PDBR + PTN com left shift
        BigInteger PtnDec = new BigInteger(memoriaExercicio.getPageTableNumberLS(), 16);
        BigInteger PdbrDec = new BigInteger(memoriaExercicio.getPdbr(), 16);
        String soma = PtnDec.add(PdbrDec).toString();
        String somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoriaExercicio.completarZerosEsquerda(somaHex,8);
        memoriaExercicio.setAdressDirectory(somaHex);

        if(!somaHex.equals(jTextField3.getText()))
            correcao = false;
        
        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoriaExercicio.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoriaExercicio.setContentDirectory(memoriaExercicio.getEnderecoConteudo()[i][1]);
            }
        }
        
        if(!memoriaExercicio.getContentDirectory().equals(jTextField4.getText()))
            correcao = false;
        
        memoriaExercicio.setContentDirectoryStart(memoriaExercicio.leftShift(memoriaExercicio.getContentDirectory().substring(0, 5), 3));
        
        String tabela[] = new String [8];
        tabela = memoriaExercicio.montarTabelaDiretorio();
        
        if(!tabela[0].equals(jTextField5.getText()))
            correcao = false;
        if(!tabela[1].equals(jTextField6.getText()))
            correcao = false;
        if(!tabela[2].equals(jTextField7.getText()))
            correcao = false;
        if(!tabela[3].equals(jTextField15.getText()))
            correcao = false;
        if(!tabela[4].equals(jTextField16.getText()))
            correcao = false;
        if(!tabela[5].equals(jTextField17.getText()))
            correcao = false;
        if(!tabela[6].equals(jTextField18.getText()))
            correcao = false;
        if(!tabela[7].equals(jTextField19.getText()))
            correcao = false;
        
        if(correcao == true){
            PanelPrincipal.removeAll();
            PanelPrincipal.add(PanelEx4);
            PanelPrincipal.repaint();
            PanelPrincipal.revalidate();
        }else{
            correcaoLabel2.setText("Incorreto, tente novamente");
        }
    }//GEN-LAST:event_botaoContinuarE3MouseClicked

    private void botaoContinuarE3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarE3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarE3ActionPerformed

    private void VoltarE3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarE3MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx2);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_VoltarE3MouseClicked

    private void VoltarE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarE2MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx1);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_VoltarE2MouseClicked

    private void botaoContinuarE2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarE2MouseClicked
        boolean correcao = true;
        
        //passa o valor da VM de hexadecimal para um binario de 32 caracteres
        String bin = new BigInteger(memoriaExercicio.getVirtualMemory(), 16).toString(2);
        bin = memoriaExercicio.completarZerosEsquerda(bin, 32);
        
        if(!bin.equals(jTextField8.getText()))
            correcao = false;
        
        String PtnBin = bin.substring(0,10);
        String PnBin = bin.substring(10,20);
        String OffsetBin = bin.substring(20,32);
        
        if(!PtnBin.equals(jTextField9.getText()))
            correcao = false;
        if(!PnBin.equals(jTextField10.getText()))
            correcao = false;
        if(!OffsetBin.equals(jTextField11.getText()))
            correcao = false;
        
        //separa os 32 caracteres em partes de 10,10 e 12
        String Ptn = Integer.toString(Integer.parseInt(bin.substring(0,10),2),16);
        String Pn = Integer.toString(Integer.parseInt(bin.substring(10,20),2),16);
        String Offset = Integer.toString(Integer.parseInt(bin.substring(20,32),2),16);
        Ptn = memoriaExercicio.completarZerosEsquerda(Ptn,3);
        Pn = memoriaExercicio.completarZerosEsquerda(Pn,3);
        Offset = memoriaExercicio.completarZerosEsquerda(Offset,3);
        
        if(!Ptn.equals(jTextField12.getText()))
            correcao = false;
        if(!Pn.equals(jTextField13.getText()))
            correcao = false;
        if(!Offset.equals(jTextField14.getText()))
            correcao = false;
        
        memoriaExercicio.setPageTableNumber(Ptn);
        memoriaExercicio.setPageNumber(Pn);
        memoriaExercicio.setOffset(Offset);
        
        if(correcao == true){
            PanelPrincipal.removeAll();
            PanelPrincipal.add(PanelEx3);
            PanelPrincipal.repaint();
            PanelPrincipal.revalidate();
        }else{
            correcaoLabel.setText("Incorreto, tente novamente");
        }
    }//GEN-LAST:event_botaoContinuarE2MouseClicked

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void botaoVoltar3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoVoltar3MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial2);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoVoltar3MouseClicked

    private void botaoContinuarT3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarT3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarT3ActionPerformed

    private void botaoContinuarT3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarT3MouseClicked
        //hexadecimal para binario
        String PtnBin = new BigInteger(memoria.getPageTableNumber(), 16).toString(2);

        //completa os zeros à esquerda para ficar com 10 caracteres
        PtnBin = memoria.completarZerosEsquerda(PtnBin, 10);

        //left shift
        PtnBin = memoria.leftShift(PtnBin, 2);

        //binario para hexadecimal
        String PtnHex = Integer.toString(Integer.parseInt(PtnBin,2),16);

        //completa os 0 à esquerda para ficar com 3 caracteres
        PtnHex = memoria.completarZerosEsquerda(PtnHex, 3);
        memoria.setPageTableNumberLS(PtnHex);

        //realiza a soma do PDBR + PTN com left shift
        BigInteger PtnDec = new BigInteger(memoria.getPageTableNumberLS(), 16);
        BigInteger PdbrDec = new BigInteger(memoria.getPdbr(), 16);
        String soma = PtnDec.add(PdbrDec).toString();
        String somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoria.completarZerosEsquerda(somaHex,8);
        memoria.setAdressDirectory(somaHex);

        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoria.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoria.setContentDirectory(memoria.getEnderecoConteudo()[i][1]);
            }
        }

        //mostra os valores nos labels da tela
        PdbrLabel.setText("0x"+memoria.getPdbr());
        PageTableNumberLabel.setText("0x"+memoria.getPageTableNumber());
        PageTableNumberx4Label.setText("0x"+memoria.getPageTableNumberLS());
        somaPTNandPDBR.setText("0x"+memoria.getPdbr()+" + 0x"+memoria.getPageTableNumberLS());
        valorFisico.setText("0x"+memoria.getAdressDirectory());
        conteudo.setText("0x"+memoria.getContentDirectory());
        AdressPanel.setText("0x"+memoria.getContentDirectory());

        //atualiza o painel sendo exibido
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelTutorial4);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_botaoContinuarT3MouseClicked

    private void VoltarE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VoltarE4MouseClicked
        PanelPrincipal.removeAll();
        PanelPrincipal.add(PanelEx3);
        PanelPrincipal.repaint();
        PanelPrincipal.revalidate();
    }//GEN-LAST:event_VoltarE4MouseClicked

    private void botaoContinuarE4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoContinuarE4MouseClicked
        boolean correcao = true;
        
        if(!memoriaExercicio.getContentDirectoryStart().equals(jTextField31.getText()))
            correcao = false;
        
        //hexadecimal para binario
        String PnBin = new BigInteger(memoriaExercicio.getPageNumber(), 16).toString(2);
        //left shift
        String PnBinLS = memoriaExercicio.leftShift(PnBin, 2);
        //binario para hexadecimal
        String PnHexLS = Integer.toString(Integer.parseInt(PnBinLS,2),16);
        //completa os 0 à esquerda para ficar com 3 caracteres
        PnHexLS = memoriaExercicio.completarZerosEsquerda(PnHexLS, 3);
        memoriaExercicio.setPageNumberLS(PnHexLS);

        if(!PnHexLS.equals(jTextField30.getText()))
            correcao = false;
        
        //realiza a soma do diretoiro + PN com left shift
        BigInteger PnDec = new BigInteger(memoriaExercicio.getPageNumberLS(), 16);
        BigInteger adressStartDec = new BigInteger(memoriaExercicio.getContentDirectoryStart(), 16);
        String soma = PnDec.add(adressStartDec).toString();
        String somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoriaExercicio.completarZerosEsquerda(somaHex,8);
        memoriaExercicio.setAdressPageEntry(somaHex);
        
        if(!somaHex.equals(jTextField29.getText()))
            correcao = false;
        
        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoriaExercicio.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoriaExercicio.setContentPageEntry(memoriaExercicio.getEnderecoConteudo()[i][1]);
            }
        }
        
        if(!memoriaExercicio.getContentPageEntry().equals(jTextField28.getText()))
            correcao = false;
        
        memoriaExercicio.setContentPageEntryStart(memoriaExercicio.leftShift(memoriaExercicio.getContentPageEntry().substring(0, 5), 3));

        String tabela[] = new String [8];
        tabela = memoriaExercicio.montarTabelaPageEntry();
        
        if(!tabela[0].equals(jTextField27.getText()))
            correcao = false;
        if(!tabela[1].equals(jTextField26.getText()))
            correcao = false;
        if(!tabela[2].equals(jTextField25.getText()))
            correcao = false;
        if(!tabela[3].equals(jTextField24.getText()))
            correcao = false;
        if(!tabela[4].equals(jTextField23.getText()))
            correcao = false;
        if(!tabela[5].equals(jTextField22.getText()))
            correcao = false;
        if(!tabela[6].equals(jTextField21.getText()))
            correcao = false;
        if(!tabela[7].equals(jTextField20.getText()))
            correcao = false;
        
        //realiza a soma do PageEntry + Offset
        BigInteger offsetDec = new BigInteger(memoriaExercicio.getOffset(), 16);
        adressStartDec = new BigInteger(memoriaExercicio.getContentPageEntryStart(), 16);
        soma = offsetDec.add(adressStartDec).toString();
        somaHex = Integer.toString(Integer.parseInt(soma,10),16);
        somaHex = memoriaExercicio.completarZerosEsquerda(somaHex,8);
        memoriaExercicio.setAdressPhysivalMemory(somaHex);

        //busca na tabela o conteudo relacionado com o endereco do diretorio
        for(int i=0; i<6; i++){
            if(memoriaExercicio.getEnderecoConteudo()[i][0].equals(somaHex)){
                memoriaExercicio.setContentPhysicalMemory(memoriaExercicio.getEnderecoConteudo()[i][1]);
            }
        }
        
        
        if(!memoriaExercicio.getContentPhysicalMemory().equals(jTextField32.getText()))
            correcao = false;
        
        if(correcao == true){
            PanelPrincipal.removeAll();
            PanelPrincipal.add(PanelInicial);
            PanelPrincipal.repaint();
            PanelPrincipal.revalidate();
        }else{
            correcaoLabel3.setText("Incorreto, tente novamente");
        }
    }//GEN-LAST:event_botaoContinuarE4MouseClicked

    private void botaoContinuarE4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoContinuarE4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoContinuarE4ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField26ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField26ActionPerformed

    private void jTextField21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField21ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField21ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdressPanel;
    private javax.swing.JButton Encerrar;
    private javax.swing.JLabel OffsetBIN;
    private javax.swing.JLabel PageNumberLabel;
    private javax.swing.JLabel PageNumberx4Label;
    private javax.swing.JLabel PageTableNumberLabel;
    private javax.swing.JLabel PageTableNumberx4Label;
    private javax.swing.JPanel PanelEx1;
    private javax.swing.JPanel PanelEx2;
    private javax.swing.JPanel PanelEx3;
    private javax.swing.JPanel PanelEx4;
    private javax.swing.JPanel PanelInicial;
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JPanel PanelSobre1;
    private javax.swing.JPanel PanelTutorial1;
    private javax.swing.JPanel PanelTutorial2;
    private javax.swing.JPanel PanelTutorial3;
    private javax.swing.JPanel PanelTutorial4;
    private javax.swing.JPanel PanelTutorial5;
    private javax.swing.JPanel PanelTutorial6;
    private javax.swing.JPanel PanelTutorial7;
    private javax.swing.JPanel PanelTutorial8;
    private javax.swing.JLabel PdbrLabel;
    private javax.swing.JLabel PnBIN;
    private javax.swing.JLabel PtnBIN;
    private javax.swing.JLabel VmBin;
    private javax.swing.JLabel VmHex;
    private javax.swing.JLabel VmP1;
    private javax.swing.JLabel VmP2;
    private javax.swing.JLabel VmP3;
    private javax.swing.JButton VoltarE1;
    private javax.swing.JButton VoltarE2;
    private javax.swing.JButton VoltarE3;
    private javax.swing.JButton VoltarE4;
    private javax.swing.JLabel adressAndPN;
    private javax.swing.JLabel adressPageTable;
    private javax.swing.JLabel bits_0;
    private javax.swing.JLabel bits_01;
    private javax.swing.JLabel bits_1;
    private javax.swing.JLabel bits_11;
    private javax.swing.JLabel bits_11_7;
    private javax.swing.JLabel bits_11_71;
    private javax.swing.JLabel bits_2;
    private javax.swing.JLabel bits_21;
    private javax.swing.JLabel bits_31_12;
    private javax.swing.JLabel bits_31_121;
    private javax.swing.JLabel bits_4_3;
    private javax.swing.JLabel bits_4_31;
    private javax.swing.JLabel bits_5;
    private javax.swing.JLabel bits_51;
    private javax.swing.JLabel bits_6;
    private javax.swing.JLabel bits_61;
    private javax.swing.JButton botaoContinuar7;
    private javax.swing.JButton botaoContinuarE1;
    private javax.swing.JButton botaoContinuarE2;
    private javax.swing.JButton botaoContinuarE3;
    private javax.swing.JButton botaoContinuarE4;
    private javax.swing.JButton botaoContinuarT1;
    private javax.swing.JButton botaoContinuarT2;
    private javax.swing.JButton botaoContinuarT3;
    private javax.swing.JButton botaoContinuarT4;
    private javax.swing.JButton botaoContinuarT5;
    private javax.swing.JButton botaoContinuarT6;
    private javax.swing.JButton botaoVoltar2;
    private javax.swing.JButton botaoVoltar3;
    private javax.swing.JButton botaoVoltar4;
    private javax.swing.JButton botaoVoltar5;
    private javax.swing.JButton botaoVoltar6;
    private javax.swing.JButton botaoVoltar7;
    private javax.swing.JButton botaoVoltar8;
    private javax.swing.JTextField campoConteudo1;
    private javax.swing.JTextField campoConteudo2;
    private javax.swing.JTextField campoConteudo3;
    private javax.swing.JTextField campoConteudo4;
    private javax.swing.JTextField campoConteudo5;
    private javax.swing.JTextField campoConteudo6;
    private javax.swing.JTextField campoConteudoE1;
    private javax.swing.JTextField campoConteudoE2;
    private javax.swing.JTextField campoConteudoE3;
    private javax.swing.JTextField campoConteudoE4;
    private javax.swing.JTextField campoConteudoE5;
    private javax.swing.JTextField campoConteudoE6;
    private javax.swing.JTextField campoEndereco1;
    private javax.swing.JTextField campoEndereco2;
    private javax.swing.JTextField campoEndereco3;
    private javax.swing.JTextField campoEndereco4;
    private javax.swing.JTextField campoEndereco5;
    private javax.swing.JTextField campoEndereco6;
    private javax.swing.JTextField campoEnderecoE1;
    private javax.swing.JTextField campoEnderecoE2;
    private javax.swing.JTextField campoEnderecoE3;
    private javax.swing.JTextField campoEnderecoE4;
    private javax.swing.JTextField campoEnderecoE5;
    private javax.swing.JTextField campoEnderecoE6;
    private javax.swing.JTextField campoPDBR;
    private javax.swing.JTextField campoPDBRE;
    private javax.swing.JTextField campoVM;
    private javax.swing.JTextField campoVME;
    private javax.swing.JLabel conteudo;
    private javax.swing.JLabel conteudo1;
    private javax.swing.JLabel correcaoLabel;
    private javax.swing.JLabel correcaoLabel2;
    private javax.swing.JLabel correcaoLabel3;
    private javax.swing.JLabel endPanel7;
    private javax.swing.JLabel finalContent;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
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
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenu menu_exercicio_btn;
    private javax.swing.JMenu menu_sobre_btn;
    private javax.swing.JMenu menu_tutorial_btn;
    private javax.swing.JLabel pageEntryStart;
    private javax.swing.JLabel physicalAdress;
    private javax.swing.JLabel somaPTNandPDBR;
    private javax.swing.JLabel valorFisico;
    private javax.swing.JLabel valorFisico1;
    // End of variables declaration//GEN-END:variables
}