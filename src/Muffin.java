class Muffin extends Patisserie {
    @Override
    public String getName() {
        return "Muffin";
    }

    @Override
    public double baseCost() {
        return 15000;
    }

    @Override
    public double cost() {
        return baseCost();
    }
}