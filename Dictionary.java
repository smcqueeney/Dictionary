package dictionary;
import java.util.ArrayList;

public class Dictionary {



	public static void language(String s) {

		String word = s;

		String[] nouns = new String[] {"abcd","c","def","h","ij","cde"};
		String[] verbs = new String[] {"bc","fg","g","hij","bcd"};
		String[] articles = new String[] {"a","ac","e"};

		ArrayList<String> result = new ArrayList<String>();

		for(int index = 0; index < word.length(); index++) {

			for(int i = 0; i < nouns.length; i++) {

				if(word.indexOf(nouns[i], index) == index) {
					result.add(nouns[i]);
				}

			}

			for(int i = 0; i < verbs.length; i++) {

				if(word.indexOf(verbs[i], index) == index) {
					result.add(verbs[i]);
				}
			}

			for(int i = 0; i < articles.length; i++) {

				if(word.indexOf(articles[i], index) == index) {
					result.add(articles[i]);
				}
			}
		}
		
		String results = result.toString() 
						.replace(","," ");
		
		System.out.print(results);
			

	}



	public static void main(String[] args) {

		String wordSearch = "hijhij";
		language(wordSearch);

	}

}

