import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var input = new String[]{"Вася", "Петя", "Никита", "Петя"};
        System.out.println(RemoveDuplicates(input));
    }
    public static String RemoveDuplicates(String[] input) {
        var output = Arrays.stream(input).distinct().toArray(s -> new String[s]);

        var result="";

        for (int i = 0; i < output.length; i++) {
            if (input[i]==null){
                continue;
            }
            result=result+input[i] +", ";

        }
        return result;

    }
}