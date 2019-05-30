class Boss3 extends Chain {
    public Boss3(int _level) {
        this.level = _level;
    }

    protected void writeMessage(String msg) {
        System.out.println("Boss3: " + msg);
    }
}