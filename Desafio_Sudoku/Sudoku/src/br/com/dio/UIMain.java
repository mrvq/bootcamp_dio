package br.com.dio;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import br.com.dio.ui.custom.frame.MainFrame;
import br.com.dio.ui.custom.panel.MainPanel;

public class UIMain {

    public static void main(String[] args) {
        // Main method to start the application
        // System.out.println("Welcome to the Game!");
        // Here you can initialize your game logic and UI components

        var dimension = new Dimension(600, 600);
        JPanel mainPanel = new MainPanel(dimension);
        JFrame mainFrame = new MainFrame(dimension, mainPanel);
        mainFrame.revalidate();
        mainFrame.repaint();

    }
}