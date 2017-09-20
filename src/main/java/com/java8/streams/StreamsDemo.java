package com.java8.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.streams.Streams.Status;
import com.java8.streams.Streams.Task;

public class StreamsDemo {
	
	public static void main(String[] args) {
		
		
		final Collection<Task> tasks = Arrays.asList(
				new Streams().new Task(Status.OPEN, 34),
				new Streams().new Task(Status.OPEN, 16),
				new Streams().new Task(Status.CLOSED, 45)
				);
		
		// how many points in total all OPEN tasks have
		// before Java 8
		
		int sum = 0;
		for(Task task:tasks){
			if(task.getStatus().equals(Status.OPEN))
				sum += task.getPoints();
		}
		System.out.println("Total OPEN tasks : " + sum);
		
		// In Java 8
		
		final long totalPoints = tasks
				.stream()
				.filter(task -> task.getStatus() == Status.OPEN)
				.mapToInt(Task::getPoints)
				.sum();
		
		System.out.println("Total OPEN tasks : " + totalPoints);
		
		// sum of all points
		
		final double sumPoints = tasks.stream().parallel().map(task -> task.getPoints()).reduce(0, Integer::sum);
		
		// or   final double sumPoints = tasks.stream().mapToInt(Task::getPoints).sum();
		
		System.out.println("Total tasks : "+ sumPoints);
		
		// group tasks by their status
		
		final Map<Status, List<Task>> map = tasks
				.stream()
				.collect(Collectors.groupingBy(Task::getStatus));
		
		System.out.println("Group tasks by Status : "+ map);
		
		// overall percentage of each task across whole collection based on its points
		
		final Collection<String> result = tasks
				.stream()
				.mapToInt(Task::getPoints)
				.asLongStream()
				.mapToDouble(points -> points/sumPoints)
				.boxed()
				.mapToLong(weight -> (long) (weight * 100))
				.mapToObj(percentage -> percentage + "%")
				.collect(Collectors.toList());
		
		System.out.println("percentile :"+ result);
		
		
		
	}
	
}
