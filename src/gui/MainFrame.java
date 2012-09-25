//**********************************************************
// COMPUTACIÓN GRÁFICA
// TALLER 1: Primitivas de Raster - Conversión de Rectas
//
// PROYECTO DE SOFTWARE EN JAVA (JDK1.7)
// USANDO IDE: NetBeans 7.1.2
//
// WEB PAGE: http://gustalibreros.github.com/TALLER_1_CG/
//
// FECHA: 13.Sep 2012
//
// ARCHIVO: MainFrame.java
//
// AUTORES:
//
//     Juan David Patiño 
//     juandavid162@gmail.com
//
//     Roberto Ceballos            
//     robertrock2000@gmail.com
//
//     Gustavo Adolfo Rodriguez
//     gustalibreros@gmail.com
//
// ESCUELA DE INGENIERIA DE SISTEMAS Y COMPUTACION
// UNIVERSIDAD DEL VALLE
//**********************************************************
package gui;

import algoritmoLinea.PuntoMedio;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.UnsupportedLookAndFeelException;

public class MainFrame extends javax.swing.JFrame {

    private int iContadorMouse;
    private int ixInicial, ixFinal, iyInicial, iyFinal;
    private ManejadorCanvas mc;
    private String sAlgoritmoEjecutar;
    private ArrayList<Point> arrayPuntos;

    public MainFrame() {
        initComponents();
        iContadorMouse = 0;
        ixInicial = 0;
        ixFinal = 0;
        iyInicial = 0;
        iyFinal = 0;
        mc = new ManejadorCanvas(canvas);
        arrayPuntos = new ArrayList<Point>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        canvas = new CanvasPersonalizado();
        jPanel2 = new javax.swing.JPanel();
        jLpuntoInicial = new javax.swing.JLabel();
        jLxi = new javax.swing.JLabel();
        jTFxi = new javax.swing.JTextField();
        jLyi = new javax.swing.JLabel();
        jTFyi = new javax.swing.JTextField();
        jBLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLxf = new javax.swing.JLabel();
        jTFxActual = new javax.swing.JTextField();
        jLyf = new javax.swing.JLabel();
        jTFyActual = new javax.swing.JTextField();
        jLpuntoFinal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TALLER 1: Primitivas de Raster - Conversión de Rectas");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        canvas.setBackground(java.awt.Color.white);
        canvas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        canvas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                canvasMouseClicked(evt);
            }
        });
        canvas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                canvasMouseMoved(evt);
            }
        });
        jPanel1.add(canvas);
        canvas.setBounds(0, 0, 450, 350);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 0, 450, 350);

        jPanel2.setLayout(null);

        jLpuntoInicial.setText("Punto Inicial");
        jPanel2.add(jLpuntoInicial);
        jLpuntoInicial.setBounds(20, 15, 110, 20);

        jLxi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxi.setText("x");
        jPanel2.add(jLxi);
        jLxi.setBounds(10, 40, 30, 30);

        jTFxi.setEditable(false);
        jTFxi.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel2.add(jTFxi);
        jTFxi.setBounds(35, 40, 42, 30);

        jLyi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLyi.setText("y");
        jPanel2.add(jLyi);
        jLyi.setBounds(73, 40, 30, 30);

        jTFyi.setEditable(false);
        jTFyi.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel2.add(jTFyi);
        jTFyi.setBounds(100, 40, 42, 30);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.setFocusable(false);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiar);
        jBLimpiar.setBounds(20, 300, 110, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 150, 350);

        jPanel3.setLayout(null);

        jLxf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxf.setText("x");
        jPanel3.add(jLxf);
        jLxf.setBounds(0, 0, 30, 30);

        jTFxActual.setEditable(false);
        jTFxActual.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel3.add(jTFxActual);
        jTFxActual.setBounds(20, 0, 42, 30);

        jLyf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLyf.setText("y");
        jPanel3.add(jLyf);
        jLyf.setBounds(70, 0, 30, 30);

        jTFyActual.setEditable(false);
        jTFyActual.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel3.add(jTFyActual);
        jTFyActual.setBounds(90, 0, 42, 30);

        jLpuntoFinal.setText("Punto actual");
        jPanel3.add(jLpuntoFinal);
        jLpuntoFinal.setBounds(20, 30, 110, 20);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 350, 140, 60);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(220, 380, 450, 90);

        jLabel1.setText("Lista de puntos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 360, 120, 18);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-738)/2, (screenSize.height-512)/2, 738, 512);
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        canvas.repaint();
        jTFxi.setText(null);
        jTFyi.setText(null);
        jTFxActual.setText(null);
        jTFyActual.setText(null);
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void canvasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseMoved
        int ix, iy;
        ix = mc.javaTorealX(evt.getX());
        iy = mc.javaTorealY(evt.getY());
        jTFxActual.setText(Integer.toString(ix));
        jTFyActual.setText(Integer.toString(iy));
    }//GEN-LAST:event_canvasMouseMoved

    private void canvasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_canvasMouseClicked

        if (iContadorMouse == 0) {
            ixInicial = mc.javaTorealX(evt.getX());
            iyInicial = mc.javaTorealY(evt.getY());
            mc.pintarPixel(ixInicial, iyInicial);
            arrayPuntos.add(new Point(ixInicial, iyInicial));
            jTFxi.setText(Integer.toString(ixInicial));
            jTFyi.setText(Integer.toString(iyInicial));
            iContadorMouse++;
        } else {            
            ixFinal = mc.javaTorealX(evt.getX());
            iyFinal = mc.javaTorealY(evt.getY());
            arrayPuntos.add(new Point(ixFinal, iyFinal));
            iContadorMouse++;
            puntoMedio(ixInicial, iyInicial, ixFinal, iyFinal);
            ixInicial = ixFinal;
            iyInicial = iyFinal;
        }
    }//GEN-LAST:event_canvasMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        System.out.println(evt.getKeyCode());
    }//GEN-LAST:event_formKeyPressed

    void puntoMedio(int nx1, int ny1, int nx2, int ny2) {

        ArrayList<Point> aListPuntosRasterizacion = PuntoMedio.Bresenham(nx1, ny1, nx2, ny2);

        if (!aListPuntosRasterizacion.isEmpty()) {
            for (int i = 0; i < aListPuntosRasterizacion.size(); i++) {
                Point point = aListPuntosRasterizacion.get(i);
                mc.pintarPixel(point.x, point.y);
            }
        }

    }

    public static void main(String args[]) {

        try {
            try {
                javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (UnsupportedLookAndFeelException ex) {
                ex.printStackTrace();
            }
        } catch (Exception ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Canvas canvas;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLpuntoFinal;
    private javax.swing.JLabel jLpuntoInicial;
    private javax.swing.JLabel jLxf;
    private javax.swing.JLabel jLxi;
    private javax.swing.JLabel jLyf;
    private javax.swing.JLabel jLyi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFxActual;
    private javax.swing.JTextField jTFxi;
    private javax.swing.JTextField jTFyActual;
    private javax.swing.JTextField jTFyi;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
