package com.sbs.java.board;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int lastArticleId = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("== 자바 텍스트 게시판 ==");
    while(true) {
      System.out.print("명령) ");
      String cmd = sc.nextLine();
      if(cmd.equals("/usr/article/write")) {
        System.out.println("== 게시물 작성 ==");
        System.out.print("제목 : ");
        String subject = sc.nextLine();
        System.out.print("내용 : ");
        String content = sc.nextLine();
        int id = ++lastArticleId;
        Article article = new Article(); // 게시물 객체 생성
        article.id = id;
        article.subject = subject;
        article.content = content;
        System.out.println("생성 된 게시물 객체 : " + article);
        System.out.printf("%d번 게시물이 등록되었습니다.\n", article.id);
      }
      else if(cmd.equals("exit")) {
        break;
      }
      else {
        System.out.println("잘못 된 명령어입니다.");
      }
    }
    System.out.println("== 자바 텍스트 게시판 종료 ==");
    sc.close();
  }
}
class Article {
  int id;
  String subject;
  String content;

  @Override // 어노테이션
  public String toString() { // 메서드 오버라이딩
    return "{id : %d, subject: \"%s\", content : \"%s\"}".formatted(id, subject, content);
  }
}