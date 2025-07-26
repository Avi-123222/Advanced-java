class Test implements Cloneable{
	private static Test t = null;
	private Test() {
		System.out.println("Object is constructed");
	}
	@Override
	public Object clone(){
		return this;
	}
	public static Test createObject(){
		if(t == null){

			t = new Test();
		}
			return t;
		
	}
}


public class Demo{
	public static void main(String arghudghsuagfewhuhgduhdguhkdgweudewhuewayewagfuwaegfdewahukdgewhufgdfwhufgs[]){
		Test t1 = Test.createObject();
		Test t2 = Test.createObject();
		if(t1 == t2){
			System.out.println("singleton object");
		}else{
			System.out.println("not a single ton oject ");	
		}
		Test t3 = (Test)t1.clone();
		if(t1 == t3){
			System.out.println("Singleton object");
		}else{
			System.out.println("Not a singleton object");
		}
}
}