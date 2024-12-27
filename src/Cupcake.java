class Cupcake extends Patisserie {
    @Override
    public String getName() {
        return "Cupcake";
    }

    @Override
    public double baseCost() {
        return 12000;
    }

    @Override
    public double cost() {
        return baseCost();
    }
}
