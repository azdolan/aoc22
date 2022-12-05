import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class main {

    Day2 day2 = new Day2();
    Day3 day3 = new Day3();
    Day4 day4 = new Day4();
    Day5 day5 = new Day5();

    public static void main(String[] args) {
        main main = new main();
        //main.partOne();
       // main.day2.partOne();
      //  main.day3.partOne();
        //main.day4.partOne();
       // main.day4.partTwo();
        main.day5.partOne();


    }
    public  void partOne() {
        try {
            File myObj = new File(("day1.txt"));
            Scanner myReader = new Scanner(myObj);
            List<String> list = new ArrayList<String>();

            while (myReader.hasNextLine())
            {
               list.add(myReader.nextLine());

            }

            System.out.println(list);

            myReader.close();


            int sum=0;
            int max =0;


            List <Integer> list2 = new ArrayList<Integer>();

            for(int i=0;i<list.size();i++){
                try {

                    int tempNum = Integer.parseInt(list.get(i));
                    sum+=tempNum;

                } catch (Exception e){
                    System.out.println("not a number :(");
                }
                if(list.get(i).isEmpty()){
                    list2.add(sum);

                    if(max<sum){
                        max = sum;
                    }

                    sum = 0;
                }

            }
            list2.add(sum);
            Collections.sort(list2);

            list2.size();
            int sum2 = list2.get(list2.size()-1) + list2.get(list2.size()-2) + list2.get(list2.size()-3);



            System.out.println(max);
            System.out.println(list2);
            System.out.println(sum2);
        }
        catch(FileNotFoundException e){
            System.out.println("an error occured");
            e.printStackTrace();
        }

    }
}
