package lesson04.part01;

import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.Iterator;
/**
 * Создать коллекцию Set (реализация HashSet) с типом элементов String.
 * Добавить в неё 10 строк:
 * арбуз
 * банан
 * вишня
 * груша
 * дыня
 * ежевика
 * женьшень
 * земляника
 * ирис
 * картофель
 *
 * Вывести содержимое коллекции на экран, каждый элемент с новой строки.
 * Посмотреть, как изменился порядок добавленных элементов.
 *
 * Требования:
 * 1.	Объяви переменную коллекции Set с типом элементов String и сразу проинициализируй ee.
 * 2.	Программа не должна считывать строки с клавиатуры.
 * 3.	Программа должна добавлять в коллекцию 10 строк, согласно условию.
 * 4.	Программа должна выводить 10 строк из коллекции на экран, каждую с новой строки.
 */

public class Task06 {
  public static void main(String[] args) {
    //напишите тут ваш код
    HashSet<String> hash= new HashSet<String>();
    hash.add("арбуз");
    hash.add("банан");
    hash.add("вишня");
    hash.add("груша");
    hash.add("дыня");
    hash.add("земляника");
    hash.add("женьшень");
    hash.add("ежевика");
    hash.add("ирис");
    hash.add("картофель");
    Iterator<String> itr= hash.iterator();
    while (itr.hasNext()){
      System.out.println(itr.next().toString());
    }

  }
}
