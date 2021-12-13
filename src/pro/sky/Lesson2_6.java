package pro.sky;

import java.util.*;
import java.util.stream.Collectors;

public class Lesson2_6 {
    public static void main(String[] args) {
        //task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 9, 11, 10, 6, 3, 1)));
        //task2(new HashSet<>(Set.of(5, 4, 3, 2, 1, 100, 0, -2, 8)));
        //task3(new ArrayList<>(List.of("Свекла", "Огурцы", "Помидоры", "Картофель", "Морковь", "Огурцы", "Помидоры", "Картофель", "Капуста", "Капуста")));
        task4("Java - это язык программирования. Python - это тоже язык программирования.");

    }


    public static void task1(List<Integer> numbers) {
        /*## Задание 1
        Напишите код, с помощью которого можно напечатать только нечетные числа в консоль.
        Код должен работать с любой последовательностью и объемом списка чисел.
        В качестве отладочной информации можете использовать список чисел ```java
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
         */

        List<Integer> nums = numbers;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
    }

    public static void task2(Set<Integer> numbers) {
       /*
       Напишите код, с помощью которого можно напечатать только четные числа без повторений в порядке возрастания.
       Код должен работать с любой последовательностью и объемом списка чисел.
       В качестве отладочной информации можете использовать список чисел ```java
       List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7))
        */
        numbers.stream().sorted().filter(i -> i % 2 == 0).distinct().forEach(i -> System.out.print(" " + i));
    }

    public static void task3(List<String> words) {
        /*
        Задание 3
        Напишите код, который выводит в консоль все уникальные слова из списка слов, в котором могут встречаться дубли.
        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
        Это может быть произвольный набор слов, литературный текст или произвольное предложение.
        Код должен работать с любой последовательностью и объемом списка слов.
         */
        List<String> repeatedWords = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<>();
        for (String word : words) {
            if (!uniqueWords.add(word)) {
                repeatedWords.add(word);
            }
        }
        System.out.println(repeatedWords);
    }

    public static void task4(String text) {
        /*
        Задание 4
        Напишите код, который выводит в консоль все количество дублей из списка слов.
        *Например, у вас есть текст из 6 слов, в котором есть одно слово, которое повторяется.
        В таком случае в консоли выведется результат "2", то есть то количество элементов, которые повторяются.*
        В качестве отладочной информации возьмите произвольный набор слов или текст, в котором встречаются повторения.
        Это может быть произвольный набор слов, литературный текст или произвольное предложение.
        Код должен работать с любой последовательностью и объемом списка слов.
         */
        int count = 0;
        text = text.toLowerCase();
        String[] strArray = text.split(" ");
        List<String> repeatedWords = new ArrayList<>();
        Set<String> uniqueWords = new HashSet<>();
        for (String str : strArray) {
            if (!uniqueWords.add(str)) {
                count++;
                repeatedWords.add(str);
            }
        }
        System.out.println(repeatedWords + " \nКоличество элементов,которые повторяются: " + count);
    }
}




