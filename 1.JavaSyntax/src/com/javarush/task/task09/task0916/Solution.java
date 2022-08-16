package com.javarush.task.task09.task0916;

import java.io.IOException;
import java.rmi.RemoteException;

/* 
Перехват checked-исключений
*/

public class Solution {
    public static void main(String[] args) {
        processExceptions(new Solution());

    }

    public static void processExceptions(Solution obj) {
      try {
          obj.method1();
          obj.method2();
          obj.method3();
      } catch (NoSuchFieldException q){
          System.out.println(q);
      }catch (RemoteException q){
          System.out.println(q);
      }catch (IOException q){
          System.out.println(q);
      }
    }

    public void method1() throws IOException {
        throw new IOException();
    }

    public void method2() throws NoSuchFieldException {
        throw new NoSuchFieldException();
    }

    public void method3() throws RemoteException {
        throw new RemoteException();
    }
}
/*Перехват checked-исключений
В методе processExceptions обработайте все checked исключения.
Нужно вывести на экран каждое возникшее checked исключение.
Можно использовать только один блок try..catch


Требования:
1. Метод processExceptions должен вызывать метод method1.
2. Метод processExceptions должен вызывать метод method2.
3. Метод processExceptions должен вызывать метод method3.
4. Метод processExceptions должен использовать только один блок try..catch.
5. Метод processExceptions должен отлавливать и выводить на экран все возникающие checked исключения.
6. Программа должна выводить на экран текст.*/