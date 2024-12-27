class Chocolate extends PatisserieDecorator {
    public Chocolate(Patisserie patisserie) {
        super(patisserie);
    }

    @Override
    public String getDecoratorName() {
        return "Chocolate";
    }

    @Override
    public double getDecoratorCost() {
        return 3000;
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