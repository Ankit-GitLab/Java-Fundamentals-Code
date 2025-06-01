package ControlStatement_Math_String.CHALLENGE;

class DiceRoll {

    // Method to return a random number between 1 and 6
    int roll() {
        //Adds 1 → final result is a random integer from 1 to 6 ✅
        return (int)(Math.random() * 6) + 1;
    }

    public static void main(String[] args) {
        DiceRoll dice = new DiceRoll();
        System.out.println("🎲 Rolling the dice 10 times:");
        for (int i = 0; i < 10; i++) {
            System.out.print(dice.roll() + " ");
        }
    }
}
