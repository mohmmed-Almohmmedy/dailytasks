package MATH;

import java.util.Scanner;

public class Main {

     static String tasks []=new String[7];
    static String days [] =  {"الاحد", "الاثنين","الثلاثاء"
            ,"الاربعاء", "الخميس", "الجمعة", "السبت"
    };

    static Scanner readar = new Scanner(System.in);
        public static void dailytasks () {



            System.out.println("ادخل مهامك اليوميه ");




            for (int i=0; i<days.length; i++)
         {
              System.out.print(days[i]);
              tasks[i] = readar.nextLine();

           }
        }
        public static String FindTask(String day){
            if(day.equals("الاحد"))
                return tasks[0];
            else if (day.equals("الاثنين"))
                return tasks[1];
            else if (day.equals("الثلاثاء"))
                return tasks[2];
            else if (day.equals("الاربعاء"))
                return tasks[3];
            else if (day.equals("الخميس"))
                return tasks[4];
            else if (day.equals("الجمعة"))
                return tasks[5];
            else if (day.equals("السبت"))
                return tasks[6];
            else
                return "ادخل يوم صحيح";

        }
        public static void main(String[] args) {

            dailytasks();
            System.out.print("اكتب اليوم :");
          System.out.print(FindTask(readar.nextLine()));


        }

}

