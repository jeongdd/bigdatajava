package bigdata;

import java.util.Scanner;

public class StudyManager {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      Study study = new Study();
      String input;
      int toggle = 0;
      int inputCost;
      int selectN = 0;
      int costT = 0;
      int costAvg = 0;
      while (toggle == 0) {
         System.out.print("1.정보 입력 2.등록정보 출력 3.수강비 수정 4.수강비용 정보 5.프로그램종료 : ");
         int select = sc.nextInt();
         switch (select) {
         case 1:
        	System.out.print("아이디 입력:");
            input = sc.next();
            study.id[selectN] = input;
            System.out.print("수강과목 : ");
            input = sc.next();
            study.subject[selectN] = input;
            System.out.print("수강내용 : ");
            input = sc.next();
            study.content[selectN] = input;
            System.out.print("수강비용 : ");
            inputCost = sc.nextInt();
            study.cost[selectN] = inputCost;
            System.out.print("수강가능 인원 : ");
            input = sc.next();
            study.students[selectN] = inputCost;
            selectN++;
            System.out.println("입력이 완료되었습니다.");
            System.out.println("===================");
            break;

         case 2:
            study.printAttribute();
            break;
         case 3:
             System.out.print("수정할 아이디 : ");
             input = sc.next();
             int check = 0;
             for (int i = 0; i < selectN; i++) {
                if (study.id[i].equals(input)) {
                   check = 1;
                   System.out.print("비용 수정 : ");
                   study.cost[i] = sc.nextInt();
                   System.out.println();
                   break;
                }
             }
             if(check == 0)
                System.out.println("찾으시는 아이디가 없습니다. 다시 입력해주세요.");
             break;
         case 4:
            System.out.println("=================");
            for (int i = 0; i < study.cost.length; i++) {
               costT += study.cost[i];
            }
            costAvg = costT / selectN;
            System.out.println("총 수강비용 : " + costT);
            System.out.println("총 수강비용 평균 : " + costAvg);
            System.out.println("=================");
            break;
         case 5:
            System.out.println("프로그램을 종료합니다.");
            toggle = 1;
            break;
         }

      }
   }
}