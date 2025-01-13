/*
 * Escape character (\): To represent special characters included in a string
 *   escape sequence (valid ones are  \b  \t  \n  \f  \r  \"  \'  \\ )
 *   \b - backspace (delete previous character)
 *   \t - tab (Adds a tab space)
 *   \n - Newline (Moves the string after it to next line)
 *   \f - Page break
 *   \r - return the cursor to start of a line
 *   
 */
package basics;

public class EscapeCharacter {

	public static void main(String[] args) {
		System.out.println("Hello\b iQuest!!"); //Output: Hell iQuest!!
		System.out.println("Hello\tiQuest!!"); //Output: Hello   iQuest!!
		System.out.println("Hello\niQuest!!"); // Output: Hello
											//			  iQuest!!
		

	}

}
