package zuoye52;

public class MyTimetext {

	public static void main(String[] args) {
		MyTime MyTime=new MyTime();
		MyTime.setHour(12);
		MyTime.setMinute(50);
		MyTime.setSecond(45);
		System.out.println(MyTime.getHour()+""+MyTime.getMinute()+""+MyTime.getSecond());       
	}

}
