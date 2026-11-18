/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.starterproject;
import javax.swing.SwingUtilities;


/**
 *
 * @author tebellox
 */
public class Starterproject {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        SwingUtilities.invokeLater(() -> new HospitalInspectionForm().setVisible(true));
    }
}
