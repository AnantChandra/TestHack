import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MainParser {

    public static void main(String[] args) throws Exception {
        
//    	  File file = new File("C:\\file.txt");
//        BufferedReader br = new BufferedReader(new FileReader(file));
//        List<String> lines = new ArrayList<String>();
    	
    		Scanner scanner = new Scanner(System.in);
    		String line;
        System.out.println("Please enter a string");
//        line = br.readLine();
    		
    		line = scanner.nextLine();
    		
        String[] wordsSplitUp = line.split("\\s");
        System.out.println(wordsSplitUp.length);
        System.out.println(wordsSplitUp[0]);
        
        if(wordsSplitUp[0].equals("nextline")) {
        		System.out.println("");
        }
        
        else if(wordsSplitUp[0].equalsIgnoreCase("print")) {
        		System.out.print("System.out.println("+"\"");
        		for (int x=1; x<wordsSplitUp.length; x++) {
        			System.out.print(wordsSplitUp[x] + " ");
        		}
       		System.out.print("\");");
        }
        
        else if(wordsSplitUp[0].equals("if")) {
        		System.out.print("if(" + wordsSplitUp[1]);
        		if(wordsSplitUp[3].equals("greater") || wordsSplitUp[3].equals("more")) {
        			System.out.print(">");
        			System.out.print(wordsSplitUp[5] + ");");
        		}
        		else if(wordsSplitUp[3].equals("less")) {
        			System.out.print("<");
        			System.out.print(wordsSplitUp[5] + ");");
        		}
        		else if(wordsSplitUp[3].equals("equal")) {
        			System.out.print("=");
        			System.out.print(wordsSplitUp[5] + ");");
        		}
        		
        		else if(wordsSplitUp[3].equals("not") && wordsSplitUp[4].equals("equal")) {
        			System.out.print("!=");
        			System.out.print(wordsSplitUp[6] + ");");        			
        		}	
        }
        
        else if(wordsSplitUp[0].equals("while"))
        {
        		System.out.print("while(");
        		String var1 = wordsSplitUp[1];
        		System.out.print(var1);
        		
        		if(wordsSplitUp[3].equals("greater"))
        		{
        			System.out.print(">");
        		}
        		else if(wordsSplitUp[3].equals("equals"))
        		{
        			System.out.print("=");
        		}
        		else if(wordsSplitUp[3].equals("less"))
        		{
        			System.out.print("<");
        		}
        		else if(wordsSplitUp[3].equals("not") && wordsSplitUp[3].equals("equal"))
        		{
        			System.out.print("!=");
        		}
        		
        		String var2 = wordsSplitUp[5];
        		System.out.print(var2);
        		System.out.println(") {");
        	}
        
        else if(wordsSplitUp[0].equals("initialise") || wordsSplitUp[0].equals("initialize"))
        {
        		if(wordsSplitUp[1].equals("string")) {
        			System.out.print("String " + wordsSplitUp[2] + " = " + wordsSplitUp[4] + ";");
        		}
        		
        		else if(wordsSplitUp[1].equals("variable")) {
        			System.out.print("var " + wordsSplitUp[2] + " = " + wordsSplitUp[4] + ";");
        		}
        		
        		else if(wordsSplitUp[1].equals("integer")) {
        			System.out.print("int " + wordsSplitUp[2] + " = " + wordsSplitUp[4] + ";");
        		}
        }
        
        else if(wordsSplitUp[0].equals("for"))
        {
        		System.out.print("for(");
        		String var1 = wordsSplitUp[1];
        		System.out.print("int " + var1);
        		System.out.print(" = ");
        		String start = wordsSplitUp[3];
        		String end = wordsSplitUp[5];
        		System.out.print(start + "; " + var1 + " < " + end + "; " + var1 + "++)");
        }
        
        else{
    		System.out.println("");
        }
    }
}