import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//average of Array
		List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12);
		double avg=list.stream().mapToInt(e->e).average().getAsDouble();
		System.out.println(avg);
		
		//Square of each number, if sqyuare >100 add and find avg
		double avg100=list.stream().map(e->e*e).filter(e->e>100).mapToInt(e->e).average().getAsDouble();
		System.out.println(avg100);
		
		//find odd and even
		List<Integer> even=list.stream().filter(e->e%2==0).collect(Collectors.toList());
		for(int i:even)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		List<Integer> odd=list.stream().filter(e->e%2==1).collect(Collectors.toList());
		for(int i:odd)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,20,25,28,30);
		
		//number Starts with 2
		List<Integer> startWith2=list1.stream().map(e->String.valueOf(e)).filter(e->e.startsWith("2")).map(e->Integer.valueOf(e)).collect(Collectors.toList());
		for(int i:startWith2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//print Duplicate Numbers
		List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,7,6,5,3,12,3,445,6777);
		HashSet<Integer> set=new HashSet<>();
		//List<Integer> duplicate=list2.stream().filter(e->!set.add(e)).collect(Collectors.toList());
		List<Integer> duplicate=list2.stream().filter(e->Collections.frequency(list2, e)>1).distinct().collect(Collectors.toList());
		for(int i:duplicate)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		//get/Ignore first five number
		List<Integer> first5=list.stream().limit(5).collect(Collectors.toList());
		for(int i:first5)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Integer> ignore5=list.stream().skip(5).collect(Collectors.toList());
		for(int i:ignore5)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		//sum
		
		int sum=list1.stream().reduce((x,y)->x+y).get();
		System.out.println(sum);
		
		//getSecondHighest
		
		int secondHighest=list.stream().sorted((x,y)->y-x).distinct().skip(1).limit(1).findFirst().get();
		System.out.println(secondHighest);
		
		
	}

}
