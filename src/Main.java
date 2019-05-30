public class Main {

    private static Chain createChain() {

        Chain chain1 = new Boss1(Chain.One);

        Chain chain2 = new Boss2(Chain.Two);
        chain1.setNext(chain2);

        Chain chain3 = new Boss3(Chain.Three);
        chain2.setNext(chain3);

        return chain1;
    }

    public static void main(String[] args) {

        Chain chain = createChain();

        chain.message("Low power player", Chain.One);
        System.out.println();
        chain.message("Medium power player", Chain.Two);
        System.out.println();
        chain.message("High power player", Chain.Three);
    }

}