package HomeWork1;

public class Task_5 {
        public static void main(String[] args) {
            boolean isWeekday = true;
            boolean isVacation = false;

            if (sleepIn (isWeekday, isVacation)) {
                System.out.println("Можем спать дальше");
            } else {
                System.out.println("Пора идти на работу");
            }
        }
        public static boolean sleepIn(boolean weekday, boolean vacation) {
            return !weekday || vacation;
        }
    }


