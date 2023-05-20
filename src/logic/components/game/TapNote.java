package logic.components.game;

import controller.GameController;
import logic.core.FastLateType;
import logic.core.JudgementType;
import logic.core.NoteType;

public class TapNote extends BaseNote {

    public TapNote(int time, int laneStart, int laneEnd) {
        super(time, laneStart, laneEnd);
    }

    @Override
    public NoteType getNoteType() {
        return NoteType.TAP;
    }

    @Override
    public NoteCheckResult checkJudgement(GameController controller) {
        if (controller.getCurrentTime() > this.getTime()) {
            this.setJudgementType(JudgementType.MISS);
            this.setFastLateType(FastLateType.NONE);
            return NoteCheckResult.REMOVE;
        }

        return NoteCheckResult.NONE;
    }
}
