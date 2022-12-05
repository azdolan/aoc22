import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day3 {

    public void partOne() {
        try {
            File myObj = new File(("day3.txt"));
            Scanner myReader = new Scanner(myObj);
            List<String> list = new ArrayList<String>();

            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());

            }
            int listSize = list.size() / 3;
            int elfs = 0;
            List<List<String>> groups = new ArrayList<>();


            for (int i = 0; i <listSize; i++) {
                List <String> groupedElements = new ArrayList<>();
                groupedElements.add(list.get(elfs));
                groupedElements.add(list.get(elfs+1));
                groupedElements.add(list.get(elfs+2));

                elfs+=3;
                groups.add(groupedElements);
              //  String line = list.get(i);
               // System.out.println("We are at line " + line + " " + i);
            }

            int result=0;
            for (int i=0; i< groups.size();i++){

                for (char letter : groups.get(i).get(0).toCharArray()){
                    if(groups.get(i).get(1).contains(String.valueOf(letter)) && groups.get(i).get(2).contains(String.valueOf(letter)))
                    {
                        result+=score(letter);
                        break;
                    }

                }

            }
            //System.out.println(elfs);
            System.out.println(result);
            // System.out.println(result2);


        }  catch (FileNotFoundException e) {
            System.out.println("an error occured");
            e.printStackTrace();
        }
    }


    public int score(char letter) {

        switch (letter) {
            case 'a':
                return 1;

            case 'b':
                return 2;

            case 'c':
                return 3;

            case 'd':
                return 4;

            case 'e':
                return 5;
            case 'f':
                return 6;

            case 'g':
                return 7;

            case 'h':
                return 8;
            case 'i':
                return 9;

            case 'j':
                return 10;

            case 'k':
                return 11;

            case 'l':
                return 12;

            case 'm':
                return 13;

            case 'n':
                return 14;

            case 'o':
                return 15;

            case 'p':
                return 16;

            case 'q':
                return 17;

            case 'r':
                return 18;

            case 's':
                return 19;

            case 't':
                return 20;

            case 'u':
                return 21;

            case 'v':
                return 22;

            case 'w':
                return 23;

            case 'x':
                return 24;

            case 'y':
                return 25;

            case 'z':
                return 26;

            case 'A':
                return 27;

            case 'B':
                return 28;

            case 'C':
                return 29;

            case 'D':
                return 30;

            case 'E':
                return 31;

            case 'F':
                return 32;

            case 'G':
                return 33;

            case 'H':
                return 34;

            case 'I':
                return 35;

            case 'J':
                return 36;

            case 'K':
                return 37;

            case 'L':
                return 38;

            case 'M':
                return 39;

            case 'N':
                return 40;

            case 'O':
                return 41;

            case 'P':
                return 42;
            case 'Q':
                return 43;

            case 'R':
                return 44;

            case 'S':
                return 45;

            case 'T':
                return 46;

            case 'U':
                return 47;

            case 'V':
                return 48;

            case 'W':
                return 49;

            case 'X':
                return 50;

            case 'Y':
                return 51;

            case 'Z':
                return 52;
            default:
                return 0;


        }

    }
}
