//**********************************************************
// COMPUTACIÓN GRÁFICA
// TALLER 1: Primitivas de Raster - Conversión de Rectas
//
// PROYECTO DE SOFTWARE EN JAVA (JDK1.7)
// USANDO IDE: NetBeans 7.1.2
//
// WEB PAGE: http://gustalibreros.github.com/TALLER_1_CG/
//
// FECHA: 17.Sep 2012
//
// ARCHIVO: ManejadorCanvas.java
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

//~--- JDK imports ------------------------------------------------------------
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class description
 *
 *
 * @version Enter version here..., 13.Sep 2012
 * @author Enter your name here...
 */
public class ManejadorCanvas {

    private Canvas canvas;
    private int iCanvasHalfWidth;
    private int iCanvasHalfHeight;

    /**
     * Constructs ...
     *
     */
    public ManejadorCanvas(Canvas canvas) {
        this.canvas = canvas;
        iCanvasHalfHeight = this.canvas.getHeight() / 2;
        iCanvasHalfWidth = this.canvas.getWidth() / 2;
        System.out.println("iCanvasHalfHeight" + iCanvasHalfHeight);
        System.out.println("iCanvasHalfWidth" + iCanvasHalfWidth);
    }


    // / funcion para pintar un pixel en el canvas

    /**
     * Method description
     *
     *
     * @param iXreal
     * @param iYreal
     * @param c
     */
    public void pintarPixel(int iXreal, int iYreal) {
        Graphics gp = canvas.getGraphics();
 
        // ++ se puede modificar por una funcion que solo pinte un pixel en el canvas

        int iXjava = realTojavaX(iXreal);
        int iYjava = realTojavaY(iYreal);
        gp.setColor(Color.orange);
        gp.drawLine(iXjava, iYjava, iXjava, iYjava);
    }

    /**
     * Method description
     *
     *
     * @param iXJava
     * @param nh
     *
     * @return
     */
    public int javaTorealX(int iXJava) {
        return iXJava - iCanvasHalfWidth;
    }

    /**
     * Method description
     *
     *
     * @param iYjava
     * @param nw
     *
     * @return
     */
    public int javaTorealY(int iYjava) {
        return iCanvasHalfHeight - iYjava;
    }

    /**
     * Method description
     *
     *
     * @param iXreal
     * @param nh
     *
     * @return
     */
    public int realTojavaX(int iXreal) {
        return iCanvasHalfWidth + iXreal;
    }

    /**
     * Method description
     *
     *
     * @param iYreal
     * @param nw
     *
     * @return
     */
    public int realTojavaY(int iYreal) {
        return iCanvasHalfHeight - iYreal;
    }

    /**
     * Method description
     *
     */
    public void pruebaJavaToRealXY() {
        System.out.println("90,90 ---> -10,10");
        System.out.println("xr:" + javaTorealX(90));
        System.out.println("yr:" + javaTorealY(90));
        System.out.println("110,90 ---> 10,10");
        System.out.println("xr:" + javaTorealX(110));
        System.out.println("yr:" + javaTorealY(90));
        System.out.println("90,110 ---> -10,-10");
        System.out.println("xr:" + javaTorealX(90));
        System.out.println("yr:" + javaTorealY(110));
        System.out.println("110,110 ---> 10,-10");
        System.out.println("xr:" + javaTorealX(110));
        System.out.println("yr:" + javaTorealY(110));
        System.exit(0);
    }

    /**
     * Method description
     *
     */
    public void pruebaRealToJavaXY() {
        System.out.println("90,90 <--- -10,10");
        System.out.println("xr:" + realTojavaX(-10));
        System.out.println("yr:" + realTojavaY(10));
        System.out.println("110,90 <--- 10,10");
        System.out.println("xr:" + realTojavaX(10));
        System.out.println("yr:" + realTojavaY(10));
        System.out.println("90,110 <--- -10,-10");
        System.out.println("xr:" + realTojavaX(-10));
        System.out.println("yr:" + realTojavaY(-10));
        System.out.println("110,110 <--- 10,-10");
        System.out.println("xr:" + realTojavaX(10));
        System.out.println("yr:" + realTojavaY(-10));
        System.exit(0);
    }

    /**
     * Method description
     *
     *
     * @param segundos
     */
    public void esperar(int segundos) {
        try {
            Thread.sleep(1000 * segundos);
        } catch (InterruptedException ex) {
            Logger.getLogger(ManejadorCanvas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
