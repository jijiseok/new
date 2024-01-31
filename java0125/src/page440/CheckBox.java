package page440;

public class CheckBox {
	OnSelectListener listener;
	
	void OnSelectListener(OnSelectListener listener) {
		this.listener = listener;
	}

	void select() {
		listener.onSelect();
	}

	static interface OnSelectListener{
		void onSelect();
	}
}
