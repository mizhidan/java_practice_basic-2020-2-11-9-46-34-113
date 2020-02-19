package com.thoughtworks;

import java.util.HashSet;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Card cards = new Card();
    CardMachine machine = new CardMachine(cards);
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入想抽的卡数");
    int numberOfCards = scanner.nextInt();
    HashSet<String> cardSet = machine.drawCard(numberOfCards);
    
    System.out.println("抽到的卡为：");
    System.out.println(String.join(",",cardSet));
  }
}
