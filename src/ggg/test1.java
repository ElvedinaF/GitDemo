package ggg;
import org.testng.annotations.Test;



import java.util.ArrayList;
import java.util.stream.Stream;

public class test1 {

	//count the number of names starting with alphabet A in list
	
	//@Test
	public void regular()
	
	{
	ArrayList <String> names = new ArrayList<String>();
	names.add("Alma");
	names.add("Don");
	names.add("Adam");
	names.add("Asim");
	names.add("Ram");
    int count = 0;
	for (int i=0; i<names.size(); i++)
		
	{
		
		String actual = names.get(i);
		if(actual.startsWith("A"))
		{
			count++;
			
		
		}	
		}
		System.out.println(count);	
	}

  @Test
  //lambda expression
  public void streamFilter()
	{
		
	  ArrayList <String> names = new ArrayList<String>();
		names.add("Alma");
		names.add("Don");
		names.add("Adam");
		names.add("Asim");
		names.add("Ram");
	   
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
long d =		Stream.of("Ram","Asim","Adam","Don","Alma").filter(s->
		{
			s.startsWith("A");
			return true;
		}).count();
		
		System.out.println(d);
		
			
}}