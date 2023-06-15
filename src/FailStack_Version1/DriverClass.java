//--------------------------------------------------------
// Very and I mean very bare-bones version of this program.
// This first version is just for figuring out the percent
// chance threshold for successfully upgrading gear and
// unsuccessfully upgrading gear. This program only has
// a random number generator and a conditional expression
// for trying to reach a successful upgrade.
//-------------------------------------------------------


package FailStack_Version1;

import java.util.Random;

public class DriverClass {
    public static void main(String[] args) {
        Random rand = new Random();
        double chance = rand.nextDouble(0, 100);

        System.out.printf("Percent chance of an upgrade: %.2f%%\n\n", chance);

        double yourChance = rand.nextDouble(0, 100);

        if (yourChance <= chance){
            System.out.printf("Upgrade successful. Your value was %.2f%%", yourChance);
        }
        else {
            System.out.printf("Upgrade failed. Your value was %.2f%%", yourChance);
        }


    }
}
