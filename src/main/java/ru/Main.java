package ru;


import ru.createfile.CreateFile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите путь: \n");
        String userPath = scanner.nextLine();
        String nameData = scanner.nextLine();
        System.out.printf("Hello and welcome!");
        CreateFile.newFile(userPath, nameData);


    }



}