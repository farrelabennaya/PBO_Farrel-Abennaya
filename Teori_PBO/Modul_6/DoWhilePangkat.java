/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modul_6;

/**
 *
 * @author Abennaya
 */
import javax.swing.JOptionPane;
public class DoWhilePangkat {
public static void main (String[]args){
 int i =1;
 int hasil =1;
String str1="";
 String str2="";
 str1=JOptionPane.showInputDialog("Masukkan angka");
 int angka=Integer.valueOf(str1).intValue();
 str2=JOptionPane.showInputDialog("Masukkan pangkat");
 int pangkat=Integer.valueOf(str2).intValue();
 do{
 hasil=hasil*angka;
 i++;
 }
 while(i<=pangkat);
String str3=angka+" pangkat "+pangkat+ " = "+hasil;
JOptionPane.showMessageDialog(null, str3 );
 }
}
