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

import logica.PuntoMedio;
import java.awt.Point;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.UnsupportedLookAndFeelException;
import logica.Transformaciones;

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
        hablitarGuiTransformaciones(false);
        valoresPorDefectoFunciones();
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
        jBRotar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTFtxTrasladar = new javax.swing.JTextField();
        jTFtyTrasladar = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jTFPxRotacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTFGradosRotar = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTFPyRotacion = new javax.swing.JTextField();
        jBTrasladar = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jTFPcxEscalacion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTFPcyEscalacion = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTFPsxEscalacion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTFPsyEscalacion = new javax.swing.JTextField();
        jBEscalar = new javax.swing.JButton();

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
        canvas.setBounds(0, 0, 520, 460);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(150, 0, 520, 460);

        jPanel2.setLayout(null);

        jBLimpiar.setText("Limpiar");
        jBLimpiar.setFocusable(false);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });
        jPanel2.add(jBLimpiar);
        jBLimpiar.setBounds(10, 380, 110, 30);

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
        jLabel1.setBounds(10, 140, 120, 18);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 120, 140, 10);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 150, 420);

        jLabel2.setText("* Para cerrar el poligono presionar ' f '");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 470, 270, 18);

        jPanel5.setLayout(null);

        jBRotar.setText("Rotar");
        jBRotar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRotarActionPerformed(evt);
            }
        });
        jPanel5.add(jBRotar);
        jBRotar.setBounds(160, 70, 110, 30);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Tx");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(10, 10, 30, 30);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ty");
        jPanel5.add(jLabel3);
        jLabel3.setBounds(80, 10, 30, 30);

        jTFtxTrasladar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFtxTrasladar);
        jTFtxTrasladar.setBounds(40, 10, 42, 30);

        jTFtyTrasladar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFtyTrasladar);
        jTFtyTrasladar.setBounds(110, 10, 40, 30);
        jPanel5.add(jSeparator2);
        jSeparator2.setBounds(0, 130, 280, 10);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Px");
        jPanel5.add(jLabel5);
        jLabel5.setBounds(10, 60, 30, 30);

        jTFPxRotacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPxRotacion);
        jTFPxRotacion.setBounds(40, 60, 42, 30);

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Py");
        jPanel5.add(jLabel6);
        jLabel6.setBounds(80, 60, 30, 30);

        jTFGradosRotar.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFGradosRotar);
        jTFGradosRotar.setBounds(110, 90, 40, 30);

        jLabel7.setText("Grados");
        jPanel5.add(jLabel7);
        jLabel7.setBounds(60, 90, 50, 30);

        jTFPyRotacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPyRotacion);
        jTFPyRotacion.setBounds(110, 60, 40, 30);

        jBTrasladar.setText("Trasladar");
        jBTrasladar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTrasladarActionPerformed(evt);
            }
        });
        jPanel5.add(jBTrasladar);
        jBTrasladar.setBounds(160, 10, 110, 30);
        jPanel5.add(jSeparator3);
        jSeparator3.setBounds(0, 50, 280, 10);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Px");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(10, 140, 30, 30);

        jTFPcxEscalacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPcxEscalacion);
        jTFPcxEscalacion.setBounds(40, 140, 42, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Py");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(80, 140, 30, 30);

        jTFPcyEscalacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPcyEscalacion);
        jTFPcyEscalacion.setBounds(110, 140, 40, 30);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sx");
        jPanel5.add(jLabel10);
        jLabel10.setBounds(10, 180, 30, 30);

        jTFPsxEscalacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPsxEscalacion);
        jTFPsxEscalacion.setBounds(40, 180, 42, 30);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Sy");
        jPanel5.add(jLabel11);
        jLabel11.setBounds(80, 180, 30, 30);

        jTFPsyEscalacion.setFont(new java.awt.Font("Ubuntu", 0, 14)); // NOI18N
        jPanel5.add(jTFPsyEscalacion);
        jTFPsyEscalacion.setBounds(110, 180, 40, 30);

        jBEscalar.setText("Escalar");
        jBEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEscalarActionPerformed(evt);
            }
        });
        jPanel5.add(jBEscalar);
        jBEscalar.setBounds(160, 160, 110, 30);

        getContentPane().add(jPanel5);
        jPanel5.setBounds(680, 10, 280, 320);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-976)/2, (screenSize.height-522)/2, 976, 522);
    }// </editor-fold>//GEN-END:initComponents

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed

        canvas.repaint();

        ///  valores de las cajas de texto de la gui vacias
        jTFxi.setText(null);
        jTFyi.setText(null);
        jTFxActual.setText(null);
        jTFyActual.setText(null);
        jTAListaPuntos.setText(null);
        
        valoresPorDefectoFunciones();
        
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
        //deshabiliar funciones de transformaciones de la gui
        hablitarGuiTransformaciones(false);
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
            hablitarGuiTransformaciones(true);
        }

    }//GEN-LAST:event_formKeyPressed

    private void jBRotarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRotarActionPerformed
        try {
            int px = Integer.parseInt(jTFPxRotacion.getText());
            int py = Integer.parseInt(jTFPyRotacion.getText());
            int grados = Integer.parseInt(jTFGradosRotar.getText());
            Point pc = new Point(px, py);
            System.out.println(arrayTodosPuntosPintados.size());
            for (int i = 0; i < arrayTodosPuntosPintados.size(); i++) {
                Point pointGet = arrayTodosPuntosPintados.get(i);
                Point pointRotacion = Transformaciones.rotacion(pc, pointGet, grados);
                arrayTodosPuntosPintados.remove(i);
                arrayTodosPuntosPintados.add(i, pointRotacion);
            }
            pintarCanvasArray(arrayTodosPuntosPintados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error datos Rotacion", "Ingresar Px, Py, grados ", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_jBRotarActionPerformed

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

    private void jBEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEscalarActionPerformed
        try {
            int px = Integer.parseInt(jTFPcxEscalacion.getText());
            int py = Integer.parseInt(jTFPcyEscalacion.getText());
            double xs = Double.parseDouble(jTFPsxEscalacion.getText());
            double ys = Double.parseDouble(jTFPsyEscalacion.getText());
            Point pc = new Point(px, py);
            System.out.println(arrayTodosPuntosPintados.size());
            for (int i = 0; i < arrayTodosPuntosPintados.size(); i++) {
                Point pointGet = arrayTodosPuntosPintados.get(i);
                Point pointEscalacion = Transformaciones.escalacion(pc, pointGet, xs, ys);
                arrayTodosPuntosPintados.remove(i);
                arrayTodosPuntosPintados.add(i, pointEscalacion);
            }
            pintarCanvasArray(arrayTodosPuntosPintados);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error datos Escalacion", "Ingresar Px, Py, Sx , Sy ", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jBEscalarActionPerformed

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

    void pintarCanvasArray(ArrayList<Point> puntos) {
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

    void hablitarGuiTransformaciones(boolean a) {
        /// para rotacion
        jTFPxRotacion.setEnabled(a);
        jTFPyRotacion.setEnabled(a);
        jTFGradosRotar.setEnabled(a);
        jBRotar.setEnabled(a);

        /// para traslacion
        jTFtxTrasladar.setEnabled(a);
        jTFtyTrasladar.setEnabled(a);
        jBTrasladar.setEnabled(a);

        // para escalacion
        jTFPcxEscalacion.setEnabled(a);
        jTFPcyEscalacion.setEnabled(a);
        jTFPsxEscalacion.setEnabled(a);
        jTFPsyEscalacion.setEnabled(a);
        jBEscalar.setEnabled(a);
    }

    void valoresPorDefectoFunciones() {
        /// para rotacion
        jTFPxRotacion.setText("0");
        jTFPyRotacion.setText("0");
        jTFGradosRotar.setText("0");

        /// para traslacion
        jTFtxTrasladar.setText("0");
        jTFtyTrasladar.setText("0");

        // para escalacion        
        jTFPcxEscalacion.setText("0");
        jTFPcyEscalacion.setText("0");
        jTFPsxEscalacion.setText("0");
        jTFPsyEscalacion.setText("0");
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
    private javax.swing.JButton jBEscalar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRotar;
    private javax.swing.JButton jBTrasladar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTAListaPuntos;
    private javax.swing.JTextField jTFGradosRotar;
    private javax.swing.JTextField jTFPcxEscalacion;
    private javax.swing.JTextField jTFPcyEscalacion;
    private javax.swing.JTextField jTFPsxEscalacion;
    private javax.swing.JTextField jTFPsyEscalacion;
    private javax.swing.JTextField jTFPxRotacion;
    private javax.swing.JTextField jTFPyRotacion;
    private javax.swing.JTextField jTFtxTrasladar;
    private javax.swing.JTextField jTFtyTrasladar;
    private javax.swing.JTextField jTFxActual;
    private javax.swing.JTextField jTFxi;
    private javax.swing.JTextField jTFyActual;
    private javax.swing.JTextField jTFyi;
    // End of variables declaration//GEN-END:variables
}
