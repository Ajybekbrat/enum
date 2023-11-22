
    import java.util.Scanner;

    public enum TransportType {

        CAR {
            @Override
            public double calculateTravelCost() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("   CAR:");
                System.out.print("Enter how many kilometers" +
                        "  0.1$ FOR 1 kilometer: ");

                double car = 0.1;
                int car2 = scanner.nextInt();

                long ress = (long) (car * car2);

                System.out.println("for "+car2+" kilometers you need "+ress+"$");
                return ress;




            }
        },
        BUS {
            @Override
            public double calculateTravelCost() {
                Scanner scanner = new Scanner(System.in);
                System.out.println(   "   BUS:");
                System.out.print("Enter how many kilometers" +
                        "   0.2$ FOR 1 kilometer: ");
                double car = 0.2;
                int car2 = scanner.nextInt();
                long ress = (long) (car * car2);
                System.out.println("for "+car2+" kilometers you need "+ress+"$");
                return ress;

            }
        },

        TRUCK {
            @Override
            public double calculateTravelCost() {
                Scanner scanner = new Scanner(System.in);
                System.out.println("   TRUCK:");
                System.out.print("Enter how many kilometers" +
                        "   0.5$ for 1 kilometer: ");
                double car = 0.5;
                long car2 = scanner.nextLong();
                long ress = (long) (car * car2);
                System.out.println("for "+car2+" kilometers you need "+ress+"$");
                return ress;

            }
        };
        public abstract double calculateTravelCost();
    }

