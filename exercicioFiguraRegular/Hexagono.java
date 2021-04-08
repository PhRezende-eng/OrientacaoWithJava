public class Hexagono extends FiguraRegular{

	public Hexagono (float lado) {
		super(lado);
	}
    public float calcularArea() {
		float area = ((super.calcularArea() * super.raiz3 ) / 4) * 6;
		return area;
	}
    public float calcularPerimetro() {
        return 6 * lado;
    }
}