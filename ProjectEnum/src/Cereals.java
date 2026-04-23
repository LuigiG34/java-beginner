public enum Cereals {
    CORNFLAKES(5),
    CHEERIOS(8),
    RICE_KRISPIES(6),
    FROSTED_FLAKES(9),
    CAPN_CRUNCH(7);

    final int levelOfDeliciousness;

    Cereals(int levelOfDeliciousness) {
        this.levelOfDeliciousness = levelOfDeliciousness;
    }
}