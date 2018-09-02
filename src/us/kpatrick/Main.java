package us.kpatrick;

import java.io.*;
import java.util.Arrays;

/**
 *This class is the main program
 *@author kpatrick author
 *@version 1.0.0 Major Minor Bug
 */

public class Main {



    /**
     * Main program start point
     * @param args base arguments getting loaded
     */
    public static void main(String[] args) throws IOException {
	// write your code here
        //File file = new File("crypt.txt");
        String fileName = "crypt.txt";

        try {
            Encrypt(fileName);
        } catch (Exception e) {
            System.out.println("The file cannot be found!");
        }

        try {
            System.out.println(Decrypt("En_" + fileName));
        } catch (Exception e) {
            System.out.println("Error Decrypting File");
        }



    }

    /**
     * This method will take the file given and Encrypt it into a new file with a prefix of En_.
     * Encryption is done by adding 10 to the character code
     * @param filename
     */
    public static void Encrypt(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        st = br.readLine();

        String newStr;
        newStr = "";

        char[] array = st.toCharArray();
        for (char ch : array) {
            int charCode = ch+10;
            newStr += (char)charCode;
        }

        BufferedWriter writer = new BufferedWriter(new FileWriter("En_" + filename));
        writer.write(newStr);

        writer.close();
    }

    /**
     * This method will take an encrypted file and decrypt it
     * Decryption is done by subtracting 10 from the character code
     * @param filename Name of the file to be decrypted
     * @return String to be output to the display
     * @throws IOException
     */
    public static String Decrypt(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader br = new BufferedReader(new FileReader(file));

        String st;
        st = br.readLine();

        String newStr;
        newStr = "";

        char[] array = st.toCharArray();
        for (char ch : array) {
            int charCode = ch-10;
            newStr += (char)charCode;
        }

        return newStr;
    }

}
