/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mrojas.hipodromo.util;

import javax.swing.JFrame;

/**
 *
 * @author manu
 */
public class FrameUtil {
    
    
    public static void personalizar(JFrame frame){
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        //para agregar imagen icon
        //frame.setIconImage(new ImageIcon(getClass().getResource("/images/snake.png")).getImage());
        
    }
}