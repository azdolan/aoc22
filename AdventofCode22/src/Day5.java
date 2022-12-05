import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Day5 {

    public void partOne() {
        try {
            File myObj = new File(("day5.txt"));
            Scanner myReader = new Scanner(myObj);
            List<String> list = new ArrayList<String>();

            while (myReader.hasNextLine()) {
                list.add(myReader.nextLine());

            }
            List<String> splitList = new ArrayList<>();


            System.out.println(list);

            Stack<String> stackOne = new Stack<>();
            Stack<String> stackTwo = new Stack<>();
            Stack<String> stackThree = new Stack<>();
            Stack<String> stackFour = new Stack<>();
            Stack<String> stackFive = new Stack<>();
            Stack<String> stackSix = new Stack<>();
            Stack<String> stackSeven = new Stack<>();
            Stack<String> stackEight = new Stack<>();
            Stack<String> stackNine = new Stack<>();

            stackOne.push("B");
            stackOne.push("L");
            stackOne.push("D");
            stackOne.push("T");
            stackOne.push("W");
            stackOne.push("C");
            stackOne.push("F");
            stackOne.push("M");

            stackTwo.push("N");
            stackTwo.push("B");
            stackTwo.push("L");

            stackThree.push("J");
            stackThree.push("C");
            stackThree.push("H");
            stackThree.push("T");
            stackThree.push("L");
            stackThree.push("V");

            stackFour.push("S");
            stackFour.push("P");
            stackFour.push("J");
            stackFour.push("W");

            stackFive.push("Z");
            stackFive.push("S");
            stackFive.push("C");
            stackFive.push("F");
            stackFive.push("T");
            stackFive.push("L");
            stackFive.push("R");

            stackSix.push("W");
            stackSix.push("D");
            stackSix.push("G");
            stackSix.push("B");
            stackSix.push("H");
            stackSix.push("N");
            stackSix.push("Z");

            stackSeven.push("F");
            stackSeven.push("M");
            stackSeven.push("S");
            stackSeven.push("P");
            stackSeven.push("V");
            stackSeven.push("G");
            stackSeven.push("C");
            stackSeven.push("N");

            stackEight.push("W");
            stackEight.push("Q");
            stackEight.push("R");
            stackEight.push("J");
            stackEight.push("F");
            stackEight.push("V");
            stackEight.push("C");
            stackEight.push("Z");

            stackNine.push("R");
            stackNine.push("P");
            stackNine.push("M");
            stackNine.push("L");
            stackNine.push("H");

            int stackElementToMoveFrom = 0;
            int stackToMoveFrom = 0;
            int stackElementToMoveTo = 0;

            //get element i which is the element to move
            //get which stack to move from
            //get which stack to move to
            for (int i = 0; i < list.size(); i++) {


                String parts = list.get(i);
                String[] elves = parts.split(" ");



                String elf1 = elves[1];
                String elf2 = elves[3];
                String elf3 = elves[5];

                stackElementToMoveFrom = Integer.parseInt(elf1);
                stackToMoveFrom = Integer.parseInt(elf2);
                stackElementToMoveTo = Integer.parseInt(elf3);


//                System.out.println(elf1);
//                System.out.println(elf2);
//                System.out.println(elf3);


               // System.out.println(list.get(i).length());




                for (int j = 0; j < stackElementToMoveFrom; j++) {





                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 2) {
                        stackOne.push(stackTwo.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 3) {
                        stackOne.push(stackThree.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 4) {
                        stackOne.push(stackFour.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 5) {
                        stackOne.push(stackFive.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 6) {
                        stackOne.push(stackSix.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 7) {
                        stackOne.push(stackSeven.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 8) {
                        stackOne.push(stackEight.pop());
                    }
                    if (stackElementToMoveTo == 1 && stackToMoveFrom == 9) {
                        stackOne.push(stackNine.pop());
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 1) {
                        stackTwo.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 3) {
                        stackTwo.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 4) {
                        stackTwo.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 5) {
                        stackTwo.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 6) {
                        stackTwo.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 7) {
                        stackTwo.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 8) {
                        stackTwo.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 2 && stackToMoveFrom == 9) {
                        stackTwo.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 1) {
                        stackThree.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 2) {
                        stackThree.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 4) {
                        stackThree.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 5) {
                        stackThree.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 6) {
                        stackThree.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 7) {
                        stackThree.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 8) {
                        stackThree.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 3 && stackToMoveFrom == 9) {
                        stackThree.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 1) {
                        stackFour.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 2) {
                        stackFour.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 3) {
                        stackFour.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 5) {
                        stackFour.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 6) {
                        stackFour.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 7) {
                        stackFour.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 8) {
                        stackFour.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 4 && stackToMoveFrom == 9) {
                        stackFour.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 1) {
                        stackFive.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 2) {
                        stackFive.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 3) {
                        stackFive.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 4) {
                        stackFive.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 6) {
                        stackFive.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 7) {
                        stackFive.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 8) {
                        stackFive.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 5 && stackToMoveFrom == 9) {
                        stackFive.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 1) {
                        stackSix.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 2) {
                        stackSix.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 3) {
                        stackSix.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 4) {
                        stackSix.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 5) {
                        stackSix.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 7) {
                        stackSix.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 8) {
                        stackSix.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 6 && stackToMoveFrom == 9) {
                        stackSix.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 1) {
                        stackSeven.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 2) {
                        stackSeven.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 3) {
                        stackSeven.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 4) {
                        stackSeven.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 5) {
                        stackSeven.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 6) {
                        stackSeven.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 8) {
                        stackSeven.push((stackEight.pop()));
                    }
                    if (stackElementToMoveTo == 7 && stackToMoveFrom == 9) {
                        stackSeven.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 1) {
                        stackEight.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 2) {
                        stackEight.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 3) {
                        stackEight.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 4) {
                        stackEight.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 5) {
                        stackEight.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 6) {
                        stackEight.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 7) {
                        stackEight.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 8 && stackToMoveFrom == 9) {
                        stackEight.push((stackNine.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 1) {
                        stackNine.push((stackOne.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 2) {
                        stackNine.push((stackTwo.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 3) {
                        stackNine.push((stackThree.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 4) {
                        stackNine.push((stackFour.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 5) {
                        stackNine.push((stackFive.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 6) {
                        stackNine.push((stackSix.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 7) {
                        stackNine.push((stackSeven.pop()));
                    }
                    if (stackElementToMoveTo == 9 && stackToMoveFrom == 8) {
                        stackNine.push((stackEight.pop()));
                    }

                }

                }
                System.out.println(stackOne.lastElement());
                System.out.println(stackTwo.lastElement());
                System.out.println(stackThree.lastElement());
                System.out.println(stackFour.lastElement());
            System.out.println(stackFive.lastElement());
            System.out.println(stackSix.lastElement());
            System.out.println(stackSeven.lastElement());
            System.out.println(stackEight.lastElement());
            System.out.println(stackNine.lastElement());


            }
        catch(FileNotFoundException e){
                System.out.println("an error occured");
                e.printStackTrace();
            }
        }



}
