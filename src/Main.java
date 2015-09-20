/**
 * Autor kodu: Sewery Adamczyk
 * Pochodzenie: http://pl.spoj.com/problems/JHTMLLET/
 */

import java.util.*;

public class Main {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		while(in.hasNextLine())
		{
			String kod = in.nextLine();
			char znak;
			boolean check = false;
			for(int i=0;i<kod.length();i++)
			{
				znak = kod.charAt(i);
				
				if(znak == '<')
				{
					check = true;
				}
				if (znak >= 'a' && 'z' >= znak && check == true)
				{
					znak = Character.toUpperCase(znak);
				}
				if (znak == '>')
				{
					check = false;
				}
				
				System.out.print(znak);
			}
			System.out.println();
		}
		in.close();
	}
}


