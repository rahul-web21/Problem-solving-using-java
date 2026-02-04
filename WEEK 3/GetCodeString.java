public class GetCodeString {
    public String getCode(String input) {
        StringBuilder sb = new StringBuilder();

        for (char c : input.toCharArray()) {
            sb.append((int) c);
        }
        return sb.toString();
    }
}