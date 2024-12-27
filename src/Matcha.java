class Matcha extends PatisserieDecorator {
    public Matcha(Patisserie patisserie) {
        super(patisserie);
    }

    @Override
    public String getDecoratorName() {
        return "Matcha";
    }

    @Override
    public double getDecoratorCost() {
        return 4000;
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