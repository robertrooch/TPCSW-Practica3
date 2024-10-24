/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package org.uv.tpcsw.practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author roberto
 */
public class EmpleadosGUI extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmpleadosGUI
     */
    public EmpleadosGUI() {
        initComponents();
        cargarDepartamentos();
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtClave = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDIreccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btoBuscarId = new javax.swing.JButton();
        btonTodos = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btonActualizar = new javax.swing.JButton();
        cbxDepartamentos = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(700, 400));
        setPreferredSize(new java.awt.Dimension(700, 400));

        jLabel1.setText("Clave:");

        jLabel2.setText("Nombre:");

        jLabel3.setText("Direccion:");

        jLabel4.setText("Telefono:");

        txtClave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClaveActionPerformed(evt);
            }
        });

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        btoBuscarId.setText("Buscar");
        btoBuscarId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBuscarIdActionPerformed(evt);
            }
        });

        btonTodos.setText("Buscar Todos");
        btonTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonTodosActionPerformed(evt);
            }
        });

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        jLabel5.setText("Nuevo Empleado");

        jLabel6.setText("Buscar o borrar empleado");

        jLabel7.setText("Buscar todos los empleados");

        btonActualizar.setText("Actualizar");
        btonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btonActualizarActionPerformed(evt);
            }
        });

        jLabel8.setText("Departamento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel8))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDIreccion, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnGuardar)
                                                .addGap(137, 137, 137)
                                                .addComponent(jLabel1))
                                            .addComponent(btonActualizar))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btoBuscarId)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnBorrar))))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbxDepartamentos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                                .addGap(0, 215, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(216, 216, 216))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btonTodos)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDIreccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btoBuscarId)
                    .addComponent(btnBorrar)
                    .addComponent(btonActualizar))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxDepartamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(51, 51, 51)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btonTodos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarDepartamentos() {
        DAODepartamento daoDepartamento = new DAODepartamento();
        List<Departamento> departamentos = daoDepartamento.findAll();

        if (departamentos != null) {
            for (Departamento dep : departamentos) {
                // Guardar el ID y nombre en el mapa
                departamentosMap.put(dep.getClave(), dep.getNombre());

                // Agregar solo el nombre al JComboBox
                cbxDepartamentos.addItem(dep.getNombre());
            }
        } else {
            JOptionPane.showMessageDialog(this, "No se encontraron departamentos.");
        }
    }


    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String nombreSeleccionado = (String) cbxDepartamentos.getSelectedItem();  // Obtener el nombre seleccionado

        // Buscar el ID correspondiente en el mapa
        Long departamentoId = null;
        for (Map.Entry<Long, String> entry : departamentosMap.entrySet()) {
            if (entry.getValue().equals(nombreSeleccionado)) {
                departamentoId = entry.getKey();
                break;
            }
        }

        if (departamentoId != null) {
            DAODepartamento daoDepartamento = new DAODepartamento();
            Departamento departamento = daoDepartamento.findById(departamentoId);  // Buscar por ID

            if (departamento != null) {
                Empleado nuevoEmpleado = new Empleado();
                nuevoEmpleado.setNombre(txtNombre.getText());
                nuevoEmpleado.setDireccion(txtDIreccion.getText());
                nuevoEmpleado.setTelefono(txtTelefono.getText());
                nuevoEmpleado.setDepto(departamento);  // Asociar el departamento

                DAOEmpleado daoEmpleado = new DAOEmpleado();
                if (daoEmpleado.save(nuevoEmpleado)) {
                    JOptionPane.showMessageDialog(this, "Empleado guardado con éxito.");
                } else {
                    JOptionPane.showMessageDialog(this, "Error al guardar el empleado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un departamento válido.");
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btoBuscarIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBuscarIdActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  // Abrir nueva sesión
        Transaction t = session.beginTransaction();

        try {
            // Obtener la clave del empleado desde el campo de texto
            Long clave = Long.valueOf(txtClave.getText());

            // Buscar el empleado por su ID (clave primaria)
            Empleado empleado = session.get(Empleado.class, clave);

            if (empleado != null) {
                // Mostrar los datos del empleado en los campos de texto
                txtNombre.setText(empleado.getNombre());
                txtDIreccion.setText(empleado.getDireccion());
                txtTelefono.setText(empleado.getTelefono());

                // Obtener el departamento del empleado
                Departamento departamento = empleado.getDepto();
                if (departamento != null) {
                    // Establecer la selección del JComboBox al departamento del empleado
                    cbxDepartamentos.setSelectedItem(departamentosMap.get(departamento.getClave()));
                } else {
                    JOptionPane.showMessageDialog(this, "Departamento no encontrado.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado.");
            }

            t.commit();  // Confirmar la transacción
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  // Revertir la transacción si hay un error
            }
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            session.close();  // Cerrar la sesión
        }
    }//GEN-LAST:event_btoBuscarIdActionPerformed

    private void btonTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonTodosActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  // Abrir nueva sesión
        Transaction t = session.beginTransaction();

        try {
            // Obtener todos los empleados
            DAOEmpleado daoEmpleado = new DAOEmpleado();
            List<Empleado> empleados = daoEmpleado.findAll();

            // Crear el modelo para la tabla
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Clave");
            modelo.addColumn("Nombre");
            modelo.addColumn("Dirección");
            modelo.addColumn("Teléfono");
            modelo.addColumn("Departamento");

            // Agregar los datos de los empleados al modelo
            for (Empleado emp : empleados) {
                String nombreDepartamento = emp.getDepto() != null ? emp.getDepto().getNombre() : "Sin departamento";
                modelo.addRow(new Object[]{
                    emp.getClave(),
                    emp.getNombre(),
                    emp.getDireccion(),
                    emp.getTelefono(),
                    nombreDepartamento
                });
            }

            // Establecer el modelo en la tabla
            jTable1.setModel(modelo);

            t.commit();  // Confirmar la transacción
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  // Revertir la transacción en caso de error
            }
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            session.close();  // Cerrar la sesión
        }
    }//GEN-LAST:event_btonTodosActionPerformed

    private void txtClaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClaveActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  // Se recomienda abrir una nueva sesión.
        Transaction t = null;

        try {
            t = session.beginTransaction();  // Inicia la transacción

            Long clave = Long.valueOf(txtClave.getText());
            Empleado empleadoEncontrado = session.get(Empleado.class, clave);

            if (empleadoEncontrado != null) {
                session.delete(empleadoEncontrado);  // Eliminar el empleado
                t.commit();  // Confirmar la transacción
                JOptionPane.showMessageDialog(this, "Empleado eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado");
            }
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  // Revertir la transacción si hay un error
            }
            JOptionPane.showMessageDialog(this, "Error al eliminar empleado: " + e.getMessage());
        } finally {
            session.close();  // Cerrar la sesión para liberar recursos
        }
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btonActualizarActionPerformed
        // TODO add your handling code here:
        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.openSession();  // Abrir una nueva sesión
        Transaction t = null;

        try {
            t = session.beginTransaction();  // Iniciar la transacción

            // Obtener la clave del empleado desde el campo de texto
            Long clave = Long.valueOf(txtClave.getText());

            // Buscar el empleado por su clave
            Empleado empleadoEncontrado = session.get(Empleado.class, clave);
            if (empleadoEncontrado != null) {
                // Actualizar los datos del empleado
                empleadoEncontrado.setNombre(txtNombre.getText());
                empleadoEncontrado.setDireccion(txtDIreccion.getText());
                empleadoEncontrado.setTelefono(txtTelefono.getText());

                session.update(empleadoEncontrado);  // Actualizar en la sesión
                t.commit();  // Confirmar la transacción

                JOptionPane.showMessageDialog(this, "Empleado actualizado");
            } else {
                JOptionPane.showMessageDialog(this, "Empleado no encontrado");
            }
        } catch (Exception e) {
            if (t != null) {
                t.rollback();  // Revertir la transacción en caso de error
            }
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
        } finally {
            session.close();  // Cerrar la sesión para liberar recursos
        }
    }//GEN-LAST:event_btonActualizarActionPerformed

    private Map<Long, String> departamentosMap = new HashMap<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btoBuscarId;
    private javax.swing.JButton btonActualizar;
    private javax.swing.JButton btonTodos;
    private javax.swing.JComboBox<String> cbxDepartamentos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtDIreccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
