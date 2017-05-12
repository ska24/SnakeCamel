package snakecamel;

public class Main {
	
	public static void main(String args[]){
		String s,x,r,t,a,b,c,d,e,f;
		
		SnakeCamelUtil scu=new SnakeCamelUtil();
	
		s=scu.snakeToCamelcase("junit_tutorial");
		x=scu.camelToSnakecase("JunitTutorial");
	
		r=scu.snakeToCamelcase("snake_camel");
		t=scu.camelToSnakecase("SnakeCamel");
	
		a=scu.snakeToCamelcase("chocolate_ice");
		b=scu.camelToSnakecase("ChocolateIce");
	
		c=scu.snakeToCamelcase("default_package");
		d=scu.camelToSnakecase("DefaultPackage");
	
		e=scu.capitalize("xyz");
		f=scu.uncapitalize("Xyz");
		
		System.out.println(s);
		System.out.println(x);
		System.out.println(r);
		System.out.println(t);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}
