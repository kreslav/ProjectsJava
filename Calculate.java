class Calculate {

    public static void main(String[] args) {

        int var1 = 10;
        int var2 = 20;
        double varD1 = 30.5;
        double varD2 = 40.5;

        int result1 = var1 + var2;
        System.out.println("Rezultat slogeniya = " + result1);
        int result2 = var1 - var2;
        System.out.println("Rezultat vychitaniya = " + result2);
        double result3 = varD1 * varD2;
        System.out.println("Rezultat umnogheniya =" + result3);
        double result4 = varD2 / varD1;
        System.out.println("Rezultat deleniya" + result4);

        int varArgs = Integer.valueOf(args[0]);
        varArgs *= varArgs;
        int result5 = varArgs;
        System.out.println("Rezultat vozvedeniya chisla vvedennogo c konsoli = " + result5);

    }

}