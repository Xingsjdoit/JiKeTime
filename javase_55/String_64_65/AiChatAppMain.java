package com.jiketime.javase_55;

import java.util.Scanner;

/**
 * @Author xing
 * @create 2022/5/29 22:25
 */
public class AiChatAppMain {
    public static void main(String[] args) {
        AiChat aiChat = new AiChat();
        Scanner scanner = new Scanner(System.in);
        while (true){
            String input = scanner.next();
            if ("exit".equals(input)){  //字符串比较，字符串常量放前面，用equals
                System.out.println("再见！");
                break;
            }
            String answer = aiChat.answer(input);
            System.out.println(answer);
        }
    }
}
