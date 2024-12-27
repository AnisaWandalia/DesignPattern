public class BakeryTest {
    public static void main(String[] args) {
        // Cabang Malang
        RedHoodBakery malangBranch = new BranchMalang();
        malangBranch.addOrder("croissant", new StrawberryJam(new Cream(new Croissant())));
        malangBranch.addOrder("muffin", new Chocolate(new Matcha(new Muffin())));
        malangBranch.addOrder("danish roll", new Tiramisu(new DanishRoll()));
        malangBranch.addOrder("cupcake");

        malangBranch.receipt();


        // Cabang Surabaya
        RedHoodBakery surabayaBranch = new BranchSurabaya();
        surabayaBranch.addOrder("panna cotta", new Cream(new Tiramisu(new PannaCotta())));
        surabayaBranch.addOrder("cupcake", new Matcha(new Chocolate(new Cream(new Cupcake()))));
        surabayaBranch.addOrder("croissant", new Chocolate(new Matcha(new Cream(new Croissant()))));

        surabayaBranch.receipt();
    }
}
