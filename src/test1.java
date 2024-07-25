import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class test1 {
	
	public void regular()
	{
		ArrayList <String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		int count=0;
		for(int i=0;i<names.size();i++)
		{
			String actual=names.get(i);
			if(actual.startsWith("A"))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	public void streamFilter()
	{
		ArrayList <String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		long c= names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
	}
	
	public void streamMap()
	{
		//print names which have last letter as "a" with upperCase
		//Stream.of("Abhijeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//print names which have first letter "a" with upperCase and sorted
		List <String>names1=Arrays.asList("Abhijeet","Don","Alekhya","Adam","Ram");
		//names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		//merging of 2 different lists
		ArrayList <String> names=new ArrayList<String>();
		names.add("Abhijeet");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		Stream<String> newStream=Stream.concat(names.stream(), names1.stream());
		newStream.sorted().forEach(s->System.out.println(s));
		boolean flag=newStream.anyMatch(s->s.equalsIgnoreCase("Ad77am"));
		System.out.println(flag);
		Assert.assertTrue(flag);
		
		
	}
	@Test
	public void streamCollect()
	{
		List <String> ls = Stream.of("Abhijeeet","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).collect(Collectors.toList());
		System.out.println(ls.get(0));
		List<Integer> values=Arrays.asList(3,2,2,7,5,1,9,7);
		//print unique number from this Array
		//sort the 3rd index Array
		values.stream().distinct().forEach(s->System.out.println(s));
		List <Integer> li =values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(li.get(2));
		
	}
	
	

}

