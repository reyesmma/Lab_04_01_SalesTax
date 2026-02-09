void main()
{
    double price = 100.0;
    double taxRate = 0.05;
    double tax = price * taxRate;
    double totalPrice = price + tax;

    // Output
    System.out.println("Total Price (including tax): $" + totalPrice);
    System.out.println("The tax on " + price + " is $" + tax);
}
