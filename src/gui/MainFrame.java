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
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import transformacionesGeometricas.Transformaciones;

public class MainFrame extends javax.swing.JFrame {

    private int iContadorMouse;
    private int ixInicial, ixFinal, iyInicial, iyFinal, ixTemp, iyTemp;
    private ManejadorCanvas mc;
    /// arrayPuntosExtremos, arreglo de los puntos extremos de cada linea
    private ArrayList<Point> arrayTodosPuntosPintados, arrayPuntosExtremos;

    public MainFrame() {
        initComponents();
        iContadorMouse = 0;
        ixInicial = 0;
        ixFinal = 0;
        iyInicial = 0;
        iyFinal = 0;
        mc = new ManejadorCanvas(canvas);
        arrayTodosPuntosPintados = new ArrayList<Point>();
        arrayPuntosExtremos = new ArrayList<Point>();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        canvas = new CanvasPersonalizado();
        jPanel2 = new javax.swing.JPanel();
        jBLimpiar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLxf = new javax.swing.JLabel();
        jTFxActual = new javax.swing.JTextField();
        jLyf = new javax.swing.JLabel();
        jTFyActual = new javax.swing.JTextField();
        jLpuntoFinal = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLpuntoInicial = new javax.swing.JLabel();
        jLxi = new javax.swing.JLabel();
        jTFxi = new javax.swing.JTextField();
        jLyi = new javax.swing.JLabel();
        jTFyi = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTAListaPuntos = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jBTrasladar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFtxTrasladar = new javax.swing.JTextField();
        jTFtyTrasladar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TALLER 4: Transformaciones Geometricas");
        addKeyListener(new java.awt.event.KeyAdapter() {
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

        jBLimpiar.setText("Limpiar");
        jBLimpiar.setFocusable(false);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiar);
        jBLimpiar.setBounds(10, 380, 110, 29);

        jPanel3.setLayout(null);

        jLxf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxf.setText("x");
        jPanel3.add(jLxf);
        jLxf.setBounds(0, 20, 30, 30);

        jTFxActual.setEditable(false);
        jTFxActual.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel3.add(jTFxActual);
        jTFxActual.setBounds(20, 20, 42, 30);

        jLyf.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLyf.setText("y");
        jPanel3.add(jLyf);
        jLyf.setBounds(60, 20, 30, 30);

        jTFyActual.setEditable(false);
        jTFyActual.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel3.add(jTFyActual);
        jTFyActual.setBounds(80, 20, 42, 30);

        jLpuntoFinal.setText("Punto actual");
        jPanel3.add(jLpuntoFinal);
        jLpuntoFinal.setBounds(10, 0, 110, 20);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 0, 140, 60);

        jPanel4.setLayout(null);

        jLpuntoInicial.setText("Punto Inicial");
        jPanel4.add(jLpuntoInicial);
        jLpuntoInicial.setBounds(10, 0, 110, 20);

        jLxi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLxi.setText("x");
        jPanel4.add(jLxi);
        jLxi.setBounds(0, 20, 30, 30);

        jTFxi.setEditable(false);
        jTFxi.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel4.add(jTFxi);
        jTFxi.setBounds(20, 20, 42, 30);

        jLyi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLyi.setText("y");
        jPanel4.add(jLyi);
        jLyi.setBounds(60, 20, 30, 30);

        jTFyi.setEditable(false);
        jTFyi.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel4.add(jTFyi);
        jTFyi.setBounds(80, 20, 40, 30);

        jPanel2.add(jPanel4);
        jPanel4.setBounds(0, 60, 130, 60);

        jTAListaPuntos.setEditable(false);
        jTAListaPuntos.setColumns(20);
        jTAListaPuntos.setRows(5);
        jScrollPane1.setViewportView(jTAListaPuntos);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(10, 160, 120, 200);

        jLabel1.setText("Lista de puntos");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(10, 140, 120, 17);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 120, 140, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 150, 420);

        jLabel2.setText("*Para cerrar el poligono presionar ' f '");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(220, 350, 270, 17);

        jPanel5.setLayout(null);

        jBTrasladar.setText("Trasladar");
        jBTrasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrasladarActionPerformed(evt);
            }
        });
        jPanel5.add(jBTrasladar);
        jBTrasladar.setBounds(180, 10, 110, 29);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tx");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(10, 10, 30, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ty");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(90, 10, 30, 30);

        jTFtxTrasladar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFtxTrasladar);
        jTFtxTrasladar.setBounds(40, 10, 42, 30);

        jTFtyTrasladar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFtyTrasladar);
        jTFtyTrasladar.setBounds(120, 10, 40, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(230, 380, 440, 110);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-760)/2, (screenSize.height-540)/2, 760, 540);
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        canvas.repaint();

        ///  valores de las cajas de texto de la gui vacias
        jTFxi.setText(null);
        jTFyi.setText(null);
        jTFxActual.setText(null);
        jTFyActual.setText(null);
        jTAListaPuntos.setText(null);

        /// reinicializar variables clase
        iContadorMouse = 0;
        ixInicial = 0;
        ixFinal = 0;
        iyInicial = 0;
        iyFinal = 0;
        arrayTodosPuntosPintados.clear();
        arrayPuntosExtremos.clear();

        /// habilitar canvas
        canvas.enable(true);
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
            arrayPuntosExtremos.add(new Point(ixInicial, iyInicial));
            jTFxi.setText(Integer.toString(ixInicial));
            jTFyi.setText(Integer.toString(iyInicial));
            ixTemp = ixInicial;
            iyTemp = iyInicial;
            iContadorMouse++;
        } else {
            ixFinal = mc.javaTorealX(evt.getX());
            iyFinal = mc.javaTorealY(evt.getY());
            arrayPuntosExtremos.add(new Point(ixFinal, iyFinal));
            iContadorMouse++;
            puntoMedio(ixTemp, iyTemp, ixFinal, iyFinal);
            ixTemp = ixFinal;
            iyTemp = iyFinal;
        }
        reescribirJTextAreaPuntos();
        requestFocus();
    }//GEN-LAST:event_canvasMouseClicked

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        //System.out.println(evt.getKeyCode());
        /// el codigo de la letra f es 70
        if (evt.getKeyCode() == 70 && iContadorMouse > 2) {
            arrayPuntosExtremos.add(new Point(ixTemp, iyTemp));
            puntoMedio(ixTemp, iyTemp, ixInicial, iyInicial);
            jTFxActual.setText("");
            jTFyActual.setText("");
            canvas.enable(false);
        }

    }//GEN-LAST:event_formKeyPressed

    private void jBTrasladarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTrasladarActionPerformed
        try {
            int tx = Integer.parseInt(jTFtxTrasladar.getText());
            int ty = Integer.parseInt(jTFtyTrasladar.getText());
            System.out.println(arrayTodosPuntosPintados.size());
            for (int i = 0; i < arrayTodosPuntosPintados.size(); i++) {
                Point pointGet = arrayTodosPuntosPintados.get(i);
                Point pointTraslacion = Transformaciones.traslacion(pointGet, tx, ty);
                arrayTodosPuntosPintados.remove(i);
                arrayTodosPuntosPintados.add(i, pointTraslacion);
            }
            pintarCanvasArray(arrayTodosPuntosPintados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error datos Traslacion", "Ingresar Tx y Ty ", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jBTrasladarActionPerformed

    void puntoMedio(int nx1, int ny1, int nx2, int ny2) {

        ArrayList<Point> aListPuntosRasterizacion = PuntoMedio.Bresenham(nx1, ny1, nx2, ny2);

        if (!aListPuntosRasterizacion.isEmpty()) {
            for (int i = 0; i < aListPuntosRasterizacion.size(); i++) {
                Point point = aListPuntosRasterizacion.get(i);
                mc.pintarPixel(point.x, point.y);
                agregarPuntoPintdosaArray(point.x, point.y);
            }
        }

    }
    
    
    void pintarCanvasArray(ArrayList<Point> puntos){
        for (int i = 0; i < puntos.size(); i++) {
            Point point = puntos.get(i);
            mc.pintarPixel(point.x, point.y);
        }
        
    }

    void agregarPuntoExtremoaArray(int x, int y) {
        Point p = new Point(x, y);
        arrayPuntosExtremos.add(p);
    }

    void agregarPuntoPintdosaArray(int x, int y) {
        Point p = new Point(x, y);
        arrayTodosPuntosPintados.add(p);
    }

    void reescribirJTextAreaPuntos() {
        String texto = "";
        for (int i = 0; i < arrayPuntosExtremos.size(); i++) {
            Point puntoGet = arrayPuntosExtremos.get(i);
            puntoGet = arrayPuntosExtremos.get(i);
            texto += "(" + puntoGet.x + "," + puntoGet.y + ") \n";
        }

        jTAListaPuntos.setText(texto);
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
    private javax.swing.JButton jBTrasladar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLpuntoFinal;
    private javax.swing.JLabel jLpuntoInicial;
    private javax.swing.JLabel jLxf;
    private javax.swing.JLabel jLxi;
    private javax.swing.JLabel jLyf;
    private javax.swing.JLabel jLyi;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTAListaPuntos;
    private javax.swing.JTextField jTFtxTrasladar;
    private javax.swing.JTextField jTFtyTrasladar;
    private javax.swing.JTextField jTFxActual;
    private javax.swing.JTextField jTFxi;
    private javax.swing.JTextField jTFyActual;
    private javax.swing.JTextField jTFyi;
    // End of variables declaration//GEN-END:variables
}
