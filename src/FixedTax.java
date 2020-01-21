public enum FixedTax {
    POWER_GE_200(3), POWER_LT_200(2);

    private int value;

    FixedTax(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }
}
