import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {

    public void partOne() {
        int win = 6;
        int draw = 3;
        int lose = 0;

        int X = 1;
        int Y = 2;
        int Z = 3;


        int score = 0;
        try {
            File myObj = new File(("day2.txt"));
            Scanner myReader = new Scanner(myObj);
            List<String> list = new ArrayList<String>();

            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());

            }

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).contains("A") && list.get(i).contains("Y")) {
                    score += draw;
                    score = score + X;
                }
                if (list.get(i).contains("A") && list.get(i).contains("X")) {
                    score = score + lose;
                    score = score + Z;
                }
                if (list.get(i).contains("A") && list.get(i).contains("Z")) {
                    score = score + win;
                    score = score + Y;
                }

                //x lose
                // y draw
                // z win
                //a and x is rock
                //b and y is paper
                //c and z is scissors

                if (list.get(i).contains("B") && list.get(i).contains("Y")) {
                    score = score + draw;
                    score = score + Y;
                }
                if (list.get(i).contains("B") && list.get(i).contains("Z")) {
                    score = score + win;
                    score = score + Z;
                }
                if (list.get(i).contains("B") && list.get(i).contains("X")) {
                    score = score + lose;
                    score = score + X;
                }

                if(list.get(i).contains("C") && list.get(i).contains("X")){
                    score = score+lose;
                    score = score+Y;
                }
                if(list.get(i).contains("C") && list.get(i).contains("Y")){
                    score = score+draw;
                    score = score+Z;
                }
                if(list.get(i).contains("C") && list.get(i).contains("Z")){
                    score = score+win;
                    score = score+X;
                }
            }

            System.out.println(list.get(0));
            System.out.println(list);
            System.out.println(score);

            myReader.close();

        } catch (FileNotFoundException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }

    }

}