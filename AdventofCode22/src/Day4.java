import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



    public class Day4 {

        public void partOne() {
            try {
                File myObj = new File(("day4.txt"));
                Scanner myReader = new Scanner(myObj);
                List<String> list = new ArrayList<String>();

                while (myReader.hasNextLine()) {
                    list.add(myReader.nextLine());

                }
                int pairs =0;

                for (int i=0;i< list.size();i++){
                    String part1;
                    String part2;

                    String parts = list.get(i);
                  String []  elves =  parts.split(",");
                  String elf1 = elves[0];
                  String elf2 = elves[1];

                   // System.out.println(elves[0]);
                  //  System.out.println(elves[1]);

                  String [] anotherSplit = elf1.split("-");
                  String [] anotherSplit2 = elf2.split("-");

                  int elfOneBeginning = Integer.parseInt(anotherSplit[0]);
                  int elfOneEnd = Integer.parseInt(anotherSplit[1]);
                  int elfTwoBeginning = Integer.parseInt(anotherSplit2[0]);
                  int elfTwoEnd = Integer.parseInt(anotherSplit2[1]);




                  if(elfOneBeginning>=elfTwoBeginning && elfOneEnd<=elfTwoEnd || elfTwoBeginning >=elfOneBeginning && elfTwoEnd<=elfOneEnd){
                      pairs+=1;
                  }

                    System.out.println(pairs);




                }

                //System.out.println(list);





            }  catch (FileNotFoundException e) {
                System.out.println("an error occured");
                e.printStackTrace();
            }
        }

        public void partTwo(){
            try {
                File myObj = new File(("day4.txt"));
                Scanner myReader = new Scanner(myObj);
                List<String> list = new ArrayList<String>();

                while (myReader.hasNextLine()) {
                    list.add(myReader.nextLine());

                }
                int pairs =0;

                for (int i=0;i< list.size();i++){
                    String part1;
                    String part2;

                    String parts = list.get(i);
                    String []  elves =  parts.split(",");
                    String elf1 = elves[0];
                    String elf2 = elves[1];

                    // System.out.println(elves[0]);
                    //  System.out.println(elves[1]);

                    String [] anotherSplit = elf1.split("-");
                    String [] anotherSplit2 = elf2.split("-");

                    int elfOneBeginning = Integer.parseInt(anotherSplit[0]);
                    int elfOneEnd = Integer.parseInt(anotherSplit[1]);
                    int elfTwoBeginning = Integer.parseInt(anotherSplit2[0]);
                    int elfTwoEnd = Integer.parseInt(anotherSplit2[1]);





                    if( (elfOneBeginning<= elfTwoEnd && elfTwoBeginning<=elfOneEnd) ||
                            (elfTwoBeginning<=elfOneEnd && elfOneBeginning<=elfTwoEnd) ){
                        pairs+=1;
                    }

                   System.out.println(pairs);




                }

                //System.out.println(list);





            }  catch (FileNotFoundException e) {
                System.out.println("an error occured");
                e.printStackTrace();
            }

        }



    }

