package s_conversor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Converter converter=new Converter("10111101111100");
		System.out.println(converter.validate());
		System.out.println(converter.Convert());
	}

}
