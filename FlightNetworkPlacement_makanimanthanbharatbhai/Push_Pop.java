import java.io.*;
class Push_Pop1
{	
	int t;	
	public Push_Pop1()
	{
	}
	public void Pushing_Poping()throws IOException
	{
		int ch1;
		int n;
		int stack[]=new int[10];
		int top=-1;
		String op=null;
		do	
		{
	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Your Choice for Pushing and Poping --  -->");
			System.out.println("------------------Press 1 for Push :------------------------");
			System.out.println("------------------press 2  for  Pop :--------------------------");
			System.out.println("------------------press 3  for  Display Data :--------------------------");
			System.out.println("------------------press 4  for Exit:--------------------------");
			ch1=Integer.parseInt(br.readLine());
				switch(ch1) 
				{
					case 1:
						System.out.println("Push");
						System.out.println("Enter the PUSHING value:");
						n=Integer.parseInt(br.readLine());
						top=top+1;
						if( top>10)
						{
							System.out.println("Stack is overflow....:");
						}
						else
						{
							for(int t =0;t<=9;t++)
							{
								if(stack[t]==n)
								{
									System.out.println("Data Should be in sequence(1 to 9).....");
									top=top-1;
						 			stack[top]=stack[top];
										
								}
								else if(stack[t]>n)
								{
									System.out.println("Data Should be in sequence(1 to 9).....");
									top=top-1;
						 			stack[top]=stack[top];
										
								}
								
							}
							
							stack[top]=n;
							System.out.println("Top is :"+top);
							
						}
						break;

					case 2:
						System.out.println("Pop.");
						top=top-1;
						 stack[top]=stack[top];
						break;
		
					case 3:
						
						for(int t=0;t<=top;t++)
						{
   							System.out.println(stack[t]);
						}
						break;
					default:
						System.out.println("ThisNumber is not valid..");
				}	
					
				System.out.println("Do you want to continue:..");
          				op=br.readLine();
      			 }
       			while(op.charAt(0)=='Y'||op.charAt(0)=='y');
	}
	public void Random()throws IOException
	{
		int ch1;
		int n;
		int stack[]=new int[10];
		int top=-1;
		String op=null;
		do	
		{
	
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter Your Choice for Pushing and Poping --  -->");
			System.out.println("------------------Press 1 for Push :------------------------");
			System.out.println("------------------press 2  for  Pop :--------------------------");
			System.out.println("------------------press 3  for  Display Data :------------------");
			System.out.println("------------------press 4  for Exit:--------------------------");
			ch1=Integer.parseInt(br.readLine());

		
			
				switch(ch1) 
				{
					case 1:
						System.out.println("Push");
						System.out.println("Enter the PUSHING value:");
						n=Integer.parseInt(br.readLine());
						top=top+1;
						if( top>10)
						{
							System.out.println("Stack is overflow....:");
						}
						
						else
						{
							for(int t =0;t<=9;t++)
							{
								if(stack[t]==n)
								{
									System.out.println("Data Are Already in the stack....");
									top=top-1;
						 			stack[top]=stack[top];
										
								}
								break;
							}
							stack[top]=n;
							System.out.println("Top is :"+top);
							
						}
						break;

					case 2:
						System.out.println("Pop.");
						top=top-1;
						 stack[top]=stack[top];
						break;
		
					case 3:
						
						for(int t=0;t<=top;t++)
						{
   							System.out.println(stack[t]);
						}
						break;
					default:
						System.out.println("ThisNumber is not valid..");
				}	
					
				System.out.println("Do you want to continue:..");
          				op=br.readLine();
      			 }
       			while(op.charAt(0)=='Y'||op.charAt(0)=='y');
	}
			
}
public class Push_Pop
{
	public static void main(String args[])throws IOException
	{
		
		int ch;
		int n;
		Push_Pop1 p=new Push_Pop1();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Your Choice for order-->");
		System.out.println("------------------Press 1 for Sequencing Order :------------------------");
		System.out.println("------------------press 2  for  Random Order :--------------------------");
		System.out.println("------------------press 3  for Exit:---------------------------");
		ch=Integer.parseInt(br.readLine());

		
			for(int i=0; i<9; i++)
			{
				switch(ch) 
				{
					case 1:
						
						p.Pushing_Poping();
						break;

					case 2:
						p.Random();
						break;
		
					case 3:
						System.out.println("i is three.");
						break;
					default:
						System.out.println("i is greater than 3.");
				}	
					
			}
		
	}
	
}