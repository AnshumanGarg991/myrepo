import java.util.*;

public class OldBookStore2 {
    // Book information
    static ArrayList<String> bName = new ArrayList<>();
    static ArrayList<Integer> bID = new ArrayList<>();
    ArrayList<Integer> quan = new ArrayList<>();
    ArrayList<Float> bPrice = new ArrayList<>();
    ArrayList<String> loc = new ArrayList<>();

    public OldBookStore2() {
        // Book info
        bName = new ArrayList<>(Arrays.asList("Book1", "Book2", "Book3", "Book4", "Book5"));
        bID = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        quan = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        bPrice = new ArrayList<>(Arrays.asList(100.0f, 200.0f, 300.0f, 400.0f, 500.0f));
        loc = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore"));
        // Customer info
        cName = new ArrayList<>(Arrays.asList("Cust1", "Cust2", "Cust3", "Cust4", "Cust5"));
        cMobNo = new ArrayList<>(Arrays.asList("1111111111", "2222222222", "3333333333", "4444444444", "5555555555"));
        cLoc = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore"));
        // Seller info
        sLoc = new ArrayList<>(Arrays.asList("Seller1", "Seller2", "Seller3", "Seller4", "Seller5"));
        sMobNo = new ArrayList<>(Arrays.asList("6666666666", "7777777777", "8888888888", "9999999999", "1010101010"));
        sName = new ArrayList<>(Arrays.asList("Seller1", "Seller2", "Seller3", "Seller4", "Seller5"));
        sCity = new ArrayList<>(Arrays.asList("Delhi", "Mumbai", "Kolkata", "Chennai", "Bangalore"));
        // Suggestions
        sug = new ArrayList<>(Arrays.asList("Sug1", "Sug2", "Sug3", "Sug4", "Sug5"));
        // Admin info
        // daName = new ArrayList<>(Arrays.asList("Admin1", "Admin2", "Admin3",
        // "Admin4", "Admin5"));
        daUserId = new ArrayList<>(Arrays.asList("admin1", "admin2", "admin3", "admin4", "admin5"));
        // Admin password
        daPass = new ArrayList<>(Arrays.asList("pass1", "pass2", "pass3", "pass4", "pass5"));
        // Purchase history
        buyerName = new ArrayList<>(Arrays.asList("Buyer1", "Buyer2", "Buyer3", "Buyer4", "Buyer5"));
        buyerAddress = new ArrayList<>(Arrays.asList("Addr1", "Addr2", "Addr3", "Addr4", "Addr5"));
        buyerMob = new ArrayList<>(Arrays.asList("1111111111", "2222222222", "3333333333", "4444444444", "5555555555"));

    }

    // Customer data (mobile numbers as String)
    static ArrayList<String> cName = new ArrayList<>();
    static ArrayList<String> cMobNo = new ArrayList<>();
    static ArrayList<String> cLoc = new ArrayList<>();

    // Seller data
    ArrayList<String> sLoc = new ArrayList<>();
    ArrayList<String> sMobNo = new ArrayList<>();
    ArrayList<String> sName = new ArrayList<>();
    ArrayList<String> sCity = new ArrayList<>();

    // Suggestions / Reviews
    ArrayList<String> sug = new ArrayList<>();

    // Data administrator data
    // ArrayList<String> daName = new ArrayList<>();
    ArrayList<String> daUserId = new ArrayList<>();
    private ArrayList<String> daPass = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // View book list
    void viewBookList() {
        System.out.println("Book Name     Book Id       Book Price       Book Quantity");
        if (bName.isEmpty()) {
            System.out.println("There are no currently available books.");
            return;
        }
        for (int i = 0; i < bName.size(); i++) {
            System.out.println(
                    bName.get(i) + "         " + bID.get(i) + "               " + bPrice.get(i) + "             "
                            + quan.get(i));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        userType();

    }

    // View seller list (using seller list size)
    void viewSellerList() {
        System.out.println("Seller Name     Seller Address       Seller City       Seller Mobile Number");
        if (sName.isEmpty()) {
            System.out.println("There are no currently available sellers.");
        }
        for (int i = 0; i < sName.size(); i++) {
            System.out.println(
                    sName.get(i) + "          " + sLoc.get(i) + "                 " + sCity.get(i) + "            "
                            + sMobNo.get(i));
        }
        // After viewing seller list, return to data admin menu
        System.out.println("Please, enter your next choice:");
        int x = sc.nextInt();
        sc.nextLine();
        switch (x) {
            case 1 -> viewReviewSuggestions();
            case 2 -> viewSellerList();
            case 3 -> viewCustomerList();
            case 4 -> viewPurchaseHistory();
            case 5 -> printLocation();
            case 7 -> daLoginPage();
            case 8 -> {
                return;
            }
            case 6 -> viewBookList();
            default -> {
                System.out.println("Invalid input, please try again.");
                dataAdminTable();
            }
        }
    }

    // View suggestions/reviews (iterate over sug.size())
    void viewReviewSuggestions() {
        System.out.println("Suggestions/Review list:");
        if (sug.isEmpty()) {
            System.out.println("There are no currently available suggestions/reviews.");
            return;
        }
        for (int i = 0; i < sug.size(); i++) {
            System.out.println(i + ". " + sug.get(i));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("-----------------------------");
        System.out.println("Please, enter your next choice:");
        try {
            int x = sc.nextInt();
            sc.nextLine();
            switch (x) {
                case 1 -> viewReviewSuggestions();
                case 2 -> viewSellerList();
                case 3 -> viewCustomerList();
                case 4 -> viewPurchaseHistory();
                case 5 -> printLocation();
                case 7 -> daLoginPage();
                case 8 -> {
                    return;
                }
                case 6 -> viewBookList();
                default -> {
                    System.out.println("Invalid input, please try again.");
                    dataAdminTable();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            viewReviewSuggestions();
        }
    }

    // View data administrator details (iterate over daName)

    // Main menu: choose user type
    void userType() {
        try {
            System.out.println("-----User Type-----");
            System.out.println("1. Customer");
            System.out.println("2. Seller");
            System.out.println("3. Data administrator");
            System.out.println("4. Exit");
            int x = sc.nextInt();
            sc.nextLine(); // consume the newline
            switch (x) {
                case 1 -> cLoginPage();
                case 2 -> sLoginPage();
                case 3 -> daLoginPage();
                case 4 -> {
                    System.out.println("Exiting... Thank you.");
                    return;
                }
                default -> {
                    System.out.println("Invalid input.\nPlease select the correct user type:");
                    userType();
                }
            }
        } catch (Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
        }

    }

    // Customer login/registration page
    void cLoginPage() {
        System.out.println("------Customer Login Page-----");
        System.out.println("01. Login (using Mobile Number)");
        System.out.println("02. Register");
        System.out.println("03. Go back");
        System.out.println("04. Exit");
        int x = sc.nextInt();
        sc.nextLine();
        switch (x) {
            case 1 -> {
                System.out.println("Enter your mobile number:");
                String mob = sc.nextLine();
                int index = cMobNo.indexOf(mob);
                if (index == -1) {
                    System.out.println("Sorry, the mobile number entered was not found.");
                    System.out.println("Please register if you are a new customer.");
                    cLoginPage();
                } else {
                    String name = cName.get(index);
                    System.out.println("--------------------------------------");
                    System.out.println("Welcome " + name + " to the Old Book Store:");
                    System.out.println();
                    System.out.println("Please select your next choice:");
                    customerTable();
                }
            }
            case 2 -> {
                try {
                    System.out.println("Please enter your customer name:");
                    String name = sc.nextLine();
                    System.out.println("Please enter your mobile number:");
                    String mob1 = sc.nextLine();
                    System.out.println("Please enter your location:");
                    String location = sc.nextLine();
                    int attempts = 0;
                    System.out.println("Enter the OTP sent to your mobile number (any 6-digit number):");
                    int otp = sc.nextInt();
                    do {
                        attempts++;
                        if (String.valueOf(otp).length() != 6) {
                            System.out.println("invalid OTP.");
                            if (attempts == 2) {
                                System.out.println("Maximum attempts reached. Please try again later.");
                                System.out.println("Returning to the main menu.");
                                return;
                            }
                        } else {
                            System.out.println("Thanks for registering as our new customer.");
                            cName.add(name);
                            cMobNo.add(mob1);
                            cLoc.add(location);
                            break;
                        }
                        System.out.println("Please enter the OTP again:");
                        otp = sc.nextInt();
                        sc.nextLine();
                    } while (String.valueOf(otp).length() != 6 && attempts < 2);
                    // System.out.println("Please select your next choice:");
                    // customerTable();
                    return;
                } catch (Exception e) {
                    System.out.println("Error occurred: " + e.getMessage());
                    cLoginPage();
                }
            }

            case 3 -> userType();
            case 4 -> {
                return;
            }
            default -> {
                System.out.println("Please enter a valid input.");
                cLoginPage();
            }
        }
    }

    // Seller login/registration page
    void sLoginPage() {
        System.out.println("------Seller Login Page-----");
        System.out.println("01. Login (using Mobile Number)");
        System.out.println("02. Register");
        System.out.println("03. Go back");
        System.out.println("04. Exit");
        int x = sc.nextInt();
        sc.nextLine();
        switch (x) {
            case 1 -> {
                System.out.println("Enter your mobile number:");
                String mob = sc.nextLine();
                if (sMobNo.contains(mob)) {
                    sLoginTable();
                } else {
                    System.out.println("Wrong credentials entered.");
                    sLoginPage();
                }
            }
            case 2 -> registerAsNewSeller();
            case 3 -> userType();
            case 4 -> {
                return;
            }
            default -> {
                System.out.println("Invalid input.");
                sLoginPage();
            }
        }
    }

    // Data administrator login page
    void daLoginPage() {
        System.out.println("Enter the data-admin login-id:");
        String loginId = sc.next();
        sc.nextLine();
        if (daUserId.indexOf(loginId) == -1) {
            System.out.println("Incorrect login-id. Please try again.");
            daLoginPage();
            return;
        }

        System.out.println("Enter password:");
        String password = sc.nextLine();
        if (daPass.contains(password)) {
            dataAdminTable();
        } else {
            System.out.println("Incorrect password. Please try again.");
            daLoginPage();

        }
    }

    // Data administrator operations menu
    void dataAdminTable() {
        System.out.println("-----Data admin menu:-----");
        System.out.println("01. View feedback");
        System.out.println("02. View seller list");
        System.out.println("03. View customer list");
        System.out.println("04. View purchase history");
        System.out.println("05. View available locations");
        System.out.println("06. View available books");
        System.out.println("07. Logout");
        System.out.println("08. Exit");

        int x = sc.nextInt();
        sc.nextLine();
        switch (x) {
            case 1 -> viewReviewSuggestions();
            case 2 -> viewSellerList();
            case 3 -> viewCustomerList();
            case 4 -> viewPurchaseHistory();
            case 5 -> printLocation();
            case 7 -> daLoginPage();
            case 8 -> {
                return;
            }
            case 6 -> viewBookList();
            default -> {
                System.out.println("Invalid input, please try again.");
                dataAdminTable();
            }
        }
    }

    // Seller menu
    void sLoginTable() {
        System.out.println("------Seller Menu-----");
        System.out.println("1. Sell a book");
        System.out.println("2. Add a book");
        System.out.println("3. Give feedback/suggestions");
        // System.out.println(". Exit");
        System.out.println("4. Check available locations");
        System.out.println("5. Add a new location");
        System.out.println("6. View available books");
        System.out.println("7. Go back");
        System.out.println("8. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> {
                System.out.println("Please enter the book name:");
                String name = sc.nextLine();
                System.out.println("Please enter the book quantity:");
                int quantity = sc.nextInt();
                System.out.println("Congratulations on selling the book.");
                sLoginTable();
            }
            case 2 -> {
                System.out.println("Please enter the book name:");
                String name = sc.nextLine();
                System.out.println("Please enter the book ID:");
                int id = sc.nextInt();
                System.out.println("Please enter the book quantity:");
                int quantity = sc.nextInt();
                System.out.println("Please enter the book price:");
                float price = sc.nextFloat();
                addNewBook(name, id, quantity, price);
                System.out.println("The book has been added to the store.");
                sLoginTable();
            }
            case 3 -> {
                System.out.println("Please enter your feedback/suggestions:");
                String feedback = sc.nextLine();
                sug.add(feedback);
                System.out.println("Thank you for the feedback.");
                sLoginTable();
            }
            case 4 -> printLocation();
            case 5 -> addNewLocation();
            case 6 -> viewBookList();
            case 7 -> {
                userType();
            }
            case 8 -> {
                return;
            }
            default -> {
                System.out.println("Invalid input.");
                sLoginTable();
            }
        }
    }

    // Customer menu
    void customerTable() {
        System.out.println("------Customer Menu-----");
        System.out.println("1. Sell books");
        System.out.println("2. Buy books");
        System.out.println("3. Give books for donation");
        System.out.println("4. Give feedback/suggestions");
        System.out.println("5. Return");
        System.out.println("6. Exit");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1 -> sellABook();
            case 2 -> purchaseABook();
            case 3 -> {
                System.out.println("Please enter the book name:");
                String name = sc.nextLine();

                System.out.println("Please enter the quantity of the books to be donated:");
                int quantity = sc.nextInt();
                sc.nextLine();
                addNewBook(name, 256, quantity, 0);
                System.out.println("The book will be picked up in next 2 days.");
                // System.out.println("Thank you for your donation.");
                userType();
            }
            case 4 -> {
                System.out.println("Please enter your feedback/suggestions:");
                // String feedback = sc.nextLine();
                sug.add(sc.nextLine());
                // System.out.println("-----------------------------");
                System.out.println("Thank you for providing your valuable feedback.");
                System.out.println();
                customerTable();
            }
            case 5 -> {
                userType();
            }
            case 6 -> {
                return;
            }
            default -> {
                System.out.println("Invalid input.");
                customerTable();
            }
        }
    }

    // Check seller by mobile number (returns index)

    // Check customer by mobile number

    // Register as new seller
    void registerAsNewSeller() {
        System.out.println("Please, enter your name:");
        String name = sc.nextLine();
        System.out.println("Complete address:");
        String addr = sc.nextLine();
        System.out.println("City name:");
        String city = sc.nextLine();
        System.out.println("Mobile Number(10 digit only):");
        String mNo = sc.nextLine();
        if (mNo.length() != 10) {
            System.out.println("Invalid mobile number.");
            return;
        }
        System.out.println("OTP(any 6-digit number):");
        int otp = sc.nextInt();

        int attempts = 0;
        while (String.valueOf(otp).length() != 6 && attempts < 2) {
            attempts++;
            if (attempts == 2) {
                System.out.println("invalid OTP. Maximum attempts reached.");
                return;
            }
            System.out.println("invalid OTP. Please enter the OTP again or press 1 to opt out:");
            otp = sc.nextInt();
            sc.nextLine();
        }
        System.out.println("Congratulations, " + name + ", for becoming becoming our new seller.");
        sLoc.add(addr);
        sName.add(name);
        sMobNo.add(mNo);
        sCity.add(city);
        if (!loc.contains(city)) {
            loc.add(city);
        }
        sLoginTable();
    }

    // Register as new customer

    // View customer list
    void viewCustomerList() {
        System.out.println("Customer name          Customer Address            Customer Mobile Number");
        if (cName.isEmpty()) {
            System.out.println("The customer list is empty.");
        }
        for (int i = 0; i < cName.size(); i++) {
            System.out.println(
                    cName.get(i) + "                      " + cLoc.get(i) + "                       " + cMobNo.get(i));
        }
        System.out.println("Please, enter your next choice:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        try {
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> viewReviewSuggestions();
                case 2 -> viewSellerList();
                case 3 -> viewCustomerList();
                case 4 -> viewPurchaseHistory();
                case 5 -> printLocation();
                case 7 -> daLoginPage();
                case 8 -> {
                    return;
                }
                case 6 -> viewBookList();
                default -> {
                    System.out.println("Invalid input, please try again.");
                    dataAdminTable();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            dataAdminTable();
        }
    }

    // Add new location
    void addNewLocation() {
        // sc.nextLine();
        System.out.println("Please, enter your city:");
        String city = sc.nextLine();
        System.out.println("Please, enter your address:");
        String addr = sc.nextLine();
        
        loc.add(addr);
        // sLoc.add(addr);
        // sName.add(name);
        // sMobNo.add(mNo);
        sCity.add(city);
        System.out.println("--------------------------------------------------");
        System.out.println("Your location has been added to the list.");
        System.out.println("--------------------------------------------------");
        System.out.println("Returning to the main menu.");
        userType();
    }

    // Print available locations
    void printLocation() {
        System.out.println("---------Available locations:----------");
        for (int i = 0; i < loc.size(); i++) {
            System.out.println((i + 1) + ". " + loc.get(i));
        }
        System.out.println(
                "If your location is not available then press 0:");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        try {
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 0) {
                addNewLocation();
            } else {
                userType();
            }
        } catch (Exception e) {
            System.out.println("-----------------------------");
            System.out.println("Invalid input.");
            // printLocation();
        }

    }

    // Add new book (using passed parameters)
    void addNewBook(String bookName, int bookID, int quantity, float price) {
        int index = bID.indexOf(bookID);
        if (index == -1) {
            bName.add(bookName);
            bID.add(bookID);
            quan.add(quantity);
            bPrice.add(price);
        } else {
            quan.set(index, quan.get(index) + quantity);
        }
        // System.out.println("The book will be picked from your location in next 2
        // days.");
    }

    // Interactive method to add a new book

    // Add another book (if not already present)

    // Purchase history arrays
    ArrayList<String> buyerName = new ArrayList<>();
    ArrayList<String> buyerAddress = new ArrayList<>();
    ArrayList<String> buyerMob = new ArrayList<>();

    // View purchase history
    void viewPurchaseHistory() {
        System.out.println("Buyer name            Buyer Address                Buyer Mobile Number");
        if (buyerName.isEmpty()) {
            System.out.println("The book purchase list is empty.");
        }
        for (int i = 0; i < buyerName.size(); i++) {
            System.out.println(buyerName.get(i) + "                    " + buyerAddress.get(i) + "                    "
                    + buyerMob.get(i));
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
        try {
            System.out.println("Please, enter your next choice:");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 -> viewReviewSuggestions();
                case 2 -> viewSellerList();
                case 3 -> viewCustomerList();
                case 4 -> viewPurchaseHistory();
                case 5 -> printLocation();
                case 7 -> {
                    System.out.println("Returning to the main menu.");
                    userType();
                }
                case 8 -> {
                    return;
                }
                case 6 -> viewBookList();
                default -> {
                    System.out.println("Invalid input, please try again.");
                    dataAdminTable();
                }
            }
        } catch (Exception e) {
            System.out.println("Invalid input.");
            dataAdminTable();
        }
    }

    // Purchase a book
    void purchaseABook() {
        System.out.println("Enter the book name:");
        String Bname = sc.nextLine();
        System.out.println("Enter the purchase quantity:");
        int Quan = sc.nextInt();
        sc.nextLine();
        int index = bName.indexOf(Bname);
        if (index >= 0) {
            if (quan.get(index) >= Quan) {
                System.out.println("Please, enter your name:");
                String Byname = sc.nextLine();
                System.out.println("Please, enter your address:");
                String add = sc.nextLine();
                System.out.println("Please, enter your mobile number:");
                String mNo = sc.nextLine();
                buyerName.add(Byname);
                buyerAddress.add(add);
                buyerMob.add(mNo);
                System.out.println(
                        "The book will be delivered within the next 2 days.");
                System.out.println(
                        "Thanks for using our services.");
                quan.set(index, quan.get(index) - Quan);
            } else {
                System.out.println("The current book quantity is insufficient.");
            }
        } else {
            System.out.println("The provided book name is not present in the store.");
        }
        userType();

    }

    // Sell a book
    void sellABook() {
        System.out.println("Enter the book name:");
        String bookName = sc.nextLine();
        System.out.println("Enter the book quantity:");
        sc.nextInt();
        // Optionally, if book not found, you might add it:
        // if(i == -1){ addNewBook(...); } else { ... }
        System.out.println("Please select your location:");
        System.out.println("------------Available Locations-----------------");
        for (int i = 0; i < loc.size(); i++) {
            System.out.println((i + 1) + ". " + loc.get(i));
        }
        System.out.println("If your location is not available in the given list then press 0:");
        int choice = sc.nextInt();
        if (choice > 0 && choice <= loc.size()) {
            // System.out.println("Please, enter your name:");

            System.out.println("Please, enter the pick-up address:");
            sc.nextLine();
            String addr = sc.nextLine();
            System.out.println("Please, enter your mobile number:");
            Long mNo = sc.nextLong();
            if (mNo.toString().length() != 10) {
                System.out.println("Invalid mobile number.");
                return;
            }

            System.out.println("Please, enter the OTP sent to your mobile number (any 6-digit number):");
            int otp = sc.nextInt();
            int attempts = 0;
            while (String.valueOf(otp).length() != 6 && attempts < 2) {
                attempts++;
                System.out.println("OTP not valid. Please enter the OTP again or press 1 to opt out:");
                otp = sc.nextInt();
                sc.nextLine();
                if (String.valueOf(otp).length() == 1 && String.valueOf(otp).charAt(0) == '1') {
                    return;
                }
            }
            if (String.valueOf(otp).length() != 6) {
                System.out.println("Maximum attempts reached.");
                return;
            }
            System.out.println("--------------------------------------------------");
            System.out.println(
                    "Your order had been placed.\nThe book will be picked up from your location within next 2 days.");
            System.out.println("Thank you for using our services.");
            System.out.println("--------------------------------------------------");
        } else {
            if (choice == 0) {
                sc.nextLine();
                addNewLocation();
            } else {
                System.out.println("Invalid location selected.");
            }
        }
        userType();
        // sLoginPage();

    }

    public static void main(String[] args) {
        OldBookStore2 o = new OldBookStore2();
        o.userType();
    }
}
