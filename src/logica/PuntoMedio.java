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
// ARCHIVO: PuntoMedio.java
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



package algoritmoLinea;

//~--- JDK imports ------------------------------------------------------------

import java.awt.Point;
import java.util.ArrayList;

/**
 * Class description
 *
 *
 * @version Enter version here..., 13.Sep 2012
 * @author Enter your name here...
 */
public class PuntoMedio {

    /**
     * Field description
     */

    /**
     * Constructs ...
     *
     */
    public PuntoMedio() {}

    // / Bresenham funciona para todas las pendientes

    /**
     * Method description
     *
     *
     * @param nx1
     * @param ny1
     * @param nx2
     * @param ny2
     *
     * @return
     */
    public static ArrayList<Point> Bresenham(int nx1, int ny1, int nx2, int ny2) {
        System.out.println("p1(x1,y1)=(" + nx1 + "," + ny1 + ") " + "  p2(x2,y2)=(" + nx2 + "," + ny2 + ") ");

        int nx, ny, ndx, ndy, nd, nIncE, nIncNE, nsx, nsy;

        ndx = (nx2 - nx1);
        ndy = (ny2 - ny1);

        /*
         * Se determina el punto para comenzar, y para terminar
         */
        if (ndy < 0) {
            ndy = -ndy;
            nsy = -1;
        } else {
            nsy = 1;
        }

        if (ndx < 0) {
            ndx = -ndx;
            nsx = -1;
        } else {
            nsx = 1;
        }

        ArrayList<Point> aListPuntosRasterizacion = new ArrayList<Point>();

        nx = nx1;
        ny = ny1;
        System.out.println("pintarPuntoMedio (" + nx + "," + ny + ")");
        aListPuntosRasterizacion.add(new Point(nx, ny));

        /*
         * se itera hasta el final de la línea
         */
        if (ndx > ndy) {
            nd     = 2 * ndy - ndx;
            nIncE  = 2 * ndy;
            nIncNE = 2 * (ndy - ndx);

            while (nx != nx2) {
                nx = nx + nsx;

                if (nd < 0) {
                    nd = nd + nIncE;
                } else {
                    ny = ny + nsy;
                    nd = nd + nIncNE;
                }

                aListPuntosRasterizacion.add(new Point(nx, ny));
                System.out.println("pintarPuntoMedio (" + nx + "," + ny + ")");
            }
        } else {
            nd     = 2 * ndx - ndy;
            nIncE  = 2 * ndx;
            nIncNE = 2 * (ndx - ndy);

            while (ny != ny2) {
                ny = ny + nsy;

                if (nd < 0) {
                    nd = nd + nIncE;
                } else {
                    nx = nx + nsx;
                    nd = nd + nIncNE;
                }

                aListPuntosRasterizacion.add(new Point(nx, ny));
                System.out.println("pintarPuntoMedio (" + nx + "," + ny + ")");
            }
        }

        return aListPuntosRasterizacion;
    }

    // /algoritmoPuntoMedio solo funciona cuando la pendiente en positiva

    /**
     * Method description
     *
     *
     * @param nx1
     * @param ny1
     * @param nx2
     * @param ny2
     *
     * @return
     */
    public static ArrayList<Point> algoritmoPuntoMedio(int nx1, int ny1, int nx2, int ny2) {

        // / ndx diferencia en x , ndy diferencia en y
        int ndx = Math.abs(nx2 - nx1);
        int ndy = Math.abs(ny2 - ny1);

        // / bCambio, variable para conocer si se intercambiaron las coordenadas en los puntos
        boolean bCambio = false;

        if (ndy > ndx) {

            // /se intercambian las coordenadas en los dos puntos y se calcula de nuevo m
            int temp = ny2;    // /variable temporal para no perder el dato

            ny2     = nx2;
            nx2     = temp;
            temp    = nx1;
            nx1     = ny1;
            ny1     = temp;
            ndx     = Math.abs(nx2 - nx1);
            ndy     = Math.abs(ny2 - ny1);
            bCambio = true;
        }

        System.out.println(" nx1:" + nx1 + " ny1:" + ny1 + " nx2:" + nx2 + " ny2:" + ny2);

        // /se inicializa dD la variable de decision
        int dD = 2 * ndy - ndx;

        // /se inicializa nIncrE, incremento cuando se elige el pixel del Este
        int nIncrE = 2 * ndy;

        // /se inicializa nIncrE, incremento cuando se elige el pixel del NorEste
        int nIncrNE = 2 * (ndy - ndx);

        // / nX , nY variables sobre las que se va a iterar
        int nX;
        int nY;
        int nxFinal;

        /*
         * determinar que punto usar para empezar, cual para terminar
         */
        if (nx1 > nx2) {
            nX      = nx2;
            nY      = ny2;
            nxFinal = nx1;
        } else {
            nX      = nx1;
            nY      = ny1;
            nxFinal = nx2;
        }

        System.out.println(nX + " " + nY + " " + nxFinal);

        ArrayList<Point> aListPuntosRasterizacion = new ArrayList<Point>();

        if (!bCambio) {
            aListPuntosRasterizacion.add(new Point(nX, nY));
        } else {
            aListPuntosRasterizacion.add(new Point(nY, nX));
        }

        // / Se itera hasta que nX tome el valor de nxFinal(coordenada en x del segundo punto *(del x mayor))
        while (nX < nxFinal) {
            if (dD <= 0) {
                dD += nIncrE;
                nX++;
            } else {
                dD += nIncrNE;
                nX++;
                nY++;
            }

            if (!bCambio) {
                aListPuntosRasterizacion.add(new Point(nX, nY));
            } else {
                aListPuntosRasterizacion.add(new Point(nY, nX));
            }

            System.out.println(nX + " " + nY);
        }

        return aListPuntosRasterizacion;
    }

    /**
     * Method description
     *
     *
     * @param nx1
     * @param ny1
     * @param nx2
     * @param ny2
     *
     * @return
     */
    public static ArrayList<Point> algoritmoPuntoMedio2(int nx1, int ny1, int nx2, int ny2) {
        int ndx = nx2 - nx1;
        int ndy = ny2 - ny1;

        // /se calcual dm la pendiente
        double dm = (double) (ny2 - ny1) / (double) (nx2 - nx1);

        // / se calcula b, punto de corte con el eje y
        double           db                       = ny1 - (dm * nx1);
        ArrayList<Point> aListPuntosRasterizacion = null;

        if ((dm >= 0) && (dm <= 1)) {
            double dxk = nx1;
            double dyk = ny1 + 0.5;

            aListPuntosRasterizacion = new ArrayList<Point>();

            while (dxk <= nx2) {
                double df = f(dxk, dyk, ndx, ndy, db);

                if (df > 0) {
                    dyk++;
                    dxk++;
                    aListPuntosRasterizacion.add(new Point(round(dxk), round(dyk)));
                }

                if (df <= 0) {
                    dxk++;
                    aListPuntosRasterizacion.add(new Point(round(dxk), round(dyk)));
                }
            }
        }

        return aListPuntosRasterizacion;
    }

    /**
     * Method description
     *
     *
     * @param dxk
     * @param dyk
     * @param ndifx
     * @param ndify
     * @param db
     *
     * @return
     */
    private static double f(double dxk, double dyk, int ndifx, int ndify, double db) {
        double nf;

        nf = ndify * dxk - ndifx * dyk + db * ndifx;

        return nf;
    }

    // / round, funcion para aproximar con la funcion de Math rint

    /**
     * Method description
     *
     *
     * @param dx
     *
     * @return
     */
    private static int round(double dx) {
        int nEntero = (int) Math.rint(dx);

        return nEntero;
    }
}
