abstract class Computer{
	public abstract String getRAM();
	public abstract String getHDD();
	public abstract String getCPU();
	@Override
	
	public String toString(){
		return "RAM = "+ this.getRAM() + "   HDD =  "+ this.getHDD()+"   CPU =  "+ this.getCPU();
	}

}
class PC extends Computer{
	private String ram, hdd, cpu;
	public PC(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String getRAM(){
		return ram;
	}
	@Override
	public String getHDD(){
		return hdd;
	}
	@Override
	public String getCPU(){
		return cpu;
	}
}
class Server extends Computer{
	private String ram, hdd, cpu;
	public Server(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public String getRAM(){
		return ram;
	}
	@Override
	public String getHDD(){
		return hdd;
	}
	@Override
	public String getCPU(){
		return cpu;
	}
}
interface ComputerAbstractFactory{
	public Computer createComputer();
}
class PCAbstractFactory implements ComputerAbstractFactory{
	private String ram, hdd, cpu;
	public PCAbstractFactory(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public Computer createComputer(){
		return new PC(ram, hdd, cpu);
	}
}
	


class ServerAbstractFactory implements ComputerAbstractFactory{
	private String ram, hdd, cpu;
	public ServerAbstractFactory(String ram, String hdd, String cpu){
		this.ram = ram;
		this.hdd = hdd;
		this.cpu = cpu;
	}
	@Override
	public Computer createComputer(){
		return new Server(ram, hdd, cpu);
	}
}
class ComputerFactory{
	public static Computer getComputer(ComputerAbstractFactory factory){
		return factory.createComputer();
	}
}
public class Demo{
	public static void main(String args[]){
		call();
	}
	static void call(){
		Computer pc = ComputerFactory.getComputer(new PCAbstractFactory("2GB","500GB","2.4Hz"));
		System.out.println(pc);
	}
}
	

	
