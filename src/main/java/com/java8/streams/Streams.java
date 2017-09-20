package com.java8.streams;

public class Streams {
	
	public enum Status{
		OPEN, CLOSED
	};
	
	public class Task {
		
		private final Status status;
		private final Integer points;
		
		public Task(Status status, Integer points) {
			this.status = status;
			this.points = points;
		}

		public Status getStatus() {
			return status;
		}

		public Integer getPoints() {
			return points;
		}

		@Override
		public String toString() {
			return "Task [status=" + status + ", points=" + points + "]";
		}
		
		
		
	}

}
