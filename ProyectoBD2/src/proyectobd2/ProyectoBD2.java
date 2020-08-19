/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobd2;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;

/**
 *
 * @author Daniel RC
 */
public class ProyectoBD2 extends javax.swing.JFrame {

    PersonaConexion personaconexion=new PersonaConexion();
    Persona persona;
    Farmacia farmacia;
    Laboratorio laboratorio;
    Producto producto;
    ArrayList<Producto> productos;
    /**
     * Creates new form ProyectoBD2
     */
    public ProyectoBD2() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crear = new javax.swing.JDialog();
        jb_crearpersona = new javax.swing.JButton();
        jb_crearfarmacia = new javax.swing.JButton();
        jb_crearlab = new javax.swing.JButton();
        jd_crearpersona = new javax.swing.JDialog();
        jtxt_idpersona = new javax.swing.JTextField();
        jtxt_nombrepersona = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jb_registrarpersona = new javax.swing.JButton();
        jd_crearfarmacia = new javax.swing.JDialog();
        jtxt_idfarmacia = new javax.swing.JTextField();
        jtxt_nombrefarmacia = new javax.swing.JTextField();
        jtxt_direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jb_registrarfarmacia = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_productosxfarmacia = new javax.swing.JTable();
        jb_agregarproductoxfarmacia = new javax.swing.JButton();
        jd_crearlaboratorio = new javax.swing.JDialog();
        jtxt_nombrelaboratorio = new javax.swing.JTextField();
        jtxt_idlaboratorio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jb_registrarlaboratorio = new javax.swing.JButton();
        jd_crearproducto = new javax.swing.JDialog();
        jtxt_idproducto = new javax.swing.JTextField();
        jtxt_nombreproducto = new javax.swing.JTextField();
        jtxt_tipoproducto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jb_registrarfarmacia1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jb_crear = new javax.swing.JButton();
        jb_modificar = new javax.swing.JButton();
        jb_eliminar = new javax.swing.JButton();

        jb_crearpersona.setText("Persona");
        jb_crearpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearpersonaActionPerformed(evt);
            }
        });

        jb_crearfarmacia.setText("Farmacia");
        jb_crearfarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearfarmaciaActionPerformed(evt);
            }
        });

        jb_crearlab.setText("Laboratorio");
        jb_crearlab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearlabActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearLayout = new javax.swing.GroupLayout(jd_crear.getContentPane());
        jd_crear.getContentPane().setLayout(jd_crearLayout);
        jd_crearLayout.setHorizontalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addGroup(jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jb_crearlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_crearfarmacia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_crearpersona, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(167, Short.MAX_VALUE))
        );
        jd_crearLayout.setVerticalGroup(
            jd_crearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jb_crearfarmacia)
                .addGap(70, 70, 70)
                .addComponent(jb_crearlab)
                .addGap(70, 70, 70)
                .addComponent(jb_crearpersona)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        jtxt_idpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idpersonaActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre");

        jb_registrarpersona.setText("Registrar");
        jb_registrarpersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarpersonaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearpersonaLayout = new javax.swing.GroupLayout(jd_crearpersona.getContentPane());
        jd_crearpersona.getContentPane().setLayout(jd_crearpersonaLayout);
        jd_crearpersonaLayout.setHorizontalGroup(
            jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearpersonaLayout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_registrarpersona)
                    .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtxt_nombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(38, 38, 38)
                            .addComponent(jtxt_idpersona, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(48, 48, 48))
        );
        jd_crearpersonaLayout.setVerticalGroup(
            jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearpersonaLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_idpersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(59, 59, 59)
                .addGroup(jd_crearpersonaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombrepersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addComponent(jb_registrarpersona)
                .addGap(24, 24, 24))
        );

        jtxt_idfarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idfarmaciaActionPerformed(evt);
            }
        });

        jtxt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_direccionActionPerformed(evt);
            }
        });

        jLabel3.setText("IdFarmacia");

        jLabel4.setText("Nombre");

        jLabel5.setText("Direcciòn");

        jb_registrarfarmacia.setText("Registar");
        jb_registrarfarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarfarmaciaActionPerformed(evt);
            }
        });

        jt_productosxfarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "_id", "IdProducto", "NombreProducto", "Tipo"
            }
        ));
        jScrollPane1.setViewportView(jt_productosxfarmacia);

        jb_agregarproductoxfarmacia.setText("Agregar");
        jb_agregarproductoxfarmacia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_agregarproductoxfarmaciaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearfarmaciaLayout = new javax.swing.GroupLayout(jd_crearfarmacia.getContentPane());
        jd_crearfarmacia.getContentPane().setLayout(jd_crearfarmaciaLayout);
        jd_crearfarmaciaLayout.setHorizontalGroup(
            jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearfarmaciaLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(32, 32, 32)
                .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jtxt_direccion)
                        .addComponent(jtxt_nombrefarmacia)
                        .addComponent(jtxt_idfarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jb_registrarfarmacia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(115, 115, 115))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearfarmaciaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jb_agregarproductoxfarmacia)
                .addGap(85, 85, 85))
        );
        jd_crearfarmaciaLayout.setVerticalGroup(
            jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearfarmaciaLayout.createSequentialGroup()
                .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jd_crearfarmaciaLayout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jd_crearfarmaciaLayout.createSequentialGroup()
                                .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jtxt_idfarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addComponent(jtxt_nombrefarmacia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(jd_crearfarmaciaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jtxt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addComponent(jb_registrarfarmacia))
                    .addGroup(jd_crearfarmaciaLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(52, 52, 52)
                .addComponent(jb_agregarproductoxfarmacia)
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jtxt_idlaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idlaboratorioActionPerformed(evt);
            }
        });

        jLabel6.setText("IdLaboratorio");

        jLabel7.setText("Nombre");

        jb_registrarlaboratorio.setText("Registar");
        jb_registrarlaboratorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarlaboratorioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearlaboratorioLayout = new javax.swing.GroupLayout(jd_crearlaboratorio.getContentPane());
        jd_crearlaboratorio.getContentPane().setLayout(jd_crearlaboratorioLayout);
        jd_crearlaboratorioLayout.setHorizontalGroup(
            jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearlaboratorioLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jb_registrarlaboratorio)
                    .addGroup(jd_crearlaboratorioLayout.createSequentialGroup()
                        .addGroup(jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(32, 32, 32)
                        .addGroup(jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_nombrelaboratorio)
                            .addComponent(jtxt_idlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jd_crearlaboratorioLayout.setVerticalGroup(
            jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearlaboratorioLayout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jd_crearlaboratorioLayout.createSequentialGroup()
                        .addGroup(jd_crearlaboratorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtxt_idlaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(33, 33, 33)
                        .addComponent(jtxt_nombrelaboratorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addComponent(jb_registrarlaboratorio)
                .addGap(21, 21, 21))
        );

        jtxt_idproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_idproductoActionPerformed(evt);
            }
        });

        jtxt_tipoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_tipoproductoActionPerformed(evt);
            }
        });

        jLabel8.setText("Tipo");

        jLabel9.setText("Nombre");

        jLabel10.setText("IdProducto");

        jb_registrarfarmacia1.setText("Registar");
        jb_registrarfarmacia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarfarmacia1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jd_crearproductoLayout = new javax.swing.GroupLayout(jd_crearproducto.getContentPane());
        jd_crearproducto.getContentPane().setLayout(jd_crearproductoLayout);
        jd_crearproductoLayout.setHorizontalGroup(
            jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
            .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_crearproductoLayout.createSequentialGroup()
                    .addGap(71, 71, 71)
                    .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)
                        .addComponent(jLabel8))
                    .addGap(32, 32, 32)
                    .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtxt_tipoproducto)
                            .addComponent(jtxt_nombreproducto)
                            .addComponent(jtxt_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jb_registrarfarmacia1))
                    .addContainerGap(71, Short.MAX_VALUE)))
        );
        jd_crearproductoLayout.setVerticalGroup(
            jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 379, Short.MAX_VALUE)
            .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jd_crearproductoLayout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jd_crearproductoLayout.createSequentialGroup()
                            .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jtxt_idproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10))
                            .addGap(33, 33, 33)
                            .addComponent(jtxt_nombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel9))
                    .addGap(34, 34, 34)
                    .addGroup(jd_crearproductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jtxt_tipoproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGap(30, 30, 30)
                    .addComponent(jb_registrarfarmacia1)
                    .addContainerGap(100, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jb_crear.setText("Crear");
        jb_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_crearActionPerformed(evt);
            }
        });

        jb_modificar.setText("Modificar");

        jb_eliminar.setText("Eliminar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(169, 169, 169)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jb_modificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_crear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jb_eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(235, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addComponent(jb_crear)
                .addGap(40, 40, 40)
                .addComponent(jb_modificar)
                .addGap(51, 51, 51)
                .addComponent(jb_eliminar)
                .addContainerGap(137, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearActionPerformed
        jd_crear.pack();
        jd_crear.setModal(true);
        jd_crear.setLocationRelativeTo(this);
        jd_crear.setVisible(true);

    }//GEN-LAST:event_jb_crearActionPerformed

    private void jb_crearfarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearfarmaciaActionPerformed
        personaconexion.obtenerProductos(jt_productosxfarmacia);
        jd_crearfarmacia.pack();
        jd_crearfarmacia.setModal(true);
        jd_crearfarmacia.setLocationRelativeTo(this);
        jd_crearfarmacia.setVisible(true);
        
    }//GEN-LAST:event_jb_crearfarmaciaActionPerformed

    private void jb_crearpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearpersonaActionPerformed
        jd_crearpersona.pack();
        jd_crearpersona.setModal(true);
        jd_crearpersona.setLocationRelativeTo(this);
        jd_crearpersona.setVisible(true);
    }//GEN-LAST:event_jb_crearpersonaActionPerformed

    private void jb_crearlabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_crearlabActionPerformed
        jd_crearlaboratorio.pack();
        jd_crearlaboratorio.setModal(true);
        jd_crearlaboratorio.setLocationRelativeTo(this);
        jd_crearlaboratorio.setVisible(true);
    }//GEN-LAST:event_jb_crearlabActionPerformed

    private void jtxt_idpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idpersonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idpersonaActionPerformed

    private void jb_registrarpersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarpersonaActionPerformed
        persona = new Persona(jtxt_idpersona.getText(), jtxt_nombrepersona.getText());
        personaconexion = new PersonaConexion(persona);
        personaconexion.crearPersona();
    }//GEN-LAST:event_jb_registrarpersonaActionPerformed

    private void jtxt_idfarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idfarmaciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idfarmaciaActionPerformed

    private void jb_registrarfarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarfarmaciaActionPerformed
        farmacia = new Farmacia(jtxt_idfarmacia.getText(), jtxt_nombrefarmacia.getText(), jtxt_direccion.getText());
        personaconexion = new PersonaConexion(farmacia);
        farmacia.setProductos(productos);
        System.out.println(farmacia.getProductos().get(0).toString());
        personaconexion.crearFarmacia();
    }//GEN-LAST:event_jb_registrarfarmaciaActionPerformed

    private void jtxt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_direccionActionPerformed

    private void jtxt_idlaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idlaboratorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idlaboratorioActionPerformed

    private void jb_registrarlaboratorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarlaboratorioActionPerformed
        laboratorio = new Laboratorio(jtxt_idlaboratorio.getText(), jtxt_nombrelaboratorio.getText());
        personaconexion = new PersonaConexion(laboratorio);
        personaconexion.crearLaboratorio();
    }//GEN-LAST:event_jb_registrarlaboratorioActionPerformed

    private void jb_agregarproductoxfarmaciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_agregarproductoxfarmaciaActionPerformed
        producto=new Producto((String)jt_productosxfarmacia.getValueAt(jt_productosxfarmacia.getSelectedRow(), 1),(String)jt_productosxfarmacia.getValueAt(jt_productosxfarmacia.getSelectedRow(), 2),(String)jt_productosxfarmacia.getValueAt(jt_productosxfarmacia.getSelectedRow(), 3));
        productos=new ArrayList();
        productos.add(producto);
        
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i).toString());
        }
    }//GEN-LAST:event_jb_agregarproductoxfarmaciaActionPerformed

    private void jtxt_idproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_idproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_idproductoActionPerformed

    private void jtxt_tipoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_tipoproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_tipoproductoActionPerformed

    private void jb_registrarfarmacia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarfarmacia1ActionPerformed
       
    }//GEN-LAST:event_jb_registrarfarmacia1ActionPerformed

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
            java.util.logging.Logger.getLogger(ProyectoBD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProyectoBD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProyectoBD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProyectoBD2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProyectoBD2().setVisible(true);
            }
        });
        MongoClient mongoClient = MongoClients.create(
                "mongodb+srv://JoseDanielRC:Daniel08@cluster0.nvrwy.mongodb.net/test?retryWrites=true&w=majority");
        MongoDatabase database = mongoClient.getDatabase("test");
        //database.createCollection(" Personas");
        /*Persona persona = new Persona("0402", "Jasser Shelby");
        personaconexion = new PersonaConexion(persona);
        personaconexion.crearPersona();*/
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb_agregarproductoxfarmacia;
    private javax.swing.JButton jb_crear;
    private javax.swing.JButton jb_crearfarmacia;
    private javax.swing.JButton jb_crearlab;
    private javax.swing.JButton jb_crearpersona;
    private javax.swing.JButton jb_eliminar;
    private javax.swing.JButton jb_modificar;
    private javax.swing.JButton jb_registrarfarmacia;
    private javax.swing.JButton jb_registrarfarmacia1;
    private javax.swing.JButton jb_registrarlaboratorio;
    private javax.swing.JButton jb_registrarpersona;
    private javax.swing.JDialog jd_crear;
    private javax.swing.JDialog jd_crearfarmacia;
    private javax.swing.JDialog jd_crearlaboratorio;
    private javax.swing.JDialog jd_crearpersona;
    private javax.swing.JDialog jd_crearproducto;
    private javax.swing.JTable jt_productosxfarmacia;
    private javax.swing.JTextField jtxt_direccion;
    private javax.swing.JTextField jtxt_idfarmacia;
    private javax.swing.JTextField jtxt_idlaboratorio;
    private javax.swing.JTextField jtxt_idpersona;
    private javax.swing.JTextField jtxt_idproducto;
    private javax.swing.JTextField jtxt_nombrefarmacia;
    private javax.swing.JTextField jtxt_nombrelaboratorio;
    private javax.swing.JTextField jtxt_nombrepersona;
    private javax.swing.JTextField jtxt_nombreproducto;
    private javax.swing.JTextField jtxt_tipoproducto;
    // End of variables declaration//GEN-END:variables
}
