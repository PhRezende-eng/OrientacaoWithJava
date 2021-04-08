
public class Triangulo extends FiguraRegular{


	public Triangulo(float lado) {
		super(lado);
	}

	public float calcularArea() {
		float area = (super.calcularArea() * super.raiz3 ) / 4;
		return area;
	}

	public float calcularPerimetro() {
		return 3 * lado;
	}

}