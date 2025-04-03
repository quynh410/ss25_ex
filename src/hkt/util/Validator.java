package hkt.util;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Validator {
    public static int validateInputInteger(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                int value = Integer.parseInt(input.trim());
                System.out.println("Giá trị hợp lệ: " + value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị nhập vào không phải là số nguyên hợp lệ.");
            }
        }
    }
    public static float validateInputFloat(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                float value = Float.parseFloat(input.trim());
                System.out.println("Giá trị hợp lệ: " + value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị nhập vào không phải là số thực float hợp lệ.");
            }
        }
    }
    public static double validateInputDouble(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                double value = Double.parseDouble(input.trim());
                System.out.println("Giá trị hợp lệ: " + value);
                return value;
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Giá trị nhập vào không phải là số thực double hợp lệ.");
            }
        }
    }
    public static boolean validateInputBoolean(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                String trimmedInput = input.trim().toLowerCase();

                if (!trimmedInput.equals("true") && !trimmedInput.equals("false")) {
                    throw new IllegalArgumentException("Giá trị nhập vào phải là 'true' hoặc 'false'.");
                }

                boolean value = Boolean.parseBoolean(trimmedInput);
                System.out.println("Giá trị hợp lệ: " + value);
                return value;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    public static String validateInputString(String prompt, Scanner scanner, StringRule rule) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                String trimmedInput = input.trim();

                if (trimmedInput.isEmpty()) {
                    throw new IllegalArgumentException("Chuỗi không được để trống.");
                }

                if (trimmedInput.length() < rule.getMinLength()) {
                    throw new IllegalArgumentException("Chuỗi phải có ít nhất " + rule.getMinLength() + " ký tự.");
                }

                if (trimmedInput.length() > rule.getMaxLength()) {
                    throw new IllegalArgumentException("Chuỗi không được vượt quá " + rule.getMaxLength() + " ký tự.");
                }

                System.out.println("Chuỗi hợp lệ: '" + trimmedInput + "'");
                return trimmedInput;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    public static String validateEmail(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                String trimmedInput = input.trim();
                String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

                if (!Pattern.compile(emailRegex).matcher(trimmedInput).matches()) {
                    throw new IllegalArgumentException("Email không đúng định dạng.");
                }

                System.out.println("Email hợp lệ: " + trimmedInput);
                return trimmedInput;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
    public static String validatePhone(String prompt, Scanner scanner) {
        while (true) {
            try {
                System.out.print(prompt);
                String input = scanner.nextLine();
                String trimmedInput = input.trim();
                String phoneRegex = "^(03|05|07|08|09)[0-9]{8}$";

                if (!Pattern.compile(phoneRegex).matcher(trimmedInput).matches()) {
                    throw new IllegalArgumentException("Số điện thoại không đúng định dạng số di động Việt Nam.");
                }

                System.out.println("Số điện thoại hợp lệ: " + trimmedInput);
                return trimmedInput;
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}

