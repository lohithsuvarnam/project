import java.util.*;

class BusBookingSystem {
    static Scanner sc = new Scanner(System.in);


    static String[] apCities = {"Visakhapatnam", "Vijayawada", "Tirupati", "Rajahmundry", "Kakinada"};
    static String[] tgCities = {"Warangal", "Khammam", "Nizamabad", "Karimnagar"};

    
    static Map<String, Integer> cityDistanceMap = new HashMap<>();

    static {
        cityDistanceMap.put("Visakhapatnam-Hyderabad", 700);
        cityDistanceMap.put("Vijayawada-Hyderabad", 350);
        cityDistanceMap.put("Tirupati-Hyderabad", 150);
        cityDistanceMap.put("Rajahmundry-Hyderabad", 400);
        cityDistanceMap.put("Kakinada-Hyderabad", 450);
        cityDistanceMap.put("Warangal-Hyderabad", 150);
        cityDistanceMap.put("Khammam-Hyderabad", 200);
        cityDistanceMap.put("Nizamabad-Hyderabad", 150);
        cityDistanceMap.put("Karimnagar-Hyderabad", 160);
    }

    
    static double calculatePrice(int distance, String seatType) {
        int pricePerKm = 0;

        switch (seatType.toLowerCase()) {
            case "seater":
                pricePerKm = 10;
                break;
            case "semi sleeper":
                pricePerKm = 15;
                break;
            case "sleeper":
                pricePerKm = 20;
                break;
            default:
                System.out.println("Invalid seat type!");
                return 0;
        }

        double basePrice = distance * pricePerKm;
        double gst = basePrice * 0.18; 
        double sgst = basePrice * 0.09; 
        double totalPrice = basePrice + gst + sgst;
        return totalPrice;
    }


    static double applyDiscount(double totalPrice, String platform) {
        double discount = 0;

        switch (platform.toLowerCase()) {
            case "paytm":
                discount = 0.05;
                break;
            case "redbus":
                discount = 0.07; 
                break;
            case "phonepay":
                discount = 0.03; 
                break;
            case "apstrc":
                discount = 0.02;
                break;
            case "tsrtc":
                discount = 0.04; 
                break;
            default:
                System.out.println("No discount available for this platform.");
                return totalPrice;
        }

        return totalPrice - (totalPrice * discount);
    }

    
    static void bookTicket() {
        System.out.println("\u001B[32mWelcome to the Bus Booking System!\u001B[0m");


        System.out.println("\n\u001B[33mSelect a booking platform:\u001B[0m");
        System.out.println("\u001B[34m1. Paytm\u001B[0m");
        System.out.println("\u001B[34m2. PhonePay\u001B[0m");
        System.out.println("\u001B[34m3. RedBus\u001B[0m");
        System.out.println("\u001B[34m4. APSTRC\u001B[0m");
        System.out.println("\u001B[34m5. TSRTC\u001B[0m");


        System.out.print("\n\u001B[36mChoose a booking platform (1-5): \u001B[0m");
        int platformChoice = sc.nextInt();
        String platform = "";
        switch (platformChoice) {
            case 1:
                platform = "Paytm";
                break;
            case 2:
                platform = "PhonePay";
                break;
            case 3:
                platform = "RedBus";
                break;
            case 4:
                platform = "APSTRC";
                break;
            case 5:
                platform = "TSRTC";
                break;
            default:
                System.out.println("Invalid platform selection.");
                return;
        }


        System.out.println("\n\u001B[33mSelect a pickup city from the following options:\u001B[0m");

        System.out.println("\n\u001B[35mAndhra Pradesh Cities:\u001B[0m");
        for (int i = 0; i < apCities.length; i++) {
            System.out.println((i + 1) + ". " + apCities[i]);
        }

        System.out.println("\n\u001B[35mTelangana Cities:\u001B[0m");
        for (int i = 0; i < tgCities.length; i++) {
            System.out.println((i + 1 + apCities.length) + ". " + tgCities[i]);
        }

        System.out.print("\n\u001B[36mChoose a pickup city (1-" + (apCities.length + tgCities.length) + "): \u001B[0m");
        int cityChoice = sc.nextInt();
        String pickupCity = "";

        if (cityChoice >= 1 && cityChoice <= apCities.length) {
            pickupCity = apCities[cityChoice - 1];
        } else if (cityChoice > apCities.length && cityChoice <= (apCities.length + tgCities.length)) {
            pickupCity = tgCities[cityChoice - apCities.length - 1]; 
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        System.out.println("\n\u001B[33mSelect a seating type: (Seater / Semi Sleeper / Sleeper)\u001B[0m");
        String seatType = sc.next();

        
        System.out.print("\n\u001B[36mEnter the number of passengers: \u001B[0m");
        int numPassengers = sc.nextInt();
        if (numPassengers <= 0) {
            System.out.println("\u001B[31mInvalid number of passengers! Please enter a positive number.\u001B[0m");
            return;
        }


        String[] hyderabadLocations = {"Madhapur", "Ameerpet", "Kukatpally", "Banjara Hills", "Hi-tech City", 
                                        "Gachibowli", "Somajiguda", "Secunderabad"};
        String[] dropCities = new String[numPassengers];
        System.out.println("\n\u001B[33mSelect drop locations within Hyderabad for each passenger:\u001B[0m");
        for (int i = 0; i < numPassengers; i++) {
            System.out.println("\n\u001B[35mPassenger " + (i + 1) + ":\u001B[0m");
            for (int j = 0; j < hyderabadLocations.length; j++) {
                System.out.println((j + 1) + ". " + hyderabadLocations[j]);
            }
            System.out.print("\n\u001B[36mChoose a drop city (1-8): \u001B[0m");
            int dropChoice = sc.nextInt();
            dropCities[i] = hyderabadLocations[dropChoice - 1];
        }

        String routeKey = pickupCity + "-Hyderabad";
        if (cityDistanceMap.containsKey(routeKey)) {
            int distance = cityDistanceMap.get(routeKey);

            double totalPrice = 0;

            for (int i = 0; i < numPassengers; i++) {
                
                double pricePerPassenger = calculatePrice(distance, seatType);
                
                
                pricePerPassenger = applyDiscount(pricePerPassenger, platform);

                totalPrice += pricePerPassenger;


                System.out.println("\n\u001B[32mThe price for Passenger " + (i + 1) + " traveling from " +
                        pickupCity + " to " + dropCities[i] + " with " + seatType + " seat is: " + pricePerPassenger + " INR\u001B[0m");
            }


            System.out.println("\n\u001B[32mThe total price for " + numPassengers + " passenger(s) is: " + totalPrice + " INR\u001B[0m");
        } else {
            System.out.println("\u001B[31mInvalid route selected. Please choose a valid route.\u001B[0m");
        }
    }

    public static void main(String[] args) {
        bookTicket();
    }
}