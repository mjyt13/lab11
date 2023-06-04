package com.example.sadanie_11_4;

import javax.swing.*;
import java.io.*;

public class sadanie_11_2 extends JFrame {
    public JTextField last;
    public JTextField first;
    public JTextField mid;
    public JTextField birth;
    public JTextField group;

    public sadanie_11_2() {
        setTitle("Ввод данных");
        setSize(250, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel sur = new JLabel("Фамилия:");
        last = new JTextField(20);
        JLabel firstName = new JLabel("Имя:");
        first = new JTextField(20);
        JLabel midName = new JLabel("Отчество:");
        mid = new JTextField(20);
        JLabel birthDate = new JLabel("Дата рождения:");
        birth = new JTextField(20);
        JLabel groupLabel = new JLabel("Учебная группа:");
        group = new JTextField(20);
        JButton save = new JButton("Записать");
        JButton load = new JButton("Загрузить");
        save.addActionListener(I -> {
            String surN = last.getText();
            String firstN = first.getText();
            String midN = mid.getText();
            String birthD = birth.getText();
            String groupN = group.getText();
            File F = new File("D://data.txt");
            try {
                FileOutputStream FF = new FileOutputStream(F);
                FF.flush();
                surN = surN + "\n";
                firstN = firstN + "\n";
                midN = midN + "\n";
                birthD = birthD + "\n";
                groupN = groupN + "\n";
                FF.write(surN.getBytes());
                FF.write(firstN.getBytes());
                FF.write(midN.getBytes());
                FF.write(birthD.getBytes());
                FF.write(groupN.getBytes());
                JOptionPane.showMessageDialog(this, "Данные записаны успешно");
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Возникла ошибка");
            }
        });
        load.addActionListener(I -> {
            File F = new File("D://data.txt");
            try {
                BufferedReader FR = new BufferedReader(new FileReader(F));
                String lastN = FR.readLine();
                String firstN = FR.readLine();
                String midN = FR.readLine();
                String birthD = FR.readLine();
                String groupN = FR.readLine();
                last.setText(lastN);
                first.setText(firstN);
                mid.setText(midN);
                birth.setText(birthD);
                group.setText(groupN);
                JOptionPane.showMessageDialog(this, "Данные успешно загружены");
            } catch (IOException e) {
                System.out.println("Возникла ошибка");
            }
        });
        JPanel panel = new JPanel();
        panel.add(sur);
        panel.add(last);
        panel.add(firstName);
        panel.add(first);
        panel.add(midName);
        panel.add(mid);
        panel.add(birthDate);
        panel.add(birth);
        panel.add(groupLabel);
        panel.add(group);
        panel.add(save);
        panel.add(load);
        getContentPane().add(panel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new sadanie_11_2();
    }
}
