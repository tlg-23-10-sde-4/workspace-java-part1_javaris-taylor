class TelevisionValidationTest {
    /*
     * Error validation client
     */
    public static void main(String[] args) {
        // create the tv Object to test
        Television tvTest = new Television();
        // test the volume input validation
        tvTest.setVolume(0);
        tvTest.setBrand("Insignia");
        System.out.println(tvTest);
        tvTest.setBrand("Sony");
        tvTest.setVolume(100);
        System.out.println(tvTest);
        tvTest.setBrand("Bloop");
        tvTest.setVolume(-1);           // test the lower limit
        System.out.println(tvTest);
        tvTest.setBrand("Bop");
        tvTest.setVolume(101);          // test the upper limit
        System.out.println(tvTest);

    }
}