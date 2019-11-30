import java.util.Random;
public class FitnesAPP {
        public static void main(String[]args) {
            int x;
            //object call
            Exercises exe1 = new Exercises("PUSH-UP", "Place your hands on the floor. Raise up onto your toes so that all of your body weight is on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position.", 30, "FLOOR");
            Exercises exe2 = new Exercises("PLANK", " Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold.", 90, "FLOOR");
            Exercises exe3 = new Exercises("SQUATS", " Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels. ", 90, "STAND UP");
            Exercises exe4 = new Exercises("BACKWARDS KICK", "Get in an all-fours position with your knees and hands on the floor. Your back is straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat.", 60, "FLOOR");
            Exercises exe5 = new Exercises("LEG CURL", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks. Stay for 15 seconds, then repeat with your other leg.", 90, "STAND UP");
            Exercises exe6 = new Exercises("SIDEWARDS BACK STRETCH", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand.", 60, "STAND UP");

            //object printing
            System.out.println("\n\n");
            System.out.println(exe1);
            System.out.println(exe2);
            System.out.println(exe3);
            System.out.println(exe4);System.out.println(exe5);
            System.out.println(exe6);


            //ARRAYS floor , floor and duration over 60
            Exercises[] myArray = {exe1, exe2, exe3, exe4, exe5, exe6};
            for (int i = 0; i < myArray.length; i++) {
                System.out.println(myArray[i]);
            }
            System.out.println("//////////////////FLOOR/////////////////////");
            for (int j=0;j<myArray.length;j++) {
                do {
                    if (myArray[j].getPosition().equals("FLOOR") && myArray[j].getDuration() > 60)
                    {
                        System.out.println("-------------------DURATION OVER 60 ----------------");
                        System.out.println(myArray[j]);
                    }
                }
                while (myArray[j].getExerciseName().isEmpty());
                if (myArray[j].getPosition().equals("FLOOR"))
                {
                    System.out.println(myArray[j]);
                }
            }

            IntervalWorkOut iw=new IntervalWorkOut("PUSH UP","PLANK","SQUAT",4,30,1);
            System.out.println("*******************************************"+"\n"+"INTERVAL WORKOUT STARTS"+"\n"+"*******************************************");
            for(int z=1;z<5;z++)
            {
                iw.setRound(z);
                System.out.println(iw);
            }
            System.out.println("*******************************************"+"\n"+"CONGRATULATION YOU ARE DONE"+"\n"+"*******************************************");
        }
    }
