package bigdata;

public class Study {
   String id[] = new String[100];
   String subject[] = new String[100];
   String content[] = new String[100];
   int notnull = 0;
   int cost[] = new int[100];
   int students[] = new int[100];
   
   public void printAttribute() {
      for(int i = 0; i < id.length ; i++) {
         if(id[i] == null) {
            notnull = i;
            break;
         }
         
      }
      for(int i = 0; i < notnull ; i++) {
         System.out.println("=================");
         System.out.println("아이디 : " + id[i]);
         System.out.println("과목 : " + subject[i]);
         System.out.println("내용 : " + content[i]);
         System.out.println("비용 : " + cost[i]);
         System.out.println("수강가능 인원 : " + students[i]);
         System.out.println("=================");
      }
   }
}