package logic.core;

public interface Judgement {
    // Judgements

    public int getPlatinumCriticalPerfect();

    public int getCriticalPerfect();

    public int getPerfect();

    public int getGood();

    public int getMiss();

    // Fast Late

    public int getFastCriticalPerfect();

    public int getLateCriticalPerfect();

    public int getFastPerfect();

    public int getLatePerfect();

    public int getFastGood();

    public int getLateGood();

    // Computed
    public default int getTotalNotes() {
        return this.getPlatinumCriticalPerfect() + this.getCriticalPerfect()
                + this.getPerfect() + this.getGood() + this.getMiss();
    }

    public default int getFast() {
        return this.getFastCriticalPerfect()
                + this.getFastPerfect()
                + this.getFastGood();
    }

    public default int getLate() {
        return this.getLateCriticalPerfect()
                + this.getLateGood()
                + this.getLateGood();
    }
}
