import java.util.Scanner;
//This class will be used to display all students grade info
public class StudentTest {

    //Students will be able to make choices off a menu to display their information
    //They will be able to see all currant grades earned
    public static void main(String[] args) {
    //Declare variables
    Scanner input = new Scanner(System.in);     //scanner object
    int nOption = 0;    //Used to give user options
    double dQuizAverage = 0.0;      //Used to hold quiz average
    int nStudentId = 0;     //Used to hold student Id
    int nNextStudentId = 0;     //Used to hold next students Id
    String sLastName = "";     //Used to retrieve users last name
    String sFirstName = "";     //Used to retrieve users first name
    int nQuiz1 = 0;     //Used to hold quiz1 scores
    int nQuiz2 = 0;     //Used to hold quiz2 scores
    int nQuiz3 = 0;     //Used to hold quiz3 scores
    //Declare the object of reference
    Student myStudent = null;
    
    //Display menu
    System.out.println("STUDENT PROCESSING MENU");      //Used to title menu
    System.out.println("1. Create new Student - empty Account: ");      //Used to create new student
    System.out.println("2. Create new Student - information available: ");      //Used to create new student with info available
    System.out.println("3. Set Student First Name: ");      //Used to record students first name
    System.out.println("4. Set Student Last Name: ");       //Used to record students last name
    System.out.println("5. Enter Quiz1 Score: ");       //Used to enter quiz1 grade
    System.out.println("6. Enter Quiz2 Score: ");       //Used to enter quiz2 grade
    System.out.println("7. Enter Quiz3 Score: ");       //Used to enter quiz3 grade
    System.out.println("8. Get Quiz Average ");     //Used to get quiz average
    System.out.println("9. Get Student Id ");       //Used to get students Id
    System.out.println("10. Get Next Available Id ");       //Used to get next Id
    System.out.println("11. Compute Student Grade ");       //Used to get students grade
    System.out.println("12. Print Student Information ");       //Used to print students info
    System.out.println("13. Exit ");        //Used to exit program
    
    System.out.println("");  //Used to give program space
    
    //Prompt user to select option
    System.out.print("Please enter your preferred option: ");
    //Command systemt to option selection
    nOption = input.nextInt();
    
    //Loop for the options
    while(nOption != 13){
        //if to detect the option selected by the user
        if(nOption ==1){
            myStudent = new Student();      //Reference variable
                System.out.println("Student successfully created.");    //Display that system created student
                    System.out.println("StudentId #"+myStudent.getStudentId());     //Display students Id
            
        }       //End if option 1
        //  Else if user choose 2
        else if(nOption ==2){
            myStudent = new Student();      //New reference variable
                System.out.print("Please enter Student First Name: ");  //Prompt to enter students name
                    sFirstName = input.next();  //Student enters name
                        myStudent.setFirstNames(sFirstName);     //Setting first name in system
                            System.out.print("Please enter Student Last Name: ");       //Prompt student to enter last name
                                sLastName =input.next();        //User enters last name
                                    myStudent.setLastName(sLastName);       //Setting student last name
                                        System.out.print("Enter Quiz1 Score: ");        //Prompts user to enter quiz1 score
                                            nQuiz1 = input.nextInt();       //User enters quiz 1 grade
                                                myStudent.setQuiz1(nQuiz1);        //Setting Quiz 1 grade
                                                    System.out.print("Enter Quiz2 Score: ");        //Prompts user to enter quiz 2 grade
                                                        nQuiz2 = input.nextInt();       //User enters quiz 2 grade
                                                            myStudent.setQuiz2(nQuiz2);        //Setting quiz 2 grade
                                                                System.out.print("Enter Quiz3 Score: ");        //Prompts user to enter quiz 3 grade
                                                                    nQuiz3 = input.nextInt();       //User enters quiz 3 grade
                                                                        myStudent.setQuiz3(nQuiz3);       //Setting quiz 3 grade
                                                                            System.out.println("Student successfully created");     //Prompts user student created
                                                                                System.out.println("StudentId: "+myStudent.getStudentId());     //Display student Id
        }   //End else if user chooses 2
        
        //Else if user chooses option 3
        else if(nOption ==3){
            //Prompts user to enter first name
            System.out.print("Please enter Student First Name: ");
                //User enters first name
                sFirstName = input.next();
                    //Setting students first name
                    myStudent.setFirstNames(sFirstName);
        }   //End else if user choose 3
        
        //Else if user chooses option 4
        else if(nOption ==4){
            //Prompts user to enter last name
            System.out.print("Please enter Student Last Name: ");
                //User enters last name
                sLastName = input.next();
                    //Setting students last name
                    myStudent.setLastName(sLastName);
        }   //End else if user choose 4
        
        //Else if user chooses option 5
        else if(nOption ==5){
            //Propmts user to enter quiz1 grade
            System.out.print("Enter Quiz1 Score: ");
                //User enters score
                nQuiz1 = input.nextInt();
                    //Set quiz grade in object
                    myStudent.setQuiz1(nQuiz1);
        }   //End else if for option 5
        
        //Else if user chooses option 6
        else if(nOption ==6){
            //Propmts user to enter quiz1 grade
            System.out.print("Enter Quiz2 Score: ");
                //User enters score
                nQuiz2 = input.nextInt();
                    //Set quiz grade in object
                    myStudent.setQuiz2(nQuiz2);
        }   //End else if for option 6
        
        //Else if user chooses option 7
        else if(nOption ==7){
            //Propmts user to enter quiz1 grade
            System.out.print("Enter Quiz3 Score: ");
                //User enters score
                nQuiz3 = input.nextInt();
                    //Set quiz grade in object
                    myStudent.setQuiz3(nQuiz3);
        }   //End else if for option 7
        
        //Else if user chooses 8
        else if(nOption ==8){
            //Prompts user with quiz average
            System.out.println("Quiz Average: "+myStudent.calculateQuizAverage());
        }   //End else if user chooses 8
        
        //Else if user chooses 9
        else if(nOption ==9){
            //Prompts user with student Id
            System.out.println("Student Id: #"+myStudent.getStudentId());
        }   //End else if user chooses 9
        
        //Else if user chooses 10
        else if (nOption ==10){
            //Prompts user with next students Id
            System.out.println("Next Student Id: #"+myStudent.getNextStudentId());
        }   //End else if user chooses 10
        
        //Else if user chooses 11
        else if (nOption ==11){
            //Prompts user with their grade
            System.out.println("Student Grade: "+myStudent.computeStudentGrade());
        }   //End else if user chooses 11
        
        //Else if user chooses 12
        else if (nOption ==12){
            //Prompt user with students information
            myStudent.printStudentInfo();
        
        }   //End else if user chooses 12
    
        //Give the program some space
        System.out.println("");     //Give the program some space
            //Promt so loop can end
            System.out.print("Please enter your preferred an option: ");     
                //User can enter data    
                nOption = input.nextInt();      //
    
    
    
    
    }   //End loop
    
    //Display to show user program exited
    System.out.println("Program Exited");
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }       //End main class
    
}       //End public class
