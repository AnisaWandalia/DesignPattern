class Croissant extends Patisserie {
    @Override
    public String getName() {
        return "Croissant";
    }

    @Override
    public double baseCost() {
        return 20000;
    }

    @Override
    public double cost() {
        return baseCost();
    }
}