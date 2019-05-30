class Boss2 extends Chain {
    public Boss2(int _level) {
        this.level = _level;
    }

    protected void writeMessage(String msg) {
        System.out.println("Boss2: " + msg);
    }
}