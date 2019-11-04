package undip.ifundip.geoquiz;

public class Question {
    private int textResId;
    private boolean mAnswerTrue;

    public Question(int textResId, boolean answerTrue){
        this.textResId = textResId;
        this.mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public void setTextResId(int textResId) {
        this.textResId = textResId;
    }
}
