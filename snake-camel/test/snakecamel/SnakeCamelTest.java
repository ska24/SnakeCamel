package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	//テストケース1
	@Test
	public void snakeToCamelcaseでjunit_tutorialをJunitTutorialにできる(){
		String expected="JunitTutorial";
		String actual=SnakeCamelUtil.snakeToCamelcase("junit_tutorial");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでJunitTutorialをjunit_tutorialにできる(){
		String expected="junit_tutorial";
		String actual=SnakeCamelUtil.camelToSnakecase("JunitTutorial");
		assertThat(actual, is(expected));
	}
	
	//テストケース2
	@Test
	public void snakeToCamelcaseでsnake_camelをSnakeCamelにできる(){
		String expected="SnakeCamel";
		String actual=SnakeCamelUtil.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでSnakeCamelをsnake_camelにできる(){
		String expected="snake_camel";
		String actual=SnakeCamelUtil.camelToSnakecase("SnakeCamel");
		assertThat(actual, is(expected));
	}
	
	//テストケース3
	@Test
	public void snakeToCamelcaseでchocolate_iceをChocolateIceにできる(){
		String expected="ChocolateIce";
		String actual=SnakeCamelUtil.snakeToCamelcase("chocolate_ice");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでChocolateIceをchocolate_iceにできる(){
		String expected="chocolate_ice";
		String actual=SnakeCamelUtil.camelToSnakecase("ChocolateIce");
		assertThat(actual, is(expected));
	}
	
	//テストケース4
	@Test
	public void snakeToCamelcaseでdefault_packageをDefaultPackageにできる(){
		String expected="DefaultPackage";
		String actual=SnakeCamelUtil.snakeToCamelcase("default_package");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでDefaultPackageをdefault_packageにできる(){
		String expected="default_package";
		String actual=SnakeCamelUtil.camelToSnakecase("DefaultPackage");
		assertThat(actual, is(expected));
	}
}
