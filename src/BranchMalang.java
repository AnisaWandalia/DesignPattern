public class BranchMalang extends RedHoodBakery {
    public BranchMalang() {
        super("Malang Branch", "Jl. Ijen No. 123, Malang");
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