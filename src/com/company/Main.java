package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println(fullName());
        System.out.println(upperCaseName());
        String forAdminDep = fullName().replace(" ", ";");
        System.out.println(forAdminDep);
        String replaceCharUnicodeUtf16 = fullName().replace(" ", ";"); //exc#3
        System.out.println(replaceE());
    }

    public static String fullName(){
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + ' ' + firstName + ' ' + middleName;
        return fullName;
    }
    public static String upperCaseName(){
        String firstName = "iVan";
        String middleName = "ivaNovich";
        String lastName = "ivaNov";
        String result = String.join(" ", firstCharToUpperCase(firstName), firstCharToUpperCase(middleName), firstCharToUpperCase(lastName));
        return result;

    }

    public static String firstCharToUpperCase(String str){

        char[] dst = new char[str.length() - 1];
        char firstChar = Character.toUpperCase(str.charAt(0));
        str.getChars(1, str.length(), dst, 0);
        String withOutFirstChar = String.valueOf(dst).toLowerCase();

        return firstChar + withOutFirstChar;
    }

    public static String replaceE() {
        String fName = "Иванов ";
        String mName = "Семён ";
        String lName = "Семёнович";

        fName = firstCharToUpperCase(fName.toLowerCase().replace('ё', 'е'));
        mName = firstCharToUpperCase(mName.toLowerCase().replace('ё', 'е'));
        lName = firstCharToUpperCase(lName.toLowerCase().replace('ё', 'е'));

        String result = String.join(" ", fName, mName, lName);
        return result;
    }
}
