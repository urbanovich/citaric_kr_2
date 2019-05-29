/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ric_kr_2;

import java.io.InputStream;
import java.util.Scanner;
import javax.xml.transform.TransformerException;
import ric_kr_2.Entity.Document;
import ric_kr_2.Helper.Reader;

/**
 *
 * @author dzmitry
 */
public class Ric_kr_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Reader reader = new Reader();
        
        reader.read();
        
        while(true) {
            
            String list = reader.displayAll();
        
            System.out.println(list);
        
            System.out.println("If you want add new an element set 1.");
            System.out.println("If you want to find an element set 2.");
            System.out.println("If you want to delete an element set 3.");
            System.out.println("If you want to exit set 4.");

            Scanner scn = new Scanner(System.in);
            String menu = scn.nextLine();
        
            if (menu.equals("1")) {
                
                System.out.println("Set id:");
                String id = scn.nextLine();

                System.out.println("Set title:");
                String title = scn.nextLine();

                System.out.println("Set content:");
                String content = scn.nextLine();

                reader.add(Integer.parseInt(id), title, content);
            } else if(menu.equals("2")) {
                
                System.out.println("Enter document title:");
                
                String search = scn.nextLine();
                
                String result = reader.search(search);
        
                System.out.println(result);

            } else if(menu.equals("3")) {
                
                System.out.println("Enter document title:");
                
                String delete = scn.nextLine();
                
                String result = reader.delete(delete);
        
                System.out.println(result);

            } else if(menu.equals("4")) {
                break;
            }
            
        }
        
        reader.save();
        
    }
    
}
