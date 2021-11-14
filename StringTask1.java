package Array;
/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 * Например:
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */
public class StringTask1 {

    public static void main(String[] args) {
        String text = "abc Cpddd Dio OsfWw";
        System.out.println(text);
        String result = text.toUpperCase().replaceAll("\\s+", "");
        for (int i = 0; i < result.length() - 1; i++) {
            if (result.charAt(i) == result.charAt(i + 1)) {
                result = result.substring(0, i) + ' ' + result.substring(i + 1);
            }
        }
        System.out.println(result.replaceAll("\\s+", ""));
    }
}