import java.util.Scanner;


public class Points {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		String input;
		Scanner in=new Scanner(System.in);
		int x=0,y=0;
		boolean flag=true;
		System.out.println("Starting point (0,0)");
		input=in.nextLine();
		for(int i=0;i<input.length();i++){
			
			if(flag){			
			if(input.charAt(i)=='>'){
				x++;				
			}
			if(input.charAt(i)=='<'){
				x--;
			}
			if(input.charAt(i)=='v'){
				y++;				
			}
			if(input.charAt(i)=='^'){
				y--;
			}
			if(input.charAt(i)=='~'){
				flag=false;
			}
			
			}
			else{
				if(input.charAt(i)=='>'){
					x--;				
				}
				if(input.charAt(i)=='<'){
					x++;
				}
				if(input.charAt(i)=='v'){
					y--;				
				}
				if(input.charAt(i)=='^'){
					y++;
				}
				if(input.charAt(i)=='~'){
					flag=true;
				}
				
				}
			}
		System.out.println("("+x+","+y+")");
		}
		

	}


