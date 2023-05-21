package logic.components.game;

import controller.GameController;
import logic.core.FastLateType;
import logic.core.JudgementType;
import logic.core.NoteType;

public class HoldNote extends BaseNote {
    private int endTime;

    public HoldNote(int time, int laneStart, int laneEnd, int endTime) {
        super(time, laneStart, laneEnd);

        this.endTime = endTime;
    }

    @Override
    public NoteType getNoteType() {
        return NoteType.HOLD;
    }

    @Override
    public NoteCheckResult checkJudgement(GameController controller) {
        if (controller.getCurrentTime() > this.getEndTime()) {
            this.setJudgementType(JudgementType.MISS);
            this.setFastLateType(FastLateType.NONE);
            return NoteCheckResult.REMOVE;
        }

        return NoteCheckResult.NONE;
    }

    public int getEndTime() {
        return this.endTime;
    }
}