import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.File;
import java.util.Map;
import java.util.*;
import java.util.HashSet;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;
import static java.lang.System.*;
public class Member
{
	
	private String iD;
	private String surname;
	private String firstName;
	private String gender;
	private String grade;
	private String[] choices;
	
	public Member()
	{
		iD = "";
		surname = "";
		firstName = "";
		gender = "";
		grade = "";
		choices = new String[30];
	}
	
	public Member(String d, String f, String s, String gr, String g, String [] c)
	{
		iD = d;
		surname = s;
		firstName = f;
		gender = g;
		grade = gr;
		choices = new String[30];
		for (int i=0; i<c.length; i++)
			choices[i] = c[i];
	}
	
	public void setID(String i)
	{
		iD = i;
	}
	
	
	public void setSurname(String s)
	{
		surname = s;
	}
	
	public void setGender(String g)
	{
		gender = g;
	}
	
	public void setGrade(String g)
	{
		grade = g;
	}
	
	public void setFirstName(String f)
	{
		firstName = f;
	}
	
	public void setChoices(String [] c)
	{
		for (int i=0; i<c.length; i++)
			choices[i] = c[i];
	}
	
	public String getID()
	{
		return iD;
	}
	
	
	public String getSurname()
	{
		return surname;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public String getGender()
	{
		return gender;
	}
	
	public String [] getChoices()
	{
		return choices;
	}
	
	public String getGrade()
	{
		return grade;
	}
	
	public String toString()
	{
		String out = "";
		if (iD.length()==5)
		  out+="0"+iD + ", " + grade + ", " + surname + ", " + firstName;
		else
		  out += iD + ", " + grade + ", " + surname + ", " + firstName;
		return out;
	}
}