class Boss1 extends Chain {
    public Boss1(int _level) {
        this.level = _level;
    }

    protected void writeMessage(String msg) {
        System.out.println("Boss1: " + msg);
    }
}