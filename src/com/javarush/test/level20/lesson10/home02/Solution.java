package com.javarush.test.level20.lesson10.home02;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуйте объект в методе getOriginalObject предварительно определив, какого именно типа там объект.
Реализуйте интерфейс Serializable где необходимо.
*/

//Добавили реализацию интерфейса Serializable для классов Solution, A
public class Solution implements Serializable{
    public A getOriginalObject(ObjectInputStream objectStream) throws IOException, ClassNotFoundException {
        Object o  =  objectStream.readObject();
        if (o instanceof A){
            return (A) o;
        } else return (B) o;

    }

    public class A implements Serializable{
        private static final long serialVersionUID = 3;
    }

    public class B extends A {
        private static final long serialVersionUID = 4;
        public B() {
            System.out.println("inside B");
        }
    }
}