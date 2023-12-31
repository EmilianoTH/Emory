package proyectofinal;
/* Librerias personales */
import convertidor.binario.octal.decimal.hexadecimal.*;
import libreriasdeunidades.LibreriasdeUnidades1;
import libreriasdetemperaturas.*;

//Librerias para desactivar varias cosas a la vez
import java.awt.Component;
import java.awt.Container;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author camin
 */
public class Conversiones extends javax.swing.JFrame {
    /* Instancias de librerias */
    Libreriasdetemperaturas1 conversorTem = new Libreriasdetemperaturas1();
    Librerias conversorSis = new Librerias();
    LibreriasdeUnidades1 conversorUni = new LibreriasdeUnidades1();
    
    /**
     * Creates new form Conversiones
     */
    public Conversiones() {
        initComponents();
        desactivarpanel(PaneldeSistemas, false);
        desactivarpanel(PaneldeUnidades,false);
        desactivarpanel(PaneldeTemperatura,false);
    }
    
    // Método para deshabilitar todos los componentes de un contenedor y sus hijos
    private void desactivarcomponentes(Container container, boolean enabled) {
        Component[] components = container.getComponents(); // Obtiene todos los componentes dentro del contenedor
        
        for (Component component : components) { // Recorre todos los componentes del contenedor
            component.setEnabled(enabled); // Establece el estado de habilitado/deshabilitado para cada componente
              
            if (component instanceof Container container1) // Si el componente es a su vez un contenedor, deshabilita sus componentes hijos
                desactivarcomponentes(container1, enabled);
        } //Fin del for
    } //Fin de funcion desactivarcomponentes
    
        // Método para deshabilitar el panel y todos sus componentes
    private void desactivarpanel(JPanel panel, boolean enabled) {
        panel.setEnabled(enabled);
        desactivarcomponentes(panel, enabled);
    } //Fin de funcion desactivar panel

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        Panelprincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JBoxCon = new javax.swing.JComboBox<>();
        PaneldeSistemas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JBoxSISSA = new javax.swing.JComboBox<>();
        JBoxSISSC = new javax.swing.JComboBox<>();
        PaneldeUnidades = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        JBoxUNISA = new javax.swing.JComboBox<>();
        JBoxUNISC = new javax.swing.JComboBox<>();
        PaneldeTemperatura = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        JBoxTEMSA = new javax.swing.JComboBox<>();
        JBoxTEMSC = new javax.swing.JComboBox<>();
        JBConvertir = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        JEscribirNumero = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        TMostrarnumero = new javax.swing.JTextField();

        setTitle("Conversiones");

        Panelprincipal.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Conversiones");

        jLabel2.setFont(new java.awt.Font("Algerian", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Conversores: ");

        JBoxCon.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        JBoxCon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sistemas", "Unidades", "Temperaturas" }));
        JBoxCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBoxConActionPerformed(evt);
            }
        });

        PaneldeSistemas.setBackground(new java.awt.Color(153, 153, 153));

        jLabel3.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Sistema actual:");

        jLabel6.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Sistema a Convertir:");

        JBoxSISSA.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxSISSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binario", "Octal", "Decimal", "Hexadecimal" }));

        JBoxSISSC.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxSISSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Binario", "Octal", "Decimal", "Hexadecimal" }));

        javax.swing.GroupLayout PaneldeSistemasLayout = new javax.swing.GroupLayout(PaneldeSistemas);
        PaneldeSistemas.setLayout(PaneldeSistemasLayout);
        PaneldeSistemasLayout.setHorizontalGroup(
            PaneldeSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneldeSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JBoxSISSC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                        .addGroup(PaneldeSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(JBoxSISSA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PaneldeSistemasLayout.setVerticalGroup(
            PaneldeSistemasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeSistemasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoxSISSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JBoxSISSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        PaneldeUnidades.setBackground(new java.awt.Color(153, 153, 153));

        jLabel4.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sistema actual:");

        jLabel7.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Sistema a Convertir:");

        JBoxUNISA.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxUNISA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimetros", "Pulgadas", "Yardas", "Metros", "Kilometros", "Millas" }));

        JBoxUNISC.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxUNISC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Centimetros", "Pulgadas", "Yardas", "Metros", "Kilometros", "Millas" }));

        javax.swing.GroupLayout PaneldeUnidadesLayout = new javax.swing.GroupLayout(PaneldeUnidades);
        PaneldeUnidades.setLayout(PaneldeUnidadesLayout);
        PaneldeUnidadesLayout.setHorizontalGroup(
            PaneldeUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeUnidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneldeUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneldeUnidadesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JBoxUNISC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PaneldeUnidadesLayout.createSequentialGroup()
                        .addGroup(PaneldeUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addGroup(PaneldeUnidadesLayout.createSequentialGroup()
                                .addGroup(PaneldeUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(JBoxUNISA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        PaneldeUnidadesLayout.setVerticalGroup(
            PaneldeUnidadesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeUnidadesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoxUNISA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoxUNISC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PaneldeTemperatura.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sistema actual:");

        jLabel8.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Sistema a Convertir:");

        JBoxTEMSA.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxTEMSA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Fahrenheit", "Celsius" }));

        JBoxTEMSC.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        JBoxTEMSC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kelvin", "Fahrenheit", "Celsius" }));

        javax.swing.GroupLayout PaneldeTemperaturaLayout = new javax.swing.GroupLayout(PaneldeTemperatura);
        PaneldeTemperatura.setLayout(PaneldeTemperaturaLayout);
        PaneldeTemperaturaLayout.setHorizontalGroup(
            PaneldeTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PaneldeTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PaneldeTemperaturaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(JBoxTEMSC, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(PaneldeTemperaturaLayout.createSequentialGroup()
                        .addGroup(PaneldeTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                            .addGroup(PaneldeTemperaturaLayout.createSequentialGroup()
                                .addGroup(PaneldeTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(JBoxTEMSA, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        PaneldeTemperaturaLayout.setVerticalGroup(
            PaneldeTemperaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PaneldeTemperaturaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoxTEMSA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBoxTEMSC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JBConvertir.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        JBConvertir.setForeground(new java.awt.Color(0, 0, 0));
        JBConvertir.setText("Convertir");
        JBConvertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBConvertirActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Numero:");

        JEscribirNumero.setBackground(new java.awt.Color(102, 102, 102));

        jLabel10.setFont(new java.awt.Font("Algerian", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Resultado:");

        TMostrarnumero.setEditable(false);
        TMostrarnumero.setBackground(new java.awt.Color(102, 102, 102));

        javax.swing.GroupLayout PanelprincipalLayout = new javax.swing.GroupLayout(Panelprincipal);
        Panelprincipal.setLayout(PanelprincipalLayout);
        PanelprincipalLayout.setHorizontalGroup(
            PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelprincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JBConvertir)
                .addGap(351, 351, 351))
            .addGroup(PanelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelprincipalLayout.createSequentialGroup()
                        .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelprincipalLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(90, 90, 90)
                                .addComponent(JBoxCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(PaneldeSistemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                        .addComponent(PaneldeTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelprincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(PaneldeUnidades, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(294, 294, 294))
                    .addGroup(PanelprincipalLayout.createSequentialGroup()
                        .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(30, 30, 30)
                        .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(JEscribirNumero)
                            .addComponent(TMostrarnumero, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        PanelprincipalLayout.setVerticalGroup(
            PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JBoxCon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PaneldeTemperatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneldeUnidades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PaneldeSistemas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBConvertir, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JEscribirNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TMostrarnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panelprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void JBoxConActionPerformed(java.awt.event.ActionEvent evt) {                                        
        if (JBoxCon.getSelectedIndex() == 0) { //Valida que quiera trabajar con el conversor de sistemas
            desactivarpanel(PaneldeSistemas, true);
        } else {
            desactivarpanel(PaneldeSistemas, false);
        } //Fin de ifelse 1
        
        if (JBoxCon.getSelectedIndex() == 1) { //Valida que quiera trabajar con el conversor de unidades
            desactivarpanel(PaneldeUnidades, true);
        } else {
            desactivarpanel(PaneldeUnidades, false);
        } //Fin de ifelse 2
        
        if (JBoxCon.getSelectedIndex() == 2) { //Valida que quiera trabajar con el conversor de temperaturas
            desactivarpanel(PaneldeTemperatura, true);
        } else {
            desactivarpanel(PaneldeTemperatura, false);
        } //Fin del ifelse 3
    }                                       

    private void JBConvertirActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if (JBoxCon.getSelectedIndex() == 0) { //Comienzo del if para trabajar con el conversor de Sistemas
            if (JEscribirNumero.getText().isEmpty()) { //Valida que el usuario no deje el espacio en blanco
                JOptionPane.showMessageDialog(this, "ERROR\nNo dejes ningun espacio en blanco", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (JBoxSISSA.getSelectedIndex() == JBoxSISSC.getSelectedIndex()) { //Valida que no elija las mismas opciones
                JOptionPane.showMessageDialog(this, "ERROR\nNo elijas las mismas opciones a convertir", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (Integer.parseInt(JEscribirNumero.getText()) == 0) { //Valida que no haya escrito 0
                        JOptionPane.showMessageDialog(this, "ERROR\nNo escribas 0 en el numero principal", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        if (JEscribirNumero.getText().matches("^[a-f]")) {
                            TMostrarnumero.setText(conversorSis.convertidor(JBoxSISSA.getSelectedIndex()+1, JBoxSISSC.getSelectedIndex()+1, JEscribirNumero.getText().toUpperCase()));
                        } else {
                            TMostrarnumero.setText(conversorSis.convertidor(JBoxSISSA.getSelectedIndex()+1, JBoxSISSC.getSelectedIndex()+1, JEscribirNumero.getText()));
                        } //Fin del ifelse para que convierta minusculas a mayusculas
                    } //Fin del tercer ifelse
                } //Fin del segundo ifelse
            } //Fin del ifelse principal
        } //Fin del if para trabajar con sistemas
        
        
        if (JBoxCon.getSelectedIndex() == 1) { //Comienzo del if para trabajar con el conversor de Unidades
            if (JEscribirNumero.getText().isEmpty()) { //Valida que el usuario no deje el espacio en blanco
                JOptionPane.showMessageDialog(this, "ERROR\nNo dejes ningun espacio en blanco", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (JBoxUNISA.getSelectedIndex() == JBoxUNISC.getSelectedIndex()) { //Valida que no elija las mismas opciones
                JOptionPane.showMessageDialog(this, "ERROR\nNo elijas las mismas opciones a convertir", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (Integer.parseInt(JEscribirNumero.getText()) == 0) { //Valida que no haya escrito 0
                        JOptionPane.showMessageDialog(this, "ERROR\nNo escribas 0 en el numero principal", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        TMostrarnumero.setText(Double.toString(conversorUni.Unidadgeneral(JBoxUNISA.getSelectedIndex()+1, JBoxUNISC.getSelectedIndex()+1, Double.parseDouble(JEscribirNumero.getText()))));
                    } //Fin del tercer ifelse
                } //Fin del segundo ifelse
            } //Fin del ifelse principal
        } //Fin del if para trabajar con sistemas
        
        
        if (JBoxCon.getSelectedIndex() == 2) { //Comienzo del if para trabajar con el conversor de Temperatura
            if (JEscribirNumero.getText().isEmpty()) { //Valida que el usuario no deje el espacio en blanco
                JOptionPane.showMessageDialog(this, "ERROR\nNo dejes ningun espacio en blanco", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                if (JBoxTEMSA.getSelectedIndex() == JBoxTEMSC.getSelectedIndex()) { //Valida que no elija las mismas opciones
                JOptionPane.showMessageDialog(this, "ERROR\nNo elijas las mismas opciones a convertir", "Advertencia", JOptionPane.WARNING_MESSAGE);
                } else {
                    if (Integer.parseInt(JEscribirNumero.getText()) == 0) { //Valida que no haya escrito 0
                        JOptionPane.showMessageDialog(this, "ERROR\nNo escribas 0 en el numero principal", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    } else {
                        TMostrarnumero.setText(Float.toString(conversorTem.Transformador(JBoxTEMSA.getSelectedIndex()+1, JBoxTEMSC.getSelectedIndex()+1, Float.parseFloat(JEscribirNumero.getText()))));
                    } //Fin del tercer ifelse
                } //Fin del segundo ifelse
            } //Fin del ifelse principal
        } //Fin del if para trabajar Temperatura
    }                                           

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
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Conversiones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Conversiones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton JBConvertir;
    private javax.swing.JComboBox<String> JBoxCon;
    private javax.swing.JComboBox<String> JBoxSISSA;
    private javax.swing.JComboBox<String> JBoxSISSC;
    private javax.swing.JComboBox<String> JBoxTEMSA;
    private javax.swing.JComboBox<String> JBoxTEMSC;
    private javax.swing.JComboBox<String> JBoxUNISA;
    private javax.swing.JComboBox<String> JBoxUNISC;
    private javax.swing.JTextField JEscribirNumero;
    private javax.swing.JPanel PaneldeSistemas;
    private javax.swing.JPanel PaneldeTemperatura;
    private javax.swing.JPanel PaneldeUnidades;
    private javax.swing.JPanel Panelprincipal;
    private javax.swing.JTextField TMostrarnumero;
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
    // End of variables declaration                   
}
