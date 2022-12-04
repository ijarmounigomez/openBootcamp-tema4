public class Main {
    public static void main(String[] args) {
        int numerolf = -123;
        int numeroWhile = 2;
        String estacion = "Verano";

        // IF condition
        if (numerolf < 0 || numerolf >= 0) {
            System.out.println("This is what numerolf is equal to: " + numerolf);
        };

        //WHILE loop
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println(numeroWhile);
        }

        // DO WHILE loop
        do {
            numeroWhile++;
            System.out.println(numeroWhile);
        }
        while (numeroWhile < 3);

        // FOR loop
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        //SWITCH case

        switch (estacion) {
            case "Primavera":
            System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("El valor tiene que ser una estación del año");
        }

        System.out.println("Hello world!");
    }
}