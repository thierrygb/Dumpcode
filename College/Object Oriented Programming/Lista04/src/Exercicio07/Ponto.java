package Exercicio07;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ponto extends JPanel {
    private BufferedImage bufferedImage;
    private BufferedImage bufferedPonto;
    private int x; 
    private int y;
    public Ponto() {
        super(false);
        int width = 800;
        int height = 600;
        bufferedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        bufferedPonto = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB); 
        Graphics gi = bufferedImage.createGraphics();
        gi.setColor(Color.WHITE);
        gi.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        gi.dispose();
        Graphics gr = bufferedPonto.createGraphics();
        gr.setColor(Color.WHITE);
        gr.fillRect(0, 0, bufferedPonto.getWidth(), bufferedPonto.getHeight());
        gr.dispose();
        addMouseListener(new AcaoMouse());
        
    }
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.WHITE); 
        g.fillRect(0, 0, bufferedImage.getWidth(), bufferedImage.getHeight());
        g.drawImage(bufferedPonto, 0, 0, null);
        g.dispose();
    }
    private class AcaoMouse implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            pinta(e.getX(), e.getY());
            updateUI();
        }
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            pinta(e.getX(), e.getY());
            updateUI();
        }
        public void mouseReleased(MouseEvent e) {
            pinta(e.getX(), e.getY());
            Graphics gDaImagem = bufferedImage.createGraphics();
            gDaImagem.drawImage(bufferedPonto, 0, 0, null);
            gDaImagem.dispose();
            updateUI();
        }
        public void mouseEntered(MouseEvent e) {
        }
        public void mouseExited(MouseEvent e) {
        }
        public void mouseDragged(MouseEvent e) {
            pinta(e.getX(), e.getY());
            updateUI();
        }
        public void mouseMoved(MouseEvent e) {
        }
        private void pinta(int mx, int my) {
            Graphics gDaReta = bufferedPonto.createGraphics();
            gDaReta.drawImage(bufferedImage, 0, 0, null); 
            gDaReta.setColor(Color.BLACK);
            gDaReta.drawLine(x, y, mx, my);
            gDaReta.dispose();
        }
    }
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Ponto desenho = new Ponto();
        desenho.setPreferredSize(new Dimension(800, 600));
        jFrame.getContentPane().add(desenho);
        jFrame.setResizable(false);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}