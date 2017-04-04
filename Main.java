


import java.util.*;
import static java.lang.System.*;
import java.io.File;
import java.io.IOException;
import javax.swing.*;
import java.io.PrintWriter;
import java.util.Collections;



public class Main


{
	public static void main(String[] args)throws IOException
	{
		
		Scanner keyboard = new Scanner(System.in);
	
	
		
		Scanner fileA= new Scanner (new File ("Leftover.csv"));
	
		ArrayList<Member> students= new ArrayList<Member>();
		
		while (fileA.hasNext())
		{
			String line= fileA.nextLine();
			String[] info= line.split(",");
			String[] choices = new String[30];
			for(int i=5; i<info.length;i++)
			{
				choices[i-5]=info[i];
			}
			
			students.add(new Member(info[0], info[1], info[2], info[3], info[4], choices));
			
		}
		
		
		for(int i=0;i<students.size();i++)
		{
		  String[] girlmatches = new String[10];
		  int[] girlcount = new int[10];
		  String[] boymatches = new String[10];
		  int[] boycount = new int[10];
			for(int j=0;j<students.size();j++)
			{
				int count =0;
				if(!(students.get(j).getID().equals(students.get(i).getID())))
				{
					if(students.get(j).getGrade().equals(students.get(i).getGrade()))
					{ 
						
						if(students.get(j).getGender().equals("F"))
						{
							String[] student1 = new String[30];
							student1= students.get(i).getChoices();
							String[] student2 = new String[30];
							student2= students.get(j).getChoices();
					  	 for(int m=0;m<30;m++)
					   		{
					   			if(student1[m].equals(student2[m]))
					   			{
					   				count++;
					   			}
					   		}
					   	
					   	
					   		boolean girlfilled = true;
					   	int girlstop = 0;
					   	for(int y=0;y<girlcount.length;y++)
					   	{
					   		if(girlcount[y]==0)
					   		{
					   			girlfilled=false;
					   			girlstop = y;
					   		}
					   			
					   			
					   	}
					   	if(girlfilled)
					   	{
					   		for(int z=girlcount.length-1;z>=0;z--)
					   		{
					   		
					   				if(count>girlcount[z])
					   				{
					   				girlcount[z]=count;
					   				girlmatches[z]= students.get(j).getFirstName().trim()+" "+students.get(j).getSurname().trim();
					   				z=-1;
					   				
					   				}
					   			
					   			
					   			
					  		}
					  			
						}
						else 
					   			{
					   				girlcount[girlstop]=count;
					   				girlmatches[girlstop]=students.get(j).getFirstName().trim()+" "+students.get(j).getSurname().trim();
					   				
					   			}
					   		
					   			
					  		}
						
						else
						{
							
						String[] student1 = new String[30];
							student1= students.get(i).getChoices();
							String[] student2 = new String[30];
							student2= students.get(j).getChoices();
					  	 for(int m=0;m<30;m++)
					   		{
					   			if(student1[m].equals(student2[m]))
					   			{
					   				count++;
					   			}
					   		}
					   
					   	boolean boyfilled = true;
					   	int stop = 0;
					   	for(int y=0;y<boycount.length;y++)
					   	{
					   		if(boycount[y]==0)
					   		{
					   			boyfilled=false;
					   			stop = y;
					   		}
					   			
					   			
					   	}
					   	if(boyfilled)
					   	{
					   		for(int z=boycount.length-1;z>=0;z--)
					   		{
					   		
					   				if(count>boycount[z])
					   				{
					   				boycount[z]=count;
					   				boymatches[z]= students.get(j).getFirstName().trim()+" "+students.get(j).getSurname().trim();
					   				z=-1;
					   				
					   				}
					   			
					   			
					   			
					  		}
					  			
						}
						else 
					   			{
					   				boycount[stop]=count;
					   				boymatches[stop]=students.get(j).getFirstName().trim()+" "+students.get(j).getSurname().trim();
					   				
					   			}
						}
					}	
				}
		for (int a=0;a<girlmatches.length;a++)
		 {
		 	int max=0;
		 	int place=a;
		 	for(int b=a;b<girlmatches.length;b++)
		 	{
		 		if(girlcount[b]>max)
		 		{
		 			max= girlcount[b];
		 			place = b;
		 		}
		 		
		 	}
		 	int x = girlcount[a];
		 		String y = girlmatches[a];
		 		girlcount[a]=max;
		 		girlmatches[a]= girlmatches[place];
		 		girlcount[place]=x;
		 		girlmatches[place]=y;
		 }
		 for (int a=0;a<boymatches.length;a++)
		 {
		 	int max=0;
		 	int place=a;
		 	for(int b=a;b<boymatches.length;b++)
		 	{
		 		if(boycount[b]>max)
		 		{
		 			max= boycount[b];
		 			place = b;
		 		}
		 		
		 	}
		 	int x = boycount[a];
		 		String y = boymatches[a];
		 		boycount[a]=max;
		 		boymatches[a]= boymatches[place];
		 		boycount[place]=x;
		 		boymatches[place]=y;
		 }
		 
			}		
		 System.out.print(students.get(i).getFirstName()+" "+students.get(i).getSurname()+" "+students.get(i).getGrade()+" ");
		 for (int a=0;a<girlmatches.length;a++)
		 {
		 	int max=0;
		 	int place=a;
		 	for(int b=a;b<girlmatches.length;b++)
		 	{
		 		if(girlcount[b]>max)
		 		{
		 			max= girlcount[b];
		 			place = b;
		 		}
		 		
		 	}
		 	int x = girlcount[a];
		 		String y = girlmatches[a];
		 		girlcount[a]=max;
		 		girlmatches[a]= girlmatches[place];
		 		girlcount[place]=x;
		 		girlmatches[place]=y;
		 }
		 for (int a=0;a<boymatches.length;a++)
		 {
		 	int max=0;
		 	int place=a;
		 	for(int b=a;b<boymatches.length;b++)
		 	{
		 		if(boycount[b]>max)
		 		{
		 			max= boycount[b];
		 			place = b;
		 		}
		 		
		 	}
		 	int x = boycount[a];
		 		String y = boymatches[a];
		 		boycount[a]=max;
		 		boymatches[a]= boymatches[place];
		 		boycount[place]=x;
		 		boymatches[place]=y;
		 }
		 
		 for(int k=0;k<girlmatches.length;k++)
		 {
		 	System.out.print(girlmatches[k]+" "+ (int)((girlcount[k]/30.0)*100)+" ");
		 	
		 }
		 
		 
		 for(int l=0;l<boymatches.length;l++)
		 {
		 	System.out.print(boymatches[l]+" "+(int)((boycount[l]/30.0)*100)+" ");
		 	
		 }
		 
		 System.out.println();

		 
		 
		 
		 
		 
		 
		 
		 
		 
           
		 
		}
		
           
	}
	
	
}