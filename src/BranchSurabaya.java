class BranchSurabaya extends RedHoodBakery {
    public BranchSurabaya() {
        super("Surabaya Branch", "Jl. Tunjungan No. 456, Surabaya");
    }

    @Override
    public Patisserie createPatisserie(String type) {
        return switch (type.toLowerCase()) {
            case "croissant" -> new Croissant();
            case "panna cotta" -> new PannaCotta();
            case "muffin" -> new Muffin();
            case "danish" -> new DanishRoll();
            case "cupcake" -> new Cupcake();
            default -> null;
        };
    }
}