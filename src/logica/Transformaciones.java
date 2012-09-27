/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Point;

/**
 *
 * @author juandapp
 */
public class Transformaciones {

    public Transformaciones() {
    }

///    Point p, punto a trasladar
///    int tx, valor traslacion x
///    int ty, valor traslacion y
    public static Point traslacion(Point p, int tx, int ty) {
        Point pt = new Point();
        pt.x = p.x + tx;
        pt.y = p.y + ty;
        return pt;
    }

///    Point pc, punto sobre el cual se rota
///    Point p , punto a rotar
///    int grados, grados de rotacion
    public static Point rotacion(Point pc, Point p, int grados) {
        Point pr = new Point();
        double dgrados = (double) grados;
        double gradosPiRand = dgrados*Math.PI / 180.0;
        int xc = pc.x;
        int yc = pc.y;
        int x = p.x;
        int y = p.y;
        
        System.out.println("cos 20="+Math.sin((double)20*Math.PI/180.0));
        pr.x = (int) Math.rint(xc + ((x - xc) * Math.cos(gradosPiRand)) - ((y - yc) * Math.sin(gradosPiRand)));
        pr.y = (int) Math.rint(yc + ((x - xc) * Math.sin(gradosPiRand)) + ((y - yc) * Math.cos(gradosPiRand)));

        return pr;
    }
///    Point pc, punto del centro de la escalacion
///    Point p , punto a escalar
///    double xs, ys, valores de la escalacion en x y y

    public static Point escalacion(Point pc, Point p, double sx, double sy) {
        Point pr = new Point();

        int xc = pc.x;
        int yc = pc.y;
        int x = p.x;
        int y = p.y;

        pr.x = (int) (xc + sx * (double) (x - xc));
        pr.y = (int) (yc + sy * (double) (y - yc));

        return pr;
    }

    public void pruebaEscalacion() {
        Point escalacion = escalacion(new Point(0, 0), new Point(7, 1), (double) 1 / 2, (double) 1 / 3);
        System.out.println((double) 1 / 2 + "  " + (double) 1 / 3);
        System.out.println("escalacion: " + escalacion.x + "  " + escalacion.y);
    }

    public void pruebaTraslacion() {
        Point traslacion = traslacion(new Point(10, 10), 3, 8);
        System.out.println("traslacion: " + traslacion.x + "  " + traslacion.y);
    }

    public void pruebaRotacion() {
        Point rotacion = rotacion(new Point(0, 0), new Point(7, 2), 20);
        System.out.println(7 + "  " +2);
        System.out.println("rotacion grados "+20+": " + rotacion.x + "  " + rotacion.y);
    }
}
