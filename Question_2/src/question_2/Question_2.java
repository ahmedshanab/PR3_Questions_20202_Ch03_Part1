/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Question_2 {

    /**
     * @param args the command line arguments
     */
     private static void chars(String s) {
        char[] c = s.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char d : c) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         
     }
     
     private static void word(String s ){
          String[] c = s.split(" ");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for (String d : c) {
            if (map.containsKey(d)) {
                map.put(d, map.get(d) + 1);
            } else {
                map.put(d, 1);
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
         
     }
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fout = new FileReader("SmallSizeText.txt");

        ArrayList<String> arrayList = new ArrayList<>();
        Scanner in = new Scanner(fout);

        while (in.hasNextLine()) {
            String[] txtfileArray = in.nextLine().split(" ");
            arrayList.addAll(Arrays.asList(txtfileArray));
        }
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            buffer.append(arrayList.get(i) + " ");
        }

        String append = buffer.toString();
        
        System.out.println("Text in File : " + buffer);
        System.out.print("Frequecy  Character in File ");
        chars(append);
        System.out.println("Fepetition Words in File ");
        word(append);
    }

}
