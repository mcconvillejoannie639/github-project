package com.example;
import java.util.Random;
public class RandomNumber {
private static final Random RANDOM = new Random();
public int getRandomNumber(int min, int max) {
return RANDOM.nextInt((max - min) + 1) + min;
}
public static void main(String[] args) {
System.out.println(new RandomNumber().getRandomNumber(0, 10));
}
}