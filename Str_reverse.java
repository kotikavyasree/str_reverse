/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package str_reverse;

import java.util.Scanner;

/**
 *
 * @author kotik
 */
public class Str_reverse {

    public static void reverse(String str)
    {
        char[] org_str = str.toCharArray();
        System.out.println(org_str);
        int length = org_str.length;
        for(int i=length;i>0;i--)
        {
            System.out.print(org_str[i-1]);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        while(true)
        {
        System.out.println("Enter a string!");
        String str = scan.nextLine();
        reverse(str);
        }
    }
}
