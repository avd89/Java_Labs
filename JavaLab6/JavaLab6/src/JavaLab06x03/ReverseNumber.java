/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLab06x03;

/**
 * Lab 6 Базовый синтаксис языка Java. Циклические конструкции.Итерационные алгоритмы
 * 
 * Напишите программу, которая организует диалог с пользователем и с помо-
 * щью соответствующих арифметических операций для натурального числа N
 * вычисляет число M, записываемое теми же цифрами, что и N, но в обратном
 * порядке (все незначащие нули в числе M не выводятся, например, если N =
 * 2900, то M=92).
 * 
 * This is a part of the program that reverse number
 * logic methods
 * 23.03.2018
 * Group POIS1709v1
 * @author Aleksei Dubrovskii
 * v 1.0
 * 
 */
public class ReverseNumber {

    public static int getReverseNumber(int number) {   //reverse number 
        
        int temp, reversedNumber = 0;
        
        while (number > 0) {
            temp = number % 10;
            reversedNumber = reversedNumber * 10 + temp;
            number = number / 10;
        }
        return reversedNumber;
    }

}
