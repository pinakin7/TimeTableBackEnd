/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package timetablebackend;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author preet
 */
public class FILE_HANDLER_HELPER {
    public static int readBinaryFile(String filename){
        FileInputStream input = null;
        try {
            input = new FileInputStream(filename);
            try {
                int res = input.read();
                
                input.close();
                
                return res;
                
            } catch (IOException ex) {
                Logger.getLogger(FILE_HANDLER_HELPER.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(FILE_HANDLER_HELPER.class.getName()).log(Level.SEVERE, null, ex);
            }
            return -1;
            
        } catch (FileNotFoundException ex) {
            return 100;
        } finally {
            try {
                input.close();
            } catch (IOException ex) {
                Logger.getLogger(FILE_HANDLER_HELPER.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static boolean writeBinaryFile(String filename, int value) throws FileNotFoundException{
        FileOutputStream output = new FileOutputStream(filename);
        
        try {
            output.write(value);
            output.close();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FILE_HANDLER_HELPER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(FILE_HANDLER_HELPER.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return false;
    }
    
}
