package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {
	
	SnakeCamelUtil scu=new SnakeCamelUtil();

	//テストケース1
	@Test
	public void snakeToCamelcaseでjunit_tutorialをJunitTutorialにできる(){
		String expected="JunitTutorial";
		String actual=scu.snakeToCamelcase("junit_tutorial");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでJunitTutorialをjunit_tutorialにできる(){
		String expected="junit_tutorial";
		String actual=scu.camelToSnakecase("JunitTutorial");
		assertThat(actual, is(expected));
	}
	
	//テストケース2
	@Test
	public void snakeToCamelcaseでsnake_camelをSnakeCamelにできる(){
		String expected="SnakeCamel";
		String actual=scu.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでSnakeCamelをsnake_camelにできる(){
		String expected="snake_camel";
		String actual=scu.camelToSnakecase("SnakeCamel");
		assertThat(actual, is(expected));
	}
	
	//テストケース3
	@Test
	public void snakeToCamelcaseでchocolate_iceをChocolateIceにできる(){
		String expected="ChocolateIce";
		String actual=scu.snakeToCamelcase("chocolate_ice");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでChocolateIceをchocolate_iceにできる(){
		String expected="chocolate_ice";
		String actual=scu.camelToSnakecase("ChocolateIce");
		assertThat(actual, is(expected));
	}
	
	//テストケース4
	@Test
	public void snakeToCamelcaseでdefault_packageをDefaultPackageにできる(){
		String expected="DefaultPackage";
		String actual=scu.snakeToCamelcase("default_package");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでDefaultPackageをdefault_packageにできる(){
		String expected="default_package";
		String actual=scu.camelToSnakecase("DefaultPackage");
		assertThat(actual, is(expected));
	}
	
	//大文字にする
	@Test
	public void capitalizeでxyzをXyzにできる(){
		String expected="Xyz";
		String actual=scu.capitalize("xyz");
		assertThat(actual, is(expected));
	}
	
	//小文字にする
		@Test
		public void uncapitalizeでXyzをxyzにできる(){
			String expected="xyz";
			String actual=scu.uncapitalize("Xyz");
			assertThat(actual, is(expected));
		}
}
