class DanishRoll extends Patisserie {
    @Override
    public String getName() {
        return "Danish Roll";
    }

    @Override
    public double baseCost() {
        return 18000;
    }

    @Override
    public double cost() {
        return baseCost();
    }
}