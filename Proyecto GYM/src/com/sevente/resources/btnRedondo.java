/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sevente.resources;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.RoundRectangle2D;
import javax.swing.ButtonModel;
import javax.swing.JButton;

/**
 *
 * @author Edisoncor
 * @author Jeison - Modificado 12/2/2017
 */

public class btnRedondo extends JButton{

    private Color btnNormalColor        = new Color(91, 192, 222);
    private Color btnRollOverColor      = new Color(57, 179, 215);
    private Color btnPressedColor       = new Color(91, 192, 222);
        
    private Color btnDisableBoton       = new Color(209, 213, 216);
        
    private int btnOuterRoundRectSize = 8;
    private int btnInnerRoundRectSize = 6;

    private GradientPaint GP;
    
    public btnRedondo(String titulo) {
    	setText(titulo);
        setOpaque(false);
        setContentAreaFilled(false);
        setFocusPainted(false);
        setBorderPainted(false);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }

    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		int h = getHeight();
		int w = getWidth();
		ButtonModel model = getModel();
		
		if (!model.isEnabled()) {
			setForeground(Color.GRAY);
			GP = new GradientPaint(0, 0, btnDisableBoton, 0, h, btnDisableBoton,
					true);
		}
                else{
			if (model.isRollover()) {
                            GP = new GradientPaint(0, 0, btnRollOverColor, 0, h, btnRollOverColor,
						true);
                        } 
                        else {
                             GP = new GradientPaint(0, 0, btnRollOverColor, 0, h, btnRollOverColor, true);
                        }
		}
		
		g2d.setPaint(GP);
                
		GradientPaint p1;
		GradientPaint p2;
		if (model.isPressed()) {
                    // Si el boton es presionado.
                        
                    /*
                    * @param GP Color que tomará el boton.
                    */
                    GP = new GradientPaint(0, 0, btnPressedColor, 0, h, btnPressedColor, true);
                    g2d.setPaint(GP);
                        
                    /*
                    * @param btnPressedborder es el color que se dibuja 
                    * sobre del borde superior del boton.
                    */
                    p1 = new GradientPaint(0, 0, btnPressedColor, 0, h - 1,
                    /*
                    * @param btnPressedColor es el color que se dibuja
                    * sobredel borde inferior del boton.
                    */
                                        btnPressedColor);
                        
                    p2 = new GradientPaint(0, 1, btnPressedColor, 0, h - 3,
                    		btnPressedColor);
		} 
                else {
                    // Estado normal del boton.
                    
                    GP = new GradientPaint(0, 0, btnNormalColor, 0, h, btnNormalColor, false);
                    
                    p1 = new GradientPaint(0, 0, btnNormalColor, 0, h - 1,
					btnNormalColor);
                    
                    p2 = new GradientPaint(0, 1, btnNormalColor, 0, h - 1,
                                        btnNormalColor);
		}
                
		RoundRectangle2D.Float r2d = new RoundRectangle2D.Float(0, 0, w - 1,
				h - 1, btnOuterRoundRectSize, btnOuterRoundRectSize);
		Shape clip = g2d.getClip();
		g2d.clip(r2d);
		g2d.fillRect(0, 0, w, h);
		g2d.setClip(clip);
		g2d.setPaint(p1);
		g2d.drawRoundRect(0, 0, w - 1, h - 1, btnOuterRoundRectSize,
				btnOuterRoundRectSize);
		g2d.setPaint(p2);
		g2d.drawRoundRect(1, 1, w - 3, h - 3, btnInnerRoundRectSize,
				btnInnerRoundRectSize);
		g2d.dispose();

		super.paintComponent(g);
    }

    public Color getBtnNormalColor() {
        return btnNormalColor;
    }

    public void setBtnNormalColor(Color btnNormalColor) {
        this.btnNormalColor = btnNormalColor;
    }

    public Color getBtnRollOverColor() {
        return btnRollOverColor;
    }

    public void setBtnRollOverColor(Color btnRollOverColor) {
        this.btnRollOverColor = btnRollOverColor;
    }

    public Color getBtnPressedColor() {
        return btnPressedColor;
    }

    public void setBtnPressedColor(Color btnPressedColor) {
        this.btnPressedColor = btnPressedColor;
    }

    public int getBtnOuterRoundRectSize() {
        return btnOuterRoundRectSize;
    }

    public void setBtnOuterRoundRectSize(int btnOuterRoundRectSize) {
        this.btnOuterRoundRectSize = btnOuterRoundRectSize;
    }

    public int getBtnInnerRoundRectSize() {
        return btnInnerRoundRectSize;
    }

    public void setBtnInnerRoundRectSize(int btnInnerRoundRectSize) {
        this.btnInnerRoundRectSize = btnInnerRoundRectSize;
    }

    
}


