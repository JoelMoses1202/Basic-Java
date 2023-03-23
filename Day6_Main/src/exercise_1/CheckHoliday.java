package exercise_1;

public class CheckHoliday {
	public static boolean checkHoliday(int day, int month) {
		int holidayDay[] = { 1, 26, 15 };
		int holidayMonth[] = { 1, 1, 8 };
		for (int i = 0; i < holidayDay.length; i++) {
			if (holidayDay[i] == day && holidayMonth[i] == month) {
				return true;
			}
		}
		return false;

	}

}
