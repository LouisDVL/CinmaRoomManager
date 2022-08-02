package cinema;
import java.util.Arrays;
import java.util.Scanner;

public class Cinema {
    int row;
    int col;
    int soldTickets;
    int numberOfSeats;
    int currIncome;
    char[][] seats;
    public static void main(String[] args) {
        // Write your code here
        Scanner scanner = new Scanner(System.in);
        final String exitOptionString = "0";
        System.out.println("Enter the number of rows:");
        System.out.print("> ");
        int numberOfRows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        System.out.print("> ");
        int numberOfSeats = scanner.nextInt();
        Cinema currCinema = new Cinema(numberOfRows, numberOfSeats);

        String optionSelected = exitOptionString;
        do {
            currCinema.printMenu();
            System.out.print("> ");
            optionSelected = scanner.next();

            if (optionSelected.equals(exitOptionString)) {
                break;
            }

            currCinema.handleMenuSelect(optionSelected);
        } while (!optionSelected.equals(exitOptionString));
    }

    public Cinema(int row, int col) {
        this.row = row;
        this.col = col;
        this.soldTickets = 0;
        this.numberOfSeats = col * row;
        this.currIncome = 0;
        this.seats = new char[row][col];
        for (char[] r : this.seats) {
            Arrays.fill(r, 0, this.col,'S');
        }
    }

    public int calculateProfit() {
        int normalPriceSeat = 10;
        int cheapPriceSeat = 8;
        if(this.numberOfSeats <= 60) {
            int totalProfit = this.numberOfSeats * normalPriceSeat;
            return totalProfit;
        } else {
            int frontRow = this.row / 2;
            int backRow = this.row - frontRow;
            int totalFrontRowSeats = frontRow * this.col;
            int totalBackRowSeats = backRow * this.col;
            int totalProfit = totalFrontRowSeats * normalPriceSeat + totalBackRowSeats * cheapPriceSeat;
            return totalProfit;
        }
    }

    public void drawSeats() {
        char[][] seats = new char[this.row + 1][this.col + 1];
        int rowCounter = 0;
        for(char[] row : seats) {
            if(rowCounter == 0) {
                seats[0][0] = ' ';
                for(int i = 1; i < this.col + 1; i++) seats[0][i] = (char)(i+'0');
            } else {
                seats[rowCounter][0] = (char)(rowCounter+'0');
                for (int i = 0; i < this.row ; i++) {
                    for (int z = 0; z < this.col; z++) {
                        char currSeatChar = this.seats[i][z];
                        seats[i + 1][z + 1] = currSeatChar;
                    }
                }
            }
            rowCounter++;
        }
        System.out.println("Cinema:");
        for(char[] row : seats) {
            String seatString = "";
            for(char character : row) {
                seatString = seatString + character + " ";
            }
            System.out.println(seatString);
        }
    }

    // there is a minus one offset to get the right seat
    public boolean bookSeat(int row, int col) {
        final int OFF_SET = 1;
        try {
            if (!this.isSeatAvailable(row, col)) {
                System.out.println("That ticket has already been purchased!");
                return false;
            }
            final int seatPrice = this.calculateSeatPrice(row + OFF_SET, col + OFF_SET);
            System.out.println("Ticket price: $" + seatPrice);
            this.seats[row][col] = 'B';
            this.soldTickets += 1;
            this.currIncome += seatPrice;
            return true;
        } catch (Exception e) {
            System.out.println("Wrong input!");
            return false;
        }
    }

    public int calculateSeatPrice(int row, int col) {
        int numberOfSeats = this.row * this.col;
        if(numberOfSeats < 60) {
            return 10;
        } else {
            int frontRows = Math.floorDiv(this.row, 2);
            if (row > frontRows) {
                return 8;
            } else {
                return 10;
            }
        }
    }

    public void handleStatistics() {
        final double PERCENTAGE_OF_SEATS_SOLD = ((double)this.soldTickets / this.numberOfSeats) * 100;
        final int totalIncome = this.calculateProfit();
        System.out.printf("Number of purchased tickets: %d \n", this.soldTickets);
        System.out.printf("Percentage: %.2f%c \n",PERCENTAGE_OF_SEATS_SOLD, '%');
        System.out.printf("Current income: $%d \n", this.currIncome);
        System.out.printf("Total income: $%d \n", totalIncome);
        return;
    }

    public void printMenu() {
        System.out.println("");
        System.out.println("1. Show the seats");
        System.out.println("2. Buy a ticket");
        System.out.println("3. Statistics");
        System.out.println("0. Exit");
    }

    public void handleMenuSelect(String option) {
        switch (option) {
            case "1":
                drawSeats();
                break;
            case "2":
                handleBuyTicket();
                break;
            case "3":
                handleStatistics();
                break;
            default:
                System.out.println("Exiting");
        }
    }

    public void handleBuyTicket() {
        final int OFF_SET = 1;
        boolean seatBooked = false;

        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a row number:");
            System.out.print("> ");
            int rowSelected = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            System.out.print("> ");
            int seatSelected = scanner.nextInt();
            seatBooked = this.bookSeat(rowSelected - OFF_SET, seatSelected - OFF_SET);
        } while (!seatBooked);
        return;
    }

    public boolean isSeatAvailable(int row, int col) {
        if (this.seats[row][col] == 'B') {
            return false;
        }
        return true;
    }

}