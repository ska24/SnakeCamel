package snakecamel;

public class SnakeCamelUtil {

	public String snakeToCamelcase(String snake_case) {
		String[] words = snake_case.split("_");
		StringBuilder sb = new StringBuilder();
		String st=capitalize(words[0].toLowerCase());
		sb.append(st);
		for (int i = 0; i < words.length - 1; i++) {
			String s=capitalize(words[1].toLowerCase());
			sb.append(s);
		}
		return new String(sb);
	}
	 
	public String camelToSnakecase(String camelcase) {
		StringBuilder sb = new StringBuilder();
        for (int i = 0; i < camelcase.length(); i++) {
            char c = camelcase.charAt(i);
            if (Character.isUpperCase(c)) {
                sb.append(sb.length() != 0 ? '_' : "").append(Character.toLowerCase(c));
            } else {
                sb.append(Character.toLowerCase(c));
            }
        }   
        return new String(sb);
    }
	
	public String capitalize(String s) {
		char first = s.charAt(0);
		char upperFirst = Character.toUpperCase(first);
		String rest = s.substring(1);
		return upperFirst + rest;
	}

	public String uncapitalize(String s) {
		char first = s.charAt(0);
		char lowerFirst = Character.toLowerCase(first);
		String rest = s.substring(1);
		return lowerFirst + rest;
	}	
}
