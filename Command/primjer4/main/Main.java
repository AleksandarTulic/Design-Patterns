package primjer4.main;

import primjer4.reciever.*;
import primjer4.command.*;
import primjer4.invoker.*;
import java.util.*;
import primjer4.history.*;

public class Main {
	@SuppressWarnings("resource")
	public static void main(String []args) {
		Document doc = new Document();
		CommandHistory history = new CommandHistory();
		AppendCommand append = new AppendCommand(doc, history);
		WriteCommand write = new WriteCommand(doc, history);
		DocumentInvoker appendInvoker = new DocumentInvoker(append);
		DocumentInvoker writeInvoker = new DocumentInvoker(write);
		
		Scanner scan = new Scanner(System.in);
		String option = "";
		do {
			option = scan.nextLine();
			
			if ("APPEND".equals(option)) {
				System.out.print("Input Content: ");
				String content = scan.nextLine();
				appendInvoker.execute(content);
			}else if ("WRITE".equals(option)) {
				System.out.print("Input Content: ");
				String content = scan.nextLine();
				writeInvoker.execute(content);
			}else if ("WRITE UNDO".equals(option)) {
				writeInvoker.undo();
			}else if ("APPEND UNDO".equals(option)) {
				appendInvoker.undo();
			}
		}while(!"EXIT".equals(option));
		
		/*
		 * VEOMA VAZNO DA SE POGLEDA SLAJD 9 I TO OPENCOMMAND SA DOCUMENT I MENU ELEMENTIMA JER ONI NEMAJU ZAJEDNICKE STAVKE ALI IPAK OPENCOMMAND SA NJIMA KUMUNICIRA
		 * NIJE KAO OVDJE GDJE SMO RADILI DA KADA SE STAVLJA U SPECIFICNE COMMAND DA IMAJU ISTE INTERFEJSE ILI ABSTRAKTNU NADKLASU(ili su istog tipa)
		 * 
		 * */
	}
}
