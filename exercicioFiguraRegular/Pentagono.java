public class Pentagono extends FiguraRegular{

	public Pentagono (float lado) {
		super(lado);
	}
    public float calcularArea() {
		float area = ((3 * super.calcularArea() * super.raiz3 ) / 2) * 5;
		return area;
	}
    public float calcularPerimetro() {
        return 5 * lado;
    }
}