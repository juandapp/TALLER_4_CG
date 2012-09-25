/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author gustavo
 */
public class CanvasPersonalizado extends Canvas {

    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        float[] dashes = {10};
        g2d.setStroke(new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 2, dashes, 0));

        g2d.drawLine(this.getWidth() / 2, 0, this.getWidth() / 2, this.getHeight());
        g2d.drawLine(0, this.getHeight() / 2, this.getWidth(), this.getHeight() / 2);
    }
}
