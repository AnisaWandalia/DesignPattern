abstract class PatisserieDecorator extends Patisserie {
    protected final Patisserie patisserie;

    public PatisserieDecorator(Patisserie patisserie) {
        this.patisserie = patisserie;
    }

    public abstract String getDecoratorName();
    public abstract double getDecoratorCost();

    public PatisserieDecorator getInner() {
        return patisserie instanceof PatisserieDecorator ? (PatisserieDecorator) patisserie : null;
    }
}