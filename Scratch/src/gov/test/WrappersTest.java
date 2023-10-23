package gov.test;

class WrappersTest {
    public static void main(String[] args) {
        // Int Wrapper
        String ageInput = "30"; // take a string input
        // normal int
        int age = Integer.parseInt("30");
        System.out.println("You input: " + ageInput);
        System.out.println("So I made the int: " + age);


        // Int
        Integer ageInteger = Integer.valueOf(ageInput);

        // Long wrapper
        String brainCellsInput = "86000000000";
        // normal
        long brainCells = Long.parseLong((brainCellsInput));
        //Long
        Long brainCellsLong = Long.valueOf(brainCellsInput);

        // Double Wrapper
        String shoeSizeInput = "9.5";
        double shoeSize = Double.parseDouble(shoeSizeInput);
        Double shoeSizeDouble = Double.valueOf(shoeSizeInput);

        // Boolean Wrapper
        String sunnyInput = "true";
        boolean sunny = Boolean.parseBoolean(sunnyInput);
        Boolean sunnyBoolean = Boolean.valueOf(sunnyInput);

        Integer bigInt = 9;

        int primInt = 5;

    }
}