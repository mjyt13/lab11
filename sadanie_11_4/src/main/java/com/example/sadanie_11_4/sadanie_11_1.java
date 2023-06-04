package com.example.sadanie_11_4;

import javax.swing.*;
import java.io.*;
import static java.lang.System.*;
public class sadanie_11_1  extends JFrame{
    private JTextField tx1;
    private JTextField tx2;
    public sadanie_11_1(){
        setTitle("Запись информации");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel l1 = new JLabel("Информация(до 25 символов)");
        tx1 = new JTextField(25);
        JLabel l2 = new JLabel("Директория файла");
        tx2 = new JTextField(25);
        JButton b = new JButton("Запись");
        b.addActionListener(I->{
            String txt = tx1.getText();
            String putt = tx2.getText();
            File F = new File(putt);
            try {
                FileOutputStream FF = new FileOutputStream(F);
                if(txt.length()<=25){
                    FF.flush();
                    byte c[] = txt.getBytes();
                    FF.write(c);
                    out.println("Запись прошла успешно");
                }
            } catch (FileNotFoundException e) {
                out.println("Возникла ошибка");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        });
        JPanel pa = new JPanel();
        pa.add(l1);
        pa.add(tx1);
        pa.add(l2);
        pa.add(tx2);
        pa.add(b);
        getContentPane().add(pa);
        setVisible(true);
    }

    public static void main(String[] args) {
        new sadanie_11_1();
    }
}
