package br.com.dio.ui.custom.panel;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import br.com.dio.ui.custom.input.NumberText;

import static java.awt.Color.black;

import java.util.List;

public class SudokuSector extends JPanel {

    public SudokuSector(final List<NumberText> textFileds) {

        var dimension = new java.awt.Dimension(170, 170);

        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setBorder(new LineBorder(black, 2, true));
        this.setVisible(true);
        textFileds.forEach(this::add);

    }

}
