public class Pentagono extends FiguraRegular{
    private static float raiz3 = (float) Math.sqrt(3);

	public Pentagono (float lado) {
		super(lado);
	}
    public float calcularArea() {
		float area = ((3 * super.calcularArea() * raiz3 ) / 2) * 5;
		return area;
	}
    public float calcularPerimetro() {
        return 5 * lado;
    }
}