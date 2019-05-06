/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orian.ioana.lab9.ex4;

/**
 *
 * @author Alexandra
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GridLayoutJFrame extends JFrame implements ActionListener {
    private JButton[] button = new JButton[9];
    private boolean changePlayer = true;

    private GridLayoutJFrame() {

        setTitle("Tic Tac Toe");
        setSize(316, 339);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);

        for (int i = 0; i <= 8; i++) {
            button[i] = new JButton(String.valueOf(i));
            button[i].setBackground(Color.WHITE);
            button[i].setFont(new Font("Arial", Font.BOLD, 0));
            button[i].setFocusPainted(false);
            button[i].addActionListener(this);
            add(button[i]);

        }
        button[0].setBounds(0, 0, 100, 100);
        button[1].setBounds(100, 0, 100, 100);
        button[2].setBounds(200, 0, 100, 100);
        button[3].setBounds(0, 100, 100, 100);
        button[4].setBounds(100, 100, 100, 100);
        button[5].setBounds(200, 100, 100, 100);
        button[6].setBounds(0, 200, 100, 100);
        button[7].setBounds(100, 200, 100, 100);
        button[8].setBounds(200, 200, 100, 100);
    }

    private void restartGame() {

        int playAgain = JOptionPane.showConfirmDialog(null, "Wanna play again?", "You won!", JOptionPane.YES_NO_OPTION);

        if (playAgain == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            for (int i = 0; i <= 8; i++) {
                button[i].setText(String.valueOf(i));
                button[i].setFont(new Font("Arial", Font.BOLD, 0));
                button[i].setForeground(Color.black);
            }


        }
    }

    private void restartGameNoWinner() {

        int playAgain = JOptionPane.showConfirmDialog(null, "Wanna play again?", "Draw!", JOptionPane.YES_NO_OPTION);

        if (playAgain == JOptionPane.NO_OPTION) {
            System.exit(0);
        } else {
            for (int i = 0; i <= 8; i++) {
                button[i].setText(String.valueOf(i));
                button[i].setFont(new Font("Arial", Font.BOLD, 0));
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i <= 8; i++) {
            if (e.getSource() == button[i]) {
                if (changePlayer) {
                    button[i].setText("X");
                    button[i].setFont(new Font("Arial", Font.BOLD, 70));
                    changePlayer = false;
                } else {
                    button[i].setText("O");
                    button[i].setFont(new Font("Arial", Font.BOLD, 70));
                    changePlayer = true;
                }


            }
        }
        if (button[0].getText().equals(button[1].getText()) && button[1].getText().equals(button[2].getText())) {
            button[0].setForeground(Color.RED);
            button[1].setForeground(Color.RED);
            button[2].setForeground(Color.RED);
        } else if (button[0].getText().equals(button[3].getText()) && button[3].getText().equals(button[6].getText())) {
            button[0].setForeground(Color.RED);
            button[3].setForeground(Color.RED);
            button[6].setForeground(Color.RED);
        } else if (button[0].getText().equals(button[4].getText()) && button[4].getText().equals(button[8].getText())) {
            button[0].setForeground(Color.RED);
            button[4].setForeground(Color.RED);
            button[8].setForeground(Color.RED);
        } else if (button[1].getText().equals(button[4].getText()) && button[4].getText().equals(button[7].getText())) {
            button[1].setForeground(Color.RED);
            button[4].setForeground(Color.RED);
            button[7].setForeground(Color.RED);
        } else if (button[2].getText().equals(button[5].getText()) && button[5].getText().equals(button[8].getText())) {
            button[2].setForeground(Color.RED);
            button[5].setForeground(Color.RED);
            button[8].setForeground(Color.RED);
        } else if (button[3].getText().equals(button[4].getText()) && button[4].getText().equals(button[5].getText())) {
            button[3].setForeground(Color.RED);
            button[4].setForeground(Color.RED);
            button[5].setForeground(Color.RED);
        } else if (button[6].getText().equals(button[7].getText()) && button[7].getText().equals(button[8].getText())) {
            button[6].setForeground(Color.RED);
            button[7].setForeground(Color.RED);
            button[8].setForeground(Color.RED);
        }
        if (button[6].getText().equals(button[4].getText()) && button[4].getText().equals(button[2].getText())) {
            button[6].setForeground(Color.RED);
            button[4].setForeground(Color.RED);
            button[2].setForeground(Color.RED);

        }

        if ((button[0].getForeground() == Color.RED && button[1].getForeground() == Color.RED && button[2].getForeground() == Color.RED)
                || (button[0].getForeground() == Color.RED && button[3].getForeground() == Color.RED && button[6].getForeground() == Color.RED)
                || (button[0].getForeground() == Color.RED && button[4].getForeground() == Color.RED && button[8].getForeground() == Color.RED)
                || (button[1].getForeground() == Color.RED && button[4].getForeground() == Color.RED && button[7].getForeground() == Color.RED)
                || (button[2].getForeground() == Color.RED && button[5].getForeground() == Color.RED && button[8].getForeground() == Color.RED)
                || (button[3].getForeground() == Color.RED && button[4].getForeground() == Color.RED && button[5].getForeground() == Color.RED)
                || (button[6].getForeground() == Color.RED && button[7].getForeground() == Color.RED && button[8].getForeground() == Color.RED)
                || (button[2].getForeground() == Color.RED && button[4].getForeground() == Color.RED && button[6].getForeground() == Color.RED)) {
            restartGame();
        } else if ((button[0].getText().equals("X") || button[0].getText().equals("O"))
                && (button[1].getText().equals("X") || button[1].getText().equals("O"))
                && (button[2].getText().equals("X") || button[2].getText().equals("O"))
                && (button[3].getText().equals("X") || button[3].getText().equals("O"))
                && (button[4].getText().equals("X") || button[4].getText().equals("O"))
                && (button[5].getText().equals("X") || button[5].getText().equals("O"))
                && (button[6].getText().equals("X") || button[6].getText().equals("O"))
                && (button[7].getText().equals("X") || button[7].getText().equals("O"))
                && (button[8].getText().equals("X") || button[8].getText().equals("O"))) {
            restartGameNoWinner();
        }
    }

    public static void main(String[] args) {
        GridLayoutJFrame app = new GridLayoutJFrame();
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}