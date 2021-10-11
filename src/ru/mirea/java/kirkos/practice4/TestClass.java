package ru.mirea.java.kirkos.practice4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class TestClass extends JFrame{
    //кнопки
    JButton realMadrideButton = new JButton("Real Madrid");
    JButton milanButton = new JButton("AC Milan");

    //нередактируемые записи
    JLabel score = new JLabel();
    JLabel winner = new JLabel();
    JLabel lastGoal = new JLabel();

    int milanGoals = 0, madrideGoals = 0; //кол-во голов

    //констуктор
    public TestClass(){
        //вызов констуктора суперкласса, т.е. к. класса, от которого наследуется текущий
        //в данном случае конструктор JFrame, в аргументах заголовок окна
        super("Real Madrid vs AC Milan");
        //Выход из приложения с помощью метода выхода из системы, определена в JFrame
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        //расположение
        GridLayout layout = new GridLayout(3, 2, 20, 0);
        setLayout(layout);

        //установка шрифтов
        Font font1 = new Font("Calibri",Font.BOLD,40);
        Font font2 = new Font("Calibri",Font.BOLD,20);

        //задание методов
        updateScore();
        updateCurrentWinner();
        String temp = "N/A";
        updateLastGoal(temp);

        //new ActionListener() создает анонимный внутренний класс типа ActionListener
        //поскольку ActionListener - интерфейс, нельзя создать новый экземпляр, типа Object obj = new Object();
        //мы должны реализовать методы, определенные этим интерфейсом. Это только actionPerformed
        milanButton.addActionListener(new AbstractAction()
        {
            public void actionPerformed(ActionEvent e) {
                milanGoals++;
                updateScore();
                updateCurrentWinner();
                updateLastGoal("AC Milan");
            }
        });

        realMadrideButton.addActionListener(new AbstractAction()
        {
            public void actionPerformed(ActionEvent e) {
                madrideGoals++;
                updateScore();
                updateCurrentWinner();
                updateLastGoal("Real Madrid");
            }
        });

        //добавление компонентов
        add(realMadrideButton);
        realMadrideButton.setForeground(Color.BLUE);
        realMadrideButton.setFont(font2);
        setSize(800,400);
        add(milanButton);
        milanButton.setForeground(Color.BLUE);
        milanButton.setFont(font2);
        //setSize для второго не нужен, т.к. все растягивает GridLayout

        add(score);
        score.setFont(font1);
        score.setVerticalAlignment(JLabel.CENTER);
        score.setHorizontalAlignment(JLabel.CENTER);
        add(winner);
        winner.setFont(font2);
        winner.setVerticalAlignment(JLabel.CENTER);
        winner.setHorizontalAlignment(JLabel.CENTER);
        add(lastGoal);
        winner.setFont(font2);
        lastGoal.setVerticalAlignment(JLabel.CENTER);
        lastGoal.setHorizontalAlignment(JLabel.CENTER);
    }

    public void updateCurrentWinner() {
        if (milanGoals > madrideGoals)
            winner.setText("Winner: AC MILAN");
        else if (milanGoals < madrideGoals)
            winner.setText("Winner: REAL MADRID");
        else
            winner.setText("Winner: DRAW");
    }

    public void updateLastGoal(String command) {
        lastGoal.setText("Last Scorer: " + command);
    }

    public void updateScore() {
        score.setText("Result: " + madrideGoals + " X " + milanGoals);
    }

    public static void main(String[] args) {
        new TestClass().setVisible(true);
    }
}
