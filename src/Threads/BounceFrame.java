package Threads;//Ball without threads

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.List;
import javax.swing.*;

public class BounceFrame extends JFrame {

    private JPanel canvas;
    private JButton startButton;
    private JButton stopButton;
    private JButton closeButton;
    
    public BounceFrame() {
        setSize(300, 200);
        setTitle("Bounce");
        canvas = new JPanel();
        add(canvas, "Center");

        JPanel buttonPanel = new JPanel();
        startButton = new JButton("Start");
        closeButton = new JButton("Close");
        stopButton = new JButton("Stop");

        buttonPanel.add(startButton);
        buttonPanel.add(stopButton);
        buttonPanel.add(closeButton);

        ButtonHandler handler = new ButtonHandler();

        startButton.addActionListener(handler);
        stopButton.addActionListener(handler);
        closeButton.addActionListener(handler);

        add(buttonPanel, "South");
    }

    private class ButtonHandler implements ActionListener {


        LinkedList<Ball> runnables = new LinkedList();
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == startButton) {
                Ball ball = new Ball(canvas);
                runnables.add(ball);
                Thread t1 = new Thread(ball);
                t1.start();
            }else if (event.getSource() == stopButton) {
                // to be completed
                if(runnables.size() != 0) {
                    System.out.println("Stop the ball");
                    Ball ball = runnables.removeFirst();
                    ball.setStopped(true);
                }

            } else if (event.getSource() == closeButton) {
                System.exit(0);
            }
        }
    }
    
    public static void main(String[] args) {
        BounceFrame frame = new BounceFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
