package primjer2.main;

import primjer2.reciever.*;
import primjer2.command.*;
import primjer2.invoker.*;
import java.util.*;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Document doc = new Document();
		AppendCommand append = new AppendCommand(doc);
		//WriteCommand write = new WriteCommand(doc);
		DocumentInvoker appendInvoker = new DocumentInvoker(append);
		//DocumentInvoker writeInvoker = new DocumentInvoker(write);
		
		Scanner scan = new Scanner(System.in);
		String option = "";
		do {
			option = scan.nextLine();
			
			if ("APPEND".equals(option)) {
				System.out.print("Input Content: ");
				String content = scan.nextLine();
				appendInvoker.execute(content);
			}
			/*
			else if ("WRITE".equals(option)) {
				System.out.print("Input Content: ");
				String content = scan.nextLine();
				writeInvoker.execute(content);
			}else if ("WRITE UNFO".equals(option)) {
				writeInvoker.undo();
			}
			*/
			else if ("APPEND UNDO".equals(option)) {
				appendInvoker.undo();
			}
		}while(!"EXIT".equals(option));
		
		/*
		 * VEOMA VAZNO DA SE POGLEDA SLAJD 9 I TO OPENCOMMAND SA DOCUMENT I MENU ELEMENTIMA JER ONI NEMAJU ZAJEDNICKE STAVKE ALI IPAK OPENCOMMAND SA NJIMA KUMUNICIRA
		 * NIJE KAO OVDJE GDJE SMO RADILI DA KADA SE STAVLJA U SPECIFICNE COMMAND DA IMAJU ISTE INTERFEJSE ILI ABSTRAKTNU NADKLASU(ili su istog tipa)
		 * 
		 * 
		 * */
	}
}
