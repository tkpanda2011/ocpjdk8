package advanced.java.concurrancy;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class Purchase implements Delayed {
	private String message;
	private long startTime;
	
	
	public Purchase(String message, long startTime) {
		super();
		this.message = message;
		this.startTime = System.currentTimeMillis()+startTime;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getStartTime() {
		return startTime;
	}

	public void setStartTime(long startTime) {
		this.startTime = startTime;
	}

	@Override
	public int compareTo(Delayed o) {
		 if (this.startTime < ((Purchase) o).startTime) {
		             return -1;
		     }
		  if (this.startTime > ((Purchase) o).startTime) {
		        return 1;
		   }
		     return 0;

	}

	@Override
	public String toString() {
		return "Purchase [message=" + message + ", startTime=" + startTime + "]";
	}

	@Override
	public long getDelay(TimeUnit unit) {
		long diff = startTime - System.currentTimeMillis();
       return unit.convert(diff, TimeUnit.MILLISECONDS);

	}

}
