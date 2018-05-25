/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmi_oop;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author thomas
 */
public class Output {
    // Ausgabe soll ohne Nachkommastellen erfolgen
        DecimalFormat df = new DecimalFormat("0");
        // Diee aktuelle Lokalzeit wird n 'now' gespechert
        LocalDateTime now = LocalDateTime.now();
        // Es wird eine Formatierung definiert, die dann unten als Argument der 
        // 'format()'-Funktion übergeben wird. 
        DateTimeFormatter dateform = DateTimeFormatter.ofPattern("dd.MM.yyyy kk:mm");
}
