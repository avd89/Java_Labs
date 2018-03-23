/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x02;

import java.util.Scanner;

/**
 * Lab 6 Базовый синтаксис языка Java. Циклические конструкции.Итерационные алгоритмы
 * 
 * Натуральное число называют совершенным, если оно равно сумме всех своих
 * делителей, не считая только его самого (например, 28=1+2+3+7+14 – совер-
 * шенное число). Напишите программу, которая организует диалог с пользова-
 * телем и проверяет, является ли введённое натуральное число совершенным.
 * Для проверки работоспособности программы приводится список некоторых
 * совершенных чисел: 6, 28, 496, 8128. 
 * 
 * This is a part of the program that recognize perfect number
 * input method
 * 23.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * v 1.0
 * 
 */
public class UserInput {
    
    static Scanner scanner = new Scanner(System.in);
    
    public static int input(String msg){
        
        System.out.print(msg);
        return scanner.nextInt();
        
    }
    
}
