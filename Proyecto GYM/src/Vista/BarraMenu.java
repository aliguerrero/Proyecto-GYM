/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.sevente.resources.btnAzul;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import java.awt.Color;
import java.awt.GridLayout;

public class BarraMenu extends JPanel {

    private JPanel pIzquierdo,panelBotones,pDerecho;
    private Color  btnNormalColor    = new Color(37, 55, 68);
    private Color  btnPressedborder  = new Color(18, 109, 164);
    private Color  btnRollOverColor  = new Color(18, 109, 164);
    private int    btnOuterRoundRectSize = 0;
    private int    btnInnerRoundRectSize = 0;
    private Font   btnFuente = new Font("Segoe UI", Font.BOLD, 13);
    private Color  btnForeground  = Color.white;
    
    int btnAncho = 100;
    int btnAlto  = 18; // Altura del Panel Norte y Sur.
        

    public BarraMenu() {
        setLayout(new FlowLayout());
        setOpaque(true);
        setBorder(new EmptyBorder(5, 5, 5, 5));

        		btnAzul BTN = new btnAzul("Home");
	            BTN.setFont(btnFuente);
	            BTN.setForeground(btnForeground);
	            BTN.setBtnNormalColor(btnNormalColor);
	            BTN.setBtnNormalBorder(btnNormalColor);
	            BTN.setBtnPressedColor(btnNormalColor);
	            BTN.setBtnPressedborder(btnPressedborder);
	            BTN.setBtnRollOverColor(btnRollOverColor);
	            BTN.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN);
	                                
	            btnAzul BTN1 = new btnAzul("Features");
	            BTN1.setFont(btnFuente);
	            BTN1.setForeground(btnForeground);
	            BTN1.setBtnNormalColor(btnNormalColor);
	            BTN1.setBtnNormalBorder(btnNormalColor);
	            BTN1.setBtnPressedColor(btnNormalColor);
	            BTN1.setBtnPressedborder(btnPressedborder);
	            BTN1.setBtnRollOverColor(btnRollOverColor);
	            BTN1.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN1.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN1.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN1.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN1);
	        
	            btnAzul BTN2 = new btnAzul("About");
	            BTN2.setFont(btnFuente);
	            BTN2.setForeground(btnForeground);
	            BTN2.setBtnNormalColor(btnNormalColor);
	            BTN2.setBtnNormalBorder(btnNormalColor);
	            BTN2.setBtnPressedColor(btnNormalColor);
	            BTN2.setBtnPressedborder(btnPressedborder);
	            BTN2.setBtnRollOverColor(btnRollOverColor);
	            BTN2.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN2.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN2.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN2.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN2);
					
	            btnAzul BTN3 = new btnAzul("Login");
	            BTN3.setFont(btnFuente);
	            BTN3.setForeground(btnForeground);
	            BTN3.setBtnNormalColor(btnNormalColor);
	            BTN3.setBtnNormalBorder(btnNormalColor);
	            BTN3.setBtnPressedColor(btnNormalColor);
	            BTN3.setBtnPressedborder(btnPressedborder);
	            BTN3.setBtnRollOverColor(btnRollOverColor);
	            BTN3.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN3.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN3.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN3.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN3);
	            
	            btnAzul BTN4 = new btnAzul("About");
	            BTN4.setFont(btnFuente);
	            BTN4.setForeground(btnForeground);
	            BTN4.setBtnNormalColor(btnNormalColor);
	            BTN4.setBtnNormalBorder(btnNormalColor);
	            BTN4.setBtnPressedColor(btnNormalColor);
	            BTN4.setBtnPressedborder(btnPressedborder);
	            BTN4.setBtnRollOverColor(btnRollOverColor);
	            BTN4.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN4.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN4.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN4.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN4);
					
	            btnAzul BTN5 = new btnAzul("Login");
	            BTN5.setFont(btnFuente);
	            BTN5.setForeground(btnForeground);
	            BTN5.setBtnNormalColor(btnNormalColor);
	            BTN5.setBtnNormalBorder(btnNormalColor);
	            BTN5.setBtnPressedColor(btnNormalColor);
	            BTN5.setBtnPressedborder(btnPressedborder);
	            BTN5.setBtnRollOverColor(btnRollOverColor);
	            BTN5.setBtnOuterRoundRectSize(btnOuterRoundRectSize);
	            BTN5.setBtnInnerRoundRectSize(btnInnerRoundRectSize);
	            BTN5.setPreferredSize(new Dimension(btnAncho, btnAlto));
	            BTN5.setVerticalAlignment(SwingConstants.BOTTOM);
	            add(BTN5);
   }
    
    
	public static void main(String args[]) {
		JFrame frame = new JFrame("Portafolio");
		frame.setLayout(new GridLayout());
		BarraMenu PA = new BarraMenu();
		frame.add(PA);
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setBackground(Color.WHITE);
		frame.setBounds(100, 100, 1156, 126);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

}
