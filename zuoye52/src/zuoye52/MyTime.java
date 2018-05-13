package zuoye52;

public class MyTime {
	 private double hour;
	    private double minute;
	    private double second;
	    public MyTime() {
			System.out.println();
		}
	   
	public void sum() {
		
		   System.out.println(hour+"时"+ minute+"分"+second+"秒");
	   }
	   public void subtract(){
		   System.out.println(hour+"时"+ minute+"分"+second+"秒");
	}

	public MyTime(double hour, double minute, double second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public double getHour() {
		return hour;
	}

	public void setHour(double hour) {
		this.hour = hour;
	}

	public double getMinute() {
		return minute;
	}

	public void setMinute(double minute) {
		this.minute = minute;
	}

	public double getSecond() {
		return second;
	}

	public void setSecond(double second) {
		this.second = second;
	}
	}

