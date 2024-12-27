class StrawberryJam extends PatisserieDecorator {
    public StrawberryJam(Patisserie patisserie) {
        super(patisserie);
    }

    @Override
    public String getDecoratorName() {
        return "Strawberry Jam";
    }

    @Override
    public double getDecoratorCost() {
        return 2000;
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