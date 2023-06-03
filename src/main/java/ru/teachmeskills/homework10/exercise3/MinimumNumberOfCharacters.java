package ru.teachmeskills.homework10.exercise3;

public class MinimumNumberOfCharacters {

    public void getMinimumNumberOfCharacters(String string) {

        //Разбиваем предложение на слова
        String[] words = string.split(" ");

        // Массив для записи количества различных символов, для каждого слова
        int[] counter = new int[words.length];

        //Поиск различных символов в слове и запись их количества в counter[]
        for (int k = 0; k < words.length; k++) {
            StringBuilder  stringBuilder = new StringBuilder(words[k]);
            for (int i = 0; i < stringBuilder.length(); i++) {
                for (int j = i + 1; j < stringBuilder.length(); j++) {
                    if(stringBuilder.charAt(i) == stringBuilder.charAt(j)) {
                        stringBuilder.deleteCharAt(j--);
                    }
                }
                counter[k] = stringBuilder.length();
            }
        }

        //Вывод слов по отдельности с количеством различных символов в нём
//        for ( int i = 0; i < words.length; i++) {
//            System.out.println(words[i]  +  " " + counter[i]);
//      }

        //Находим индекс, соответствующий слову с наименьшим количеством различных символов
        int index = 0;
        for (int i = 1; i < counter.length; i++) {
            if(counter[0] > counter[i]) {
                counter[0] = counter[i];
                index = i;
            }
        }

        System.out.println("В строке " + "\"" + string + "\"");
        System.out.println("Слово, c минимальным количеством различных символов - " + words[index]);
    }
}
