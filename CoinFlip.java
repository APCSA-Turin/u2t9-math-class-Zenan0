public class CoinFlip {
    public CoinFlip () {}

    public String flip() {
        if (Math.random() < 0.5) {
            return "heads";
        } else {
            return "tails";
        }
    }

    public double simulate(int numFlips) {
        int headsCount = 0;
        for (int i = 0; i < numFlips; i++) {
            String hOrT = flip();
            if (hOrT.equals("heads")) {
                headsCount++;
            }
        }
        double percentHeads = (double) headsCount / (double) numFlips;
        return percentHeads;
    }
}
