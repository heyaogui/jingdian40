package zuoye52;

public class Coustomertest {

	public static void main(String[] args) {
		Coustomer coustomer=new Coustomer();
		coustomer.setName("张三");
		coustomer.service();
		
		VIPCoustomer vipcoustomer=new VIPCoustomer();
		vipcoustomer.setLevel(3);
		vipcoustomer.tusuo();
	}

}
