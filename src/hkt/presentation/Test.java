package hkt.presentation;

import hkt.util.StringRule;
import hkt.util.Validator;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Validator.validateInputInteger("Nhập vào kiểu dữ liệu số nguyên: ", scanner);
        Validator.validateInputFloat("Nhập vào kiểu dữ liệu số thực: ", scanner);
        Validator.validateInputBoolean("Nhập vào kiểu dữ liệu boolean: ", scanner);
        Validator.validateInputDouble("Nhập vào kiểu số thực double: ", scanner);
        Validator.validateInputString("Nhập vào kiểu string: ", scanner, new StringRule(10, 100));
        Validator.validateEmail("Nhập vào kiểu email: ", scanner);
        Validator.validatePhone("Nhập vào kiểu số điện thoại: ", scanner);

        scanner.close();
    }
}