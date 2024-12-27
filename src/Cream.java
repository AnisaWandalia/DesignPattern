class Cream extends PatisserieDecorator {
    public Cream(Patisserie patisserie) {
        super(patisserie);
    }

    @Override
    public String getDecoratorName() {
        return "Cream";
    }

    @Override
    public double getDecoratorCost() {
        return 1000;
    }

    @Override
    public String getName() {
        return patisserie.getName();
    }

    @Override
    public double baseCost() {
        return patisserie.baseCost();
    }

    @Override
    public double cost() {
        return patisserie.cost() + getDecoratorCost();
    }
}