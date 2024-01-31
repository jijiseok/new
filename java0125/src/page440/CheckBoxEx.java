package page440;

public class CheckBoxEx {

	public static void main(String[] args) {
		CheckBox checkbox = new CheckBox();
		checkbox.OnSelectListener(new CheckBox.OnSelectListener() {
			//답지 다시 보기
			@Override
			public void onSelect() {
				System.out.println("배경을 변경합니다");
				
			}
		});
		checkbox.select();
	}

}
