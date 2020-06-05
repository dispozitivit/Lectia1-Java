
public class PrimitiveTypeSizeMinMax {
	public static void main(String[] args) {
		// Boolean does not have Boolean.SIZE, Boolean.MIN_VALUE, or
		// Boolean.MAX_VALUE
		display(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		display(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		display(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
		display(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		display(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		display(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		display(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
	}

	public static void display(Class<?> type, int size, Number min, Number max) {
		System.out.printf("tip primitiva :%-6s bytes:%-2s min:%-20s max:%s\n", type, size, min, max);
	}

}
