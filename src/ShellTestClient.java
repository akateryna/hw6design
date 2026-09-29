public class ShellTestClient {

    public static void main(String[] args) {
        String input = "S H E L L S O R T R O C K S";

        String[] parts = input.split(" ");
        Character[] charArray = new Character[parts.length];

        for (int i = 0; i < parts.length; i++) {
            charArray[i] = parts[i].charAt(0);
        }

        System.out.print("Original array: ");
        Shell.show(charArray);

        Shell.sort(charArray);

        System.out.print("Sorted array:   ");
        Shell.show(charArray);
    }
}