package LambdaExpressions;

public class MyClassWithLambda {

    public static void main(String[] args) {

        WordCount wc = (str) -> {

            if (str == null || str.trim().isEmpty()) {
                return 0;
            }

            return str.trim().split("\\s+").length;
        };

        String sentence = "Java is a programming language";

        System.out.println("Sentence : " + sentence);
        System.out.println("Word Count : " + wc.count(sentence));
    }
}