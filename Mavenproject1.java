package com.mycompany.mavenproject1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */import javax.swing.JOptionPane;



/**
 *
 * @author luald
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter you name");
        JOptionPane.showMessageDialog(null, "Hello " + name);
        
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter you age"));
                JOptionPane.showMessageDialog(null, "You are " +age+ " Years old");
                
                 double height = Double.parseDouble(JOptionPane.showInputDialog("Enter you Height"));
                JOptionPane.showMessageDialog(null, "You are " +height+ " cm tall");

    }
}
