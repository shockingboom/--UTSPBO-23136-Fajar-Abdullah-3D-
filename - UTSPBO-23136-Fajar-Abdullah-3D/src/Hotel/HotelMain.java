package Hotel;

import UserHotel.HotelAdmin;
import UserHotel.Customer;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        HotelAdmin hotelAdmin = new HotelAdmin();
        Customer hotelCustomer = new Customer(hotelAdmin);
        boolean isRunning = true;
        boolean isAdminMode = true; // Default mode is admin mode

        while (isRunning) {
            if (isAdminMode) {
                System.out.println("\n=== Admin Mode ===");
                System.out.println("1. Check Room Availability");
                System.out.println("2. Add New Room");
                System.out.println("3. Switch to Customer Mode");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");

                int option = inputScanner.nextInt();
                inputScanner.nextLine(); // Clear the newline

                switch (option) {
                    case 1:
                        hotelAdmin.checkRoomAvailability();
                        break;
                    case 2:
                        System.out.print("Enter Room ID: ");
                        int roomId = inputScanner.nextInt();
                        inputScanner.nextLine(); // Clear the newline
                        System.out.print("Enter Room Type: ");
                        String roomType = inputScanner.nextLine();
                        hotelAdmin.addRoom(roomId, roomType);
                        break;
                    case 3:
                        isAdminMode = false;
                        break;
                    case 4:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option! Please choose a valid option.");
                }
            } else {
                System.out.println("\n=== Customer Mode ===");
                System.out.println("1. View Booking Details");
                System.out.println("2. Make a Reservation");
                System.out.println("3. Switch to Admin Mode");
                System.out.println("4. Exit");
                System.out.print("Select an option: ");

                int option = inputScanner.nextInt();
                inputScanner.nextLine(); 

                switch (option) {
                    case 1:
                        hotelCustomer.viewBookingDetails();
                        break;
                    case 2:
                        System.out.print("Enter Reservation ID: ");
                        int reservationId = inputScanner.nextInt();
                        System.out.print("Enter Room ID: ");
                        int roomId = inputScanner.nextInt();
                        inputScanner.nextLine();
                        System.out.print("Enter Customer Name: ");
                        String customerName = inputScanner.nextLine();
                        System.out.print("Enter Check-in Date: ");
                        String checkInDate = inputScanner.nextLine();
                        System.out.print("Enter Check-out Date: ");
                        String checkOutDate = inputScanner.nextLine();
                        hotelCustomer.reserveRoom(reservationId, roomId, customerName, checkInDate, checkOutDate);
                        break;
                    case 3:
                        isAdminMode = true;
                        break;
                    case 4:
                        isRunning = false;
                        break;
                    default:
                        System.out.println("Invalid option! Please choose a valid option.");
                }
            }
        }

        System.out.println("Thank you for using the hotel reservation system!");
        inputScanner.close();
    }
}
