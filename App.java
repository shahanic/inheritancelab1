public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Wizards and Warlocks");

        /**
         * Create a Wizard Class and Warlock Class which Inherits the Properties of Character Class.
         * eg. Wizard.java, Warlock.java
         * Create a which Inherits the Properties of Character Class.
         * Each of the above mentioned Classes should have the following:
         * 1 - 2 Damage Spells(you are free to name it)
         * - each method/spell should invoke the damageTarget method from Character
         * and has its corresponding mana cost and damage points
         * 2 - 1 Recover spell(you are free to name it) that will increase both HP and Mana Points
         *
         */

        /**
         * Create a Sequence of each Character Created Casting Spells until one of the Characters Created gets defeated.
         *
         * The sequence should contain the following:
         * 1 - Damaging the Opposing Character.
         * 2 - Both Characters will Damage each other.
         * 3 - At least one of the Characters should cast a "recover" spell that adds HP and MP of the caster.
         * 4 - "Recover spell" has no Mana Point Cost
         * 5 - Either the Warlock/Wizard should be defeated at the end of the Sequence.
         * 6 - The winner will have their level increased by 10 (Create a Method In Character.java that increases level)
         * 7 - Display the Details of each Character at each "phase/turn" to see the current status of the Characters
         *      - Create a method to display details for better readability
         */

        Wizard Merlin = new Wizard("Merlin");
        Warlock Saruman = new Warlock("Saruman");

        Merlin.displayCharName();
        Saruman.displayCharName();

        System.out.println("FIGHT!\n");

        //turn 1
        Saruman.scarletRot(Merlin);//Merlin HP deducted
        Merlin.thunderBolt(Saruman);//Saruman HP deducted

            System.out.println("\nDisplaying Stats: ");
            //Display both of their stats
            Merlin.displayStatus();
            Saruman.displayStatus();

        //turn 2
        Saruman.frostBite(Merlin); // Merlin HP deducted
        Merlin.fireStorm(Saruman);  //Merlin HP and MP increases

            System.out.println("\nDisplaying Stats: ");
            //Display both of their stats
            Merlin.displayStatus();
            Saruman.displayStatus();
        //turn 3
        Saruman.heal();// Saruman healed
        Merlin.thunderBolt(Saruman);

            System.out.println("\nDisplaying Stats: ");
            //Display both of their stats
            Merlin.displayStatus();
            Saruman.displayStatus();

        //turn 4
        Saruman.scarletRot(Merlin); //Merlin HP deducted -- Merlin is now defeated
            System.out.println("\nDisplaying Stats: ");
        //Display both of their stats
        Merlin.displayStatus();
        Saruman.displayStatus();

    }
}
