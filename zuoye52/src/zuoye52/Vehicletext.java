package zuoye52;


public class Vehicletext {

	public static void main(String[] args) {
		Vehicle Vehicle=new Vehicle();
		Vehicle.name="奔驰";
		Vehicle.speed=185;
		Vehicle.size=9000;
		Vehicle.move="移动"; 
		Vehicle.speedUp="加速";
		Vehicle.speedDown="减速";
   System.out.println(Vehicle.name+"\n"+""+Vehicle.speed+""+"\n"+Vehicle.size+""+"\n"+Vehicle.move+""+"\n"+Vehicle.speedUp+""+"\n"+Vehicle.speedDown);
  
	}

}
