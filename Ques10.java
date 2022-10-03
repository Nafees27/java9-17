/*
    10. Demonstrate the use of repeat, strip, isBlank, indent,
    transform, stripIndent, translateEscapes, formatted String methods.
 */
package Java9_17;

public class Ques10
{
    public static void main(String[] args)
    {
        // repeat
        String str = "Hi !";
        System.out.println(str.repeat(2));

        // Strip
        String complexWhitespacesString = "\u2005\u2005\u2005\u2005  This string consist of Unicode Space. ";
        System.out.println(complexWhitespacesString.strip());

        // isBlank
        String str1 = "\n\u2005   ";
        System.out.println(str1.isBlank());

        // stripIndent
        String html =
                "\t<html>\n"+
                        "\t\t<head>\n"+
                        "\t\t\t<body>\n"+
                        "\t\t\t\t<p>Html Text Executed Perfectly</p>\n"+
                        "\t\t\t</body>\n"+
                        "\t\t</head>\n"+
                        "\t<html>";

        System.out.println(html);
        System.out.println("After stripIndent" + html.stripIndent());

        // Translate Escapes executed
        System.out.println("\"Can you \\n Push me to new line? \"".translateEscapes());

        //isEmpty
        System.out.println("\n\u2005   ".isEmpty());

        // format
        System.out.println(String.format("Format %s","Executed"));

        // formatted
        System.out.println("Formatted %s".formatted("Executed"));

    }
}
