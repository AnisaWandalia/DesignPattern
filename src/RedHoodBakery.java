import java.util.ArrayList;
import java.util.List;

abstract class RedHoodBakery {
    private final List<Patisserie> orders = new ArrayList<>();
    private final String branchName;
    protected String address;

    public RedHoodBakery(String branchName, String address) {
        this.branchName = branchName;
        this.address = address;
    }

    public abstract Patisserie createPatisserie(String type);

    public void addOrder(String type, PatisserieDecorator... decorators) {
        Patisserie patisserie = createPatisserie(type);
        for (PatisserieDecorator decorator : decorators) {
            patisserie = decorator;
        }
        orders.add(patisserie);
    }

    public void receipt() {
        int lineLength = 42;
        double taxRate = 0.1;
        double totalCost = 0;

        System.out.println("\n" + "=".repeat(lineLength)+"\n");
        System.out.printf("%" + (lineLength / 2 + branchName.length() / 2) + "s\n", branchName);
        System.out.printf("%" + (lineLength / 2 + address.length() / 2) + "s\n", address+"\n");
        System.out.println("=".repeat(lineLength));

        for (Patisserie patisserie : orders) {
            System.out.printf("%-30s %11s\n", patisserie.getName(), String.format("Rp%4.0f", patisserie.baseCost()));

            if (patisserie instanceof PatisserieDecorator decorator) {
                while (decorator != null) {
                    System.out.printf("     + %-24s %10s\n", decorator.getDecoratorName(), String.format("Rp%4.0f", decorator.getDecoratorCost()));
                    decorator = decorator.getInner();
                }
            }

            System.out.println("-".repeat(lineLength));
            System.out.printf("%" + (lineLength - 11) + "s %10s\n\n", "", String.format("Rp%4.0f", patisserie.cost()));
            totalCost += patisserie.cost();
        }

        double tax = totalCost * taxRate;
        double finalAmount = totalCost + tax;

        System.out.printf("%-30s %11s\n", "Total Cost", String.format("Rp%4.0f", totalCost));
        System.out.printf("%-30s %11s\n", "Tax", String.format("Rp%4.0f", tax));
        System.out.println("-".repeat(lineLength));
        System.out.printf("%-30s %11s\n", "Final Amount", String.format("Rp%4.0f", finalAmount));
        System.out.println("=".repeat(lineLength));
        System.out.println("\n\n");
    }
}
