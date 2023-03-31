package exercise_2c;

public class Files {
	private long bytes;
	private String units = "";

	public void SetBytes(long bytes) {

		if (bytes >= 1024 * 1024 * 1024) {
			this.bytes = bytes / (1024 * 1024 * 1024);
			units = "GB";
		} else if (bytes >= 1024 * 1024) {
			this.bytes = bytes / (1024 * 1024);
			units = "MB";

		} else if (bytes >= 1024) {
			this.bytes = bytes / (1024);
			units = "KB";
		} else {
			this.bytes = bytes;
			units = "Byte";
		}
	}

	public long getBytes() {
		return bytes;
	}

	public String getUnits() {
		return units;
	}

}