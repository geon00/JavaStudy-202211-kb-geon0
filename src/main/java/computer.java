
public class computer {
	private String cpuType;
	private int rmasize;
	private int ssdSize;

	public computer(String cpuType, int rmasize, int ssdSize) {
		this.cpuType = cpuType;
		this.rmasize = rmasize;
		this.ssdSize = ssdSize;
	}

	public static OrderBuilder builder() {
		return new OrderBuilder();
	}

	public static class OrderBuilder {
		private String cpuType;
		private int rmasize;
		private int ssdSize;

		public OrderBuilder cpuType(String cpuType) {
			this.cpuType = cpuType;
			return this;
		}

		public OrderBuilder rmasize(int rmasize) {
			this.rmasize = rmasize;
			return this;
		}

		public OrderBuilder ssdSize(int ssdSize) {
			this.ssdSize = ssdSize;
			return this;
		}

		public computer build() {
			return new computer(cpuType, rmasize, ssdSize);
		}
	}

	public void showcomputerInfo() {
		System.out.println("CPU 종류: " + cpuType);
		System.out.println("PAM 용량: " + rmasize);
		System.out.println("SSD 용량: " + ssdSize);
	}

	public static void main(String[] args) {
		computer order = computer.builder().cpuType("intel").rmasize(16)
				.ssdSize(512).build();
		order.showcomputerInfo();
	}
}
