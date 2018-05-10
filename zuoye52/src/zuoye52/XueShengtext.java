package zuoye52;

public class XueShengtext {

	public static void main(String[] args) {
		XueSheng student=new XueSheng();
		student.name ="张三";
		student.interest="玩游戏";
		student.curriculum="lol";
		student.age=15;
		student.student();
		
		Teacher teac=new Teacher();
		teac.name ="李四";
		teac.major="化学";
		teac.curriculum="化学";
		teac.age=5;
		teac.teac();
	}

}
