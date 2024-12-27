class PannaCotta extends Patisserie {
    @Override
    public String getName() {
        return "PannaCotta";
    }

    @Override
    public double baseCost() {
        return 25000;
    }

    @Override
    public double cost() {
        return baseCost();
    }
}
