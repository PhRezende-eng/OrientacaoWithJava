public class Hexagono extends FiguraRegular{
    private static float raiz3 = (float) Math.sqrt(3);

	public Hexagono (float lado) {
		super(lado);
	}
    public float calcularArea() {
		float area = ((super.calcularArea() * raiz3 ) / 4) * 6;
		return area;
	}
    public float calcularPerimetro() {
        return 6 * lado;
    }
}