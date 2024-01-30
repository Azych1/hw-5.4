package org.example;

public class StringSplitExample {

    public static void main(String[] args) {
        String inputString = "This_is_a_test_string_to_be_split";

        // Разделение строки на части через каждые 5 символов
        for (int i = 0; i < inputString.length(); i += 5) {
            System.out.println(inputString.substring(i, Math.min(i + 5, inputString.length())));
        }
    }
}

