/*
 * Angus Henry 
 * This program will create pyramids out of user inputed words
 * 12/04/2019
 */

package wordpyramid;

import javax.swing.JOptionPane;

/**
 *
 * @author anhen3335
 */
public class WordPyramid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String word = JOptionPane.showInputDialog(
      "What word do you want to make into a pyramid \n");
       System.out.println (word);
       pyr (word);
    }
        public static String pyr(String word){
    if((word.length() == 1) || (word.length()== 2)) {
      return word;
    }
    else {
        word = word.substring (1,word.length()-1);
        System.out.println (word);
      return (pyr(word));
    }
  }
}
