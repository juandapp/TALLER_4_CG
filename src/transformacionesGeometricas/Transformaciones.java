/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package transformacionesGeometricas;

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
    public Point traslacion(Point p, int tx, int ty) {
        Point pt = new Point();
        pt.x = p.x + tx;
        pt.y = p.y + ty;
        return pt;
    }

///    Point pc, punto sobre el cual se rota
///    Point p , punto a rotar
///    int grados, grados de rotacion
    public Point rotacion(Point pc, Point p, int grados) {
        Point pr = new Point();
        double dgrados = (double) grados;
        int xc = pc.x;
        int yc = pc.y;
        int x = p.x;
        int y = p.y;

        pr.x = (int) (xc + ((x - xc) * Math.cos(dgrados)) - ((y - yc) * Math.sin(dgrados)));
        pr.y = (int) (yc + ((x - xc) * Math.sin(dgrados)) + ((y - yc) * Math.cos(dgrados)));

        return pr;
    }
///    Point pc, punto del centro de la escalacion
///    Point p , punto a escalar
///    Point escalares, valores de la escalacion en x y y

    public Point escalacion(Point ps, Point p, double xs, double ys) {
        Point pr = new Point();

        int xc = ps.x;
        int yc = ps.y;
        int x = p.x;
        int y = p.y;
        System.out.println(xs+"  "+ys);

        pr.x =(int) (xc + xs * (double)(x - xc));
        pr.y =(int) (yc + ys * (double)(y - yc));

        return pr;
    }

    public void pruebaEscalacion() {
        Point escalacion = escalacion(new Point(0, 0), new Point(7, 1), (double)1/2,(double)1/3);
        System.out.println(escalacion.x+"  "+escalacion.y);
    }
}
