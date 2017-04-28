package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelTest {

	//テストケース1
	@Test
	public void snakeToCamelcaseでjunit_tutorialをJunitTutorialにできる(){
		String expected="junitTutorial";
		String actual=SnakeCamelUtil.snakeToCamelcase("junit_tutorial");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでjunitTutorialをjunit_tutorialにできる(){
		String expected="junit_tutorial";
		String actual=SnakeCamelUtil.camelToSnakecase("junitTutorial");
		assertThat(actual, is(expected));
	}
	
	//テストケース2
	@Test
	public void snakeToCamelcaseでsnake_camelをsnakeCamelにできる(){
		String expected="snakeCamel";
		String actual=SnakeCamelUtil.snakeToCamelcase("snake_camel");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでsnakeCamelをsnake_camelにできる(){
		String expected="snake_camel";
		String actual=SnakeCamelUtil.camelToSnakecase("snakeCamel");
		assertThat(actual, is(expected));
	}
	
	//テストケース3
	@Test
	public void snakeToCamelcaseでchocolate_iceをchocolateIceにできる(){
		String expected="chocolateIce";
		String actual=SnakeCamelUtil.snakeToCamelcase("chocolate_ice");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでchocolateIceをchocolate_iceにできる(){
		String expected="chocolate_ice";
		String actual=SnakeCamelUtil.camelToSnakecase("chocolateIce");
		assertThat(actual, is(expected));
	}
	
	//テストケース4
	@Test
	public void snakeToCamelcaseでdefault_packageをdefaultPackageにできる(){
		String expected="defaultPackage";
		String actual=SnakeCamelUtil.snakeToCamelcase("default_package");
		assertThat(actual, is(expected));
	}
	@Test
	public void camelToSnakecaseでdefaultPackageをdefault_packageにできる(){
		String expected="default_package";
		String actual=SnakeCamelUtil.camelToSnakecase("defaultPackage");
		assertThat(actual, is(expected));
	}
}
