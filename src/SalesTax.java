//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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
