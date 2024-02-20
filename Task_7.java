package HomeWork1;

public class Task_7 {
        public static void main(String[] args) {
            int[] phoneNumberDigits = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
            String formattedPhoneNumber = createPhoneNumber(phoneNumberDigits);
            System.out.println(formattedPhoneNumber);
        } public static String createPhoneNumber(int[] digits) {
            String num = String.format("(%d%d%d) %d%d%d-%d%d%d%d",
                    digits[0], digits[1], digits[2], digits[3], digits[4], digits[5], digits[6], digits[7], digits[8], digits[9]);
            return num;
        }
    }


