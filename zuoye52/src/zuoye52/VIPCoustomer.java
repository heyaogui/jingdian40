package zuoye52;

public class VIPCoustomer extends Coustomer {
   private int level; 

public int getLevel() {
	return level;
}
public void setLevel(int level) {
	this.level = level;
}
   public void tusuo() {
	   System.out.println("VIP"+level+"张先生/女士在投诉中。。。。");
   }
}
