package observer.이벤트리스너;

public class Button{
    private OnClickListener onClickListener;
    public int count=0;

    // Observer 인터페이스
    interface OnClickListener {
        // update()
        void onClick(Button button);
    }

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    // notifyObservers()
    public void onClick() {
        onClickListener.onClick(this);
    }
    public int getCount() {
        return count;
    }
}
